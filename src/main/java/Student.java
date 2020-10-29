public class Student {
    //Instance vars
    private String firstName;
    private String lastName;
    private int classYear;

    //Default constructor
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.classYear = 2022;
    }   

    //Main constructor
    public Student(String firstName, String lastName, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classYear = classYear;
    }

    //Random doSomething method
    public void doSomething() {
        System.out.println("I am studying!");
    }

    //toString method
    @Override
    public String toString() {
        String newString = firstName + " , " + lastName + " , " + classYear;
        return newString;
    }

    //Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getClassYear() {
        return this.classYear;
    }

    //Setters
    public void setFirstName(String x) {
        this.firstName = x;
    }

    public void setLastName(String x) {
        this.lastName = x;
    }

    public void setClassYear(int x) {
        this.classYear = x;
    }
}