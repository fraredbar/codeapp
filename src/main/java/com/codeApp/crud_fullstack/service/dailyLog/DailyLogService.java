package com.codeApp.crud_fullstack.service.dailyLog;

import com.codeApp.crud_fullstack.entity.DailyLog;

import java.util.List;

public interface DailyLogService {
    DailyLog save(DailyLog c);
    List<DailyLog> findAll();
    DailyLog findById(Integer id);
}
