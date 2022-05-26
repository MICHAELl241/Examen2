package MMAURI.MMAURI.Service.impl;

import MMAURI.MMAURI.Dao.IEstudianteDao;
import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;


    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}
    @Override
    public Estudiante obtenerEstudianteByNombre(String nombre) {
        return this.estudianteDao.buscarEstudiante(nombre);
    }
}
