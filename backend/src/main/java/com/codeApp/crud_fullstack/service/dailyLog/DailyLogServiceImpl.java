package com.codeApp.crud_fullstack.service.dailyLog;

import com.codeApp.crud_fullstack.entity.DailyLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyLogServiceImpl implements DailyLogService{
    @Override
    public DailyLog save(DailyLog c) {
        return null;
    }

    @Override
    public List<DailyLog> findAll() {
        return List.of();
    }

    @Override
    public DailyLog findById(Integer id) {
        return null;
    }
}
