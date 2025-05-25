package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursos.model.Curso;
<<<<<<< HEAD
//import com.cursos.repository.CursoRepository;
import com.cursos.repository.repositoryInterfaz;
=======
import com.cursos.repository.CursoRepository;
>>>>>>> 2351162a5ea882620a6217c56938e6a6e236b1b4

@Service
public class CursoService {

    @Autowired
<<<<<<< HEAD
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
=======
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
>>>>>>> 2351162a5ea882620a6217c56938e6a6e236b1b4
