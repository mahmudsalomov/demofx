package com.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloController {
    public TextField nprget;
    //    @FXML
//    private Label button;
    double qskv;
    double tsks;
    double npr;
    double nskv;
    double Vskv;
    double qstkond;
    double nkol;
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
    double P;
    double T;
    double C;
    double Vreg;
    double A;
    double qdeg1;
    double Qreg;
    double rash71;
    double rash72;
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
    double rash111;

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
    double rash112;

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
    double rash113;
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
    double Snip27;
    double Snip27ob;
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
    private TextField qskvget;

    @FXML
    private TextField tskvget;

    @FXML
    private TextField nskvget;
    @FXML
    private TextField qstkondget;
    @FXML
    private TextField Nkolget;
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
    private TextField vobshukpg1get;
    @FXML
    private TextField Udegget;
    @FXML
    private TextField Pget;
    @FXML
    private TextField Tget;
    @FXML
    private TextField Cget;
    @FXML
    private TextField rash71get;
    @FXML
    private TextField rash72get;
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
    private TextField tsksget;



    @FXML
    protected void onButtonClick() {
        qskv = validValue(qskvget.getText());
        tsks =validValue(tsksget.getText());
        npr = validValue(nprget.getText());
        nskv = validValue(nskvget.getText());
        Vskv = qskv * tsks * npr * nskv; //расчет
        qstkond = validValue(qstkondget.getText());
        nkol = validValue(Nkolget.getText());
       Qdeg = qstkond * nkol / 1000; // расчет
        vobshukpg = validValue(vobshukpgget.getText());
        qb = validValue(qbget.getText());
        rdb = validValue(rdbget.getText());
        k = validValue(kget.getText());
        c = validValue(cget.getText());
        qgaz = rdb * Math.pow(10,-k * c); //расчет
        Qdeg2 = vobshukpg * qgaz * qb   / 1000; //расчет
        vobshukpg1 = validValue(vobshukpg1get.getText());
        Udeg = validValue(Udegget.getText());
        P = validValue(Pget.getText());
        T = validValue(Tget.getText());
        C = validValue(Cget.getText());
        Vreg = vobshukpg1 * Udeg; //расчет
        A = 1.415 * C / 1000 + 5.78 * Math.pow(C,2)/1000000 + 1.43 * T * C / 100000 + 3.57 * Math.pow(T,2) / 1000000 -7.048/100; //расчет
        qdeg1 = P * A; // расчет
        Qreg = qdeg1 * Vreg/1000; //расчет
        rash71 = validValue(rash71get.getText());
        rash72 = validValue(rash72get.getText());
        Qdeg8 = validValue(Qdeg8get.getText());
        Qkoteldkc =validValue(Qkoteldkcget.getText());
        Qkotelukpg = validValue(Qkotelukpgget.getText());
        Qfakeldkc = validValue(Qfakeldkcget.getText());
        Qfakelukpg = validValue(Qfakelukpgget.getText());
        qutechukpg =validValue(qutechukpgget.getText());
        tukpg =validValue(tukpgget.getText());
        yukpg =validValue(yukpgget.getText());
        nukpg =validValue(nukpgget.getText());
        pgukpg =validValue(pgukpgget.getText());
        qutechgp = validValue(qutechgpget.getText());
        tgp = validValue(tgpget.getText());
        ugp = validValue(ugpget.getText());
        ngp = validValue(ngpget.getText());
        pggp = validValue(pggpget.getText());
       qutechdkc =validValue(qutechdkcget.getText());
        tdkc =validValue(tdkcget.getText());
        udkc = validValue(udkcget.getText());
        ndkc =validValue(ndkcget.getText());
        pgdkc =validValue(pgdkcget.getText());
        rash111 = ((qutechukpg * tukpg * yukpg * nukpg / pgukpg)+(qutechgp * tgp * ugp *ngp/pggp)+(qutechdkc * tdkc * udkc * ndkc/pgdkc))/1000; // расчет

        qutechukpg1 =validValue(qutechukpg1get.getText());
        tukpg1 =validValue(tukpg1get.getText());
        yukpg1 =validValue(yukpg1get.getText());
        nukpg1 =validValue(nukpg1get.getText());
        pgukpg1 =validValue(pgukpg1get.getText());
        qutechgp1 = validValue(qutechgp1get.getText());
        tgp1 = validValue(tgp1get.getText());
        ugp1 = validValue(ugp1get.getText());
        ngp1 = validValue(ngp1get.getText());
        pggp1 = validValue(pggp1get.getText());
        qutechdkc1 =validValue(qutechdkc1get.getText());
        tdkc1 =validValue(tdkc1get.getText());
        udkc1 = validValue(udkc1get.getText());
        ndkc1 =validValue(ndkc1get.getText());
        pgdkc1 =validValue(pgdkc1get.getText());
        rash112 = ((qutechukpg1 * tukpg1 * yukpg1 * nukpg1 / pgukpg1)+(qutechgp1 * tgp1 * ugp1 *ngp1/pggp1)+(qutechdkc1 * tdkc1 * udkc1 * ndkc1/pgdkc1))/1000; // расчет

        qutechukpg2 =validValue(qutechukpg2get.getText());
        tukpg2 =validValue(tukpg2get.getText());
        yukpg2 =validValue(yukpg2get.getText());
        nukpg2 =validValue(nukpg2get.getText());
        pgukpg2 =validValue(pgukpg2get.getText());
        qutechgp2 = validValue(qutechgp2get.getText());
        tgp2 = validValue(tgp2get.getText());
        ugp2 = validValue(ugp2get.getText());
        ngp2 = validValue(ngp2get.getText());
        pggp2 = validValue(pggp2get.getText());
        qutechdkc2 =validValue(qutechdkc2get.getText());
        tdkc2 =validValue(tdkc2get.getText());
        udkc2 = validValue(udkc2get.getText());
        ndkc2 =validValue(ndkc2get.getText());
        pgdkc2 =validValue(pgdkc2get.getText());
        rash113 = ((qutechukpg2 * tukpg2 * yukpg2 * nukpg2 / pgukpg2)+(qutechgp2 * tgp2 * ugp2 *ngp2/pggp2)+(qutechdkc2 * tdkc2 * udkc2 * ndkc2/pgdkc2))/1000; //расчет
        Gvodi = validValue(Gvodiget.getText());
        MH2O = validValue(MH2Oget.getText());
        Gnestkond =validValue(Gnestkondget.getText());
        Mnestkond =validValue(Mnestkondget.getText());
        Qupb = Gvodi/MH2O * 24.04; //расчет
        Qupnest = Gnestkond / Mnestkond * 24.04; //расчет
        Snipobg = vobshukpg * 1000;
        Snip11 = Vskv; //Надо доработать
        Snip12 = 0; //Надо доработать
        Snip13 = 0; //Надо доработать
        Snip14 = Qdeg;
        Snip15 = Qdeg2;
        Snip16 = Qreg;
        Snip21 = rash71;
        Snip22 = rash72;
        Snip23 = Qdeg8;
        Snip24 = Qkoteldkc;
        Snip25 = Qkotelukpg;
        Snip26 = Qfakeldkc;
        Snip27 = Qfakelukpg;
        Sniptopnujd = Snip21 + Snip22 + Snip23 + Snip24 +Snip25 + Snip26 + Snip27; //расчет
        Snip31 = rash111;
        Snip32 = rash112;
        Snip33 = rash113;
        Snipoter = Snip31 +Snip32 + Snip33; // расчет/
        Snip41 = Qupb;
       Sniposed = Snip41;
        Snip42 = Qupnest;
        Sniptechnujd = Snip11 + Snip12 + Snip13 + Snip14 + Snip15 +Snip16;
        Snipall = Sniptechnujd + Sniptopnujd + Snipoter;
        Sniposedall = Sniposed +Snipall;

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
        Snip27ob = Snip27 / Snipobg * 100;
        Sniptopnujdob =Snip21ob + Snip22ob + Snip23ob + Snip24ob + Snip25ob + Snip26ob + Snip27ob;

        Snip31ob = Snip31 / Snipobg *100;
        Snip32ob = Snip32 / Snipobg *100;
        Snip33ob = Snip33 / Snipobg *100;
        Snipoterob = Snip31ob + Snip32ob + Snip33ob ;
        Snip41ob = Snip41 / Snipobg * 100;
        Snip42ob = Snip42 / Snipobg * 100;
        Sniposedob = Snip41ob +Snip42ob;
        Snipsallob = Sniptechnujdob +Sniptopnujdob + Snipoterob;
        Sniposedallob = Snipsallob + Sniposedob;


        Snipobgres.setText(String.valueOf(Snipobg ));
        Snipallres.setText(String.valueOf(Snipall %.3f));
        Sniptechnujdres.setText(String.valueOf(Sniptechnujd %.3f));
        Snip11res.setText(String.valueOf(Snip11 %.3f));
        Snip12res .setText(String.valueOf(Snip12 %.3f));
        Snip13res.setText(String.valueOf(Snip13 %.3f));
        Snip14res.setText(String.valueOf(Snip14 %.3f));
        Snip15res.setText(String.valueOf(Snip15 %.3f));
        Snip16res.setText(String.valueOf(Snip16 %.3f));
        Sniptopnujdres.setText(String.valueOf(Sniptopnujd %.3f));
        Snip21res.setText(String.valueOf(Snip21 %.3));
        Snip22res.setText(String.valueOf(Snip22 %.3));
        Snip23res.setText(String.valueOf(Snip23 %.3));
        Snip24res.setText(String.valueOf(Snip24 %.3));
        Snip25res.setText(String.valueOf(Snip25 %.3));
        Snip26res.setText(String.valueOf(Snip26 %.3));
        Snip27res.setText(String.valueOf(Snip27 %.3));
        Snipoterres.setText(String.valueOf(Snipoter %.3));
        Snip31res.setText(String.valueOf(Snip31 %.3));
        Snip32res.setText(String.valueOf(Snip32 %.3));
        Snip33res.setText(String.valueOf(Snip33 %.3));
        Sniposedres.setText(String.valueOf(Snipobg %.3));
        Snip41res.setText(String.valueOf(Snip41 %.3));
        Snip42res.setText(String.valueOf(Snip42 %.3));
        Sniposedallres.setText(String.valueOf(Sniposedall));

        Snipallobres.setText(String.valueOf(Snipall));
        Sniptechnujdobres.setText(String.valueOf(Sniptechnujdob));
        Snip11obres.setText(String.valueOf(Snip11ob));
        Snip12obres .setText(String.valueOf(Snip12ob));
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
        Snip27obres.setText(String.valueOf(Snip27ob));
        Snipoterobres.setText(String.valueOf(Snipoterob));
        Snip31obres.setText(String.valueOf(Snip31ob));
        Snip32obres.setText(String.valueOf(Snip32ob));
        Snip33obres.setText(String.valueOf(Snip33ob));
        Sniposedobres.setText(String.valueOf(Sniposedob));
        Snip41obres.setText(String.valueOf(Snip41ob));
        Snip42obres.setText(String.valueOf(Snip42ob));
        Sniposedallobres.setText(String.valueOf(Sniposedallob));




//        welcomeText.setText(qskvget.getText());
//        yangi.setText("salom");
    }

    private Double validValue(String value){
        try {
            if (value.isEmpty()){
                return 0.0;
            }
            return Double.valueOf(value);
        }catch (Exception e){
            return 0.0;
        }
    }

}