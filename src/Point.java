import java.io.*;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }//costruttore

    public int getX(){
        return x;
    }//getX

    public int getY(){
        return y;
    }//getY

    public Boolean spostaX(int px){
        x+=px;
        if(x<=1000&&x>=0) {
            return true;
        }else{
            return false;
        }
    }//spostaX

    public Boolean spostaY(int py){
        y+=py;
        if(y<=1000&&y>=0) {
            return true;
        }else {
            return false;
        }
    }//spostaY
}

