package com.example.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ShellScriptProcessBuilderTest {

    @Test
    public void shellCommandRunTest(){
        String stringCommand = "ping -c 10 8.8.8.8";

        new ShellScriptProcessBuilder(stringCommand).runShellCommand();
    }
}
