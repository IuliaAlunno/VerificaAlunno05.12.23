import java.io.*;
public class Tester{
    public static void main (String [] args) {
        Point point= new Point(0, 0);
        Circle circle= new Circle(0,0,1.0);


        Boolean coordinataX= point.spostaX(10000);
        if(coordinataX==true){
            System.out.println("valore accettabile");
            System.out.println("coordinata x= "+point.getX());
        }else {
            System.out.println("valore troppo grande o troppo piccolo");
        }

        Boolean coordinataY= point.spostaY(7);
        if(coordinataY==true) {
            System.out.println("valore accettabile");
            System.out.println("coordinata y= " + point.getY());
        }else{
            System.out.println("valore troppo grande o troppo piccolo");
        }

    }
}