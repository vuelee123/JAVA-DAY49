package SchoolManagement;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main (String[]args){
        Teacher hector = new Teacher(1, "Hector", 500);
        Teacher brandon = new Teacher(2, "Brandon", 700);
        Teacher eric = new Teacher(3, "Eric", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(hector);
        teacherList.add(brandon);
        teacherList.add(eric);

        Student lee = new Student(1, "Lee", 4 );
        Student avis = new Student(2, "Avis Yang", 12 );
        Student kian= new Student(3, "Kian", 5 );

        List<Student> studentList = new ArrayList<>();
        studentList.add(lee);
        studentList.add(avis);
        studentList.add(kian);

        School ghs = new School (teacherList, studentList);
        Teacher pasha = new Teacher (6, "Pasha", 900);
        ghs.addTeacher(pasha);


        lee.payFees(5000);
        avis.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        hector.receiveSalary(hector.getSalary());
        System.out.println("GHS has spent for salary to " + hector.getName()+ " and now has $" + ghs.getTotalMoneyEarned());

        eric.receiveSalary(eric.getSalary());
        System.out.println("GHS has spent for salary to " + eric.getName()+ " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(avis);
        brandon.receiveSalary(brandon.getSalary());
        System.out.println(lee);

    }
}
