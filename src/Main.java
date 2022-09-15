public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача №1");

        int [] taskOne = new int [3];
        taskOne [0] = 1;
        taskOne [1] = 2;
        taskOne [2] = 3;

        double [] taskTwo = {1.57, 7.654, 9.986};

        int [] taskThree = {4, 44, 4444, 44444};

        // Задача 2
        System.out.println("Задача №2");
        System.out.print(taskOne[0] + ", ");
        System.out.print(taskOne[1] + ", ");
        System.out.print(taskOne[2]);

        System.out.println("");

        for (int i = 0; i < 2; i++) {
                System.out.print(taskTwo[i] + ", ");
            }
        System.out.print(taskTwo[2]);

        System.out.println(" ");

        for (int a = 0; a < 3; a++) {
            System.out.print(taskThree[a] + ", ");
        }
        System.out.print(taskThree[3]);

        System.out.println(" ");

        // Задача 3
        System.out.println("Задача №3");

        for (int b = 2; b >= 1; b--) {
            System.out.print(taskOne[b] + ", ");
        }
        System.out.println(taskOne[0]);

        for (int c = 2; c >= 1; c--) {
            System.out.print(taskTwo[c] + ", ");
        }
        System.out.println(taskTwo[0]);

        for (int d = 3; d >= 1; d--) {
            System.out.print(taskThree[d] + ", ");
        }
        System.out.println(taskThree[0]);

        // Задача 4
        System.out.println("Задача №4");
        for (int e = 0; e < 3; e++) {
            if (taskOne[e] % 2 == 0) {
            System.out.println(taskOne[e]);
            }
            else {
                System.out.println(taskOne[e]+1);
            }
        }










    }
}