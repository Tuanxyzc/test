/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author Manh Tuan
 */
public class Mainn {
    public static void main(String[] args)
    {
        Sophuc p=new Sophuc();
        Sophuc p1=new Sophuc();
        Sophuc p2=new Sophuc();
        p1.nhap();
        p2.nhap();
        p1.xuat();
        p2.xuat();
        p.cong(p1,p2);
        p.xuat();
        p.nhan(p1,p2);
        p.xuat();
    }
    
}
