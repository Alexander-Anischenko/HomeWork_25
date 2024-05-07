package homeWork_25;
/* 1. Создайте проект
2. Напишите программу которая считает сумму чисел от 1 до числа X
(где значение X равняется произведению дня вашего рождения на год)*/
//Поменяйте число X на число Y (где значение Y равняется произведению месяца вашего рождения на год)

public class SumOfNumbers {
    public static void main(String[] args) {

        int y = 7 * 1979;
        System.out.println("X = " + y);
        int sum = calculateSum(y);
        System.out.println("Sum of the numbers from 1 to " + y + " = " + sum);
    }

    private static int calculateSum(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum+= i;
        }
        return sum;
    }
}
