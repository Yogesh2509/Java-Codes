
class Student {

    int rollno;
    String name;
    double marks;

    public void setdata(int x, String y, double z) {
        rollno = x;
        name = y;
        marks = z;
    }

    public void showdata() {
        System.out.println("name is : " + name);
        System.out.println("rollno is : " + rollno);
        System.out.print("marks is : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdata(15, "harsh", 85.32);
        s1.showdata();
    }
}
