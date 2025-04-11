package br.com.futurodev.estudantes.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    private static List<Students> students = new ArrayList<>();

    private Database(){

    }

    public static void addStudent(Students students){
        Database.students.add(students);
    }

    public static List<Students> listAll(){
        return Database.students;
    }

    public static void deleteStudent(Integer registration){
        Database.students.removeIf(student -> student.getRegistration().equals(registration));
    }

    public static Students listOne(Integer registration){
        Optional<Students> optionalStudent = Database.students.stream().filter(student -> student.getRegistration().equals(registration)).findFirst();
        return optionalStudent.orElse(null);
    }

    public static Students updateStudent(Integer registration, Students student) throws Exception{
        Students studentToUpdate = Database.listOne(registration);
        if(studentToUpdate != null){
            studentToUpdate.setName(student.getName() != null ? student.getName() : studentToUpdate.getName());
            studentToUpdate.setEmail(student.getEmail() != null ? student.getEmail() : studentToUpdate.getEmail());
            return studentToUpdate;
        }
        throw new Exception("O aluno não foi encontrado!");
    }
}
