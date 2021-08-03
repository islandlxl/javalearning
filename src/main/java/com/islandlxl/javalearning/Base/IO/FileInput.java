package com.islandlxl.javalearning.Base.IO;

/*
@project:com.IO
@Title:FileInput
@Auther:lxl
@create:2019/6/2,18:40
*/public class FileInput {

    public static void main(String[] args) {

        System.out.println(2==2);
        Integer in=Integer.MAX_VALUE;
        int re=reverse(123897654);
        System.out.println(re);

    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
