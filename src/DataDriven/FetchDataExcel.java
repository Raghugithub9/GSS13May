package DataDriven;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataExcel {

	public static String[][] readexcel(String filename, String sheetname) throws IOException  {

		File file = new File("C://Users//lenovo//Desktop//Trainings//Selenium//Framework//TestData.xlsx");
		
		FileInputStream ips = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(ips);
	
		Sheet sh = wb.getSheet("Data");

		//int rowNum = sh.getLastRowNum();
		int rowNum = sh.getPhysicalNumberOfRows();
		int colNum = sh.getRow(0).getLastCellNum(); // (+1 is added internally)
System.out.println("Total no of Rows "+rowNum);
System.out.println("Total no of Columns "+colNum);


		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) { // iterate through loop horizontally

			Row row = sh.getRow(i);

			for (int j = 0; j < colNum; j++) {

				String value = row.getCell(j).getStringCellValue();
				data[i][j] = value;
				
				//data[0][0]=
				//data[0][1]=
				//data[1][0]
				//data[1][1]
			}

		}
		return data;

	}

}
