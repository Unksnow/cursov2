package com.cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
            return serviceCursos.obtenerCursos();
        }
    @PostMapping()
        public Curso guardarCurso(@RequestBody Curso cur){
            return serviceCursos.guardarCurso(cur);
        }
     
    @GetMapping("{idcurso}")
        public Curso buscarCurso(@PathVariable int idcurso){
            return serviceCursos.buscarCursoPorId(idcurso);
        }
    @PutMapping("{idcurso}")
        public Curso actualizaCurso(@PathVariable int idcurso, @RequestBody Curso cur){
            cur.setIdcurso(idcurso);
            return serviceCursos.actualizarCurso(cur);
        }
    @GetMapping("/nombres")
        public List<String> obtenerNombresCursos() {
            return serviceCursos.obtenerNombresCursos();
        }
        
    @GetMapping("/profesor/{nombreProfesor}")
        public List<Curso> obtenerCursosPorProfesor(@PathVariable String nombreProfesor) {
            return serviceCursos.obtenerCursosPorProfesor(nombreProfesor);
        }    
    @DeleteMapping("{idcurso}")
        public String eliminarCurso(@PathVariable int idcurso){
            return serviceCursos.eliminarCurso(idcurso); 
        }        

}
