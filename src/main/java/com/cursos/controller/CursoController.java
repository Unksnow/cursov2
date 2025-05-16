package com.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.model.Curso;
import com.cursos.services.CursoService;

@RestController
@RequestMapping("/api/v0/cursos")
public class CursoController {
    @Autowired
    private CursoService serviceCursos;

    @GetMapping()
        public List<Curso> obteneCursos(){
            return serviceCursos.obteneCursos();
        }
    @PostMapping()
        public Curso guardarCurso(@RequestBody Curso cur){
            return serviceCursos.guardarCurso(cur);
        }
    @DeleteMapping("(idcurso)")
        public void eliminar(@PathVariable int idcurso){
            return;
        }        

}
