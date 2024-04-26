package com.softtek.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;

    @Column(length = 60, nullable = false)
    private String nombre;

    @Column(length = 60, nullable = false)
    private String ubicacion;

    //En caso de que front lo solicite (está dentro del paradigma de orientacion a objetos

    @ManyToMany(mappedBy = "proveedores", //ese proveedores es el de la lista de proveedores en Producto
    cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    List<Producto> productos;
}
