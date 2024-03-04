/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
public class Polymorphism {
    public static void main(String[] arg){
        try {
            Anjing anjing = new Anjing("Bobby");
            anjing.bergerak();
            anjing.bersuara();
            
            Kucing kucing = new Kucing("Kertanegara");
            kucing.bergerak();
            kucing.bersuara();
            
            Burung burung = new Burung("Papilow");
            burung.bergerak();
            burung.bersuara();
            
            Singa singa = new Singa("RajaSinga");
            singa.bergerak();
            singa.bersuara();
            
            Ular ular = new Ular("Python");
            ular.bergerak();
            ular.bersuara();
            
            throw new KesalahanHewan("Kesalahan pada hewan");
            
        } catch (KesalahanHewan e) {
            System.out.println("Terjadi kesalahan pada hewan : " + e);
        } catch ( Exception e ) {
            System.out.println("Terjadi kesalahan : " + e);
        }
    }
}
