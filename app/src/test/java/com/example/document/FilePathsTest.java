package com.example.document;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * packageName    : com.example.document
 * <p>
 * fileName       : FilePathsTEst
 * <p>
 * author         : acj
 * <p>
 * date           : 2022/01/30
 * <p>
 * description    :
 * <p>
 * ===========================================================
 * <p>
 * DATE              AUTHOR             NOTE
 * <p>
 * -----------------------------------------------------------
 * <p>
 * 2022/01/30        acj       최초 생성
 */
public class FilePathsTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void filePathsTest(){
        String filePathWithName = Paths.get("D:","sampleFile", "testImage.png").toString();

        logger.debug(filePathWithName);
        logger.debug(filePathWithName);
        logger.debug(filePathWithName);
        logger.debug(filePathWithName);

        System.out.println(filePathWithName);
        System.out.println(filePathWithName);
        System.out.println(filePathWithName);
        System.out.println(filePathWithName);


    }


    @Test
    public void getResourceFile () {


//        ClassPathResource resource = new ClassPathResource("data/data.txt");


    }
}
