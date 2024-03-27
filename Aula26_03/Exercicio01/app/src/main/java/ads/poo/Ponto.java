package ads.poo;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanciaDoisPontos(Ponto p)
    {
        double difX = this.x - p.x;
        double difY = this.y - p.y;

        double dist = Math. sqrt(Math. pow(difX, 2) + Math. pow(difY, 2));
        
        return dist;
    }
    
}
