/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author ASUS
 */
public class BMI {
    
    double berat;
    double tinggi;
    
    public BMI (double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi / 100;
    }
    
    public double hitung(){
        return berat / (tinggi * tinggi);
    }
    
    public void hasil(){
        double BMI = hitung ();
        if (BMI < 18.5) {
            System.out.println("termasuk kategori kurus");
        } else if (BMI < 25){
            System.out.println("termasuk kategori ideal");
        } else if (BMI < 30){
            System.out.println("termasuk kategori gemuk");
        } else {
            System.out.println("termasuk kategori obesitas");
        } 
            System.out.printf("hasil BMI anda : %.1f\n" , hitung());
    }
}
