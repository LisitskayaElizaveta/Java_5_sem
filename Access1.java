class Access1 {
    public int intPublic = 1; // без ограничения доступа
    protected int intProtected = 2; //доступен внутри пакета и наследникам
    private int intPrivate = 3;  // доступен только внутри класса
    int intDefault = 4;  // без идентификатора доступа - Default. Доступен внутри пакета

    public void methodPublic() {
        System.out.println("Public method");
    }

    protected void methodProtected() {
        System.out.println("Protected method");
    }

    private void methodPrivate() {
        System.out.println("Private method");
    }

    void methodDefault() {
        System.out.println("Default method");
    }
}

class Access1Test {
    public static void main(String[] args) {
        Access1 obj = new Access1();

        // поля класса Access
        System.out.println("Public field: " + obj.intPublic);
        System.out.println("Protected field: " + obj.intProtected);
        //System.out.println("Private field: " + obj.intPrivate); //не находимся внутри класса, поэтому не можем обратиться
        System.out.println("Default field: " + obj.intDefault);


        // методы класса Access
        obj.methodPublic();
        obj.methodProtected();
        //obj.methodPrivate(); // не находимся внутри класса, поэтому метрод не может быть вызван
        obj.methodDefault();


    }
}