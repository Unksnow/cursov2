package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursos.model.Curso;
import com.cursos.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repositoryCursos;

        public List<Curso> obteneCursos(){
            return repositoryCursos.obtenerCursos();
        }

        public Curso guardarCurso(Curso cur){
            return repositoryCursos.guardarCurso(cur);
        }

        public Curso getCursoId(int idcurso) {
            return repositoryCursos.buscarCursoPorId(idcurso);
        }

        public String eliminar(int idcurso){
            repositoryCursos.eliminar(idcurso);
            return "curso Eliminado";
        }
}
