public class Student extends Person {
   private int classYear;

   public Student(String a, String b, int c) {
       super(a, b);
       this.classYear = c;
   }

   public Student() {
       super("John", "Pascal");
       this.classYear = 2024;
   }
   
   public int getClassYear() {
       return this.classYear;
   }

   public void setClassYear(int x) {
       this.classYear = (x < 2025 && x > 2020) ? x : this.classYear;
   }
}