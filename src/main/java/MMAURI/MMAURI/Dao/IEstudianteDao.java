package MMAURI.MMAURI.Dao;

import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface IEstudianteDao  extends JpaRepository<Estudiante,Long> {

    @Query("SELECT p FROM Estudiante p WHERE p.nombre = ?1")
    Estudiante buscarEstudiante(String nombre);



}
