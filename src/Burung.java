/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
class Burung extends Hewan implements Bersuara {
    public Burung(String nama){
        super(nama);
    }
    @Override
    public void bergerak() {
        System.out.println(nama + " terbang diangkasa.");
    }
    @Override
    public void bersuara() {
        System.out.println(nama + " berkicau : Chip Chip!.");
    }
}
