package io.oikk.project.setting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

// Junit5_를_프로젝트에_정상적으로_적용하였는지_테스트
public class JUnit5Test {

    @Test
    public void 숫자비교() {
        Long id = 1L;
        assertThat(id).isEqualTo(1);
    }

    @Test
    public void 문자비교() {
        String name = "chanjin_ahn";
        assertThat(name).isEqualTo("chanjin_ahn");
    }
}
