package one.digitalinnovation;

import one.digitalinnovation.model.Curso;
import one.digitalinnovation.model.Mentoria;
import one.digitalinnovation.model.Bootcamp;
import one.digitalinnovation.model.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso2.setTitulo("curso spring boot");
        curso2.setDescricao("descrição curso spring boot");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de spring boot");
        mentoria2.setDescricao("descrição mentoria  spring boot");
        mentoria2.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devAngelo = new Dev();
        devAngelo.setNome("Angelo");
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Angelo:" + devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Angelo:" + devAngelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Angelo:" + devAngelo.getConteudosConcluidos());
        System.out.println("XP:" + devAngelo.calcularTotalXp());

        System.out.println("-------");

        Dev devGi = new Dev();
        devGi.setNome("Giovanna");
        devGi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovanna:" + devGi.getConteudosInscritos());
        devGi.progredir();
        devGi.progredir();
        devGi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Giovanna:" + devGi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Giovanna:" + devGi.getConteudosConcluidos());
        System.out.println("XP:" + devGi.calcularTotalXp());


    }
}