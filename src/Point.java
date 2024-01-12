public class Point {
    private int x;
    private int y;

    public Point(int x, int y ){
        this.x=x;
        this.y=y;
    }
    public int getX(){
      return this.x;
    }
    public void setX(int x){
       this.x=x ;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y ;
    }
    public double distance (int x , int y ){

        double distanceSquare= (this.x-x)*(this.x-x) + (this.y-y)*(this.y-y);

        return Math.sqrt(distanceSquare);
    }
    public double distance(Point p ){
        double distanceSquare= (this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y);

        return Math.sqrt(distanceSquare);
    }
    public double distance (){

        double distanceSquare= this.x*this.x + this.y*this.y;

        return Math.sqrt(distanceSquare);
    }
}
