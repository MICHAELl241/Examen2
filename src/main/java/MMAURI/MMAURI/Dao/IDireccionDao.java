package MMAURI.MMAURI.Dao;

import MMAURI.MMAURI.Entity.Direccion;

import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDireccionDao extends JpaRepository<Direccion,Long> {

    @Query("SELECT p FROM Direccion p WHERE p.idpersona= ?1")
    Direccion buscarDireccion(String idpersona);
}
