package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoring extends Content{

    private LocalDate date;

    @Override
    public double calculateXP() {
        return DEFAULT_XP  + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "Título='" + getTitle() + '\'' +
                ", Descrição=' " + getDescription() + '\'' +
                "Data=" + date +
                '}';
    }
}
