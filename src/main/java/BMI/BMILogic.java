/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class BMILogic {
    public static void main(String[] args) {
        Scanner inputanku = new Scanner(System.in);
        System.out.print("berat badan kamu : ");
        double berat = inputanku.nextDouble();
        System.out.println("tinggi badan kamu : ");
        double tinggi = inputanku.nextDouble();
        BMI depi = new BMI(berat,tinggi);
        depi.hasil();
}}
