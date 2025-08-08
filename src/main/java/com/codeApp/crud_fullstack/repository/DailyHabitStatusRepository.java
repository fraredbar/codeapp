package com.codeApp.crud_fullstack.repository;

import com.codeApp.crud_fullstack.entity.DailyHabitStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyHabitStatusRepository extends JpaRepository<DailyHabitStatus,Integer> {
}
