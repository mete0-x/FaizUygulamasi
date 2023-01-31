package com.mycompany.faizuygulamasi;

import java.util.Scanner;

public class NewClass {
public static void main(String[] args) {
   
Scanner scanner = new Scanner(System.in);
System.out.println("Bankamıza hoşgeldiniz. Faiz oranı %6'dır.");

int anapara,vade;
System.out.println("Yatırmak İstediğiniz tutar : ");
anapara = scanner.nextInt();
System.out.println("Paranızı yatırmak isteğiniz vade süresi : ");
vade = scanner.nextInt();

double toplampara = anapara ;
double faizoranı = 0.20;

for(int i = 1; i <= vade ; i++){

toplampara = (int)(toplampara * faizoranı) + toplampara;

    System.out.println(i +".Yılında toplam para : " + toplampara);


}

}
    
}
