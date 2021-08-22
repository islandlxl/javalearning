package com.islandlxl.javalearning;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavalearningApplicationTests {

    @Test
    void contextLoads() {

    }

    public static void main(String[] args) {
        String a="203234";
        int c=a.charAt(1)-'0';
        System.out.println(c);
    }

}
