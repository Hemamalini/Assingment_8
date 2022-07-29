package assingment8;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	public static String[][] leadMtd(String fileName) throws IOException{
		XSSFWorkbook book =new XSSFWorkbook("./Excel/"+fileName+".xlsx");
		XSSFSheet sheet =book.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();
		String[][] data=new String[lastRowNum][colCount];
		for(int i =1;i<=lastRowNum;i++) {//iterate from (1,0) leaving header
			for(int j =0;j<colCount;j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
		}
		book.close();
		return data;
	}
}
