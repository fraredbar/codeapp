package com.codeApp.crud_fullstack.service.quotes;

import com.codeApp.crud_fullstack.entity.Quotes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesServiceImpl implements QuotesService{
    @Override
    public Quotes save(Quotes c) {
        return null;
    }

    @Override
    public List<Quotes> findAll() {
        return List.of();
    }

    @Override
    public Quotes findById(Integer id) {
        return null;
    }
}
