package com.codeApp.crud_fullstack.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "quotes")
public class Quotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String text;

    private String source;

    private LocalDate dateAssigned;
}
