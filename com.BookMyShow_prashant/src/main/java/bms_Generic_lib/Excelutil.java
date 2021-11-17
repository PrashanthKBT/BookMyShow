package bms_Generic_lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Prashanth KB
 *
 */

public class Excelutil {
	/**
	 * 
	 * @param sheetname this method is used to enter the sheet name of the ExcelSheet 
	 * @param rowno this method is used to get  the the rowno of the ExcelSheet
	 * @param cellno this method is used to get the cellno  of the ExcelSheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException   
	 */
		public static String readstringfromexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		File abspath=new File("./src/test/resources/testdata.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
		/**
		 * 
		 * @param sheetname this method is used to enter the sheet name of the ExcelSheet
		 * @param rowno this method is used to get  the the row no of the ExcelSheet
		 * @param cellno this method is used to get the cell no  of the ExcelSheet
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public static boolean readbooleanvaluefromexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
			File abspath=new File("./src/test/resources/testdata.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			boolean data = workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getBooleanCellValue();
			return data;
		}
		/**
		 * 
		 * @param sheetname this method is used to enter the sheet name of the ExcelSheet
		 * @param rowno this method is used to get  the the rowno of the ExcelSheet
		 * @param cellno this method is used to get the cellno  of the ExcelSheet
		 * @return 
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public static  LocalDateTime readdatevalueformexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
			File abspath=new File("./src/test/resources/testdata.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			 LocalDateTime data = workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getLocalDateTimeCellValue();
			return data;
		}
		/**
		 * 
		 * @param sheetname this method is used to enter the sheet name of the ExcelSheet
		 * @param rowno  this method is used to get  the the row no of the ExcelSheet
		 * @param cellno  this method is used to get the cell no  of the ExcelSheet
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public static double readnumericvaluefromexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
			File abspath=new File("./src/test/resources/testdata.xlsx");
			FileInputStream fis=new FileInputStream(abspath);
			Workbook workbook = WorkbookFactory.create(fis);
			double data = workbook.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue();
			return data;
		}

	
}
