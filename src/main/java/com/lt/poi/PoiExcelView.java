package com.lt.poi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiExcelView {
		private final String point = ".";
		private final String xlsx = ".xlsx";
		private final String xls = ".xls";
		
		public Workbook getWorkbook(String filePath) throws IOException{
			if(filePath.isEmpty() || null == filePath) {
				return null;
			}
			String suffixPath = filePath.substring(filePath.indexOf(point));
			InputStream is = new FileInputStream(filePath);
			try {
				if(xlsx.equals(suffixPath)) {
					return new XSSFWorkbook(is);
				}else if(xls.equals(suffixPath)){
					return new HSSFWorkbook(is);
				}
			}catch(Exception ignore) {
				
			}finally {
				is.close();
			}
			return null;
		}
		
		@SuppressWarnings("unused")
		private boolean isMergedRegion(Sheet sheet,int rowNum,int cellNum) {
			int sheetMergeCount = sheet.getNumMergedRegions();
			System.out.println(sheetMergeCount);
			for(int i=0;i<sheetMergeCount;i++) {
				CellRangeAddress cellRange = sheet.getMergedRegion(i);
				int firstRow = cellRange.getFirstRow();
				int lastRow = cellRange.getLastRow();
				int firstCell = cellRange.getFirstColumn();
				int lastCell = cellRange.getLastColumn();
				
				System.out.println(firstRow+","+lastRow+","+firstCell+","+lastCell);
				System.out.println();
				System.out.println("-------------------------------------------");
				
			}
			return false;
		}
		
}
