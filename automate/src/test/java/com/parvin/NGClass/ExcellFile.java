package com.parvin.NGClass;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcellFile {
     public static void main(String[] args) throws IOException {
        File src = new File("New Spreadsheet 1.xlsx");

        FileInputStream fileInputStream = new FileInputStream(src);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = workbook.getSheet("Sheet1");

        String data0 = sheet.getRow(1).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is " + data0);

        String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println("Data from Excel is " + data1);

        workbook.close();
        fileInputStream.close();


     }
}
