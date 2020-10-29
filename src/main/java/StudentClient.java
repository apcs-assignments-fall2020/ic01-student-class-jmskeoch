public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jason", "Skeoch", 2022);
        s1.doSomething();
        s2.doSomething();
        System.out.println(s1.getFirstName());
        System.out.println(s2.getLastName());
        System.out.println(s1.getClassYear());
        System.out.println(s2.getClassYear());
        System.out.println(s1);
        System.out.println(s2);
    }
}