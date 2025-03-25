package com.example.demofx.service;

public class Calculate1 {

    public double plotvoz;
    public double deltP;
    public double Z;
    public double qbaz;
    public double F;
    public double Psred;
    public double tproduv;


    public double Q1;
    public double Q2;
    public double Q3;
    public double Q4;
    public double Q5;


    public void method1(double Ddiaf,
                        double C,
                        double Pnp,
                        double pG,
                        double T,
                        double L,
                        double dvnutr,
                        double patm,
                        double pzab,
                        double pust,
                        double kolproduv, double plotvoz) {
        this.plotvoz=plotvoz;
        deltP = pG / plotvoz; //Относительная плотность по воздуху
        System.out.println("Относительная плотность по воздуху"+deltP);
        Z = 1-((10.2*Pnp-6)*(0.345/100*deltP-0.466/1000)+0.015)*(1.3-0.0144*(T-283.2)); //Фактор сжимаемости природного газа
        System.out.println("Фактор сжимаемости природного газа"+Z);
        qbaz = C*Pnp/Math.sqrt(deltP*T*Z); //Базовый дебит скважины
        System.out.println("Базовый дебит скважины"+qbaz);
        F = (3.14*Math.pow(dvnutr,2))/4/1000; //Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)
        System.out.println("Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)"+F);
        Psred = (pzab+pust)/2; //Среднее давление по стволу скважины, определяется как среднеарифметическое значение
        System.out.println("Среднее давление по стволу скважины, определяется как среднеарифметическое значение"+Psred);
        tproduv = ((L*(F/1000)*Psred)/(qbaz*1000*patm)); //Продолжительность продувки
        System.out.println("Продолжительность продувки"+tproduv);
        Q1 = qbaz*tproduv*kolproduv; //Расход газа на одну продувку
    }

    public void method2() {

    }

    public void method3() {

    }

    public void method4() {

    }

    public void method5() {

    }

    public static void main(String[] args) {

    }
}
