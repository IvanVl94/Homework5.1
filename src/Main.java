import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[3];
        {
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;

            System.out.println(weights[1]);

        }
        double[] numbers = {1.57, 7.654, 9.986};
        {
            numbers[0] = 1.57;
            numbers[1] = 7.654;
            numbers[2] = 9.986;


            double arr = numbers[1];
            System.out.println(numbers[1]);
            {
            }
        }


        int[] lucky = {12, 11, 10};
        {
            lucky[0] = 12;
            lucky[1] = 11;
            lucky[2] = 10;
            int luckyMonths = 0;
            System.out.println(lucky[luckyMonths]);
            {
            }

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weights = new int[3];
        {
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;

            for (int i = 0; i < weights.length - 1; i++) {
                System.out.print(weights[i] + ", ");
            }
            System.out.println(weights[weights.length - 1]);


            double[] numbers = {1.57, 7.654, 9.986};
            {
                numbers[0] = 1.57;
                numbers[1] = 7.654;
                numbers[2] = 9.986;

                for (int i = 0; i < numbers.length - 1; i++) {
                    System.out.print(numbers[i] + ", ");
                }
                System.out.println(numbers[numbers.length - 1]);

            }


            int[] lucky = {12, 11, 10};
            {
                lucky[0] = 12;
                lucky[1] = 11;
                lucky[2] = 10;
                for (int i = 0; i < lucky.length - 1; i++) {
                    System.out.print(lucky[i] + ", ");
                }
                System.out.println(lucky[lucky.length - 1]);

            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        {
            weights[0] = 1;
            weights[1] = 2;
            weights[2] = 3;

            for (int i = 2; i > 0; i--) {
                System.out.print(weights[i] + ", ");
            }
            System.out.println(weights[0]);

        }
        double[] numbers = {1.57, 7.654, 9.986};
        {
            numbers[0] = 1.57;
            numbers[1] = 7.654;
            numbers[2] = 9.986;


            for (int i = 2; i > 0; i--) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.println(numbers[0]);
        }


        int[] lucky = {12, 11, 10};
        {
            lucky[0] = 12;
            lucky[1] = 11;
            lucky[2] = 10;
            for (int i = 2; i > 0; i--) {
                System.out.print(lucky[i] + ", ");
            }
            System.out.println(lucky[0]);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
            }
            System.out.println(Arrays.toString(numbers));

    }
}
