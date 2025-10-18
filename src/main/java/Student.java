package ie.atu;

public class Student {

    String name;
    String email;
    String course;

    //constructor
    public Student()
    {
        System.out.println("Student constructor");
        this.name = "";
        this.email = "";
        this.course = "";
    }

    //getters
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getCourse()
    {
        return course;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }
}
