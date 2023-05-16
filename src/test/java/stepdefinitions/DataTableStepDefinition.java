package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDefinition {

    @Given("Asagidaki tablo bu methodda parametre olarak kullanilacak")
    public void asagidakiTabloBuMethoddaParametreOlarakKullanilacak(DataTable table) {

        List<List<String>> data = table.asLists();    // aslist metodunu secerken dikkat et (list<List<String>)olmali

        for (List<String> eachrow:data) {
            for (String eachCell : eachrow) {
                System.out.print(eachCell+" ");
            }
            System.out.println();
        }


    }
}
