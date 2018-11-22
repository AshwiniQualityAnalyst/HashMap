package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class MapPlusExcelSheet {

	private static final String excel = "C://Users//10645280//eclipse-workspace//HashMap//src//ApachePOI//TestData.xls";
	private static FileInputStream fis;
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;

	// load excel function
	public static void loadExcel() throws IOException {
		File file = new File(excel);
		fis = new FileInputStream(file);
		workbook = new HSSFWorkbook(fis);
		sheet = workbook.getSheet("TestData");
		fis.close();
	}

	// This function should return Map<String, Map<String, String>>
	public static Map<String, Map<String, String>> getDataMap() throws IOException {
		if (sheet == null) {
			loadExcel();
		}

		// Declare a map within map(Embedded map)
		Map<String, Map<String, String>> supermap = new HashMap<String, Map<String, String>>();
		// Declare a simple map which stores key and value in the form of string
		Map<String, String> myMap = new HashMap<String, String>();
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			row = sheet.getRow(i);
			String keyCell = row.getCell(0).getStringCellValue();
			int colNum = row.getLastCellNum();
			for (int j = 1; j < colNum; j++) {
				String value = row.getCell(j).getStringCellValue();
				// Add value at cell 0 as key and adjacent cell content in the value for map
				myMap.put(keyCell, value);
			}
		}
		// Once the sheet has been iterated, add the simple map to embedded map with key
		// 'MasterData'
		supermap.put("MasterData", myMap);
		return supermap;

	}

	public static String getValue(String key) throws IOException {
		// get the simple map with key MasterData from the embedded map
		Map<String, String> myVal = getDataMap().get("MasterData");

		// fetch a key from the simple map
		String retValue = myVal.get(key);
		return retValue;
	}

	public static void main(String[] args) throws IOException {

		System.out.println(getValue("Name1"));
		System.out.println(getValue("Name2"));
		System.out.println(getValue("Name3"));
		System.out.println(getValue("Name4"));
		System.out.println(getValue("Name5"));
		System.out.println(getValue("Name6"));
		System.out.println(getValue("Name7"));
		System.out.println(getValue("Name8"));
		System.out.println(getValue("Name9"));
		System.out.println(getValue("Name10"));

	}
}
