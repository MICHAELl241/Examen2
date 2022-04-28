package MMAURI.MMAURI.controller;
import MMAURI.MMAURI.Entity.Direccion;
import MMAURI.MMAURI.Entity.Estudiante;
import MMAURI.MMAURI.Entity.Persona;
import MMAURI.MMAURI.Service.IDireccionService;
import MMAURI.MMAURI.Service.IEstudianteService;
import MMAURI.MMAURI.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class Buscar {

    @Autowired
    private IPersonaService personaService;
    private IEstudianteService estudianteService;
    private IDireccionService direccionService;

    @GetMapping("/listaPersonas")

    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();

    }
    @GetMapping("/buscarEstudiantes")

    public Estudiante buscarEstudiante(@RequestParam("codigo") String codigo){
        return (Estudiante) this.estudianteService.obtenerEstudianteByCodigo(codigo);

    }
    //@GetMapping("/buscarDireccion")

    //public Direccion buscarDireccion(@RequestParam("codigo") String codigo){
        //return (Direccion) this.direccionService.obtenerDireccionByCodigo(codigo);

    //}
}
