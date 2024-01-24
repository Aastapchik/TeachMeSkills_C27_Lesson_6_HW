package com.lesson7.homework.task2;


public class runner {

    public static void main(String[] args) {

        student A = new student("Astapchik", "Artyom", 22, 2281337);
        student B = new student("Irgalieva", "Anastasiya", 22, 4753245);
        student C = new student("Ilkevich", "Alina", 21, 225743);
        student D = new student("Karalchuk", "Artyom", 22, 177532);
        student E = new student("Krayko", "Nikita", 23, 775198);
        student F = new student("Maneev", "Oleg", 25, 5673486);
        student[] students = new student[]{A, B, C, D, E, F};
        for (com.lesson7.homework.task2.student student: students) {
            System.out.println(student.surname + " " + student.name + " " + student.age + student.passNum);
        }


    }
}
