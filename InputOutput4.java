//интерфейс AutoCloseable гарантирует, что ресурсы будут корректно закрыты

class Resource implements AutoCloseable {
    public void operation() {
        System.out.println("Операция выполняется с ресурсом.");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрывается.");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.operation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
