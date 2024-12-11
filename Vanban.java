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
public class Vanban {
    Scanner sc =new Scanner(System.in);
    private String text;
    
    public Vanban()
    {
        this.text="";
    }
    public Vanban(String st)
    {
        this.text=st;
    }
    public String setText()
    {
        return text;
    }
    public void setText(String st)
    {
        this.text=st;
    }
    public void nhap()
    {
        System.out.print("Nhap mot xau ki tu: "); text=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("Xau do la: "+this.text);
    }
    public int countWords()
    {
        if(text==null||text.trim().isEmpty())
        {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
     public int countCharH() {
        // Chuyển toàn bộ văn bản thành chữ thường
        String lowerCaseText = text.toLowerCase();
        
        // Đếm số lần xuất hiện ký tự 'h'
        int count = 0;
        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (lowerCaseText.charAt(i) == 'h') {
                count++;
            }
            
        }
         return count;
        
     } 
     public void Hamchuanhoa()
     {
         String temp="";
         String[] a = text.split("\\s+");
         for(int i=0;i<a.length;i++)
         {
             temp+=a[i]+" ";
         }
         //xoa khoang trang o 2 dau
        System.out.println(temp.trim());
         
          // Thay thế tất cả khoảng trắng liên tiếp giữa các từ thành một dấu cách duy nhất
        //text = text.replaceAll("\\s+", " ");
     }
}
