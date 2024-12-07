public class Object1 {
    private int id;
    private String name;

    public Object1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Object1 myObject = (Object1) obj;
        return id == myObject.id && (name != null ? name.equals(myObject.name) : myObject.name == null);
    }

}