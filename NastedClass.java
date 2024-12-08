public interface ForNastedClass {
    // Вложенный класс в интерфейс
    class NestedClass {
        public static void method(){
            System.out.println("Nasted class method");
        }
    }
}

//Example.NestedClass.method(); //вызов метода вложенного класса 