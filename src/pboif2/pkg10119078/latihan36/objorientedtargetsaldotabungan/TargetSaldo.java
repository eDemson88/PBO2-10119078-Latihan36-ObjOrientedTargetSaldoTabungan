/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan36.objorientedtargetsaldotabungan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class TargetSaldo {
    public int saldoAwal , besarBunga, saldoTarget;
    public double bunga;
    
    public void getSaldoAwal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo Awal\t: Rp. ");
        saldoAwal = scanner.nextInt();
    }
    public void getBesarBunga(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bunga/Bulan(%)  : ");
        besarBunga = scanner.nextInt();
    }
    public void getSaldoTarget(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo target\t: Rp. ");
        saldoTarget = scanner.nextInt();
}
    public double targetSaldo(int parSaldoAwal, int parBesarBunga, int parSaldoTarget){
        for (int i = 1; saldoAwal <= saldoTarget; i++ ){
            bunga = ((saldoAwal * besarBunga) / 100 );
            saldoAwal += bunga;
        
            System.out.println("Saldo di bulan ke-"+ i + " Rp. " + saldoAwal);   
        }
        return(bunga); 
    }
}    
