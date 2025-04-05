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

    public String toString(){
        return String.format("Estudante: %.2f - %s -  %s ", registration, name, email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, name, email);
    }

}
