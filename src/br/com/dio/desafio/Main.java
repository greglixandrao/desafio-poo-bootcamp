package br.com.dio.desafio;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setTitle("Iniciando em Java");
        javaCourse.setDescription("Curso para quem está iniciando na linguagem de programação Java");
        javaCourse.setWorkload(20);

        Course golangCourse = new Course();
        golangCourse.setTitle("Iniciando em Golang");
        golangCourse.setDescription("Curso para quem está iniciando na linguagem de programação Golang");
        golangCourse.setWorkload(4);

        Mentoring mentoringInPOO = new Mentoring();
        mentoringInPOO.setTitle("Programação Orientada a Objetos");
        mentoringInPOO.setDescription("Mentoria para quem deseja aprender sobre Programação Orientada a Objetos");
        mentoringInPOO.setDate(LocalDate.now());

        Bootcamp claroBootcamp = new Bootcamp();
        claroBootcamp.setName("Bootcamp Claro com Java e SpringBoot");
        claroBootcamp.setDescription("Bootcamp para quem deseja aprender Java e SpringBoot desde o início");
        claroBootcamp.getContents().add(javaCourse);
        claroBootcamp.getContents().add(mentoringInPOO);
        claroBootcamp.getContents().add(golangCourse);

        Dev firstDev = new Dev();
        firstDev.setName("Greg");
        firstDev.subscriBootcamp(claroBootcamp);
        System.out.println("Cursos ou Mentorias que o Greg está inscrito: " + firstDev.getSubscribedContent());
        firstDev.completeContent();
        System.out.println("----");
        System.out.println("Cursos ou Mentorias que o Greg está inscrito: " + firstDev.getSubscribedContent());
        System.out.println("Cursos ou Mentorias que o Greg concluiu: " + firstDev.getCompletedContent());
        System.out.println("XP total do Greg: " + firstDev.calculateTotalXp());

        System.out.println("----");
        Dev secondDev = new Dev();
        secondDev.setName("Helô");
        secondDev.subscriBootcamp(claroBootcamp);
        System.out.println("Cursos ou Mentorias que a Helô está inscrito: " + secondDev.getSubscribedContent());
        secondDev.completeContent();
        secondDev.completeContent();
        secondDev.completeContent();
        System.out.println("Cursos ou Mentorias que a Helô está inscrito: " + secondDev.getSubscribedContent());
        System.out.println("Cursos ou Mentorias que o Helô concluiu: " + secondDev.getCompletedContent());
        System.out.println("XP total da Helô: " + secondDev.calculateTotalXp());


    }
}
