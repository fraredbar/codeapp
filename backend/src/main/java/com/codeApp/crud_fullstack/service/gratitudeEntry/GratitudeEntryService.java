package com.codeApp.crud_fullstack.service.gratitudeEntry;

import com.codeApp.crud_fullstack.entity.GratitudeEntry;

import java.util.List;

public interface GratitudeEntryService {
    GratitudeEntry save(GratitudeEntry c);
    List<GratitudeEntry> findAll();
    GratitudeEntry findById(Integer id);
}
