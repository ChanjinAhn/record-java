package io.example.image;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import net.sf.image4j.codec.ico.ICOEncoder;
import org.apache.tika.Tika;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConvertImageToIco {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    String mimeType;
    InputStream iconInputStream;

    int size = 1024, len;
    byte[] b = new byte[size];

    public ConvertImageToIco (InputStream _iconInputStream){
        this.iconInputStream = new BufferedInputStream(_iconInputStream);
    }

    /**
     * mimeType 가져오기
     */
    public void getFileMimeType() {
        try {
            Tika tika = new Tika();
            mimeType = tika.detect(iconInputStream);
            log.debug("### MIME Type = {}", mimeType);
        } catch (IOException e){
            log.error("error", e);
        }
    }

    /**
     * 이미지 mimeType 확인
     * @return boolean
     */
    public boolean isMimeTypeImage(){
        String[] imageMimeType = {"image/jpg", "image/png", "image/jpeg"};
        return Arrays.asList(imageMimeType).contains(mimeType);
    }

    /**
     * 아이콘 mimeType 확인
     * @return boolean
     */
    public boolean isMimeTypeIco(){
        String[] icoMimeType = {"image/vnd.microsoft.icon", "image/x-icon"};
        return Arrays.asList(icoMimeType).contains(mimeType);
    }

    /**
     * 이미지 mimeType ico 확장자로 저장
     * @param imagePath image path
     */
    public void saveImageFile(String imagePath){
        try {
            BufferedImage iconBufferedImage = ImageIO.read(iconInputStream);
            ICOEncoder.write(iconBufferedImage, new File(imagePath));
        }catch (IOException e){
            log.error("error", e);
        }
    }

    /**
     * 아이콘 mimeType ico 확장자로 저장
     * @param imagePath image path
     */
    public void saveIcoFile(String imagePath){
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(imagePath)))  {
            while ((len = iconInputStream.read(b)) != -1){
                bos.write(b, 0, len);
            }
        } catch (IOException e){
            log.error("error", e);
        }
    }

    public void convertAndSaveFile(String saveFileFullPath){
        getFileMimeType();
        if(isMimeTypeImage()){
            saveImageFile(saveFileFullPath);
        }else if(isMimeTypeIco()){
            saveIcoFile(saveFileFullPath);
        }
    }

}