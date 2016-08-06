/*
 * A test driver for Person and its subclasses.
 */
 package UTS;
public class TestPerson {
   public static void main(String[] args) {
      /* Test Student class */
      Student s1 = new Student("Justin Brand", "1 Happy Ave");
      s1.addCourseGrade("ID106", 98);
      s1.addCourseGrade("ID108", 69);
      s1.printGrades();
      System.out.println("Average is " + s1.getAverageGrade());
      
      /* Test Teacher class */
      Teacher t1 = new Teacher("James Boun", "7 sunset way");
      System.out.println(t1);
      String[] courses = {"ID106", "ID108", "ID106"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added.");
         } else {
            System.out.println(course + " cannot be added.");
         }
      }
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " removed.");
         } else {
            System.out.println(course + " cannot be removed.");
         }
      }
   }
}