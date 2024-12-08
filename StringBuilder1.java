public class StringBuilder1 {
    public static void main(String[] args) {
        // создание экземпляров
        StringBuilder stringBuilder = new StringBuilder("ABCD");
        StringBuffer stringBuffer = new StringBuffer("xyz");


        // append() - добавляет новую строку в конец строки
        System.out.print(stringBuilder);
        stringBuilder.append("Z");
        System.out.println(".append(Z): " + stringBuilder);

        // delete() - удаляет диапазон символов
        System.out.print(stringBuilder);
        stringBuilder.delete(2, 4);
        System.out.println(".delete(2, 4): " + stringBuilder);

        // insert() - вставляет строку на заданную позицию
        System.out.print(stringBuilder);
        stringBuilder.insert(2, "CD");
        System.out.println(".insert(2, CD): " + stringBuilder);

        //deleteCharAt() - удаляет один символ с указанной позиции
        System.out.print(stringBuilder);
        stringBuilder.deleteCharAt(4);
        System.out.println(".deleteCharAt(4): " + stringBuilder);

        //reverse() - перезаписывает строку в обратном порядке
        System.out.print(stringBuilder);
        stringBuilder.reverse();
        System.out.println(".reverse(): " + stringBuilder);


        // append() - добавление строки в конец
        System.out.print(stringBuffer);
        stringBuffer.append("!");
        System.out.println(".append('!')=" + stringBuffer);

        // charAt() - возвращает один символ с указанной позиции
        System.out.print(stringBuffer);
        char c = stringBuffer.charAt(2);
        System.out.println(".charAt(2): " + c);

        // substring() - возвращает подстроку данного диапазона
        System.out.print(stringBuffer);
        String subStr = stringBuffer.substring(2, 4);
        System.out.println(".substring(2, 3): " + subStr);

        // setLength() - устанавливает длину строки - при необходимости обрезает
        System.out.print(stringBuffer);
        stringBuffer.setLength(8);
        System.out.println(".setLength(8): " + stringBuffer);

        // capacity() - возвращает емкость буфера
        System.out.print(stringBuffer);
        System.out.println(".capacity(): " + stringBuffer.capacity());

    }

}