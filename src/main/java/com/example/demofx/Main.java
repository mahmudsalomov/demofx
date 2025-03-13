package com.example.demofx;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Пример с сайта develnotes.org
 * @author Alex Dl.
 */
public class Main {

    public static void main(String [] args) {

        try {
            byte[] pdf = HTMLPrintUtil.printPdfReport("items_report.html", getTestData());
            FileUtils.writeByteArrayToFile(new File("src/main/resources/print/goods.pdf"), pdf);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Map<String, Object> getTestData() {

        Map<String, Object> data = new HashMap<>();
        List<Map<String,String>> table = new ArrayList<>();

        data.put("date", LocalDate.now().toString());

        Map<String, String> row = new HashMap<>();

        row.put("number", "  ");
        row.put("nameofparameter", "Объем газа, подаваемого на УКПГ АЛАН ");
        row.put("Snipres", " "); //Snipobgres
        row.put("Snipobres", " "); //null
        table.add(row);

        row = new HashMap<>();
        row.put("number", "  "); //null
        row.put("nameofparameter", "СНиП, всего ");
        row.put("Snipres", " "); //Snipallres
        row.put("Snipobres", " "); //Snipallobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1 ");
        row.put("nameofparameter", "Технологические нетопливные нужны, в том числе:");
        row.put("Snipres", "  "); //Sniptechnujdres
        row.put("Snipobres", "  "); //Sniptechnujdobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.1");
        row.put("nameofparameter", "Расход газа на продувку скважин (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip11res
        row.put("Snipobres", " "); //Snipp11obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.2");
        row.put("nameofparameter", "Расход газа при продувке после ингибирования и очистки газопроводов (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip12res
        row.put("Snipobres", " "); //Snipp12obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.3");
        row.put("nameofparameter", "Расход газа при ремонте (Согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip13res
        row.put("Snipobres", " "); //Snipp13obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1.4");
        row.put("nameofparameter", "Расход газа при дегазации (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip14res
        row.put("Snipobres", " "); //Snipp14obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1,5");
        row.put("nameofparameter", "Расход газа при дегазации пластовой воды (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip15res
        row.put("Snipobres", " "); //Snipp15obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 1,6");
        row.put("nameofparameter", "Расход газа при регенерации ДЭГ (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip16res
        row.put("Snipobres", " "); //Snipp16obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2");
        row.put("nameofparameter", "Технологические топливные нужды, в том числе (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Sniptopnujdres
        row.put("Snipobres", " "); //Sniptopnujdobres
        table.add(row);


        row = new HashMap<>();
        row.put("number", " 2.1");
        row.put("nameofparameter", "Расход топливного газа на агрегаты ДКС-1 (показания прибора)");
        row.put("Snipres", " "); //Snip21res
        row.put("Snipobres", " "); //Snip21obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.2");
        row.put("nameofparameter", "Расход топливного газа на работу БПГР ДКС (по паспортным данным)");
        row.put("Snipres", " "); //Snip22res
        row.put("Snipobres", " "); //Snip22obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.3");
        row.put("nameofparameter", "Расход топливного газа на работу огневых регенераторов (показания прибора)");
        row.put("Snipres", " "); //Snip23res
        row.put("Snipobres", " "); //Snip23obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.4");
        row.put("nameofparameter", "Расход топлива на котельную ДКС (показания прибора)");
        row.put("Snipres", " "); //Snip24res
        row.put("Snipobres", " "); //Snip24obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.5");
        row.put("nameofparameter", "Расход топливного газа на работу котельной УКПГ (показания прибора)");
        row.put("Snipres", " "); //Snip25res
        row.put("Snipobres", " "); //Snip25obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.6");
        row.put("nameofparameter", "Расход газа на факельную систему ДКС (показания прибора)");
        row.put("Snipres", " "); //Snip26res
        row.put("Snipobres", " "); //Snip26obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 2.7");
        row.put("nameofparameter", "Расход газа на факел УКПГ(показания прибора)");
        row.put("Snipres", " "); //Snip27res
        row.put("Snipobres", " "); //Snip27obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", "3");
        row.put("nameofparameter", "Технологические потери(утечки), в том числе:");
        row.put("Snipres", " "); //Snipoterres
        row.put("Snipobres", " "); //Snipoterobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.1");
        row.put("nameofparameter", "Технологические потери газа на УКПГ (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip31res
        row.put("Snipobres", " "); //Snip31obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.2");
        row.put("nameofparameter", "Технологические потери газа на газопроводе Алан-МГПЗ(согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip32res
        row.put("Snipobres", " "); //Snip32obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 3.3");
        row.put("nameofparameter", "Технологические технологические потери газа на ДКС(согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip33res
        row.put("Snipobres", " "); //Snip33obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4");
        row.put("nameofparameter", "Расход (оседание) газа, в том числе:");
        row.put("Snipres", " "); //Sniposedres
        row.put("Snipobres", " "); //Sniposedobres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4.1");
        row.put("nameofparameter", "Расход (оседание) газа с извлечением влаги (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip41res
        row.put("Snipobres", " "); //Snip41obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " 4.2");
        row.put("nameofparameter", "Расход (оседание) газа на производство нестабильного конденсата (согласно NGH 39.2-66:2009");
        row.put("Snipres", " "); //Snip42res
        row.put("Snipobres", " "); //Snip42obres
        table.add(row);

        row = new HashMap<>();
        row.put("number", " ");
        row.put("nameofparameter", "СНиП+ оседание всего");
        row.put("Snipres", " "); //Sniposedallres
        row.put("Snipobres", " "); //Sniposedallobres
        table.add(row);

        data.put("goods-rows", table);

        return data;
    }

}
