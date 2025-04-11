package br.com.futurodev.estudantes.models;

import java.util.Objects;

public class Students {
    private Integer registration;
    private String name;
    private String email;

    public Students() {
    }

    public Students(Integer registration, String name, String email) {
        this.registration = registration;
        this.name = name;
        this.email = email;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("Estudante: %.2f - %s -  %s ", registration, name, email);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(registration, students.registration) && Objects.equals(name, students.name) && Objects.equals(email, students.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, name, email);
    }
}
