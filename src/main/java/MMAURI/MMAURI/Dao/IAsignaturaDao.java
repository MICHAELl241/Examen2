package MMAURI.MMAURI.Dao;

import MMAURI.MMAURI.Entity.Asignatura;
import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {



}
