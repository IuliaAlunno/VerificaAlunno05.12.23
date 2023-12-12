public class Circle {
    private int centrox;
    private int centroy;
    private Double raggio;

    public Circle(int centrox, int centroy, Double raggio){
        this.centrox=centrox;
        this.centroy=centroy;
        this.raggio=raggio;
    }//costruttore

    public int getCentrox(){
        return centrox;
    }//getX

    public int getCentroy(){
        return centroy;
    }//getY

    public Boolean spostaX(int px){
        centrox+=px;
        return true;
    }//spostaX

    public Boolean spostaY(int py){
        centroy+=py;
        return  true;
    }//spostaY

    public Boolean puntoCerchio(Point point){
       Double distanza=Math.sqrt(Math.pow(point.getX() - centrox, 2) + Math.pow(point.getY() - centroy, 2));
       if(distanza<=raggio){
           return true;
       }else{
           return false;
       }
    }
}
