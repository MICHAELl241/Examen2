package MMAURI.MMAURI.Service.impl;

import MMAURI.MMAURI.Dao.IDireccionDao;
import MMAURI.MMAURI.Entity.Direccion;
import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;

public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    private IDireccionDao DireccionDao;

    @Override
    public Direccion obtenerDireccionByCodigo(String codigo) {return this.DireccionDao.buscarDireccion(codigo);}

}


