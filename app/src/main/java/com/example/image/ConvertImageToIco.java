package com.example.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import net.sf.image4j.codec.ico.ICOEncoder;
import org.apache.tika.Tika;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConvertImageToIco {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    File imageFile;
    BufferedImage iconBufferedImage;

    public ConvertImageToIco (File _imageFile){
        this.imageFile = _imageFile;
    }

    public boolean isImageFileCheck() throws IOException {
        String[] imageMimeType = {};
        String[] iconMimeType = {};

        InputStream inputStream = new FileInputStream(imageFile);
        Tika tika = new Tika();
        String mimeType = tika.detect(inputStream);
        log.debug("### MIME Type = {}", mimeType);


        return mimeType.startsWith("image");
    }

    public void convertImageToIco(){
        try {
            iconBufferedImage = ImageIO.read(imageFile);
        } catch (IOException e) {
            log.debug("error", e);
        }
    }

    public void saveImageFile(String imagePath){
        try {
            ICOEncoder.write(iconBufferedImage, new File(imagePath));
        }catch (IOException e){
            log.error("error", e);
        }
    }

    public void saveIcoImageFile(String imagePath){

    }
}
