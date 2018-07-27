package com.example.demo.controller;

import com.example.demo.pojo.File;
import com.example.demo.task.GetFoldFileNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);


    @RequestMapping(value = "/getImages/sqb")
    @ResponseBody
    public List<File> getImage(@RequestParam("xmid") String xmid ) throws FileNotFoundException {
        System.out.println(xmid);
        java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new java.io.File("");
        System.out.println("path:"+path.getAbsolutePath());

        //如果上传目录为/static/images/upload/，则可以如下获取：
        java.io.File getFile = new java.io.File(path.getAbsolutePath(),"/src/main/resources/static/images/"+xmid+"/审批表/");

        String filepath=getFile.getAbsolutePath();

        List<File> listImage=new ArrayList<>();
        java.io.File file = new java.io.File(filepath);
        String[] filelist = file.list();
        for (int i = 0; i < filelist.length; i++) {
            java.io.File readfile = new java.io.File(filepath + "/" + filelist[i]);
            if (!readfile.isDirectory()) {
                String name=readfile.getName();
                System.out.println(name);
                File image=new File();
                image.setName(name);
                image.setUrl("http://localhost:8080/static/images/"+xmid+"/审批表/"+name);
                listImage.add(image);
            }
        }
        return listImage;
    }

    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
        try {

            java.io.File file = new java.io.File("/Users/yijialuo/Desktop/广州港/项目管理/gzport_project_manage/static/img/");
            if (!file.isDirectory()) {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    java.io.File readfile = new java.io.File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        System.out.println("path=" + readfile.getPath());
                        System.out.println("absolutepath="
                                + readfile.getAbsolutePath());
                        System.out.println("name=" + readfile.getName());

                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }


    //文件上传相关代码
    @RequestMapping(value = "upload")
    @ResponseBody
    public String upload(@RequestParam("test") MultipartFile file,@RequestParam("xmid") String xmid,@RequestParam("blx") String blx) throws FileNotFoundException {
        System.out.println("xmid: "+xmid);
        System.out.println("blx: "+blx);
        if (file.isEmpty()) {
            return "文件为空";
        }
        // 获取文件名
        String fileName = "/"+file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);
        // 文件上传后的路径
        java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new java.io.File("");
        System.out.println("path:"+path.getAbsolutePath());

        java.io.File upload = new java.io.File(path.getAbsolutePath(),"/target/classes/static/images//"+xmid+"//"+blx);

        if(!upload.exists())
            upload.mkdirs();
        String filePath=upload.getAbsolutePath();
        java.io.File[] filenames= GetFoldFileNames.getFileName(filePath);
        for(int i=0;i<filenames.length;i++){
            System.out.println("/"+filenames[i].getName());
            System.out.println("fileName:"+fileName);
            if(fileName.equals("/"+filenames[i].getName())){
                fileName=fileName.split("\\.")[0]+"副本."+fileName.split("\\.")[1];
                System.out.println("修改后的fileName:"+fileName);
                break;
            }
        }

        System.out.println(filePath);
        // fileName = UUID.randomUUID() + suffixName;
        java.io.File dest = new java.io.File(filePath +fileName);
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传成功";
    }


}