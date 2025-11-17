package tests;

import org.testng.annotations.Test;
import utils.ExcelUtils;

import java.io.IOException;
import java.util.List;

public class DataDrivenTest extends BaseTest {

    @Test
    public void runWithExcelData() throws IOException {
        String file = System.getProperty("user.dir") + "/resources/testdata.xlsx";
        List<String[]> rows = ExcelUtils.readSheet(file, "Sheet1");
        // skip header if exists
        for (int i = 1; i < rows.size(); i++) {
            String[] r = rows.get(i);
            System.out.println("Running with: " + java.util.Arrays.toString(r));
            // Here you can call page objects and pass data
        }
    }
}
