package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{	
		
		String path = ".\\testData\\OHRM_TestData.xlsx";
	    ExcelUtility xlutil = new ExcelUtility(path);

	    int totalrows = xlutil.getRowCount("Sheet1");
	    int totalcols = xlutil.getCellCount("Sheet1", 1);

	    // Use dynamic list to avoid hardcoding row size
	    List<String[]> dataList = new ArrayList<>();

	    for (int i = 1; i <= totalrows; i++) {
	        String[] rowData = new String[totalcols];
	        boolean isRowEmpty = true;

	        for (int j = 0; j < totalcols; j++) {
	            String cellData = xlutil.getCellData("Sheet1", i, j).trim();
	            rowData[j] = cellData;

	            if (!cellData.isEmpty()) {
	                isRowEmpty = false;
	            }
	        }

	        if (!isRowEmpty) {
	            dataList.add(rowData);
	        }
	    }

	    // Convert List to Array
	    String[][] logindata = new String[dataList.size()][totalcols];
	    for (int i = 0; i < dataList.size(); i++) {
	        logindata[i] = dataList.get(i);
	    }

	    return logindata;
				
	}
}