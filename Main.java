import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double averageOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Фильтруем только четные числа
                .mapToInt(Integer::intValue) // Преобразуем Integer в int для вычисления среднего значения
                .average() // Вычисляем среднее значение
                .orElse(0.0); // Если список пустой, то вернем 0.0

        System.out.println("Среднее значение четных чисел: " + averageOfEvenNumbers);
    }
}