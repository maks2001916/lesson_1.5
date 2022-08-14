public class Main {
    public static void main(String[] args) {
        //первое задание
        System.out.println("Hello world!");
        int [] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        double [] numbersTwo = {1.57, 7.654, 9.986};
        int [] numbersThree = {5, 8, 13, 21, 49, 58};
        //второе задание
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(numbersTwo[0] + ", " + numbersTwo[1] + ", " + numbersTwo[2]);
        System.out.println(numbersThree[0] + ", " + numbersThree[1] + ", " + numbersThree[2] + ", " + numbersThree[3] + ", " + numbersThree[4] + ", " + numbersThree[5]);
        //третье задание
        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(numbersTwo[2] + ", " + numbersTwo[1] + ", " + numbersTwo[0]);
        System.out.println(numbersThree[5] + ", " + numbersThree[4] + ", " + numbersThree[3] + ", " + numbersThree[2] + ", " + numbersThree[1] + ", " + numbersThree[0]);
        //четвёртое задание
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
            System.out.print(numbers[i] + " ");
        }
            }
        }




