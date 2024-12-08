public class InnerClass3 { //внешний класс
    public class PublicInner {
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
    }


    protected class ProtectedInner {
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
    }


    private class PrivateInner {
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
    }

    class DefaultInner {
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
    }


    public void main() {

        //во внешнем классе можно создать экземпляр любого внутреннего класса:
        PublicInner innerPublic = new PublicInner();
        ProtectedInner innerProtected = new ProtectedInner();
        PrivateInner innerPrivate = new PrivateInner();
        DefaultInner innerDefault = new DefaultInner();

        // внутренний public: у внешнего класса есть доступ к любому методу или полю кроме private
        System.out.println(innerPublic.publicInt);
        System.out.println(innerPublic.protectedInt);
        //System.out.println(innerPublic.privateInt);  // ошибка
        System.out.println(innerPublic.publicInt);

        innerPublic.publicMethod();
        innerPublic.protectedMethod();
        innerPublic.defaultMethod();
        //innerPublic.privateMethod();        // ошибка

        // внутренний protected: у внешнего класса есть доступ к любому методу или полю кроме private
        System.out.println(innerProtected.publicInt);
        System.out.println(innerProtected.protectedInt);
        //System.out.println(innerProtected.privateInt);  // ошибка
        System.out.println(innerProtected.publicInt);

        innerProtected.publicMethod();
        innerProtected.protectedMethod();
        innerProtected.defaultMethod();
        //innerProtected.privateMethod();        // ошибка

        // внутренний default: у внешнего класса есть доступ к любому методу или полю кроме private
        System.out.println(innerDefault.publicInt);
        System.out.println(innerDefault.protectedInt);
        //System.out.println(innerDefault.privateInt);  // ошибка
        System.out.println(innerDefault.publicInt);

        innerDefault.publicMethod();
        innerDefault.protectedMethod();
        innerDefault.defaultMethod();
        //innerDefault.privateMethod();        // ошибка

        // внутренний private: у внешнего класса нет доступа к полям и методам


    }
}
