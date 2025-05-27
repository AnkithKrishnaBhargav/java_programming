package Lab1_8;

import java.util.Scanner;

public class StringBufferHandles {
    
    public static void main(String[] args){

        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of sb1: " + sb1.capacity());
        
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of sb2: " + sb2.capacity()); 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer reversebuffer = new StringBuffer(input);
        reversebuffer.reverse();
        System.out.println("Reversed string: " + reversebuffer.toString());
        System.out.println("Capacity of reversebuffer: " + reversebuffer.capacity());
        scanner.close();

        String sbupper = reversebuffer.toString().toUpperCase();
        System.out.println("Uppercase reversed string: " + sbupper);
        
    }
}
