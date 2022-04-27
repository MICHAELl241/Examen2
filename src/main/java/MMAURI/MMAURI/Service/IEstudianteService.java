package MMAURI.MMAURI.Service;

import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Persona;

import java.util.List;

public interface IEstudianteService {
    // listar estudiante

   // List<Estudiante> listaEstudiante();


    // buscar estudiante por su codigo
    Estudiante obtenerEstudianteByCodigo(String codigo);
}
