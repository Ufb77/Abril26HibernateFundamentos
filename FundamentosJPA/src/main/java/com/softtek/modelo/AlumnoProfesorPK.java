package com.softtek.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class AlumnoProfesorPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_profesor", nullable = false, foreignKey = @ForeignKey(name = "FK_ap_profesores"))
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false, foreignKey = @ForeignKey(name = "FK_ap_alumnos"))
    private Alumno alumno;


}
