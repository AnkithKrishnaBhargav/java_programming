package Lab1_8;

public class Boxing {
    
    public static void main(String[] args) {
        System.out.println("Boxing Demonstration\n");

        System.out.println("Boxed Values:");
        Integer i = 5; 
        Double d = 5.5;
        Character c = 'A';
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);

        System.out.println("\nUnboxed Values:");
        int unboxedInt = i; 
        double unboxedDouble = d;
        char unboxedChar = c;
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble); 
        System.out.println("Unboxed Character: " + unboxedChar);
}
}
