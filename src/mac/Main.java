package mac;
class Complex { int real, img;
    Complex(int x, int y)
    { real=x; img=y;}
public String toString(){
        return real+"."+img;
}}

public class Main {

    public static void main(String[] args) {
        Complex c=new Complex(8,10);
        System.out.println(c); }
    }