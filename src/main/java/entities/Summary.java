package entities;

import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;
    private int openActivities;


    public Summary(int activeProjects) {
        this.activeProjects = activeProjects;
    }

    private Summary (int openActivities, LocalDate date){
        this.openActivities = openActivities;
        this.date = date;
    }


    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
