package com.example.document.excel;

import com.example.document.CreateDocumentInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelDocument implements CreateDocumentInterface {

    @Override
    public void createDocument() {

    }

    @Override
    public void insertImageFromNewDocument(String fileSavePath, String fileSaveName, String fileSaveExt, String imageUrlPath, String readCheckingUrl) {
        String filePathWithName = Paths.get(fileSavePath, fileSaveName + fileSaveExt).toString();

//        File excelFile = new File(filePathWithName);
//
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet(fileSaveName);
//        Row row = null;
//        Cell cell = null;

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(new File("D:/test.html")));

            // Create Work book
            XSSFWorkbook xwork = new XSSFWorkbook();

            // Create Spread Sheet
            XSSFSheet xsheet = xwork.createSheet("MyFristSheet");

            //Create Row (Row is inside spread sheet)
            XSSFRow xrow  = null;

            int rowid =0;
            String line ;
            while (( line =br.readLine())!= null) {

                System.out.println(line);

                String split[] = line.split("<br>");
                Cell cell;
                for (int i = 0; i < split.length; i++) {
                    xrow = xsheet.createRow(rowid);
                    cell = xrow.createCell(2);
                    cell.setCellValue(split[i]);
                    String[] columnSplit = split[i].split("\\W+");
                    int columnCount = 3;
                    for (int j = 0; j < columnSplit.length; j++) {

                        cell = xrow.createCell(columnCount++);
                        cell.setCellValue(columnSplit[j]);
                    }
                    System.out.println(split[i]);
                    rowid++;
                }





            }


            // create date for adding this to our workbook name like workbookname_date
            Date d1 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
            String todaysDate = sdf.format(d1);
            System.out.println(sdf.format(d1));
            //Create file system using specific name
            FileOutputStream fout = new FileOutputStream(new File("D:/"+todaysDate+".xlsx"));

            xwork.write(fout);
            fout.close();
            System.out.println("redaingfromHTMLFile_"+todaysDate+".xlsx written successfully" );
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
