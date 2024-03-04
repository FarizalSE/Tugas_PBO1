/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
class Anjing extends Hewan implements Bersuara {
    public Anjing (String nama){
        super(nama);
    }
    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan empat kaki.");
    }
    @Override
    public void bersuara() {
        System.out.println(nama + " menggonggong : Woof!");
    }
}
