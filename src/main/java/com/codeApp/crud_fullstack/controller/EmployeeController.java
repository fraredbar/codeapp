package com.codeApp.crud_fullstack.controller;

import com.codeApp.crud_fullstack.entity.Employee;
import com.codeApp.crud_fullstack.entity.LoginRequest;
import com.codeApp.crud_fullstack.security.JwtUtil;
import com.codeApp.crud_fullstack.service.employee.EmployeeService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers") //Define la ruta del endpoint para organizar mejor todo.
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

        //Es mejor crear objetos de esta manera que usando new cuando trabajamos cn spring.
        private final EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        @PostMapping("/create")
        public Employee save(@RequestBody Employee c){
            c.setPassword(passwordEncoder.encode(c.getPassword()));

            return employeeService.save(c);
        }

    @PostMapping("/login")
    public ResponseEntity<?> getByEmail(@RequestBody LoginRequest loginRequest, HttpServletResponse response) {

            Authentication auth = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword())
            );

            String jwt = jwtUtil.generateToken(loginRequest.getEmail());

            Cookie cookie = new Cookie("jwt", jwt);
            cookie.setHttpOnly(true);
            cookie.setSecure(true);
            cookie.setPath("/");
            cookie.setMaxAge(24 * 60 * 60); // 1 día

            response.addCookie(cookie);
            return ResponseEntity.ok("Login exitoso");

    }


}
