class Student {
    public int ID ;
    public String name ;
    public int addmission ;
    public double GPA ;
    
    public Student(int id, String name, int addmission, double GPA) {

        this.ID = id;
        this.name = name;
        this.addmission = addmission;
        this.GPA = GPA;
}

public void showdetails() {
    System.out.println("Student ID: " + ID);
    System.out.println("name: " + name);
    System.out.println("addmission: " + addmission);
    System.out.println("GPA: " + GPA);
}
public void details() {
    System.out.println();
}
public int getid(int id) {
    return id;
}
public void setid(int id) {
    this.ID = id;
}
public String getname() {
    return name;
}
public void setname (String name) {
    this.name = name;
}
public int getaddmission(int addmission) {
    return addmission;
}
public void setaddmission(int addmission) {
    this.addmission = addmission;
}
public double getGPA() {
    return GPA ;
}
public void setGPA(double GPA) {
    this.GPA = GPA ;
}
public class studyid {
public static void main(String[] args) {
Student student = new Student(65022623, "GAY", 2023, 4.00);

student.showdetails();
// testrun Constructor
student.setid(6521148);
student.setname("GUY");
student.setGPA(3.9);

student.showdetails();
}
}
}
