/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author Manh Tuan
 */
public class Sophuc {

    Scanner sc = new Scanner(System.in);
    private float ao, thuc;

    public Sophuc() {
    }
    public float getsothuc()
    {
        return thuc;
        
    }
    public float getsoao()
    {
        return ao;
    }

    public Sophuc(float a, float b) {
        this.thuc = a;
        this.ao = b;
    }

    public void nhap() {
        System.out.print("Nhap so thuc: ");
        thuc = sc.nextFloat();
        System.out.print("Nhap so ao: ");
        ao = sc.nextFloat();
    }

    public void xuat() {
        String Thuc = String.format("%.0f", thuc);
        String Ao = String.format("%.0f", ao);  
        if (thuc != 0) {
             System.out.print(Thuc);
        } 

        if (ao == 1) {
            System.out.println(" +j");
        } else if (ao > 0) {
            System.out.println(" +" + Ao + "j");
        } else if (ao < 0) {
            System.out.println(Ao + "j");
        }

    }
    public void cong(Sophuc a,Sophuc b)
    {
        thuc=a.getsothuc()+b.getsothuc();
        ao=a.getsoao()+b.getsoao();  
    }
    
    public void nhan(Sophuc a,Sophuc b)
    {
        
        thuc=a.getsothuc()*b.getsothuc()-a.getsoao()*b.getsoao();
        ao=a.getsothuc()*b.getsoao()+a.getsoao()*b.getsothuc();
    }
}
