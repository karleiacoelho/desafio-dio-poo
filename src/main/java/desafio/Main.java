package desafio;

import desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargahoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
