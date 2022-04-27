package MMAURI.MMAURI.Service;

import MMAURI.MMAURI.Entity.Direccion;
import MMAURI.MMAURI.Entity.Estudiante;

import java.util.List;

public interface IDireccionService {
    // obtener direccion  por su codigo
    Direccion obtenerDireccionByCodigo(String codigo);

}
