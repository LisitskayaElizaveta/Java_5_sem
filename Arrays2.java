import java.util.Arrays;
public class Arrays2 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 1, 2};

        // toString() - преобразует массив в строкову вида [a0, a1, ..., an]
        System.out.println("toString(array1): " + Arrays.toString(array1));

        // binarySearch() - бинарный поиск в отсортированном массиве - возвращает индекс искомого элемента
        // если элемент не найден вернет -1
        int i = Arrays.binarySearch(array1, 4);
        System.out.println("binarySearch(array1, 4): " + i);
        i = Arrays.binarySearch(array1, 0);
        System.out.println("binarySearch(array1, 0): " + i);

        // equals() - проверяет два массива на равенство
        boolean b = Arrays.equals(array1, array2);
        System.out.println("{1, 2, 3, 4, 5} = {6, 7, 8, 1, 2}?  -" + b);

        // compare() - сравнивает два массива в лексеграфическом смысле
        // вовращает отрицательное число, если первый меньше
        // положительное число, если первый больше
        // 0 если одинаковые массивы
        // NullPointerException - в случае если один из массивов null
        i = Arrays.compare(array1, array2);
        System.out.println("array1 <>? array2: " + i);  // Выведет отрицательное число (array1 < array2)

        // sort() - сортирует массив, по умолчанию в порядке возрастания. При подстановке во второй аргумент в порядке убывания
        System.out.println("array2: " + Arrays.toString(array2));
        Arrays.sort(array2);  // cортировка в порядке возрастания
        System.out.println("sort(array2): " + Arrays.toString(array2));

    }
}