package com.codeApp.crud_fullstack.repository;

import com.codeApp.crud_fullstack.entity.DailyLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyLogRepository extends JpaRepository<DailyLog, Integer> {
}
