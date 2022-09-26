package io.olkkani.file;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilenameExtensionSubStringTest {

    @DisplayName("파일 한글이름 확장자 추출 테스트")
    @Test
    void koreanNameTest(){
        // given
        String fileName = "푸른 숲 하늘.jpg";
        Image image = new Image();

        // when
        Map<String, String> filenameExtension = image.substringFilenameExtension(fileName);

        // then
        assertThat(filenameExtension.get("fileName")).isEqualTo("푸른 숲 하늘");
        assertThat(filenameExtension.get("extension")).isEqualTo("jpg");
    }

    @DisplayName("파일 영어이름 확장자 추출 테스트")
    @Test
    void englishNameTest() {
        // given
        String fileName = "helloWorld.png";
        Image image = new Image();

        // when
        Map<String, String> filenameExtension = image.substringFilenameExtension(fileName);

        // then
        assertThat(filenameExtension.get("fileName")).isEqualTo("helloWorld");
        assertThat(filenameExtension.get("extension")).isEqualTo("png");
    }


}
