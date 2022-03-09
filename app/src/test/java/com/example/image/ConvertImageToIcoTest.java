package com.example.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import org.apache.tika.Tika;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 이미지 to ico 아이콘 변환 테스트
 */
public class ConvertImageToIcoTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    String sampleImagePath =  File.separator + Paths.get("Users", "acj", "Documents", "convert_icon_test");
    String[] sampleImageNames = {"bmp.bmp", "png.png", "gif.gif", "jpg.jpg", "jpeg.jpeg", "ico.ico"};

    @Test
    public void ConvertImageToIconTest () throws IOException {
//        String[] sampleImageNames = {"bmp.bmp", "png.png", "webp.webp", "ico.ico", "forcedConversion_txt.png", "forcedConversion_png.ico", "gif.gif", "jpg.jpg", "jpeg.jpeg", "svg.svg", "png_forced_conversion_txt.txt"};


        ConvertImageToIco convertImageToIco;

        for(String sampleImageName : sampleImageNames){
            log.debug(sampleImageName);

            convertImageToIco = new ConvertImageToIco(new File(Paths.get(sampleImagePath, sampleImageName).toString()));
            boolean isImageFile = convertImageToIco.isImageFileCheck();
            log.debug(String.valueOf(isImageFile));

            if(isImageFile){
                convertImageToIco.convertImageToIco();
                convertImageToIco.saveImageFile(Paths.get(sampleImagePath, "ico_file", sampleImageName + ".ico").toString());
            }
        }
    }
    @Test
    public void PrintTypeOfConvertedImage() throws IOException {

        for(String sampleImageName : sampleImageNames){
            File file = new File(Paths.get(sampleImagePath, "ico_file", sampleImageName + ".ico").toString());
            InputStream inputStream = new FileInputStream(file);
            Tika tika = new Tika();
            String mimeType = tika.detect(inputStream);
            log.debug("### MIME Type = {}", mimeType);
        }
    }
}
