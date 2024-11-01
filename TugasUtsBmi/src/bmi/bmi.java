
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author salfa
 */
public class bmi {
    
    public static void main(String[] agrs) {
        
     Scanner in = new Scanner (System.in);
     
     String jk;
     float  tinggi, berat, bmi, meter;
     
     System.out.println("KALKULATOR BMI");
     System.out.println("Masukan jenis kelamin (a.Laki-laki) | (b.Perempuan) : ");
     jk = in.next();
     System.out.println("Masukkan tinggi badan");
     tinggi = in.nextFloat();
     System.out.println("Masukkan berat badan");
     berat = in.nextFloat();
     
     meter = tinggi/100;
     bmi=(berat/(meter*meter));
     
     System.out.println("====================");
     System.out.println("BMI : "+bmi+"");
     
     
    if (bmi <18){
        System.out.println("Berat badan kurang");
    }
    else if (bmi> 18 && bmi <=24){
        System.out.println("Berat badan ideal");
    }
    else if (bmi > 24 && bmi <=29){
        System.out.println("Berat badan berlebih");
    }
    else if (bmi > 29){
        System.out.println("Obesitas");
    }
    
    
    }
}


