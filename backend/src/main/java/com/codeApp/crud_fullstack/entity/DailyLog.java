package com.codeApp.crud_fullstack.entity;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "daily_log")
public class DailyLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private Employee employee;

    private LocalDate date;

}
