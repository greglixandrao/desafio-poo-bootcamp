package br.com.dio.desafio.domain;

public class Course extends Content {

    private int workload;

    @Override
    public double calculateXP() {
        return DEFAULT_XP * workload;
    }

    public Course() {
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Título='" + getTitle() + '\'' +
                ", Descrição=' " + getDescription() + '\'' +
                ", Carga Horária= " + workload +
                '}';
    }
}
