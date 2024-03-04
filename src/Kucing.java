/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farizall
 */
class Kucing extends Hewan implements Bersuara{
    public Kucing(String nama){
        super(nama);
    }
    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan lincah.");
    }
    @Override   
    public void bersuara() {
        System.out.println(nama + " mengeong : Meow!");
    }
}
