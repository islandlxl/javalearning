//package com.islandlxl.javalearning.JobStudy;
//
//import com.alibaba.fastjson.JSON;
//import com.xxl.job.core.biz.model.ReturnT;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.codec.Charsets;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.jdbc.ScriptRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceUtils;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Reader;
//import java.io.StringWriter;
//import java.sql.Connection;
//
//@Component
//@Slf4j
//public class BrushTask {
//    @Autowired
//    private DataSource dataSource;
//
//    //刷数task
//
//    public ReturnT<String> brushDataTask(String params) throws Exception {
//        String[] filePaths;
//        if(StringUtils.isNotEmpty(params)) {
//            filePaths = params.split(",");
//        } else {
//            filePaths = new String[] {"sql/test.sql"};
//        }
//
//        log.info(JSON.toJSONString(filePaths));
//
//        try {
//            Connection connection = DataSourceUtils.getConnection(dataSource);
//            dataSource.getLogWriter().println();
//            //创建脚本执行器
//            ScriptRunner scriptRunner = new ScriptRunner(connection);
//            //创建字符输出流，用于记录SQL执行日志
//            StringWriter writer = new StringWriter();
//            PrintWriter print = new PrintWriter(writer);
//            //设置执行器日志输出
//            scriptRunner.setLogWriter(print);
//            //设置执行器错误日志输出
//            scriptRunner.setErrorLogWriter(print);
//            scriptRunner.setAutoCommit(true);
//            scriptRunner.setDelimiter(";");
//
//            //设置读取文件格式
//            Resources.setCharset(Charsets.UTF_8);
//            for (String path : filePaths) {
//                Reader reader = null;
//                try {
//                    //获取资源文件的字符输入流
//                    reader = Resources.getResourceAsReader(path);
//                } catch (IOException e) {
//                    //文件流获取失败，关闭链接
//                    log.error("path：" + path + ", " + e.getMessage(), e);
//                    continue;
//                }
//                //执行SQL脚本
////            log.info("reader:{}", IOUtils.toString(reader));
//                scriptRunner.runScript(reader);
//                //关闭文件输入流
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    log.error(e.getMessage(), e);
//                }
//            }
//            //输出SQL执行日志
//            log.info("result: {}", writer.toString());
//            //关闭输入流
//            scriptRunner.closeConnection();
//        } catch (Exception e) {
//            log.error("brush task error", e);
//        }
//
//        return ReturnT.SUCCESS;
//    }
//
//}
