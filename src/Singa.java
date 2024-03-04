/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
class Singa extends Hewan implements Bersuara{
    public Singa(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak(){
    System.out.println(nama + " berjalan sangat cepat!.");
    }
    
    @Override
    public void bersuara(){
    System.out.println(nama + " mengaum : Rawr!");
    }
}
