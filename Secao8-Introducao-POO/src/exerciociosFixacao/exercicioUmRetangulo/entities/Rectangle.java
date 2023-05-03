package exerciociosFixacao.exercicioUmRetangulo.entities;

public class Rectangle {

    public double wigth;
    public double heigth;

    public double area(){
        double area = wigth * heigth;
        return area;
    }

    public double perimeter(){
        double perimeter = 2 * (wigth + heigth);
        return perimeter;
    }

    public double diagonal(){
        double diagonal = Math.sqrt((wigth*wigth) + (heigth*heigth));
        return diagonal;
    }

    public String toString() {
        return "AREA = " + String.format("%.2f%n", area())
                + "PERIMETER = " + String.format("%.2f%n", perimeter())
                + "DIAGONAL = " + String.format("%.2f%n", diagonal());
    }
}
