// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class Task3rdMaxMinMid {
    public void arrayNumbresList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
            int num = (int)(Math.random() * 100);
            numbers.add(num);
        }

        System.out.print("Выполнение третьей задачи: " + '\n');
        System.out.println(numbers);

        int maxNum = numbers.get(0);
        int minNum = numbers.get(0);
        int sumNum = 0;

        for (Integer i: numbers) {
            if (i > maxNum) {
                maxNum = i;
            }
            if (i < minNum) {
                minNum = i;
            }
            sumNum += i;
        }

        double n = numbers.size();
        double midNum = sumNum / n;
        
        System.out.print("Максимальное число в списке: ");
        System.out.println(maxNum);
        System.out.print("Минимальное число в списке: ");
        System.out.println(minNum);
        System.out.print("Среднее число этого списка: ");
        System.out.println(midNum);
    }
}
