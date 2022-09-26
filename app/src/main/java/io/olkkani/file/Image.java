package io.olkkani.file;

import java.util.Map;
import org.apache.commons.io.FilenameUtils;

public class Image {
    Map<String, String> substringFilenameExtension (String fileName) {
        String filenameExtension = FilenameUtils.getExtension(fileName);
        fileName = FilenameUtils.getBaseName(fileName);
        return Map.of(
            "fileName", fileName,
            "extension", filenameExtension
        );
    }




    void save (Image image, String hashedName){

    }


    Image find (String hashedName) {


       return null;
    }

}
