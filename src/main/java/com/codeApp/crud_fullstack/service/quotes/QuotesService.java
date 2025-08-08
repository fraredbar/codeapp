package com.codeApp.crud_fullstack.service.quotes;
import com.codeApp.crud_fullstack.entity.Quotes;

import java.util.List;

public interface QuotesService {
    Quotes save(Quotes c);
    List<Quotes> findAll();
    Quotes findById(Integer id);
}
