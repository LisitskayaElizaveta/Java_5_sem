public class String1 {
    public static void main(String[] args) {
        String str = " ABC def GHI    jk ";
        // toLowerCase() - приводит строку к нижнему регистру
        System.out.println("toLowerCase("+str+")="+str.toLowerCase());

        // toUpperCase() - приводит строку к верхнему регистру
        System.out.println("toUpperCase("+str+")="+str.toUpperCase());

        // charAt(int index) - возвращает символ по  индексу
        System.out.println("charArt(2)=" + str.charAt(2));

        //length() - возвращает длину строки
        System.out.println("length("+str+")=" + str.length());

        // replace(char oldChar, char newChar) - заменяет все вхождения oldChar на newChar.
        System.out.println("Replace ' ' with ',': " + str.replace(' ', ','));

        // trim() - удаляет пробелы с начала и конца строки
        System.out.println("trim(str):" + str.trim() + "/end");

        // split(String regex) - разбивает строку на массив строк
        String[] strArray = str.split(" ");

        // contains(CharSequence sequence) - проверяет, содержит ли строка указанную строку
        System.out.println("Contains(ABC)= " + str.contains("ABC"));
        System.out.println("Contains(xyz)= " + str.contains("xyz"));

        // substring(int beginIndex, int endIndex) - извлекает подстроку c заданными индексами
        System.out.println("substring(1, 5)= " + str.substring(1, 5));

        // indexOf(String str) - возвращает индекс первого вхождения
        System.out.println("indexOf(GHI): " + str.indexOf("GHI"));



    }
}