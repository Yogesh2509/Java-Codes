public class cube {
    double l, b, h;              //member variable or instance variable
    static double k;
    public void setdata(double x, double y, double z) {
        l = x;
        b = y;
        h = z;

    }

    public void showdata() {          //member function or instance function
        System.out.println("Length is : " + l);             
        System.out.println("Breadth is : " + b);
        System.out.println("Height is : " + h);
        System.out.println("Value of k is : "+k);
    }
    static void setk(int p){            //this is just an example of static variable,,,,
        k=p; 
    }
}
class cubebox{
    public static void main(String[] args) {
        cube c1 = new cube();
        cube c2 = new cube();
        cube c3 = new cube();
        c1.setdata(3.5, 2.2, 3.2);
        c2.setdata(4.4, 5.5, 6.6);
        c3.setdata(4.9, 5.9, 6.9);
        cube.setk(5);
        c1.showdata();
        c2.showdata();
        c3.showdata();
    }
}
