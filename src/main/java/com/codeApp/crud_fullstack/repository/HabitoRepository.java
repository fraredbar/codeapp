package com.codeApp.crud_fullstack.repository;

import com.codeApp.crud_fullstack.entity.Habito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoRepository extends JpaRepository<Habito,Integer> {
}
