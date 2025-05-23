package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursos.model.Curso;
//import com.cursos.repository.CursoRepository;
import com.cursos.repository.repositoryInterfaz;

@Service
public class CursoService {

    @Autowired
    private repositoryInterfaz repositoryInterfaz;

    public List<Curso> obtenerCursos() {
        return repositoryInterfaz.findAll();
    }

    public Curso buscarCursoPorId(int idcurso) {
        return repositoryInterfaz.findById(idcurso).orElse(null);
    }

    public Curso guardarCurso(Curso curso) {
        return repositoryInterfaz.save(curso);
    }

    public Curso actualizarCurso(Curso cur){
        return repositoryInterfaz.save(cur);
    }

    public List<String> obtenerNombresCursos() {
        return repositoryInterfaz.findAllNombresCursos();
    }

    public List<Curso> obtenerCursosPorProfesor(String nombreProfesor) {
        return repositoryInterfaz.findByProfesorContainingIgnoreCase(nombreProfesor);
    }

    public String eliminarCurso(int idcurso) {
        repositoryInterfaz.deleteById(idcurso);
        return "Curso Eliminado";
    }
}