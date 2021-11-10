package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    private String name;
    private String matricula;
    private LocalDate dataNascimento;

    public Funcionario(String name, String matricula, LocalDate dataNascimento) {
        this.name = name;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
