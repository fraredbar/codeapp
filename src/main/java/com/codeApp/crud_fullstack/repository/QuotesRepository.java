package com.codeApp.crud_fullstack.repository;

import com.codeApp.crud_fullstack.entity.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes,Integer> {
}
