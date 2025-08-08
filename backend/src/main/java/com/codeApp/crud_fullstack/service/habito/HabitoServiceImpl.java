package com.codeApp.crud_fullstack.service.habito;

import com.codeApp.crud_fullstack.entity.Habito;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitoServiceImpl implements HabitoService{
    @Override
    public Habito save(Habito c) {
        return null;
    }

    @Override
    public List<Habito> findAll() {
        return List.of();
    }

    @Override
    public List<Habito> findByUserId(Integer id) {
        return null;
    }
}
