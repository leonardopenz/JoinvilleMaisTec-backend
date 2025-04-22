package br.com.senai.futurodev.service;

import br.com.senai.futurodev.model.entity.Assignee;
import br.com.senai.futurodev.model.exceptions.ResourceNotFoundException;
import br.com.senai.futurodev.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {
    @Autowired
    AssigneeRepository assigneeRepository;

    //Cadastrar
    public Assignee create(Assignee assignee){
        return assigneeRepository.save(assignee);
    }

    //Listar
    public List<Assignee> findAllAssignees(){
        return assigneeRepository.findAll();
    }

    //Listar 1 registro pelo ID
    public Assignee findAssigneeById(Long id){
        return assigneeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Assignee not found with id "+ id)
        );
    }

    //Atualizar 1 registro
    public Assignee update(Long id, Assignee assigneeUpdate){
        Assignee existingAssignee = findAssigneeById(id);
        existingAssignee.setName(assigneeUpdate.getName());
        return assigneeRepository.save(existingAssignee);
    }

    //Deletar 1 registro
    public void delete(Long id){
        Assignee assignee = findAssigneeById(id);
        assigneeRepository.delete(assignee);
    }
}
