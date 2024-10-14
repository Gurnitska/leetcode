package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeptemberOctober2024 {
//    "2 задачи:
//            - стрим найти сумму четных
//    Задача 2: Подсчет четных чисел
//    Дан список целых чисел. Необходимо:
//
//    Найти количество четных чисел в списке.
//    java
//    Копировать код
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//// Результат: 4 (четные числа: 2, 4, 6, 8)
    public int sumOfOdd(int[] array){
        return Arrays.stream(array)
                .filter(x -> x%2 == 0 )
                .sum();
    }
//- не стрим посчитать количество появлений определенных чисел"
    public long calculateAppearence(int[] array, int target){
        return Arrays.stream(array)
                .filter(x -> x== target)
                .count();
    }

//    Задача 1: Фильтрация и сортировка списка
//    Дан список строк, представляющий имена. Необходимо:
//
//    Отфильтровать имена, которые начинаются с буквы "A".
//    Отсортировать имена по алфавиту.
//    Собрать результат в новый список.
//            java
//    Копировать код
//    List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew");
//// Результат: ["Alice", "Anna", "Andrew"]

    public List<String> aNames(List<String> names){
        return names.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .toList();
    }

//    Задача 3: Преобразование списка объектов
//    Дан список объектов класса Person, где каждый объект имеет поля name и age. Необходимо:
//
//    Преобразовать список объектов Person в список их имен.
//    java
//    Копировать код
//    class Person {
//        String name;
//        int age;
//        // Конструктор, геттеры и сеттеры
//    }
//
//    List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
//// Результат: ["Alice", "Bob", "Charlie"]

    record Person(String name, int age){};
    public List<String> convertToNames(){
        List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        return people.stream()
                .map(Person::name)
                .toList();
    }
//    Задача 4: Поиск максимального значения
//    Дан список чисел. Необходимо:
//
//    Найти максимальное значение в списке с помощью Stream.
//    java
//    Копировать код
//    List<Integer> numbers = Arrays.asList(10, 20, 30, 5, 40, 15);
//// Результат: 40


//    Задача 5: Суммирование длины строк
//    Дан список строк. Необходимо:
//
//    Найти суммарную длину всех строк в списке.
//            java
//    Копировать код
//    List<String> words = Arrays.asList("Java", "Stream", "API", "Task");
//// Результат: 16 (4 + 6 + 3 + 3)
    public int sumStringLength(List<String> list){
        return list.stream()
                .map(String::length)
                .mapToInt(Integer::intValue)
                .sum();
    }
//    Задача 6: Группировка элементов
//    Дан список строк, представляющий названия городов. Необходимо:
//
//    Сгруппировать города по первой букве.
//            java
//    Копировать код
//    List<String> cities = Arrays.asList("Amsterdam", "Berlin", "Athens", "Barcelona", "Boston");
//// Результат: {"A": ["Amsterdam", "Athens"], "B": ["Berlin", "Barcelona", "Boston"]}

    public Map<Character, List<String>> groupByName(List<String> cities){
        return cities.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));
    }
//    Задача 7: Объединение строк
//    Дан список строк. Необходимо:
//
//    Объединить все строки в одну строку через запятую.
//    java
//    Копировать код
//    List<String> words = Arrays.asList("apple", "banana", "cherry");
//// Результат: "apple, banana, cherry"
    public String joinElements(){
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        return words.stream().collect(Collectors.joining(", "));
    }
//    Задача 8: Проверка всех элементов на условие
//    Дан список чисел. Необходимо:
//
//    Проверить, все ли числа в списке являются положительными.
//            java
//    Копировать код
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//// Результат: true (все числа положительные)
//
//    List<Integer> otherNumbers = Arrays.asList(1, -2, 3, 4, 5);
//// Результат: false (есть отрицательное число)

    public boolean chechNegative(List<Integer> numbers){
        return numbers.stream()
                .anyMatch(x-> x < 0);
    }
//    Задача 9: Уникальные элементы в списке
//    Дан список чисел, содержащий дубликаты. Необходимо:
//
//    Получить список уникальных чисел (удалить дубликаты).
//    java
//    Копировать код
//    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//// Результат: [1, 2, 3, 4, 5]
    public Set<Integer> removeDuplicates(List<Integer> numbers){
        return new HashSet<>(numbers);
    }
//    Задача 10: Преобразование двумерного массива в одномерный список
//    Дан двумерный массив целых чисел. Необходимо:
//
//    Преобразовать двумерный массив в одномерный список всех чисел.
//    java
//    Копировать код
//    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//// Результат: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    public int[] convertArray(int[][] array){
        return Stream.of(array)
                .flatMapToInt(IntStream::of)
                .toArray();

    }
}
