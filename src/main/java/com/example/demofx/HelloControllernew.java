package com.example.demofx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.application.Application.launch;

public class HelloControllernew {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloControllernew.class.getResource("newhello.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
//        stage.setTitle("Расчет Алан");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }

    //    @FXML
//    private Label button;
    double Ddiaf;
    double C;
    double Pnp;
    double pG;
    double T;
    double L;
    double dvnutr;
    double patm;
    double pzab;
    double pust;
    double kolproduv;
    double plotvoz;
    double deltP;
    double Z;
    double qbaz;
    double F;
    double Psred;
    double tproduv;
    double Qskvaj;
    double debitskv;
    double Trej;
    double nproduv;
    double Nskvaj;
    double Qproduvskv;
    double debitskvkislobr;
    double Trejkislobr;
    double nproduvkislobr;
    double nskavkislobr;
    double qproduvskvkislobr;
    double qskv;
    double tskv;
    double npr;
    double nskv;
    double Vskv;
    double debitlikvid;
    double Trejlikvid;
    double nproduvlikvid;
    double Nskvajlikvid;
    double Qproduvlikvid;
    double Dgazp;
    double tolshstenki;
    double Pgazprovod;
    double Tgazprovod;
    double plotnostgaza;
    double Dproduvzad;
    double Tproduvgaz;
    double mproduvgaz;
    double nproduvgaz;
    double Hisx;
    double plotnostvoz;
    double otnosplotvoz;
    double faktorsjgaza;
    double Koefp;
    double KoefT;
    double Koefplot;
    double Koefz;
    double Koefd;
    double Koeft;
    double normras;
    double Qnp;
    double diamgaz;
    double tolshstenki2;
    double Pgazprovodjid;
    double Tgazprovodjid;
    double plotnostgazajid;
    double Dproduvzadjid;
    double Tproduvgazjid;
    double mproduvgazjid;
    double nproduvgazjid;
    double Hisxjid;
    double plotnostvozjid;
    double otnosplotvozjid;
    double faktorsjgazajid;
    double Koefpjid;
    double KoefTjid;
    double Koefplotjid;
    double Koefzjid;
    double Koefdjid;
    double Koefstjid;
    double normrasjid;
    double Qnpjid;
    double Vremont;
    double Pgazremont;
    double Tgazremont;
    double plotnostgazremont;
    double Hisxremont;
    double nremont;
    double plotnostvozremont;
    double otnosplotnostremont;
    double faktorsjgazremont;
    double Koefpremont;
    double KoefTremont;
    double Koefzremont;
    double normarasremont;
    double Qnpremont;
    double dzadremont;
    double Pabsremont;
    double Tproduvremont;
    double Tkpremont;
    double Fremont;
    double Qnkpremont;
    double Qkpremont;
    double QPPremont;
    double qstkond;
    double Nkol;
    double Qdeg;
    double vobshukpg;
    double qb;
    double rdb;
    double k;
    double c;
    double qgaz;
    double Qdeg2;
    double vobshukpg1;
    double Udeg;
    double Pdeg;
    double Tdeg;
    double Cdeg;
    double konsdeg;
    double Vreg;
    double A;
    double qdeg1;
    double Qreg;
    double rash71;
    double rash72;
    double rash73;
    double Qdeg8;
    double Qkoteldkc;
    double Qkotelukpg;
    double Qfakeldkc;
    double Qfakelukpg;
    double qutechukpg;
    double tukpg;
    double yukpg;
    double nukpg;
    double pgukpg;
    double qutechgp;
    double tgp;
    double ugp;
    double ngp;
    double pggp;
    double qutechdkc;
    double tdkc;
    double udkc;
    double ndkc;
    double pgdkc;
    double qutechukpg1;
    double tukpg1;
    double yukpg1;
    double nukpg1;
    double pgukpg1;
    double qutechgp1;
    double tgp1;
    double ugp1;
    double ngp1;
    double pggp1;
    double qutechdkc1;
    double tdkc1;
    double udkc1;
    double ndkc1;
    double pgdkc1;
    double qutechukpg2;
    double tukpg2;
    double yukpg2;
    double nukpg2;
    double pgukpg2;
    double qutechgp2;
    double tgp2;
    double ugp2;
    double ngp2;
    double pggp2;
    double qutechdkc2;
    double tdkc2;
    double udkc2;
    double ndkc2;
    double pgdkc2;
    double plotnostkc;
    double plotnostkc1;
    double plotnostkc2;
    double obpoterukpg;
    double obpoterpkukpg;
    double obpoterflansukpg;
    double obpoterukpg1;
    double obpoterpkukpg1;
    double obpoterflansukpg1;
    double obpoterukpg2;
    double obpoterpkukpg2;
    double obpoterflansukpg2;
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
    @FXML
    private TextField Ddiafget;
    @FXML
    private TextField Cget;
    @FXML
    private TextField Pnpget;
    @FXML
    private TextField pGget;
    @FXML
    private TextField Tget;
    @FXML
    private TextField Lget;
    @FXML
    private TextField dvnutrget;
    @FXML
    private TextField patmget;
    @FXML
    private TextField pzabget;
    @FXML
    private TextField pustget;
    @FXML
    private TextField kolproduvget;
    @FXML
    private TextField plotvozget;
    @FXML
    private TextField deltPget;
    @FXML
    private TextField Zget;
    @FXML
    private TextField qbazget;
    @FXML
    private TextField Fget;
    @FXML
    private TextField Psredget;
    @FXML
    private TextField tproduvget;
    @FXML
    private TextField Qskvajget;
    @FXML
    private TextField debitskvget;
    @FXML
    private TextField Trejget;
    @FXML
    private TextField nproduvget;
    @FXML
    private TextField Nskvajget;
    public TextField nprget;
    @FXML
    private TextField Qproduvskvget;
    @FXML
    private TextField debitskvkislobrget;
    @FXML
    private TextField Trejkislobrget;
    @FXML
    private TextField nproduvkislobrget;
    @FXML
    private TextField nskavkislobrget;
    @FXML
    private TextField qproduvskvkislobrget;
    @FXML
    private TextField qskvget;
    @FXML
    private TextField tskvget;
    @FXML
    private TextField nskvget;
    @FXML
    private TextField Vskvget;
    @FXML
    private TextField debitlikvidget;
    @FXML
    private TextField Trejlikvidget;
    @FXML
    private TextField nproduvlikvidget;
    @FXML
    private TextField Nskvajlikvidget;
    @FXML
    private TextField Qproduvlikvidget;
    @FXML
    private TextField Dgazpget;
    @FXML
    private TextField tolshstenkiget;
    @FXML
    private TextField Pgazprovodget;
    @FXML
    private TextField Tgazprovodget;
    @FXML
    private TextField plotnostgazaget;
    @FXML
    private TextField Dproduvzadget;
    @FXML
    private TextField Tproduvgazget;
    @FXML
    private TextField mproduvgazget;
    @FXML
    private TextField nproduvgazget;
    @FXML
    private TextField Hisxget;
    @FXML
    private TextField plotnostvozget;
    @FXML
    private TextField otnosplotvozget;
    @FXML
    private TextField faktorsjgazaget;
    @FXML
    private TextField Koefpget;
    @FXML
    private TextField KoefTget;
    @FXML
    private TextField Koefplotget;
    @FXML
    private TextField Koefzget;
    @FXML
    private TextField Koefdget;
    @FXML
    private TextField Koeftget;
    @FXML
    private TextField normrasget;
    @FXML
    private TextField Qnpget;
    @FXML
    private TextField diamgazget;
    @FXML
    private TextField tolshstenki2get;
    @FXML
    private TextField Pgazprovodjidget;
    @FXML
    private TextField Tgazprovodjidget;
    @FXML
    private TextField plotnostgazajidget;
    @FXML
    private TextField Dproduvzadjidget;
    @FXML
    private TextField Tproduvgazjidget;
    @FXML
    private TextField mproduvgazjidget;
    @FXML
    private TextField nproduvgazjidget;
    @FXML
    private TextField Hisxjidget;
    @FXML
    private TextField plotnostvozjidget;
    @FXML
    private TextField otnosplotvozjidget;
    @FXML
    private TextField faktorsjgazajidget;
    @FXML
    private TextField Koefpjidget;
    @FXML
    private TextField KoefTjidget;
    @FXML
    private TextField Koefplotjidget;
    @FXML
    private TextField Koefzjidget;
    @FXML
    private TextField Koefdjidget;
    @FXML
    private TextField Koefstjidget;
    @FXML
    private TextField normrasjidget;
    @FXML
    private TextField Qnpjidget;
    @FXML
    private TextField Vremontget;
    @FXML
    private TextField Pgazremontget;
    @FXML
    private TextField Tgazremontget;
    @FXML
    private TextField plotnostgazremontget;
    @FXML
    private TextField Hisxremontget;
    @FXML
    private TextField nremontget;
    @FXML
    private TextField plotnostvozremontget;
    @FXML
    private TextField otnosplotnostremontget;
    @FXML
    private TextField faktorsjgazremontget;
    @FXML
    private TextField Koefpremontget;
    @FXML
    private TextField KoefTremontget;
    @FXML
    private TextField Koefzremontget;
    @FXML
    private TextField normarasremontget;
    @FXML
    private TextField Qnpremontget;
    @FXML
    private TextField dzadremontget;
    @FXML
    private TextField Pabsremontget;
    @FXML
    private TextField Tproduvremontget;
    @FXML
    private TextField Tkpremontget;
    @FXML
    private TextField Fremontget;
    @FXML
    private TextField Qnkpremontget;
    @FXML
    private TextField Qkpremontget;
    @FXML
    private TextField QPPremontget;
    @FXML
    private TextField qstkondget;
    @FXML
    private TextField Nkolget;
    @FXML
    private TextField Qdegget;
    @FXML
    private TextField vobshukpgget;
    @FXML
    private TextField qbget;
    @FXML
    private TextField rdbget;
    @FXML
    private TextField kget;
    @FXML
    private TextField cget;
    @FXML
    private TextField qgazget;
    @FXML
    private TextField Qdeg2get;
    @FXML
    private TextField vobshukpg1get;
    @FXML
    private TextField Udegget;
    @FXML
    private TextField Pdegget;
    @FXML
    private TextField Tdegget;
    @FXML
    private TextField Cdegget;
    @FXML
    private TextField konsdegget;
    @FXML
    private TextField Vregget;
    @FXML
    private TextField Aget;
    @FXML
    private TextField qdeg1get;
    @FXML
    private TextField Qregget;
    @FXML
    private TextField rash71get;
    @FXML
    private TextField rash72get;
    @FXML
    private TextField rash73get;
    @FXML
    private TextField Qdeg8get;
    @FXML
    private TextField Qkoteldkcget;
    @FXML
    private TextField Qkotelukpgget;
    @FXML
    private TextField Qfakeldkcget;
    @FXML
    private TextField Qfakelukpgget;
    @FXML
    private TextField qutechukpgget;
    @FXML
    private TextField tukpgget;
    @FXML
    private TextField yukpgget;
    @FXML
    private TextField nukpgget;
    @FXML
    private TextField pgukpgget;
    @FXML
    private TextField qutechgpget;
    @FXML
    private TextField tgpget;
    @FXML
    private TextField ugpget;
    @FXML
    private TextField ngpget;
    @FXML
    private TextField pggpget;
    @FXML
    private TextField qutechdkcget;
    @FXML
    private TextField tdkcget;
    @FXML
    private TextField udkcget;
    @FXML
    private TextField ndkcget;
    @FXML
    private TextField pgdkcget;
    @FXML
    private TextField plotnostkcget;
    @FXML
    private TextField qutechukpg1get;
    @FXML
    private TextField tukpg1get;
    @FXML
    private TextField yukpg1get;
    @FXML
    private TextField nukpg1get;
    @FXML
    private TextField pgukpg1get;
    @FXML
    private TextField qutechgp1get;
    @FXML
    private TextField tgp1get;
    @FXML
    private TextField ugp1get;
    @FXML
    private TextField ngp1get;
    @FXML
    private TextField pggp1get;
    @FXML
    private TextField qutechdkc1get;
    @FXML
    private TextField tdkc1get;
    @FXML
    private TextField udkc1get;
    @FXML
    private TextField ndkc1get;
    @FXML
    private TextField pgdkc1get;
    @FXML
    private TextField qutechukpg2get;
    @FXML
    private TextField tukpg2get;
    @FXML
    private TextField yukpg2get;
    @FXML
    private TextField nukpg2get;
    @FXML
    private TextField pgukpg2get;
    @FXML
    private TextField qutechgp2get;
    @FXML
    private TextField tgp2get;
    @FXML
    private TextField ugp2get;
    @FXML
    private TextField ngp2get;
    @FXML
    private TextField pggp2get;
    @FXML
    private TextField qutechdkc2get;
    @FXML
    private TextField tdkc2get;
    @FXML
    private TextField udkc2get;
    @FXML
    private TextField ndkc2get;
    @FXML
    private TextField pgdkc2get;
    @FXML
    private TextField plotnostkc1get;
    @FXML
    private TextField plotnostkc2get;
    @FXML
    private TextField obpoterukpgget;
    @FXML
    private TextField obpoterpkukpgget;
    @FXML
    private TextField obpoterflansukpgget;
    @FXML
    private TextField obpoterukpg1get;
    @FXML
    private TextField obpoterpkukpg1get;
    @FXML
    private TextField obpoterflansukpg1get;
    @FXML
    private TextField obpoterukpg2get;
    @FXML
    private TextField obpoterpkukpg2get;
    @FXML
    private TextField obpoterflansukpg2get;


    @FXML
    private TextField Gvodiget;
    @FXML
    private TextField MH2Oget;
    @FXML
    private TextField Gnestkondget;
    @FXML
    private TextField Mnestkondget;

    @FXML
    private TextField Snipobgres;
    @FXML
    private TextField Snipallres;
    @FXML
    private TextField Sniptechnujdres;
    @FXML
    private TextField Snip11res;
    @FXML
    private TextField Snip12res;
    @FXML
    private TextField Snip13res;
    @FXML
    private TextField Snip14res;
    @FXML
    private TextField Snip15res;
    @FXML
    private TextField Snip16res;
    @FXML
    private TextField Sniptopnujdres;
    @FXML
    private TextField Snip21res;
    @FXML
    private TextField Snip22res;
    @FXML
    private TextField Snip23res;
    @FXML
    private TextField Snip24res;
    @FXML
    private TextField Snip25res;
    @FXML
    private TextField Snip26res;
    @FXML
    private TextField Snip27res;
    @FXML
    private TextField Snipoterres;
    @FXML
    private TextField Snip31res;
    @FXML
    private TextField Snip32res;
    @FXML
    private TextField Snip33res;
    @FXML
    private TextField Sniposedres;
    @FXML
    private TextField Snip41res;
    @FXML
    private TextField Snip42res;
    @FXML
    private TextField Sniposedallres;


    @FXML
    private TextField Snipallobres;
    @FXML
    private TextField Sniptechnujdobres;
    @FXML
    private TextField Snip11obres;
    @FXML
    private TextField Snip12obres;
    @FXML
    private TextField Snip13obres;
    @FXML
    private TextField Snip14obres;
    @FXML
    private TextField Snip15obres;
    @FXML
    private TextField Snip16obres;
    @FXML
    private TextField Sniptopnujdobres;
    @FXML
    private TextField Snip21obres;
    @FXML
    private TextField Snip22obres;
    @FXML
    private TextField Snip23obres;
    @FXML
    private TextField Snip24obres;
    @FXML
    private TextField Snip25obres;
    @FXML
    private TextField Snip26obres;
    @FXML
    private TextField Snip27obres;
    @FXML
    private TextField Snipoterobres;
    @FXML
    private TextField Snip31obres;
    @FXML
    private TextField Snip32obres;
    @FXML
    private TextField Snip33obres;
    @FXML
    private TextField Sniposedobres;
    @FXML
    private TextField Snip41obres;
    @FXML
    private TextField Snip42obres;
    @FXML
    private TextField Sniposedallobres;

    @FXML
    private TextField justname;
    @FXML
    private TextField tsksget;


    @FXML
    protected void onButtonClick() {
        //исходные данные
        Ddiaf = validValue(Ddiafget.getText());
        C = validValue(Cget.getText());
        Pnp = validValue(Pnpget.getText());
        pG = validValue(pGget.getText());
        T = validValue(Tget.getText());
        L = validValue(Lget.getText());
        dvnutr = validValue(dvnutrget.getText());
        patm = validValue(patmget.getText());
        pzab = validValue(pzabget.getText());
        pust = validValue(pustget.getText());
        kolproduv = validValue(kolproduvget.getText());
        //расчет
        deltP = pG / plotvoz; //Относительная плотность по воздуху
        Z = 1 - ((10.2 * Pnp - 6) * (0.345 / 100 * deltP - 0.466 / 1000) + 0.015) * (1.3 - 0.0144 * (T - 283.2)); //Фактор сжимаемости природного газа
        qbaz = C * Pnp / Math.sqrt(deltP * T * Z); //Базовый дебит скважины
        F = (3.14 * Math.pow(dvnutr, 2)) / 4 / 1000; //Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)
        Psred = (pzab + pust) / 2; //Среднее давление по стволу скважины, определяется как среднеарифметическое значение
        tproduv = ((L * (F / 1000) * Psred) / (qbaz * 1000 * patm)); //Продолжительность продувки
        Qskvaj = qbaz * tproduv * kolproduv; //Расход газа на одну продувку

        //исходные данные
        debitskv = validValue(debitskvget.getText());
        Trej = validValue(Trejget.getText());
        nproduv = validValue(nproduvget.getText());
        Nskvaj = validValue(Nskvajget.getText());
        //расчет
        Qproduvskv = debitskv * Trej * nproduv * Nskvaj; //Расход газа на продувку скважин

        //исходные данные
        debitskvkislobr = validValue(debitskvkislobrget.getText());
        Trejkislobr = validValue(Trejkislobrget.getText());
        nproduvkislobr = validValue(nproduvkislobrget.getText());
        nskavkislobr = validValue(nskavkislobrget.getText());
        //расчет
        qproduvskvkislobr = debitskvkislobr * Trejkislobr * nproduvkislobr * nskavkislobr;
        //исходные данные
        qskv = validValue(qskvget.getText());
        tskv = validValue(tskvget.getText());
        npr = validValue(nprget.getText());
        nskv = validValue(nskvget.getText());
        //расчет
        Vskv = qskv * tskv * npr * nskv; //Расход газа на продувку скважин
        //исходные данные
        debitlikvid = validValue(debitlikvidget.getText());
        Trejlikvid = validValue(Trejlikvidget.getText());
        nproduvlikvid = validValue(nproduvlikvidget.getText());
        Nskvajlikvid = validValue(Nskvajlikvidget.getText());
        //расчет
        Qproduvlikvid = debitlikvid * Trejlikvid * nproduvlikvid * Nskvajlikvid; //Расход газа на продувку скважин

        //исходные данные
        Dgazp = validValue(Dgazpget.getText());
        tolshstenki = validValue(tolshstenkiget.getText());
        Pgazprovod = validValue(Pgazprovodget.getText());
        Tgazprovod = validValue(Tgazprovodget.getText());
        plotnostgaza = validValue(plotnostgazaget.getText());
        Dproduvzad = validValue(Dproduvzadget.getText());
        Tproduvgaz = validValue(Tproduvgazget.getText());
        mproduvgaz = validValue(mproduvgazget.getText());
        nproduvgaz = validValue(nproduvgazget.getText());
        Hisx = 2 * 55 * Math.pow(50, 2) * 10 / (864 * (Math.sqrt(0.6 * 293 * 0.887)));
        plotnostvoz = 1.204;
//расчет
        otnosplotvoz = plotnostvoz / plotnostgaza; //Относительная плотность по воздуху
        faktorsjgaza = 1 - ((10.2 * Pgazprovod / 10 - 6) * (0.345 / 100 * otnosplotvoz + 0.446 / 1000) + 0.015) * (1.3 - 0.0144 * (Tgazprovod - 283.2)); //Фактор сжимаемости природного газа
        Koefp = Pgazprovod / 55;//Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        KoefT = Math.sqrt(293 / Tgazprovod); //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        Koefplot = Math.sqrt(0.6 / otnosplotvoz); //Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной
        Koefz = Math.sqrt(0.887 / faktorsjgaza); //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        Koefd = Math.pow(Dproduvzad, 2) / 2500; //Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного
        Koeft = Tproduvgaz / 10; // Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного
        normras = Hisx * Koefp * KoefT * Koefplot * Koefz * Koeft; //Норма расхода газа на одну продувку трубопровода и технологических аппаратов
        Qnp = normras * mproduvgaz * nproduvgaz / 1000; //Общий объем газа при продувке после ингибирования
        //исходные данные
        diamgaz = validValue(diamgazget.getText());
        tolshstenki2 = validValue(tolshstenki2get.getText());
        Pgazprovodjid = validValue(Pgazprovodjidget.getText());
        Tgazprovodjid = validValue(Tgazprovodjidget.getText());
        plotnostgazajid = validValue(plotnostgazajidget.getText());
        Dproduvzadjid = validValue(Dproduvzadjidget.getText());
        Tproduvgazjid = validValue(Tproduvgazjidget.getText());
        mproduvgazjid = validValue(mproduvgazjidget.getText());
        nproduvgazjid = validValue(nproduvgazjidget.getText());
        Hisxjid = 2 * 55 * Math.pow(50, 2) * 10 / (864 * (Math.sqrt(0.6 * 293 * 0.887)));
        plotnostvozjid = 1.204;
        //расчет
        otnosplotvozjid = plotnostgazajid / plotnostvozjid; //Относительная плотность по воздуху
        faktorsjgazajid = 1 - ((10.2 * Pgazprovodjid / 10 - 6) * (0.345 / 100 * otnosplotvozjid - 0.446 / 1000) + 0.015) * (1.3 - 0.0144 * (Tgazprovodjid - 283.2));//Фактор сжимаемости природного газа
        Koefpjid = Pgazprovodjid / 55; //Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        KoefTjid = Math.sqrt(293 / Tgazprovodjid); //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        Koefplotjid = Math.sqrt(0.6 / otnosplotvozjid); //Поправочный коэффициент, учитывающий отклонение относительной плотности газа от исходной
        Koefzjid = Math.sqrt(0.887 / faktorsjgazajid); //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        Koefdjid = Math.pow(Dproduvzadjid, 2) / 2500; //Поправочный коэффициент, учитывающий отклонение диаметра продувочной задвижки от исходного
        Koefstjid = Tproduvgazjid / 10; //Поправочный коэффициент, учитывающий отклонение рабочего времени продувки от исходного
        normrasjid = Hisxjid * Koefpjid * KoefTjid * Koefplotjid * Koefzjid * Koefdjid * Koefstjid; //Норма расхода газа на одну продувку трубопровода и технологических аппаратов
        Qnpjid = normrasjid * mproduvgazjid * nproduvgazjid / 1000;//Общий объем газа при продувке после ингибирования
        //исходные данные
        Vremont = validValue(Vremontget.getText());
        Pgazremont = validValue(Pgazremontget.getText());
        Tgazremont = validValue(Tgazremontget.getText());
        plotnostgazremont = validValue(plotnostgazremontget.getText());
        Hisxremont = 1 * 55 * 293 / 293 / 0.887 / 1;
        nremont = validValue(nremontget.getText());
        plotnostvozremont = 1.2044;
        //расчет
        otnosplotnostremont = plotnostgazremont / plotnostvozremont; //Относительная плотность по воздуху
        faktorsjgazremont = (1 - ((10.2 * Pgazremont / 10 - 6) * (0.345 / 100 * otnosplotnostremont - 0.0446 / 1000) + 0.015) * (1.3 - 0.0144 * (Tgazremont - 283.2))); //Фактор сжимаемости природного газа
        Koefpremont = Pgazremont / 55; //Поправочный коэффициент, учитывающий отклонение рабочего давления от исходного
        KoefTremont = 293 / Tgazremont; //Поправочный коэффициент, учитывающий отклонение рабочей температуры от исходной
        Koefzremont = 0.887 / faktorsjgazremont; //Поправочный коэффициент, учитывающий отклонение рабочего фактора сжимаемости от исходного
        normarasremont = Hisxremont * Koefpremont * KoefTremont * Koefzremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        Qnpremont = normarasremont * Vremont * nremont / 1000; //Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта
        //исходные данные
        dzadremont = validValue(dzadremontget.getText());
        Pabsremont = validValue(Pabsremontget.getText());
        Tproduvremont = validValue(Tproduvremontget.getText());
        Tkpremont = validValue(Tkpremontget.getText());
        //расчет
        Fremont = (3.14 * Math.pow(dzadremont / 1000, 2)) / 4; //Площадь проходного сечения канала, по которому движется поток газа с жидкостью (НКТ)
        Qnkpremont = 110 * Fremont * Pabsremont * Tproduvremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        Qkpremont = 296 * Fremont * Pabsremont * Tkpremont; //Исходная норма расхода газа на стравливание одного m³ геом.объема при ремонте при 20 °С и 0,1 МРа
        QPPremont = (Qnkpremont * Qkpremont) / 1000; //Расход газа при опорожнении трубопровода или технологических аппаратов перед проведением ремонта
        //исходные данные
        qstkond = validValue(qstkondget.getText());
        Nkol = validValue(Nkolget.getText());
        //расчет
        Qdeg = qstkond * Nkol / 1000; //Расход газа при дегазации конденсата
        //исходные данные
        vobshukpg = validValue(vobshukpgget.getText());
        qb = validValue(qbget.getText());
        rdb = validValue(rdbget.getText());
        k = validValue(kget.getText());
        c = validValue(cget.getText());
        //расчет
        qgaz = rdb * Math.pow(10, k * c); //Удельный объем газа дегазации в 1 m³ пластовой воды
        Qdeg2 = vobshukpg * qgaz * qb / 1000; //Расход газа при дегазации пластовой воды
        //исходные данные
        vobshukpg1 = validValue(vobshukpg1get.getText());
        Udeg = validValue(Udegget.getText());
        Pdeg = validValue(Pdegget.getText());
        Tdeg = validValue(Tdegget.getText());
        Cdeg = validValue(Cdegget.getText());
        konsdeg = validValue(konsdegget.getText());
//расчет
        Vreg = vobshukpg1 * 1000 * (Udeg * Pdeg); //Объем насыщенного раствора ДЭГ
        A = 1.415 * konsdeg / 1000 + 5.78 * Math.pow(konsdeg, 2) / 1000000 + 1.436 * Cdeg / 1000 - 2.969 * Cdeg * konsdeg / 100000 + 3.571 * Math.pow(Cdeg, 2) / 1000000 - 7.048 / 100;//Коэффициент, зависящий от температуры и концентрации ДЭГ
        qdeg1 = Tdeg * A;//Растворимость газа в растворе ДЭГ
        Qreg = qdeg1 * Vreg / 1000;//Расход газа при дегазации пластовой воды
        //исходные данные
        rash71 = validValue(rash71get.getText());
        rash72 = validValue(rash72get.getText());
        rash73 = validValue(rash73get.getText());
        //исходные данные
        Qdeg8 = validValue(Qdeg8get.getText());
        //исходные данные
        Qkoteldkc = validValue(Qkoteldkcget.getText());
        Qkotelukpg = validValue(Qkotelukpgget.getText());
        //исходные данные
        Qfakeldkc = validValue(Qfakeldkcget.getText());
        Qfakelukpg = validValue(Qfakelukpgget.getText());
        //исходные данные
        Qkoteldkc = validValue(Qkoteldkcget.getText());
        Qkotelukpg = validValue(Qkotelukpgget.getText());
        Qfakeldkc = validValue(Qfakeldkcget.getText());
        Qfakelukpg = validValue(Qfakelukpgget.getText());
        qutechukpg = validValue(qutechukpgget.getText());
        tukpg = validValue(tukpgget.getText());
        yukpg = validValue(yukpgget.getText());
        nukpg = validValue(nukpgget.getText());
        pgukpg = validValue(pgukpgget.getText());
        qutechgp = validValue(qutechgpget.getText());
        tgp = validValue(tgpget.getText());
        ugp = validValue(ugpget.getText());
        ngp = validValue(ngpget.getText());
        pggp = validValue(pggpget.getText());
        qutechdkc = validValue(qutechdkcget.getText());
        tdkc = validValue(tdkcget.getText());
        udkc = validValue(udkcget.getText());
        ndkc = validValue(ndkcget.getText());
        pgdkc = validValue(pgdkcget.getText());
        //расчет
        obpoterukpg = ((qutechukpg * tukpg * yukpg * nukpg / pgukpg)) / 1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg = ((qutechgp * tgp * ugp * ngp / pggp)) / 1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg = ((qutechdkc * tdkc * udkc * ndkc * pgdkc)) / 1000; //Общий объем технологических потерь для фланцевых соединений ЗРА
        //исходные данные
        qutechukpg1 = validValue(qutechukpg1get.getText());
        tukpg1 = validValue(tukpg1get.getText());
        yukpg1 = validValue(yukpg1get.getText());
        nukpg1 = validValue(nukpg1get.getText());
        pgukpg1 = validValue(pgukpg1get.getText());
        qutechgp1 = validValue(qutechgp1get.getText());
        tgp1 = validValue(tgp1get.getText());
        ugp1 = validValue(ugp1get.getText());
        ngp1 = validValue(ngp1get.getText());
        pggp1 = validValue(pggp1get.getText());
        qutechdkc1 = validValue(qutechdkc1get.getText());
        tdkc1 = validValue(tdkc1get.getText());
        udkc1 = validValue(udkc1get.getText());
        ndkc1 = validValue(ndkc1get.getText());
        pgdkc1 = validValue(pgdkc1get.getText());
        //расчет
        obpoterukpg1 = ((qutechukpg1 * tukpg1 * yukpg1 * nukpg1 / pgukpg1)) / 1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg1 = ((qutechgp1 * tgp1 * ugp1 * ngp1 / pggp1)) / 1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg1 = ((qutechdkc1 * tdkc1 * udkc1 * ndkc1 * pgdkc1)) / 1000; //Общий объем технологических потерь для фланцевых соединений ЗРА
        //исходные данные
        qutechukpg2 = validValue(qutechukpg2get.getText());
        tukpg2 = validValue(tukpg2get.getText());
        yukpg2 = validValue(yukpg2get.getText());
        nukpg2 = validValue(nukpg2get.getText());
        pgukpg2 = validValue(pgukpg2get.getText());
        qutechgp2 = validValue(qutechgp2get.getText());
        tgp2 = validValue(tgp2get.getText());
        ugp2 = validValue(ugp2get.getText());
        ngp2 = validValue(ngp2get.getText());
        pggp2 = validValue(pggp2get.getText());
        qutechdkc2 = validValue(qutechdkc2get.getText());
        tdkc2 = validValue(tdkc2get.getText());
        udkc2 = validValue(udkc2get.getText());
        ndkc2 = validValue(ndkc2get.getText());
        pgdkc2 = validValue(pgdkc2get.getText());
        //расчет
        obpoterukpg2 = ((qutechukpg2 * tukpg2 * yukpg2 * nukpg2 / pgukpg2)) / 1000; //Общий объем технологических потерь для сальниковых уплотнений ЗРА
        obpoterpkukpg2 = ((qutechgp2 * tgp2 * ugp2 * ngp2 / pggp2)) / 1000; //Общий объем технологических потерь для ПК
        obpoterflansukpg2 = ((qutechdkc2 * tdkc2 * udkc2 * ndkc2 * pgdkc2)) / 1000; //Общий объем технологических потерь для фланцевых соединений ЗРА
//исходные данные
        Gvodi = validValue(Gvodiget.getText());
        MH2O = validValue(MH2Oget.getText());
        Gnestkond = validValue(Gnestkondget.getText());
        Mnestkond = validValue(Mnestkondget.getText());
        //расчет
        Qupb = Gvodi / 18.0 * 24.04; //Расход (оседание) газа с извлечением влаги
        Qupnest = Gnestkond / Mnestkond * 24.04; //Расход (оседание) газа на производство нестабильного конденсата
        //расчет
        Snipobg = vobshukpg * 1000; //Объем газа, подаваемого на УКПГ «Алан»
        Snip11 = Qskvaj + Qproduvskv + qproduvskvkislobr + Vskv + Qproduvlikvid; //Расход газа на продувку скважин
        Snip12 = Qnp + Qnpjid;//Расход газа при продувке после ингибирования и очистки газопроводов
        Snip13 = Qnpremont + QPPremont;//Расход газа при ремонте
        Snip14 = Qdeg;//Расход газа при дегазации конденсата
        Snip15 = Qdeg2;//Расход газа при дегазации пластовой воды
        Snip16 = Qreg;//Расход газа при дегазации ДЭГ
        Sniptechnujd = Snip11 + Snip12 + Snip13 + Snip14 + Snip15 + Snip16;//Технологические нетопливные нужды, в том числе:
        Snip21 = rash71;//Расход топливного газа на эксплуатацию ДКС
        Snip22 = Qdeg8;//Расход топливного газа на работу огневых регенераторов
        Snip23 = Qkoteldkc;//Расход газа на котельная ДКС
        Snip24 = Qkotelukpg;//Расход топливного газа на работу котельной УКПГ
        Snip25 = Qfakeldkc;//Расход газа на факельную систему ДКС
        Snip26 = Qfakelukpg;//Расход газа на факел УКПГ
        Sniptopnujd = Snip21 + Snip22 + Snip23 + Snip24 + Snip25 + Snip26;//Технологические топливные нужды,  в том числе:
        Snip31 = obpoterukpg + obpoterpkukpg + obpoterflansukpg;//Технологически потери газа на УКПГ
        Snip32 = obpoterukpg1 + obpoterpkukpg1 + obpoterflansukpg1;//Технологически потери газа на газопроводе Алан-МГПЗ
        Snip33 = obpoterukpg2 + obpoterpkukpg2 + obpoterflansukpg2;//Технологически потери газа на ДКС
        Snipoter = Snip31 + Snip32 + Snip33;//Технологические потери (утечки), в том числе:
        Snip41 = Qupb;//Расход (оседание) газа с извлечением влаги
        Snip42 = Qupnest;//Расход (оседание) газа на производство нестабильного конденсата
        Sniposed = Snip41 + Snip42;//Расход (оседание) газа, в том числе:
        Snipall = Sniptechnujd + Sniptopnujd + Snipoter;//СНиП, всего


        Snipobgres.setText(String.valueOf(Snipobg));
        Snipallres.setText(String.valueOf(Snipall % .3f));
        Sniptechnujdres.setText(String.valueOf(Sniptechnujd % .3f));
        Snip11res.setText(String.valueOf(Snip11 % .3f));
        Snip12res.setText(String.valueOf(Snip12 % .3f));
        Snip13res.setText(String.valueOf(Snip13 % .3f));
        Snip14res.setText(String.valueOf(Snip14 % .3f));
        Snip15res.setText(String.valueOf(Snip15 % .3f));
        Snip16res.setText(String.valueOf(Snip16 % .3f));
        Sniptopnujdres.setText(String.valueOf(Sniptopnujd % .3f));
        Snip21res.setText(String.valueOf(Snip21 % .3));
        Snip22res.setText(String.valueOf(Snip22 % .3));
        Snip23res.setText(String.valueOf(Snip23 % .3));
        Snip24res.setText(String.valueOf(Snip24 % .3));
        Snip25res.setText(String.valueOf(Snip25 % .3));
        Snip26res.setText(String.valueOf(Snip26 % .3));
        // Snip27res.setText(String.valueOf(Snip27 %.3));
        Snipoterres.setText(String.valueOf(Snipoter % .3));
        Snip31res.setText(String.valueOf(Snip31 % .3));
        Snip32res.setText(String.valueOf(Snip32 % .3));
        Snip33res.setText(String.valueOf(Snip33 % .3));
        Sniposedres.setText(String.valueOf(Snipobg % .3));
        Snip41res.setText(String.valueOf(Snip41 % .3));
        Snip42res.setText(String.valueOf(Snip42 % .3));
        Sniposedallres.setText(String.valueOf(Sniposedall));

        Snipallobres.setText(String.valueOf(Snipall));
        Sniptechnujdobres.setText(String.valueOf(Sniptechnujdob));
        Snip11obres.setText(String.valueOf(Snip11ob));
        Snip12obres.setText(String.valueOf(Snip12ob));
        Snip13obres.setText(String.valueOf(Snip13ob));
        Snip14obres.setText(String.valueOf(Snip14ob));
        Snip15obres.setText(String.valueOf(Snip15ob));
        Snip16obres.setText(String.valueOf(Snip16ob));
        Sniptopnujdobres.setText(String.valueOf(Sniptopnujdob));
        Snip21obres.setText(String.valueOf(Snip21ob));
        Snip22obres.setText(String.valueOf(Snip22ob));
        Snip23obres.setText(String.valueOf(Snip23ob));
        Snip24obres.setText(String.valueOf(Snip24ob));
        Snip25obres.setText(String.valueOf(Snip25ob));
        Snip26obres.setText(String.valueOf(Snip26ob));
        //Snip27obres.setText(String.valueOf(Snip27ob));
        Snipoterobres.setText(String.valueOf(Snipoterob));
        Snip31obres.setText(String.valueOf(Snip31ob));
        Snip32obres.setText(String.valueOf(Snip32ob));
        Snip33obres.setText(String.valueOf(Snip33ob));
        Sniposedobres.setText(String.valueOf(Sniposedob));
        Snip41obres.setText(String.valueOf(Snip41ob));
        Snip42obres.setText(String.valueOf(Snip42ob));
        Sniposedallobres.setText(String.valueOf(Sniposedallob));
        try {
            byte[] pdf = HTMLPrintUtil.printPdfReport("items_report.html", getTestData());
            File file = new File("src/main/resources/print/goods.pdf");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileUtils.writeByteArrayToFile(file, pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        welcomeText.setText(qskvget.getText());
//        yangi.setText("salom");
    }

    private Double validValue(String value) {
        try {
            if (value.isEmpty()) {
                return 0.0;
            }
            return Double.valueOf(value);
        } catch (Exception e) {
            return 0.0;
        }
    }

    private Map<String, Object> getTestData() {

        Map<String, Object> data = new HashMap<>();
        List<Map<String, String>> table = new ArrayList<>();

        data.put("date", LocalDate.now().toString());

        Map<String, String> row = new HashMap<>();

        row.put("number", "  ");
        row.put("nameofparameter", "Объем газа, подаваемого на УКПГ АЛАН ");
        row.put("Snipres", (String.valueOf(Snipobg))); //Snipobgres
        row.put("Snipobres", " "); //null
        table.add(row);

        row = new HashMap<>();
        row.put("number", "  "); //null
        row.put("nameofparameter", "СНиП, всего ");
        row.put("Snipres", (String.valueOf(Snipall))); //Snipallres
        row.put("Snipobres", (String.valueOf(Snipallobres))); //Snipallobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1 ");
        row.put("nameofparameter", "Технологические нетопливные нужны, в том числе:");
        row.put("Snipres", (String.valueOf(Sniptechnujd))); //Sniptechnujdres
        row.put("Snipobres", (String.valueOf(Sniptechnujdob))); //Sniptechnujdobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.1");
        row.put("nameofparameter", "Расход газа на продувку скважин (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip11))); //Snip11res
        row.put("Snipobres", (String.valueOf(Snip11ob))); //Snipp11obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.2");
        row.put("nameofparameter", "Расход газа при продувке после ингибирования и очистки газопроводов (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip12))); //Snip12res
        row.put("Snipobres", (String.valueOf(Snip12ob))); //Snipp12obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.3");
        row.put("nameofparameter", "Расход газа при ремонте (Согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip13))); //Snip13res
        row.put("Snipobres", (String.valueOf(Snip13ob))); //Snipp13obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.4");
        row.put("nameofparameter", "Расход газа при дегазации (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip14))); //Snip14res
        row.put("Snipobres", (String.valueOf(Snip14ob))); //Snipp14obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1,5");
        row.put("nameofparameter", "Расход газа при дегазации пластовой воды (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip15))); //Snip15res
        row.put("Snipobres", (String.valueOf(Snip15ob))); //Snipp15obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1,6");
        row.put("nameofparameter", "Расход газа при регенерации ДЭГ (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip16))); //Snip16res
        row.put("Snipobres", (String.valueOf(Snip16ob))); //Snipp16obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2");
        row.put("nameofparameter", "Технологические топливные нужды, в том числе (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Sniptechnujd))); //Sniptopnujdres
        row.put("Snipobres", (String.valueOf(Sniptopnujdob))); //Sniptopnujdobres
        table.add(row);


        row = new HashMap<>();
        row.put("number", " 2.1");
        row.put("nameofparameter", "Расход топливного газа на агрегаты ДКС-1 (показания прибора)");
        row.put("Snipres", (String.valueOf(Snip21))); //Snip21res
        row.put("Snipobres", (String.valueOf(Snip21ob))); //Snip21obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.2");
        row.put("nameofparameter", "Расход топливного газа на работу БПГР ДКС (по паспортным данным)");
        row.put("Snipres", (String.valueOf(Snip22))); //Snip22res
        row.put("Snipobres", (String.valueOf(Snip22ob))); //Snip22obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.3");
        row.put("nameofparameter", "Расход топливного газа на работу огневых регенераторов (показания прибора)");
        row.put("Snipres", (String.valueOf(Snip23))); //Snip23res
        row.put("Snipobres", (String.valueOf(Snip23ob))); //Snip23obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.4");
        row.put("nameofparameter", "Расход топлива на котельную ДКС (показания прибора)");
        row.put("Snipres", (String.valueOf(Snip24))); //Snip24res
        row.put("Snipobres", (String.valueOf(Snip24ob))); //Snip24obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.5");
        row.put("nameofparameter", "Расход топливного газа на работу котельной УКПГ (показания прибора)");
        row.put("Snipres", (String.valueOf(Snip25))); //Snip25res
        row.put("Snipobres", (String.valueOf(Snip25ob))); //Snip25obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.6");
        row.put("nameofparameter", "Расход газа на факельную систему ДКС (показания прибора)");
        row.put("Snipres", (String.valueOf(Snip26))); //Snip26res
        row.put("Snipobres", (String.valueOf(Snip26ob))); //Snip26obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", "3");
        row.put("nameofparameter", "Технологические потери(утечки), в том числе:");
        row.put("Snipres", (String.valueOf(Snipoter))); //Snipoterres
        row.put("Snipobres", (String.valueOf(Snipoterob))); //Snipoterobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.1");
        row.put("nameofparameter", "Технологические потери газа на УКПГ (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip31))); //Snip31res
        row.put("Snipobres", (String.valueOf(Snip31ob))); //Snip31obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.2");
        row.put("nameofparameter", "Технологические потери газа на газопроводе Алан-МГПЗ(согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip32))); //Snip32res
        row.put("Snipobres", (String.valueOf(Snip32ob))); //Snip32obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.3");
        row.put("nameofparameter", "Технологические технологические потери газа на ДКС(согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip33))); //Snip33res
        row.put("Snipobres", (String.valueOf(Snip33ob))); //Snip33obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4");
        row.put("nameofparameter", "Расход (оседание) газа, в том числе:");
        row.put("Snipres", (String.valueOf(Sniposed))); //Sniposedres
        row.put("Snipobres", (String.valueOf(Sniposedob))); //Sniposedobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4.1");
        row.put("nameofparameter", "Расход (оседание) газа с извлечением влаги (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip41))); //Snip41res
        row.put("Snipobres", (String.valueOf(Snip41ob))); //Snip41obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4.2");
        row.put("nameofparameter", "Расход (оседание) газа на производство нестабильного конденсата (согласно NGH 39.2-66:2009");
        row.put("Snipres", (String.valueOf(Snip42))); //Snip42res
        row.put("Snipobres", (String.valueOf(Snip42ob))); //Snip42obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " ");
        row.put("nameofparameter", "СНиП+ оседание всего");
        row.put("Snipres", (String.valueOf(Sniposedall))); //Sniposedallres
        row.put("Snipobres", (String.valueOf(Sniposedallob))); //Sniposedallobres
        table.add(row);

        data.put("justname",justname.getText());

        data.put("goods-rows", table);

        return data;
    }
}