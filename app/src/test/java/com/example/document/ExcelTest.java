package com.example.document;

import com.example.document.excel.CreateExcelDocument;
import org.junit.jupiter.api.Test;

public class ExcelTest {



    @Test
    public void create_excel_file_test(){
        CreateDocumentInterface createDocument = new CreateExcelDocument();

        createDocument.insertImageFromNewDocument("","","","","");

    }
}
