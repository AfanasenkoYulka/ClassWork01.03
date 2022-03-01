package org.itstep;

public class CycleFor2 {
    public static void main(String[] args) {
        //Счетчик имеется только у одного человека.
        //При этом первый поднимается вверх, а второй спускается вниз
        for (int i = 0; i < 10; i++) { //10
            System.out.println(i);
            System.out.println(" ");
            System.out.println(9 - i);
            // for (int i=0; i<10; i++; i--) {
            System.out.println(i);
            System.out.println(" ");
            System.out.println(9 - i);

        }

    }
}
