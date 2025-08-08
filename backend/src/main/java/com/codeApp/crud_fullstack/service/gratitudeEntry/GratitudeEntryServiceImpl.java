package com.codeApp.crud_fullstack.service.gratitudeEntry;

import com.codeApp.crud_fullstack.entity.GratitudeEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GratitudeEntryServiceImpl implements GratitudeEntryService{
    @Override
    public GratitudeEntry save(GratitudeEntry c) {
        return null;
    }

    @Override
    public List<GratitudeEntry> findAll() {
        return List.of();
    }

    @Override
    public GratitudeEntry findById(Integer id) {
        return null;
    }
}
