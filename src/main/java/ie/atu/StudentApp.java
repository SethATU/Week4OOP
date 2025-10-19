package ie.atu;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StudentApp { public static void main(String[] args)
{
    //array list
    ArrayList<Students> studentArrayList = new ArrayList<Students>();

    Scanner sc = new Scanner(System.in);
    Students student1; //create a Student using constructor

    int count = 0, i = 0;
    System.out.print("How many students do you want to enter? : ");
    count = sc.nextInt();
    sc.nextLine();

    while (i < count) {
        //prompts user for name, email, course
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your email: ");
        String email = sc.nextLine();
        System.out.print("Please enter your course: ");
        String course = sc.nextLine();

        //adding the new Student to students
        student1 = new Students();
        student1.setName(name);
        student1.setEmail(email);
        student1.setCourse(course);
        studentArrayList.add(student1);

        i++;
    }

    System.out.println("Student List:");
    for (Students Students : studentArrayList)
    {
        //print name, email, course using getters
       System.out.println(Students.name);
       System.out.println(Students.email);
       System.out.println(Students.course);
    }



    }
}
