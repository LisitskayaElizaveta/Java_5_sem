/*Исключение NullPointerException будет брошено при автоупаковке, если значение типа примитива (int, boolean ...)
 равно null.
 При автораспаковке оно произойдет, если объект-упаковка равен null и происходит попытка получить значение примитива.
 */
public class WrapperClass3 {
    public static void main(String[] args) {
        Integer obj1 = null;
        // автоупаковка примитивного типа в объект, который равен null
        obj1 = null;
        // распаковка из null
        int value = obj1;  // --NullPointerException
    }
}