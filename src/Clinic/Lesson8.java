/**
 * @author Inna Ignatovich
 * @Date 28.03.2026
 */
package Clinic;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        //Задача 1:
//Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//терапевта создать метод, который будет назначать врача пациенту согласно плану
//лечения:
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//лечить.
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Therapist therapist = new Therapist();

        System.out.println("Введите код лечения (1 - хирург, 2 - дантист, другое - терапевт):");
        int treatmentCode = sc.nextInt();

        patient.setTreatmentPlan(treatmentCode);
        therapist.assignDoctor(patient);

        System.out.println("Пациенту назначен врач: " + patient.getDoctor());

        patient.receiveTreatment();
    }
}
