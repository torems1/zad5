package com.company;

public class Calculate {
    private int a;
    private int b;
    private int c;
    Disk disk = new Disk();


    public class Disk {
        public double diskCounter(){
            return  Math.pow(b,2)-4*a*c;
        }
        public void xCalc() {
            System.out.println("D= " + disk.diskCounter());
            if (disk.diskCounter() == 0) {
                double x1 = -b / (2 * a);
                System.out.println("first sqrt " + x1);
                double x2 = -b / (2 * a);
                System.out.println("second sqrt " + x2);
            } else if (disk.diskCounter() > 0) {
                double x1 = (-b + Math.sqrt(disk.diskCounter())) / (2 * a);
                System.out.println("first sqrt " + x1);

                double x2 = (-b + Math.sqrt(disk.diskCounter())) / (2 * a);
                System.out.println("second sqrt " + x2);
            } else {
                System.out.println("None answer");
            }
        }
        public  int getA(){
            return a;
        }
        public void setA(int a){
            this.a=a;
        }
        public  int getB(){
            return b;
        }
        public void setB(int b){
            this.b=b;
        }
        public  int getC(){
            return c;
        }
        public void setC(int c){
            this.c=c;
        }
    }
}
