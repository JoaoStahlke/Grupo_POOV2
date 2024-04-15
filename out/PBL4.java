package main;

public class Pessoa {

    private static int counter = 1;

    private int numeroPessoa;
    private String name;
    private String cpf;

    public Pessoa(String name, String cpf) {
        this.numeroPessoa = Pessoa.counter;
        this.name = name;
        this.cpf = cpf;
        Pessoa.counter += 1;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String toString() {
        return  "\nName: " + this.getName() +
                "\nCPF: " + this.getCpf();
    }

}