package com.codeApp.crud_fullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/habitos") //Define la ruta del endpoint para organizar mejor todo.
@CrossOrigin(origins="http://localhost:4200")
public class HabitoController {
}
