import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class Excel {

	public static void main(String[] args)
	{
		try {
			FileInputStream File = new FileInputStream(new File("C:\\Users\\hp\\Desktop\\Standing Order_Test Basis.xls"));
			HSSFWorkbook workbook = new  HSSFWorkbook(File);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext())
			{
				Row row=rowIterator.next();
				Iterator<Cell> cellIterator=row.cellIterator();
				while(cellIterator.hasNext())
				{
					Cell cell=cellIterator.next();
					switch(cell.getCellType())
					{
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					}
				}
				System.out.println("");
			}
			File.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
