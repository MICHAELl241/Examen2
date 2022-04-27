package MMAURI.MMAURI.Dao;


import MMAURI.MMAURI.Entity.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface IProfesorDao  extends JpaRepository<Persona,Long> {



}
