public class InnerClass2 {  //внешний класс
    private int privateInt = 1;
    protected int protectedInt = 2;
    public int publicInt = 3;
    int defaultInt = 4;

    private void privateMethod() {
        System.out.println("Private");
    }

    protected void protectedMethod() {
        System.out.println("Protected");
    }

    public void publicMethod() {
        System.out.println("Public");
    }

    void defaultMethod() {
        System.out.println("Default");
    }

    public class InnerClass {
        public void main() {
            // Внутренний класс имеет доступ ко всем полям и методам внешнего класса,
            // в т.ч. со спецификаторами доступа private
            System.out.println("Поле внешнего класса private: " + privateInt);
            System.out.println("Поле внешнего класса protected: " + protectedInt);
            System.out.println("Поле внешнего класса public: " + publicInt);
            System.out.println("Поле внешнего класса default: " + defaultInt);

            privateMethod();   // внутренний класс имеет доступ ко всем методам внешнего
            protectedMethod();
            publicMethod();
            defaultMethod();
        }
    }
}