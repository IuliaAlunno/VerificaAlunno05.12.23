import java.io.*;
public class Tester{
    public static void main (String [] args) {
        Point point= new Point(0, 0);
        Circle circle= new Circle(0,0,1.0);
        Circle circle1= new Circle(0,0,1.0);
        Circle circle2= new Circle(0,0,1.0);
        Circle circle3= new Circle(0,0,1.0);


        Boolean coordinataX= point.spostaX(10000);
        if(coordinataX==true){
            System.out.println("valore accettabile");
            System.out.println("coordinata x= "+point.getX());
        }else {
            System.out.println("valore troppo grande o troppo piccolo");
        }//coordinata x point



        Boolean coordinataY= point.spostaY(7);
        if(coordinataY==true) {
            System.out.println("valore accettabile");
            System.out.println("coordinata y= " + point.getY());
        }else{
            System.out.println("valore troppo grande o troppo piccolo");
        }// coordinata y point



        Boolean centrox= circle.spostaX(5);
        Boolean centroy= circle.spostaY(2);


        Point puntoTest = new Point(1,3);
        Boolean puntoNelCerchio= circle.puntoCerchio(puntoTest);
        if(puntoNelCerchio==true){
            System.out.println("punto nel cerchio");
        }else{
            System.out.println("punto fuori dal cerchio");
        }



    }
}