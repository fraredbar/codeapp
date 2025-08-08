package com.codeApp.crud_fullstack.service.dailyHabitStatus;

import com.codeApp.crud_fullstack.entity.DailyHabitStatus;

import java.util.List;

public interface DailyHabitStatusService {
    DailyHabitStatus save(DailyHabitStatus c);
    List<DailyHabitStatus> findAll();
    DailyHabitStatus findById(Integer id);
}
