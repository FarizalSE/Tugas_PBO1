/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
class Ular extends Hewan implements Bersuara {
    public Ular(String nama){
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bberjalan lincah dan melata");
    }
    @Override
    public void bersuara() {
        System.out.println(nama + " mendesis : Shhhhh!.");
    }
}
