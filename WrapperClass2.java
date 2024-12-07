public class WrapperClass2 {
    public static void main(String[] args) {
        // c помощью конструктора
        Boolean boolObj1 = new Boolean(true);  // в переменной записано true

        // с помощью valueOf
        Boolean boolObj2 = Boolean.valueOf(true);

        Boolean boolObj3 = Boolean.valueOf("true");   //  valueOf(String)

        // с помощью предопределенных значений boolean: true, false
        Boolean boolObj4 = true;
        //Boolean boolObj5 = false;

    }
}
