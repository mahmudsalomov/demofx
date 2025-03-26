package com.example.demofx;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public abstract class raschet2 extends Application {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double  Ddiaf;
        double  C;
        double  Pnp;
        double  pG;
        double  T;
        double  L;
        double  dvnutr;
        double  patm;
        double  pzab;
        double  pust;
        double  kolproduv;
        double  plotvoz;
        double  deltP;
        double  Z;
        double  qbaz;
        double  F;
        double  Psred;
        double  tproduv;
        double  Qskvaj;
        double  debitskv;
        double  Trej;
        double  nproduv;
        double  Nskvaj;
        double  Qproduvskv;
        double  debitskvkislobr;
        double  Trejkislobr;
        double  nproduvkislobr;
        double  nskavkislobr;
        double  qproduvskvkislobr;
        double  qskv;
        double  tskv;
        double  npr;
        double  nskv;
        double  Vskv;
        double  debitlikvid;
        double  Trejlikvid;
        double  nproduvlikvid;
        double  Nskvajlikvid;
        double  Qproduvlikvid;
        double  Dgazp;
        double  tolshstenki;
        double  Pgazprovod;
        double  Tgazprovod;
        double  plotnostgaza;
        double  Dproduvzad;
        double  Tproduvgaz;
        double  mproduvgaz;
        double  nproduvgaz;
        double  Hisx;
        double  plotnostvoz;
        double  otnosplotvoz;
        double  faktorsjgaza;
        double  Koefp;
        double  KoefT;
        double  Koefplot;
        double  Koefz;
        double  Koefd;
        double  Koeft;
        double  normras;
        double  Qnp;
        double  diamgaz;
        double  tolshstenki2;
        double  Pgazprovodjid;
        double  Tgazprovodjid;
        double  plotnostgazajid;
        double  Dproduvzadjid;
        double  Tproduvgazjid;
        double  mproduvgazjid;
        double  nproduvgazjid;
        double  Hisxjid;
        double  plotnostvozjid;
        double  otnosplotvozjid;
        double  faktorsjgazajid;
        double  Koefpjid;
        double  KoefTjid;
        double  Koefplotjid;
        double  Koefzjid;
        double  Koefdjid;
        double  Koefstjid;
        double  normrasjid;
        double  Qnpjid;
        double  Vremont;
        double  Pgazremont;
        double  Tgazremont;
        double  plotnostgazremont;
        double  Hisxremont;
        double  nremont;
        double  plotnostvozremont;
        double  otnosplotnostremont;
        double  faktorsjgazremont;
        double  Koefpremont;
        double  KoefTremont;
        double  Koefzremont;
        double  normarasremont;
        double  Qnpremont;
        double  dzadremont;
        double  Pabsremont;
        double  Tproduvremont;
        double  Tkpremont;
        double  Fremont;
        double  Qnkpremont;
        double  Qkpremont;
        double  QPPremont;
        double  qstkond;
        double  Nkol;
        double  Qdeg;
        double  vobshukpg;
        double  qb;
        double  rdb;
        double  k;
        double  c;
        double  qgaz;
        double  Qdeg2;
        double  vobshukpg1;
        double  Udeg;
        double  Pdeg;
        double  Tdeg;
        double  Cdeg;
        double  konsdeg;
        double  Vreg;
        double  A;
        double  qdeg1;
        double  Qreg;
        double  rash71;
        double  rash72;
        double  rash73;
        double  Qdeg8;
        double  Qkoteldkc;
        double  Qkotelukpg;
        double  Qfakeldkc;
        double  Qfakelukpg;
        double  qutechukpg;
        double  tukpg;
        double  yukpg;
        double  nukpg;
        double  pgukpg;
        double  qutechgp;
        double  tgp;
        double  ugp;
        double  ngp;
        double  pggp;
        double  qutechdkc;
        double  tdkc;
        double  udkc;
        double  ndkc;
        double  pgdkc;
        double  qutechukpg1;
        double  tukpg1;
        double  yukpg1;
        double  nukpg1;
        double  pgukpg1;
        double  qutechgp1;
        double  tgp1;
        double  ugp1;
        double  ngp1;
        double  pggp1;
        double  qutechdkc1;
        double  tdkc1;
        double  udkc1;
        double  ndkc1;
        double  pgdkc1;
        double  qutechukpg2;
        double  tukpg2;
        double  yukpg2;
        double  nukpg2;
        double  pgukpg2;
        double  qutechgp2;
        double  tgp2;
        double  ugp2;
        double  ngp2;
        double  pggp2;
        double  qutechdkc2;
        double  tdkc2;
        double  udkc2;
        double  ndkc2;
        double  pgdkc2;
        double  plotnostkc;
        double  plotnostkc1;
        double  plotnostkc2;
        double  obpoterukpg;
        double  obpoterpkukpg;
        double  obpoterflansukpg;
        double  obpoterukpg1;
        double  obpoterpkukpg1;
        double  obpoterflansukpg1;
        double  obpoterukpg2;
        double  obpoterpkukpg2;
        double  obpoterflansukpg2;
        double Gvodi;
        double MH2O;
        double Gnestkond;
        double Mnestkond;
        double Qupb;
        double Qupnest;
        double Snipobg;
        double Snipall;
        double Snipsallob;
        double Sniptechnujd;
        double Sniptechnujdob;
        double Snip11;
        double Snip11ob;
        double Snip12;
        double Snip12ob;
        double Snip13;
        double Snip13ob;
        double Snip14;
        double Snip14ob;
        double Snip15;
        double Snip15ob;
        double Snip16;
        double Snip16ob;
        double Sniptopnujd;
        double Sniptopnujdob;
        double Snip21;
        double Snip21ob;
        double Snip22;
        double Snip22ob;
        double Snip23;
        double Snip23ob;
        double Snip24;
        double Snip24ob;
        double Snip25;
        double Snip25ob;
        double Snip26;
        double Snip26ob;
        double Snipoter;
        double Snipoterob;
        double Snip31;
        double Snip31ob;
        double Snip32;
        double Snip32ob;
        double Snip33;
        double Snip33ob;
        double Sniposed;
        double Sniposedob;
        double Snip41;
        double Snip41ob;
        double Snip42;
        double Snip42ob;
        double Sniposedall;
        double Sniposedallob;





        System.out.print("Диаметр диафрагмы или штуцера");
        Ddiaf = num.nextDouble();
        System.out.print("Коэффициент, зависящий от типа измерителя, штуцера (Приложение Е Методики)");
        C= num.nextDouble();
        System.out.print("Абсолютное давление перед пропускным отверстием (диафрагмой)");
        Pnp = num.nextDouble();
        System.out.print("Плотность газа (результаты ГКИ)");
        pG= num.nextDouble();
        System.out.print("Термодинамическая температура газа перед пропускным отверстием (диафрагмой)");
        T = num.nextDouble();
        System.out.print("Глубина скважины");
        L = num.nextDouble();
        System.out.print("Внутренний диаметр НКТ");
        dvnutr= num.nextDouble();
        System.out.print("Абсолютное атмосферное давление");
        patm = num.nextDouble();
        System.out.print("Забойное давление");
        pzab = num.nextDouble();
        System.out.print("Устьевое давление ");
        pust = num.nextDouble();
        System.out.print("Количество продувок");
        kolproduv = num.nextDouble();
        plotvoz = 1.204;
 //1.1 Расчёт расхода газа для очистки забоя скважин в процессе освоения после бурения и испытания
        //Промежуточный расчет
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
        Qskvaj = qbaz*tproduv*kolproduv; //Расход газа на одну продувку
        System.out.println("Расход газа на одну продувку"+Qskvaj);

//1.2 Расчёт расхода газа после капитального и подземного ремонта скважин
        //Исходные данные
        System.out.print("Дебит продуваемой скважины по газу при заданных режимах");
        debitskv = num.nextDouble();
        System.out.print("Продолжительность продувки скважины при заданных режимах");
        Trej = num.nextDouble();
        System.out.print("Количество продувок");
        nproduv = num.nextDouble();
        System.out.print("Количество скважин");
        Nskvaj = num.nextDouble();
//Промежуточный расчет
        Qproduvskv = debitskv*Trej*nproduv*Nskvaj; //Расход газа на продувку скважин
        System.out.println("Расход газа на продувку скважин"+Qproduvskv);

        //1.3 Расчёт расхода газа при очистке после соляно-кислотной обработки скважин
        //Исходные данные
        System.out.print("Дебит продуваемой скважины по газу при заданных режимах");
        debitskvkislobr = num.nextDouble();
        System.out.print("Продолжительность продувки скважины при заданных режимах");
        Trejkislobr = num.nextDouble();
        System.out.print("Количество продувок");
        nproduvkislobr = num.nextDouble();
        System.out.print("Количество скважин");
        nskavkislobr = num.nextDouble();
        //Промежуточный расчет
        qproduvskvkislobr = debitskvkislobr * Trejkislobr * nproduvkislobr * nskavkislobr; //Расход газа на продувку скважин
        System.out.println("Расход газа на продувку скважин"+qproduvskvkislobr);
        //1.4 Расчёт расхода газа после ингибирования скважин
        //Исходные данные
        System.out.print("Дебит продуваемой скважины по газу при заданных режимах");
        qskv = num.nextDouble();
        System.out.print("Продолжительность продувки скважины при заданных режимах");
        tskv = num.nextDouble();
        System.out.print("Количество продувок");
        npr = num.nextDouble();
        System.out.print("Количество скважин");
        nskv = num.nextDouble();
        //Промежуточный расчет
        Vskv = qskv * tskv * npr * nskv; //Расход газа на продувку скважин
        System.out.println("Расход газа на продувку скважин"+Vskv);
        //1.5 Расчёт расхода газа для ликвидации гидратных и жидкостных пробок в стволе скважин
        //Исходные данные
        System.out.print("Дебит продуваемой скважины по газу при заданных режимах");
        debitlikvid = num.nextDouble();
        System.out.print("Продолжительность продувки скважины при заданных режимах");
        Trejlikvid = num.nextDouble();
        System.out.print("Количество продувок");
        nproduvlikvid = num.nextDouble();
        System.out.print("Количество скважин");
        Nskvajlikvid = num.nextDouble();
        //Промежуточный расчет
        Qproduvlikvid = debitlikvid * Trejlikvid * nproduvlikvid * Nskvajlikvid; //Расход газа на продувку скважин
        System.out.println("Расход газа на продувку скважин"+Qproduvlikvid);
        //2.1 Расчёт расхода газа при продувке после ингибирования газопроводов
        //Исходные данные
        System.out.print("Диаметр газопровода");
        Dgazp = num.nextDouble();
        System.out.print("Толщина стенки газопровода");
        tolshstenki = num.nextDouble();
        System.out.print("Абсолютное рабочее давление в газопроводе");
        Pgazprovod = num.nextDouble();
        System.out.print("Рабочая термодинамическая температура газа в газопроводе");
        Tgazprovod = num.nextDouble();
        System.out.print("Плотность газа (результаты ГКИ)");
        plotnostgaza = num.nextDouble();
        System.out.print("Диаметр продувочной задвижки");
        Dproduvzad = num.nextDouble();
        System.out.print("Время продувки");
        Tproduvgaz = num.nextDouble();
        System.out.print("Количество продуваемых газопроводов");
        mproduvgaz = num.nextDouble();
        System.out.print("Количество продувок газопровода");
        nproduvgaz = num.nextDouble();
        Hisx = 2*55*Math.pow(50,2)*10/(864*(Math.sqrt(0.6*293*0.887)));
        plotnostvoz = 1.204;
        //Промежуточный расчет
        otnosplotvoz= plotnostvoz/plotnostgaza; //Относительная плотность по воздуху
        System.out.println("Относительная плотность по воздуху"+otnosplotvoz);
        faktorsjgaza= 1-((10.2*Pgazprovod/10-6)*(0.345/100*otnosplotvoz+0.446/1000)+0.015)*(1.3-0.0144*(Tgazprovod -283.2)); //Фактор сжимаемости природного газа
        System.out.println("Фактор сжимаемости природного газа"+faktorsjgaza);
        Koefp=Pgazprovod/55;//Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного"+Koefp);
        KoefT = Math.sqrt(293/Tgazprovod); //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходно"+KoefT);
        Koefplot = Math.sqrt(0.6/otnosplotvoz); //Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной
        System.out.println("Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной"+Koefplot);
        Koefz = Math.sqrt(0.887/faktorsjgaza); //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного"+Koefz);
        Koefd = Math.pow(Dproduvzad,2)/2500; //Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного"+Koefd);
        Koeft = Tproduvgaz/10; // Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного"+Koeft);
        normras = Hisx*Koefp*KoefT*Koefplot*Koefz*Koeft; //Норма расхода газа на одну продувку трубопровода и технологических аппаратов
        System.out.println("Норма расхода газа на одну продувку трубопровода и технологических аппаратов"+normras);
        Qnp = normras*mproduvgaz*nproduvgaz/1000; //Общий объем газа при продувке после ингибирования
        System.out.println("Общий объем газа при продувке после ингибирования"+Qnp);

        //2.2 Расчёт расхода газа при очистке газопроводов от жидкости путем продувки
        //Исходные данные
        System.out.print("Диаметр газопровода");
        diamgaz = num.nextDouble();
        System.out.print("Диаметр газопровода");
        tolshstenki2 = num.nextDouble();
        System.out.print("Диаметр газопровода");
        Pgazprovodjid = num.nextDouble();
        System.out.print("Диаметр газопровода");
        Tgazprovodjid = num.nextDouble();
        System.out.print("Диаметр газопровода");
        plotnostgazajid = num.nextDouble();
        System.out.print("Диаметр газопровода");
        Dproduvzadjid = num.nextDouble();
        System.out.print("Время продувки");
        Tproduvgazjid = num.nextDouble();
        System.out.print("Количество продуваемых газопроводов");
        mproduvgazjid = num.nextDouble();
        System.out.print("Количество продувок газопровода");
        nproduvgazjid = num.nextDouble();
        System.out.print("Исходная норма расхода газа на одну продувку оборудования при 20 °С и 0,1 МРа (const)");
        Hisxjid = 2*55*Math.pow(50,2)*10/(864*(Math.sqrt(0.6*293*0.887)));
        //Промежуточный расчет
        plotnostvozjid = 1.204;
        otnosplotvozjid = plotnostgazajid/plotnostvozjid; //Относительная плотность по воздуху
        System.out.println("Относительная плотность по воздуху"+otnosplotvozjid);
        faktorsjgazajid = 1-((10.2*Pgazprovodjid/10-6)*(0.345/100*otnosplotvozjid-0.446/1000)+0.015)*(1.3-0.0144*(Tgazprovodjid-283.2));//Фактор сжимаемости природного газа
        System.out.println("Фактор сжимаемости природного газа"+faktorsjgazajid);
        Koefpjid =Pgazprovodjid /55; //Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного"+Koefpjid);
        KoefTjid = Math.sqrt(293/Tgazprovodjid); //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной"+KoefTjid);
        Koefplotjid = Math.sqrt(0.6/otnosplotvozjid); //Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной
        System.out.println("Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной"+Koefplotjid);
        Koefzjid = Math.sqrt(0.887/faktorsjgazajid); //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного"+Koefzjid);
        Koefdjid = Math.pow(Dproduvzadjid,2)/2500; //Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного"+Koefdjid);
        Koefstjid = Tproduvgazjid/10; //Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного"+ Koefstjid);
        normrasjid = Hisxjid*Koefpjid*KoefTjid*Koefplotjid*Koefzjid*Koefdjid*Koefstjid; //Норма расхода газа на одну продувку трубопровода и технологических аппаратов
        System.out.println("Норма расхода газа на одну продувку трубопровода и технологических аппаратов"+normrasjid);
        Qnpjid =normrasjid*mproduvgazjid*nproduvgazjid/1000 ;//Общий объем газа при продувке после ингибирования
        System.out.println("Общий объем газа при продувке после ингибирования"+Qnpjid);

        //3.1 Расчёт расхода газа при стравливании газа перед проведением ремонтных работ
        //Исходные данные
        System.out.print("Геометрический объемоборудования или участка трубопровода, из которых стравливается газ");
        Vremont = num.nextDouble();
        System.out.print("Абсолютное рабочее давление в газопроводе");
        Pgazremont = num.nextDouble();
        System.out.print("Рабочая термодинамическая температура газа в газопроводе");
        Tgazremont = num.nextDouble();
        System.out.print("Плотность газа (результаты ГКИ)");
        plotnostgazremont = num.nextDouble();
        Hisxremont = 1*55*293/293/0.887/1;
        System.out.print("Количество единиц однотипного оборудования");
        nremont = num.nextDouble();
        //Промежуточный расчет

        plotnostvozremont = 1.2044;
        otnosplotnostremont = plotnostgazremont/plotnostvozremont; //Относительная плотность по воздуху
        System.out.println("Относительная плотность по воздуху"+otnosplotnostremont);
        faktorsjgazremont = (1-((10.2*Pgazremont/10-6)*(0.345/100*otnosplotnostremont-0.0446/1000)+0.015)*(1.3-0.0144*(Tgazremont-283.2))); //Фактор сжимаемости природного газа
        System.out.println("Фактор сжимаемости природного газа"+faktorsjgazremont);
        Koefpremont = Pgazremont/55; //Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного"+Koefpremont);
        KoefTremont = 293/Tgazremont; //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной"+KoefTremont);
        Koefzremont = 0.887/faktorsjgazremont; //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        System.out.println("Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного"+Koefzremont);
        normarasremont = Hisxremont*Koefpremont*KoefTremont*Koefzremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        System.out.println("Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа"+normarasremont);
        Qnpremont = normarasremont*Vremont*nremont/1000; //Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта
        System.out.println("Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта"+Qnpremont);
        //3.2 Расчёт расхода газа при продувке оборудования
        //Исходные данные
        System.out.print("Диаметр продувочной задвижки");
        dzadremont = num.nextDouble();
        System.out.print("Абсолютное рабочее давление газа перед сечением трубы, через которое производится продувка");
        Pabsremont = num.nextDouble();
        System.out.print("Время продувки при некритическом истечении");
        Tproduvremont = num.nextDouble();
        System.out.print("Время продувки при критическом истечении");
        Tkpremont = num.nextDouble();
        //Промежуточный расчет
        Fremont =(3.14*Math.pow(dzadremont/1000,2))/4; //Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)
        System.out.println("Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)"+Fremont);
        Qnkpremont =110*Fremont*Pabsremont*Tproduvremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        System.out.println("Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа"+Qnkpremont);
        Qkpremont =296*Fremont*Pabsremont*Tkpremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        System.out.println("Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа"+Qkpremont);
        QPPremont =(Qnkpremont*Qkpremont)/1000; //Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта
        System.out.println("Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта"+QPPremont);

        //4. Расчет расхода газа при дегазации газового конденсата
        //Исходные данные
        System.out.print("Количество стабильного конденсата полученного в результате дегазации н/с конденсата");
        qstkond = num.nextDouble();
        System.out.print("Газовый фактор, количество газа дегазации, выделяющегося при получение 1 m³ конденсата (результаты ГКИ)");
        Nkol = num.nextDouble();
        //Промежуточный расчет
        Qdeg= qstkond*Nkol/1000; //Расход газа при дегазации конденсата
        System.out.println("Расход газа при дегазации конденсата"+Qdeg);
        //5. Расчет расхода газа при дегазации пластовой воды
        //Исходные данные
        System.out.print("Общий объем сырьевого газа, подаваемого на УКПГ Алан");
        vobshukpg = num.nextDouble();
        System.out.print("Удельное содержание воды в объеме добытого газа");
        qb = num.nextDouble();
        System.out.print("Растворимость газа в дистиллированной воде, определяемая по таблице Н.1 Методики");
        rdb = num.nextDouble();
        System.out.print("Коэффициент Сеченова, определяемый по таблице Н.2 Методики");
        k = num.nextDouble();
        System.out.print("Концентрация солей в воде (лабораторные исследования)");
        c = num.nextDouble();
        //Промежуточный расчет
        qgaz = rdb* Math.pow(10,k*c); //Удельный объем газа дегазации в 1 m³ пластовой воды
        System.out.println("Удельный объем газа дегазации в 1 m³ пластовой воды"+qgaz);
        Qdeg2 = vobshukpg*qgaz*qb/1000; //Расход газа при дегазации пластовой воды
        System.out.println("Расход газа при дегазации пластовой воды"+Qdeg2);
        //6. Расчет расхода газа при дегазации ДЭГ
        System.out.print("Объем газа, обрабатываемого ДЭГ");
        vobshukpg1 = num.nextDouble();
        System.out.print("Удельный объем вспрыскиваемого регенерируемого ДЭГ (принимается в соответствии с данными цеха УНТС)");
        Udeg = num.nextDouble();
        System.out.print("Удельное содержание воды в объеме добытого газа ");
        Pdeg = num.nextDouble();
        System.out.print("Рабочее давление");
        Tdeg = num.nextDouble();
        System.out.print("Рабочая температура");
        Cdeg = num.nextDouble();
        System.out.print("Концентрация ДЭГ");
        konsdeg = num.nextDouble();
        //Промежуточный расчет
        Vreg =vobshukpg1*1000*(Udeg*Pdeg); //Объем насыщенного раствора ДЭГ
        System.out.println("Объем насыщенного раствора ДЭГ"+Vreg);
        A = 1.415*konsdeg/1000+5.78*Math.pow(konsdeg,2)/1000000+1.436*Cdeg/1000-2.969*Cdeg*konsdeg/100000+3.571*Math.pow(Cdeg,2)/1000000-7.048/100;//Коэффициент, зависящий от температуры и концентрации ДЭГ
        System.out.println("Коэффициент, зависящий от температуры и концентрации ДЭГ"+A);
        qdeg1 = Tdeg*A;//Растворимость газа в растворе ДЭГ
        System.out.println("Растворимость газа в растворе ДЭГ"+qdeg1);
        Qreg = qdeg1*Vreg/1000;//Расход газа при дегазации пластовой воды
        System.out.println("Расход газа при дегазации пластовой воды"+Qreg);
        //7. Расчет расхода топливного газа компрессоры ДКС ГКМ Алан
        System.out.print("Расход топливного газа на агрегаты ДКС (принимается по показаниям прибора учета)Г");
        rash71 = num.nextDouble();
        System.out.print("Расход топливного газа на работу БПГР ДКС (принимается по паспортным данным)");
        rash72 = num.nextDouble();
        System.out.print("Расход топливного газа факельную систему (принимается по показаниям прибора учета)");
        rash73 = num.nextDouble();


        //8. Расчет расхода топливного газа на работу огневых регенераторов
        System.out.print("Расход топливного газа огневыми регенераторами ДЭГ (принимается по показаниям прибора учета)");
        Qdeg8 = num.nextDouble();

        //9. Расчет расхода топливного газа на работу котельной
        System.out.print("Расход топливного газа на рабоу котельной ДКС (принимается по показаниям прибора учета)");
        Qkoteldkc = num.nextDouble();
        System.out.print("Расход топливного газа на рабоу котельной УКПГ (принимается по показаниям прибора учета)");
        Qkotelukpg = num.nextDouble();

        //10. Расчет расхода топливного газа на поддержание дежурного огня
        System.out.print("Расход  газа на факел при аварийном останове промысла ДКС (принимается по показаниям прибора учета)");
        Qfakeldkc = num.nextDouble();
        System.out.print("Расход  газа на факел при аварийном останове промысла УКПГ (принимается по показаниям прибора учета)");
        Qfakelukpg = num.nextDouble();


        //11. Технологические потери (утечки)
        //Исходные данные УКПГ
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechukpg = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tukpg = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        yukpg = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        nukpg = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pgukpg = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechgp = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tgp = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        ugp = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ngp = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pggp = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechdkc = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tdkc = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        udkc = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ndkc = num.nextDouble();
        System.out.print("Количество фланцев на одном ЗРА");
        pgdkc = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        plotnostkc = num.nextDouble();
        //Промежуточный расчет
        obpoterukpg =((qutechukpg*tukpg*yukpg*nukpg/pgukpg))/1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg = ((qutechgp*tgp*ugp*ngp/pggp))/1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg = ((qutechdkc*tdkc*udkc*ndkc*pgdkc))/1000; //Общий объем технологических потерь для фланцевых соединений ЗРА

        //Исходные данные Алан МГПЗ
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechukpg1 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tukpg1 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        yukpg1 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        nukpg1 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pgukpg1 = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechgp1 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tgp1 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        ugp1 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ngp1 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pggp1 = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechdkc1 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tdkc1 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        udkc1 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ndkc1 = num.nextDouble();
        System.out.print("Количество фланцев на одном ЗРА");
        pgdkc1 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        plotnostkc1 = num.nextDouble();
        //Промежуточный расчет
        obpoterukpg1 =((qutechukpg1*tukpg1*yukpg1*nukpg1/pgukpg1))/1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg1 = ((qutechgp1*tgp1*ugp1*ngp1/pggp1))/1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg1 = ((qutechdkc1*tdkc1*udkc1*ndkc1*pgdkc1))/1000; //Общий объем технологических потерь для фланцевых соединений ЗРА

        //Исходные данные ДКС
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechukpg2 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tukpg2 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        yukpg2 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        nukpg2 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pgukpg2 = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechgp2 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tgp2 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        ugp2 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ngp2 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        pggp2 = num.nextDouble();
        System.out.print("Расчетная величина утечек (Приложение Q Методики)");
        qutechdkc2 = num.nextDouble();
        System.out.print("Продолжительность работы единицы арматуры за анализируемый период");
        tdkc2 = num.nextDouble();
        System.out.print("Коэффициент, характеризующий долю уплотнений, потерявших герметичность (Приложение Q Методики)");
        udkc2 = num.nextDouble();
        System.out.print("Количество единиц ЗРА");
        ndkc2 = num.nextDouble();
        System.out.print("Количество фланцев на одном ЗРА");
        pgdkc2 = num.nextDouble();
        System.out.print("Плотность газа при стандартных условиях за анализируемый период (результаты ГКИ)");
        plotnostkc2 = num.nextDouble();
        //Промежуточный расчет
        obpoterukpg2 =((qutechukpg2*tukpg2*yukpg2*nukpg2/pgukpg2))/1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg2 = ((qutechgp2*tgp2*ugp2*ngp2/pggp2))/1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg2 = ((qutechdkc2*tdkc2*udkc2*ndkc2*pgdkc2))/1000; //Общий объем технологических потерь для фланцевых соединений ЗРА

        //12. Расчет расхода (оседание) газа на производство продукции
        //Исходные данные
        System.out.print("Количество извлеченной воды");
        Gvodi = num.nextDouble();
        System.out.print("Молеклярная масса воды");
        MH2O = num.nextDouble();
        System.out.print("Количество извлеченного нестабильного конденсата");
        Gnestkond = num.nextDouble();
        System.out.print("Средняя молекулярная масса нестабильного конденсата (результаты ГКИ)");
        Mnestkond = num.nextDouble();
        //Промежуточный расчет
        Qupb= Gvodi/18.0*24.04; //Расход (оседание) газа с извлечением влаги
        Qupnest=Gnestkond/Mnestkond*24.04; //Расход (оседание) газа на производство нестабильного конденсата
        Snipobg=vobshukpg*1000; //Объем газа, подаваемого на УКПГ «Алан»
        Snip11=Qskvaj+Qproduvskv+qproduvskvkislobr+Vskv+Qproduvlikvid; //Расход газа на продувку скважин
        Snip12=Qnp+Qnpjid;//Расход газа при продувке после ингибирования и очистки газопроводов
        Snip13=Qnpremont+QPPremont;//Расход газа при ремонте
        Snip14=Qdeg;//Расход газа при дегазации конденсата
        Snip15=Qdeg2;//Расход газа при дегазации пластовой воды
        Snip16=Qreg;//Расход газа при дегазации ДЭГ
        Sniptechnujd=Snip11+Snip12+Snip13+Snip14+Snip15+Snip16;//Технологические нетопливные нужды, в том числе:
        Snip21=rash71;//Расход топливного газа на эксплуатацию ДКС
        Snip22=Qdeg8;//Расход топливного газа на работу огневых регенераторов
        Snip23=Qkoteldkc;//Расход газа на котельная ДКС
        Snip24=Qkotelukpg;//Расход топливного газа на работу котельной УКПГ
        Snip25=Qfakeldkc;//Расход газа на факельную систему ДКС
        Snip26=Qfakelukpg;//Расход газа на факел УКПГ
        Sniptopnujd=Snip21+Snip22+Snip23+Snip24+Snip25+Snip26;//Технологические топливные нужды,  в том числе:
        Snip31=obpoterukpg+obpoterpkukpg+obpoterflansukpg;//Технологически потери газа на УКПГ
        Snip32=obpoterukpg1+obpoterpkukpg1+obpoterflansukpg1;//Технологически потери газа на газопроводе Алан-МГПЗ
        Snip33=obpoterukpg2+obpoterpkukpg2+obpoterflansukpg2;//Технологически потери газа на ДКС
        Snipoter=Snip31+Snip32+Snip33;//Технологические потери (утечки), в том числе:
        Snip41=Qupb;//Расход (оседание) газа с извлечением влаги
        Snip42=Qupnest;//Расход (оседание) газа на производство нестабильного конденсата
        Sniposed=Snip41+Snip42;//Расход (оседание) газа, в том числе:
        Snipall=Sniptechnujd+Sniptopnujd+Snipoter;//СНиП, всего


        Snip11ob = Snip11 / Snipobg * 100;
        Snip12ob = Snip12 / Snipobg * 100;
        Snip13ob = Snip13 / Snipobg * 100;
        Snip14ob = Snip14 / Snipobg * 100;
        Snip15ob = Snip15 / Snipobg * 100;
        Snip16ob = Snip16 / Snipobg * 100;
        Sniptechnujdob = Snip11ob +Snip12ob +Snip13ob + Snip14ob + Snip15ob + Snip16ob;
        Snip21ob = Snip21 / Snipobg * 100;
        Snip22ob = Snip22 / Snipobg * 100;
        Snip23ob = Snip23 / Snipobg * 100;
        Snip24ob = Snip24 / Snipobg * 100;
        Snip25ob = Snip25 / Snipobg * 100;
        Snip26ob = Snip26 / Snipobg * 100;
        Sniptopnujdob =Snip21ob + Snip22ob + Snip23ob + Snip24ob + Snip25ob + Snip26ob;

        Snip31ob = Snip31 / Snipobg *100;
        Snip32ob = Snip32 / Snipobg *100;
        Snip33ob = Snip33 / Snipobg *100;
        Snipoterob = Snip31ob + Snip32ob + Snip33ob ;
        Snip41ob = Snip41 / Snipobg * 100;
        Snip42ob = Snip42 / Snipobg * 100;
        Sniposedob = Snip41ob +Snip42ob;
        Snipsallob = Sniptechnujdob +Sniptopnujdob + Snipoterob;
        Sniposedallob = Snipsallob + Sniposedob;
    }
}
