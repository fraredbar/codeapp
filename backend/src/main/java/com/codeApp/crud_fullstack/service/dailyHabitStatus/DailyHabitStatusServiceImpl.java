package com.codeApp.crud_fullstack.service.dailyHabitStatus;

import com.codeApp.crud_fullstack.entity.DailyHabitStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyHabitStatusServiceImpl implements DailyHabitStatusService{
    @Override
    public DailyHabitStatus save(DailyHabitStatus c) {
        return null;
    }

    @Override
    public List<DailyHabitStatus> findAll() {
        return List.of();
    }

    @Override
    public DailyHabitStatus findById(Integer id) {
        return null;
    }
}
