import rikkei.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        while (a < 0) {
            System.out.println("nhap tra ve a,lon hon");
            a = scanner.nextDouble();
        }
        quadraticEquation.setA(a);
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        quadraticEquation.setB(b);
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        quadraticEquation.setC(c);
        double detal = quadraticEquation.getDiscriminant();
        if (detal < 0){
            System.out.println("phuong trinh vo nghiem: ");
        } else if (detal == 0) {
            System.out.println("phuong trinh co nghiem kep: ");
            System.out.println("x = " + quadraticEquation.getRoot());
        } else {
            System.out.println("phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }
    }
}
