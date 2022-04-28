package MMAURI.MMAURI.Dao;

import MMAURI.MMAURI.Entity.Direccion;

import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDireccionDao extends JpaRepository<Persona,Long> {

    @Query("SELECT p FROM Estudiante p WHERE p.codigo= ?1")
    Estudiante buscarDireccion(String nombre);
}
