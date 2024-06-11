package KeyworkDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	public static String[][] readexcel(String filename, String sheetname) throws IOException {

		File file = new File("C://Users//lenovo//Desktop//Trainings//Selenium//Framework//TestData.xlsx");

		
		FileInputStream ips = new FileInputStream(file);

		Workbook wb = new XSSFWorkbook(ips);
	
		Sheet sh = wb.getSheet("keyworddata");

		int rowNum = sh.getLastRowNum();
		int colNum = sh.getRow(0).getLastCellNum(); // (+1 is added internally)
		System.out.println("rowNum value is "+rowNum);
		System.out.println(colNum);
		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) { // iterate through loop horizontally

			Row row = sh.getRow(i);

			for (int j = 0; j < colNum; j++) {

				String value = row.getCell(j).getStringCellValue();
				data[i][j] = value;
			}

		}
		return data;

	}

}
