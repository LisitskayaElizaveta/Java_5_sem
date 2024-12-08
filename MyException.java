public class MyException extends Exception {

    public MyException() {         // конструктор без параметров
    }

    // конструктор от сообщения об ошибки
    public MyException(String message) {
        super(message);
    }

    // конструктор от другого исключения
    public MyException(Throwable cause) {
        super(cause);
    }
}
