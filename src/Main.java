public class Main {
    public static void main(String[] args) {


        //task1
        System.out.println("Task 1");
        for(byte i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        //task2
        System.out.println("Task 2");
        for(byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        //task3
        System.out.println("Task 3");
        for(int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }


        //task4
        System.out.println("Task 4");
        for(byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }




        //task5
        System.out.println("Task 5");
        for(int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " year is leap");
        }


        //task6
        System.out.println("Task 6");
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }


        //task7
        System.out.println("Task 7");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }


        //task8
        System.out.println("Task 8");
        int deposit = 50_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Month " + i + " total deposit will be " + total + " $");
        }


        //task9
        System.out.println("Task 9");
        int deposit1 = 50_000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = (int) ((double) total1 + ((total1 *0.5) / 100));
            total1 = (total1 + deposit1);
            System.out.println("Month " + i + " total deposit will be " + total1 + " $");
        }


        //task10
        System.out.println("Task 10");
        int a = 2;
        for(int i = 1; i < 11; i++){
            System.out.println("2 * " + i + " = " + (a * i));
        }


    }
}