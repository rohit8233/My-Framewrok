package genericUtils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;


public class CSVDataProvider implements IPathConstant{

	public static String getCSVData(int rowcount, int columncount)  {
	    String result=null;
try {
		
    List<String[]> csvData = readCSVData(csvfilepath);
    for (String[] rowData : csvData) {
        // Process the data from the CSV file
        if (rowcount < csvData.size() && columncount < rowData.length) {
            result = csvData.get(rowcount)[columncount];
        }
    }
}
    catch(Exception e) {
    	e.printStackTrace();
    }
    return result;
}
	
	 public static List<String[]> readCSVData(String csvFilePath) {
	        List<String[]> data = new ArrayList<>();
	        try {
	        CSVReader reader = new CSVReader(new FileReader(csvFilePath)) ;
	            String[] rowData;
	            while ((rowData = reader.readNext()) != null) {
	                data.add(rowData);
	            }
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return data;
	    }

}


