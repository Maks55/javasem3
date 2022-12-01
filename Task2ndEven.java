// Задача 2: Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Iterator;

public class Task2ndEven {
    public void arrayNumbresList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
            int num = (int)(Math.random() * 100);
            numbers.add(num);
        }

        System.out.print("Выполнение второй задачи, удаление четных чисел: " + '\n');
        System.out.println(numbers);
        System.out.print("->");

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
 
        System.out.println(numbers);
    }
}
