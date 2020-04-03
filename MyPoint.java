package Buoi6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public  MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return  "MyPoint(" + x +", "+ y + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public String getPoints() {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
        }
        return getPoints();
    }
}
