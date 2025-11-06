/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author Mirzaa
 */
public class Main {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();//ini yang disebut polimorfisme
        p = new Manajer();//ini yang disebut polimorfisme
        
        Manajer m = new Manajer();
        m.gajiPokok  =  10000;
        m.nama = "Samsul";
        m.Tunjangan  =  5000;
        p = m;//ini yang disebut polimorfisme
        p.tampilData();
        
        m.tampilData();
        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "uchiha";pr.gajiPokok = 10000;pr.Bonus=120000;
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
    }
    public static void hitungGajiTotal(Pegawai p){
    
        if(p instanceof Programmer){
            Programmer prog = (Programmer)p;
            int gajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Programmer =" +gajiTot);
        }else if(p instanceof Manajer){
            Manajer man = (Manajer)p;
            int gajiTot = man.Tunjangan+man.gajiPokok;
            System.out.println("Gaji Total Manajer =" + gajiTot);
        }
        }
    }

