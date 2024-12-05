public class Operation1 {
    public static void main(String[] args) {
        // Операторы присваивания
        int a = 1; // a = 1
        a += 2; // a = 3
        a -= 4; // a = -1
        a *= 5; // a = -5
        a /= -5; // a = 1
        a %= 5; // a = 1

        String str = "abc";
        str += "+defg"; // str = "abc+defg" - конкатенация

        // оператор (?:)
        int c = 1, d = 2;
        int min = (c > d) ? d : c; // min = 1

        //операторы (||, &&)
        boolean b1 = true, b2 = false;
        boolean b3 = (b1||b2); // =true - логическое сложение
        boolean b4 = (b1&&b2); // =false - логическое умножение

        //операторы (|, ^, &)
        int bit1 = 1;  // представление для побитовых операций 0001
        int bit2 = 5;  // представление для побитовых операций 0101
        int bit3=(bit1|bit2); // =0101 - ИЛИ побитовое
        int bit4=(bit1^bit2); // =0100 - ИСКЛЮЧАЮЩЕЕ ИЛИ побитовое
        int bit5=(bit1 & bit2); //=0001 - И


        // Операторы сравнения
        // x=1; y=2
        // (x == y) // false
        // (x > y) // false
        // (x < y) // true
        // (x>=y) // false
        // (x <=  y) // true

        // (>>, >>>, <<)
        int s = -2; // 1000
        System.out.println("s>>1: " + (s >> 1));
        System.out.println("s>>>1: " + (s >>> 1));
        System.out.println("s<<1: " + (s << 1));

        // операторы (+, -, *, /, %)
        int i1 = 7;
        int i2 = 3;

        System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));
        System.out.println(i1 + "-" + i2 + "=" + (i1 - i2));
        System.out.println(i1 + "*" + i2 + "=" + (i1 * i2));
        System.out.println(i1 + "/" + i2 + "=" + (i1 / i2));
        System.out.println(i1 + "%" + i2 + "=" + (i1 % i2));


        // операторы (++, --, ~, !)
        int k = 1;
        System.out.println("Префиксная форма: " + (++k)); // до вывода прибавляется 1 (до строки k=1, ++k - в k записывается k+1, потом выводится)
        System.out.println("Текущее значение: " + (k));
        System.out.println("Постфиксная форма: " + (k++)); // сначала выводится значение, потом прибавляется 1
        System.out.println("Текущее значение: " + (k));
        System.out.println("Постфиксная форма: " + (k--)); // сначала выводится значение, потом вычитается 1
        System.out.println("Префиксный форма: " + (--k));


        int bytes = 12;
        System.out.println("Инверсия: " + (~bytes)); // побитовая инверсия

        boolean bool1 = true;
        System.out.println("Логическое НЕ: " + (!bool1)); // false
        System.out.println("Логическое НЕ: " + (!false)); //true

        // Группировка
        int l = 2 + 2 * 2; // l=6
        int m = (2 + 2) * 2; // m=8

        //Обращение к элементам массива
        int[] arr = {1, 2, 3}; // arr[0]=1 arr[1]=2 arr[2]=3
        System.out.println("Первый элемент: " + arr[0]);
        System.out.println("Второй элемент: " + arr[1]);
    }
}
