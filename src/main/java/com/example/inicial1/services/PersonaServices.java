package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServices implements BaseService<Persona>{

    @Override
    public List<Persona> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Persona findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long id, Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
