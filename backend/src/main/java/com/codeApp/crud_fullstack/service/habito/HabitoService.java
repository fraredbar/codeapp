package com.codeApp.crud_fullstack.service.habito;

import com.codeApp.crud_fullstack.entity.Habito;

import java.util.List;

public interface HabitoService {
    Habito save(Habito c);
    List<Habito> findAll();
    Habito findById(Integer id);
}
