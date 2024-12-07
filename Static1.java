public class Static1 {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        printVars();  // Вызов из другого статического метода

        Static1.printVars(); // Вызов через класс

        Static1 obj = new Static1();
        obj.printVars();    // Вызов через экземпляр класса

    }
}