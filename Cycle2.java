public class Cycle2 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                i=i+1;
                continue; // если число четное, то переходим к следующему, не выполняя дальнейших инструкций
            }
            System.out.println(i); // выводим число - из-за continue будут выведены только нечетные
            if (i >= 100) {
                break;  // заканчивает цикл, если достигает 100
            }
            i=i+1;
        }
    }
}