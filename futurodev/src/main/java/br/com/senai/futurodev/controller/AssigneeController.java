package br.com.senai.futurodev.controller;

import br.com.senai.futurodev.model.entity.Assignee;
import br.com.senai.futurodev.model.dtos.RequestAssigneeDTO;
import br.com.senai.futurodev.service.AssigneeService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignee")
public class AssigneeController {

    @Autowired
    AssigneeService assigneeService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<Assignee> create(@RequestBody @Valid RequestAssigneeDTO assigneeDTO){
        Assignee assignee = modelMapper.map(assigneeDTO, Assignee.class); //Tranformar a classe DTO em uma Entity
        return ResponseEntity.status(HttpStatus.CREATED).body(assigneeService.create(assignee));
    }


}
