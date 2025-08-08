package com.codeApp.crud_fullstack.repository;

import com.codeApp.crud_fullstack.entity.GratitudeEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GratitudeEntryRepository extends JpaRepository<GratitudeEntry,Integer> {
}
