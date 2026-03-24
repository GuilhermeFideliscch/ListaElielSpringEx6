package com.example.Cliente.services;

import com.example.Cliente.models.ClienteModel;
import com.example.Cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public ClienteModel criarCliente(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> findById(Long id){
        return clienteRepository.findById(id);
    }

    public void deletarCliente(Long id){
        clienteRepository.deleteById(id);
    }

}