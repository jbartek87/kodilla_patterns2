package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67032134343243", "John", "Smith"},
            {"77032134343243", "Ivone", "Novak"},
            {"67832134343243", "Jessie", "Pinkman"},
            {"77202134343243", "Walter", "White"},
            {"99032134343243", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n){
        if(n>salaries.length){
            return "";
        }
        return  workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

