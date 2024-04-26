package com.softtek.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(length = 60, nullable = false)
    private String descripcionDepartamento;

    //Esta es solo para el front, creo. No aparece reflejado en la bd porque es una ¿doble asociación?
    @OneToMany(mappedBy = "d1",
    cascade =  CascadeType.ALL,
    orphanRemoval = true,
    fetch = FetchType.EAGER)
    List<Empleado> empleados;

}
