package MMAURI.MMAURI.Dao;


import MMAURI.MMAURI.Entity.Persona;

import MMAURI.MMAURI.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface IProfesorDao  extends JpaRepository<Profesor,Long> {



}
