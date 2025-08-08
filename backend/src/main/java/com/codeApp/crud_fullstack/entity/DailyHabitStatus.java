package com.codeApp.crud_fullstack.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "daily_habit_status")
public class DailyHabitStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "daily_log_id")
    private DailyLog dailyLog;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "habit_id")
    private Habito habito;

    private Boolean completed;









}
