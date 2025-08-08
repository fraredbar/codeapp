package com.codeApp.crud_fullstack.entity;


import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity //definimos que es una entidad de la base de datos.
@Table(name="employees") //le damos nombre a la tabla, si dejamos solo la anotacion nombre=clase.
public class Employee {
    @Id //asignamos a id que sea la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;


    public Employee(Integer id, String name, String email, Role role, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public Employee() {}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }







}
