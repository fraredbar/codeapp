package com.codeApp.crud_fullstack.controller;

import com.codeApp.crud_fullstack.entity.Employee;
import com.codeApp.crud_fullstack.entity.Habito;
import com.codeApp.crud_fullstack.service.habito.HabitoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitos") //Define la ruta del endpoint para organizar mejor todo.
@CrossOrigin(origins="http://localhost:4200")
public class HabitoController {

    public HabitoController(HabitoService habitoService) {
        this.habitoService = habitoService;
    }

    private final HabitoService habitoService;

    @GetMapping("/get")
    public List<Habito> getHabitos(@RequestBody Employee employee){
        return habitoService.findByUserId(employee.getId());
    }



}
