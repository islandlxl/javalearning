package com.islandlxl.javalearning.datatoexcel.utils;//package com.datatoexcel.utils;
//
//
//
//import java.io.OutputStream;
//import java.lang.reflect.Field;
//import java.util.List;
//import java.util.Map;
//
///*
//@project:com.datatoexcel.utils
//@Title:ExcelUtils
//@Auther:lxl
//@create:2019/3/6,15:05
//*/public class ExcelUtils {
////一张表中存了多少条数据
//   public static final int  sheetSize=5000;
//
//    public static <T> void listToExcel(List<T> data, OutputStream outputStream, Map<String,String> fields)throws Exception{
//
//        if (data==null||data.size()==0){
//             throw new Exception("没有数据啊");
//        }
//
//        HSSFWorkbook workbook=new HSSFWorkbook();
////        一共多少张sheet
//        int sheetNum=data.size()%sheetSize==0?data.size()/sheetSize:data.size()/sheetSize+1;
//
//        String[] fieldNames=new String[fields.size()];
//        String[] chinaNames=new String[fields.size()];
//        int count=0;
//        for (Map.Entry<String,String> entry :fields.entrySet()){
//            String fieldName = entry.getKey();
//            String chinaName = entry.getValue();
//
//            fieldNames[count]=fieldName;
//            chinaNames[count]=chinaName;
//            count++;
//
//        }
//        int rowCount=0;
////拿出属性,
//        for (int i=0;i<sheetNum;i++){
//
//
//            HSSFSheet sheet = workbook.createSheet();
//            int startIndex=sheetSize*i;
//
//            int endIndex=sheetSize*(i+1)-1>data.size()?data.size():sheetSize*(i+1)-1;
//
//            HSSFRow row = sheet.createRow(rowCount);
//
////            标题的第一行
//            for (int j=0;j<chinaNames.length;j++){
//                HSSFCell cell = row.createCell(j);
//                System.out.println("输出的数组长度："+chinaNames.length+"输出的字段名字："+chinaNames[j]);
////设置中文名称
//                cell.setCellValue(chinaNames[j]);
//            }
//
//            rowCount++;
////写其他数据
//            for (int index=startIndex;index<endIndex;index++){
//                T item=data.get(index);
//                for (int j=0;j<chinaNames.length;j++){
//                    Field field=item.getClass().getDeclaredField(fieldNames[j]);
//                    field.setAccessible(true);
//                    Object o = field.get(item);
//                    String value= o==null?"":o.toString();
//                    HSSFCell cell = row.createCell(j);
//                    cell.setCellValue(value);
//
//
//                }
//                rowCount++;
//            }
//            workbook.write(outputStream);
//
//        }
//
//    }
//}
