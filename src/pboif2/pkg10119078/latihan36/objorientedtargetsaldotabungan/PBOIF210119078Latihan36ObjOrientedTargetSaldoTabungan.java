/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan target saldo tabungan
 */
package pboif2.pkg10119078.latihan36.objorientedtargetsaldotabungan;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan36ObjOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetSaldo target =  new TargetSaldo();
        
        target.getSaldoAwal();
        target.getBesarBunga();
        target.getSaldoTarget();
        target.targetSaldo(target.saldoAwal, target.besarBunga, target.saldoTarget);
    }
    
}
