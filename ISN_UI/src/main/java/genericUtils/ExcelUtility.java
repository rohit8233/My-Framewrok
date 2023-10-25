package genericUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility implements IPathConstant{


		/**
		 * This Method will read data from Excel sheet and return value
		 * @throws IOException 
		 * @throws EncryptedDocumentException 
		 */
		public String readDataFromExcel(String sheet , int rowno , int cellno ) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(IPathConstant.excelfilepath);
			Workbook wb = WorkbookFactory.create(fis); 
			String value = wb.getSheet(sheet).getRow(rowno).getCell(cellno).getStringCellValue();
			return value;
		}
}
