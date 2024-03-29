package com.islandlxl.javalearning.Base.IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
@project:com.IO
@Title:IOTest
@Auther:lxl
@create:2019/9/8,11:20
*/
public class IOTest {

    public static void main(final String[] args) {

        File path=new File("/");
        String[] list;
        if(args.length==0){
            list=path.list();
        }else{
            list=path.list(new FilenameFilter() {

                private Pattern pattern= Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
            for (String  s :list) {
                System.out.printf(s);
            }
        }
    }
}
