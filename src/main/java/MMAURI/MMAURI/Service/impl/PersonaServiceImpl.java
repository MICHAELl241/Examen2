package MMAURI.MMAURI.Service.impl;

import MMAURI.MMAURI.Dao.IPersonaDao;
import MMAURI.MMAURI.Entity.Persona;

import MMAURI.MMAURI.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona:personaList){
            System.out.println(persona.toString());
        }
        return personaList;
    }


}
