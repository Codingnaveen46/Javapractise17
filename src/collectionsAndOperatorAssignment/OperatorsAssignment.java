package collectionsAndOperatorAssignment;

import java.util.*;

public class OperatorsAssignment {

    public static void main(String[] args) {

        // Employee details
        List<String> employeesNames = Arrays.asList("Alice Johnson", "Bob Smith", "Carol Davis",
                "David Brown", "Eva Green");
        List<Integer> empSalary = Arrays.asList(75000, 68000, 82000, 90000, 60000);
        List<Integer> empExperience = Arrays.asList(5, 3, 7, 10, 2);
        List<Float> empRatings = Arrays.asList(4.2f, 3.8f, 4.5f, 2f, 3.5f);

        // Hike percentage Map (manually calculated)
        Map<String, Double> employeeHikePercentage = new HashMap<>();

        // Calculate hike for Alice Johnson
        double hikeAlice = (empSalary.get(0) * (empRatings.get(0) >= 4 ? 15 : empRatings.get(0) >= 3 ? 10 : 3) / 100.0)
                + (empRatings.get(0) >= 4 ? 1500 : empRatings.get(0) >= 3 ? 1200 : 300)
                + (empExperience.get(0) >= 5 ? 5000 : 0);
        double hikeAlicePercentage = (hikeAlice / empSalary.get(0)) * 100;
        System.out.println(employeesNames.get(0) + " has a hike percentage of " + hikeAlicePercentage + "%");


        // Calculate hike for Bob Smith
        double hikeBob = (empSalary.get(1) * (empRatings.get(1) >= 4 ? 15 : empRatings.get(1) >= 3 ? 10 : 3) / 100.0)
                + (empRatings.get(1) >= 4 ? 1500 : empRatings.get(1) >= 3 ? 1200 : 300)
                + (empExperience.get(1) >= 5 ? 5000 : 0);
        double hikeBobPercentage = (hikeBob / empSalary.get(1)) * 100;
        System.out.println(employeesNames.get(1) + " has a hike percentage of " + hikeBobPercentage + "%");

        // Calculate hike for Carol Davis
        double hikeCarol = (empSalary.get(2) * (empRatings.get(2) >= 4 ? 15 : empRatings.get(2) >= 3 ? 10 : 3) / 100.0)
                + (empRatings.get(2) >= 4 ? 1500 : empRatings.get(2) >= 3 ? 1200 : 300)
                + (empExperience.get(2) >= 5 ? 5000 : 0);
        double hikeCarolPercentage = (hikeCarol / empSalary.get(2)) * 100;
        System.out.println(employeesNames.get(2) + " has a hike percentage of " + hikeCarolPercentage + "%");

        // Calculate hike for David Brown
        double hikeDavid = (empSalary.get(3) * (empRatings.get(3) >= 4 ? 15 : empRatings.get(3) >= 3 ? 10 : 3) / 100.0)
                + (empRatings.get(3) >= 4 ? 1500 : empRatings.get(3) >= 3 ? 1200 : 300)
                + (empExperience.get(3) >= 5 ? 5000 : 0);
        double hikeDavidPercentage = (hikeDavid / empSalary.get(3)) * 100;
        System.out.println(employeesNames.get(3) + " has a hike percentage of " + hikeDavidPercentage + "%");

        // Calculate hike for Eva Green
        double hikeEva = (empSalary.get(4) * (empRatings.get(4) >= 4 ? 15 : empRatings.get(4) >= 3 ? 10 : 3) / 100.0)
                + (empRatings.get(4) >= 4 ? 1500 : empRatings.get(4) >= 3 ? 1200 : 300)
                + (empExperience.get(4) >= 5 ? 5000 : 0);
        double hikeEvaPercentage = (hikeEva / empSalary.get(4)) * 100;

        System.out.println(employeesNames.get(4) + " has a hike percentage of " + hikeEvaPercentage + "%");
    }
}
