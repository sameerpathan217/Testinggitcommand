package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String AcceptExcelData(String filename, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis =new FileInputStream("./src/test/resources/DemoSauce.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		DataFormatter d=new DataFormatter();
		String data = d.formatCellValue(book.getSheet(filename).getRow(row).getCell(cell));
	     return data;	
	}

}
