public class Employee {
    /** just a placeholder class to show the instantiation
     of an Object array */
    private String name;
    private String id;

    public Employee() {
        name = "";
        id = "";
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString(){
        return "Name " + name + " ID: " + id;
    }

}