/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author Manh Tuan
 */
public class main {
    public static void main(String[] args)
    {
        Vanban vb = new Vanban();
        System.out.println("----------------------------------");
        vb.nhap();
        System.out.println("So tu trong xau la: "+vb.countWords());
        System.out.println("So ki tu H trong xau la: "+vb.countCharH());
        vb.Hamchuanhoa();
   
    }
    
}
