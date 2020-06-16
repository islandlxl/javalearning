package com.islandlxl.javalearning.datatoexcel;/*
package com.datatoexcel;

import com.datatoexcel.pojo.Student;
import com.datatoexcel.utils.ExcelUtils;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

*/
/*
@project:com.datatoexcel
@Title:Demo
@Auther:lxl
@create:2019/3/6,14:15
*//*
public class Demo {


    public static void main(String[] args) throws Exception{

////        创建一个工作薄
//        HSSFWorkbook workbook=new HSSFWorkbook();
////    创建一个sheet
//        HSSFSheet sheet = workbook.createSheet();
////        创建行
//        HSSFRow row = sheet.createRow(0);
////        创建列
//        HSSFCell cell = row.createCell(0);
////     填充数据
//        cell.setCellValue("张学良");
////        从excel导入到磁盘
//        OutputStream outputStream=new FileOutputStream("d://student.xls");
//
//        workbook.write(outputStream);
//
//        outputStream.close();

        List<Student> list=new ArrayList<>();
        Student student1=new Student();
        student1.setSid(1001);
        student1.setAge(19);
        student1.setClazz("前端精英班01");
        student1.setUsername("小王");
        list.add(student1);


        Student student2=new Student();
        student2.setSid(1002);
        student2.setAge(19);
        student2.setClazz("后台精英班01");
        student2.setUsername("小李");

        list.add(student2);
        OutputStream outputStream=new FileOutputStream("d://student.xls");
        Map<String,String> fields=new HashMap<>();
        fields.put("sid","学号");
        fields.put("age","年龄");
        fields.put("clazz","班级");
        fields.put("username","姓名");


        ExcelUtils.listToExcel(list,outputStream,fields);
//        outputStream.close();

    }
}
*/
