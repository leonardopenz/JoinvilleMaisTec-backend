package br.com.futurodev.estudantes.services;

import br.com.futurodev.estudantes.models.Database;
import br.com.futurodev.estudantes.models.Students;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.rmi.server.ExportException;
import java.util.List;

@Service
public class StudentService {

    //Retorna a lista de estudantes cadastrados
    public List<Students> listStudents(){
        return Database.listAll();
    }

    //Cadastrar o estudante no banco de dados
    public void createStudent(Students student) throws Exception{
        if(student != null){
            Database.addStudent(student);
        }
        else {
            throw new Exception("Valor de estudante é nulo");
        }
    }

    //Atualizar um cadastro de estudante
    public Students updateStudent(Integer registration, Students student) throws Exception{
        return Database.updateStudent(registration, student);
    }

    //Deletar um aluno
    public void deleteStudent(Integer registration){
        Database.deleteStudent(registration);
    }
}
