package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public Object[][] getRegistrationData(String sheetName) throws IOException {

		
		FileInputStream str = new FileInputStream("C:\\Users\\Shone\\Desktop\\Demo Web Shop\\Code\\DemoWebShop\\src\\test\\resources\\Data Provider\\DemoWebStore.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(str);
    	XSSFSheet sheet = wb.getSheet("Users");
	    int rowCount = sheet.getLastRowNum();
	    int colCount = sheet.getRow(0).getLastCellNum();

	    Object data[][] = new Object[rowCount][colCount];

	    for(int i=1; i<=rowCount; i++) {

	        for(int j=0; j<colCount; j++) {

	            data[i-1][j] = sheet.getRow(i).getCell(j).toString();

	        }

	    }

	    return data;
	}

}
