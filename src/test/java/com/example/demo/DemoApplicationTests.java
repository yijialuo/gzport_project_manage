package com.example.demo;

import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import com.example.demo.service.SpbService;
import com.example.demo.service.XmService;
import com.example.demo.service.YhService;
import com.example.demo.task.DeleteFileUtil;
import com.example.demo.task.GetFoldFileNames;
import com.example.demo.task.IdCreate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	XmMapper xmMapper;
	@Autowired
	XmService xmService;
	@Autowired
	YhMapper yhMapper;
	@Autowired
	YhService yhService;
	@Autowired
	SpbService spbService;
	@Autowired
	ZbbMapper zbbMapper;
	@Autowired
	ZhongbiaobMapper zhongbiaobMapper;
	@Autowired
	GlbMapper glbMapper;


	@Test
	public void testGlbdelet(){
		Glb glb=new Glb();
		glb.setXmid("1");
		glbMapper.delete(glb);
	}

	@Test
	public void testInsertZbb(){
		Zbb zbb=new Zbb();
		zbb.setZbbid("1");
		zbb.setBj("2");
		zbb.setDf("3");
		zbb.setDwmc("4");
		zbb.setFbsj("5");
		zbb.setXmmc("6");
		zbb.setXmid("7");
		zbb.setPbsj("8");
		System.out.println(zbbMapper.insert(zbb));
	}

	@Test
	public void testUpdatazzb(){
		Zbb zbb=new Zbb();
		zbb.setZbbid("20180715071858884");
		zbb.setXmid("20180425095259770");
		zbbMapper.updateByPrimaryKey(zbb);
	}

	@Test
	public void testSeletZhongbb() {
		Zhongbiaob zhongbiaob=new Zhongbiaob();
		zhongbiaob.setZbxmid("20180425095259770");
		System.out.println(zhongbiaobMapper.select(zhongbiaob).size());
	}

	@Test
	public void testsk(){
		Xm xm=new Xm();
		xm.setSflx("收款");
		System.out.println("ssssssssssss:"+xmMapper.select(xm).size());
	}

	@Test
	public void testSelectZbb(){
		Zbb zbb=new Zbb();
		zbb.setXmid("20180425095259770");
		System.out.println(zbbMapper.select(zbb).size());
	}

	@Test
	public void deletZbb(){
		zbbMapper.deleteByPrimaryKey("20180715011928808");
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void TestselectXmById(){
		String Id="2018-04-13 02:32:38";
		Xm xm=xmService.selectXmById(Id);
		System.out.println("xmmc: "+xm.getXmmc()+"xmlx: "+xm.getXmlx());
	}

	@Test
	public void addXm(){
		Xm xm=new Xm();
		xm.setXmid(IdCreate.id());
		xm.setXmmc("yijialuo999999");
		xmService.saveXm(xm);
	}

	@Test
	public void selectSpb(){
		Spb spb=new Spb();
		spb.setXmid("111");
		for(Spb i:spbService.selectSpb(spb)){
			System.out.println(i.getSpburl());
		}
	}

	@Test
	public void testDeletPath() throws FileNotFoundException {
	//	System.out.println(spbid);
		Spb spb = new Spb();
		spb.setSpbid("20180423095104296");
		spb = spbService.selectSpbOne(spb);
		//获取项目路径
		java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
		if (!path.exists()) path = new java.io.File("");
		System.out.println("path:" + path.getAbsolutePath());

		//获取删除文件路径
		java.io.File deletpath = new java.io.File(path.getAbsolutePath(), "/target/classes/static/images//" + spb.getXmid() + "//审批表//" + spb.getSpbmc());
		if (!deletpath.exists()) deletpath.mkdirs();
		System.out.println(deletpath);

	}

	@Test
	public void textspilt(){
		String a="/审批表.pdf";
		//.  需要\\转义
		System.out.println(a.split("\\.")[0]);
	}

	@Test
	public void file(){
		File[] a=GetFoldFileNames.getFileName("/Users/yijialuo/Desktop/广州港/项目管理/gzport_project_manage/target/classes/static/images/20180424112958273/审批表");
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i].getName());
		}
	}

	@Test
	public void time(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSS");
		String  formDate =sdf.format(date);
		System.out.println();
		System.out.println(formDate);

	}

	@Test
	public void testSelectSpbOne(){



		Spb spb=new Spb();
		spb.setSpbid("20180423095104296");
		System.out.println();
		System.out.println(spbService.selectSpbOne(spb).getSpburl().substring(21));
	}


	@Test
	public void testPath() throws FileNotFoundException {
		Spb spb=new Spb();
		spb.setSpbid("20180423095104296");
		spb=spbService.selectSpbOne(spb);
		//String  nama=spbService.selectSpbOne(spb).getSpburl().substring(21);

		java.io.File path = new java.io.File(ResourceUtils.getURL("classpath:").getPath());
		System.out.println("path:"+path.getAbsolutePath());
		if(!path.exists()) path = new File("");
		//删除路径，则可以如下获取：
		java.io.File deletpath = new java.io.File(path.getAbsolutePath(),"/target/classes/static/images//"+spb.getXmid()+"//审批表//"+spb.getSpbmc());
		System.out.println();
		System.out.println(deletpath.toString());

	}

	@Test
	public void testupdataxm(){
		Xm xm=new Xm();
		xm.setXmid("20180423094644383");
		xm.setXmmc("项目管理系统");
		xm.setZxmmc("修改项目系统");
		xm.setXmlx("软件");
		xm.setXmgq("三个月");
		xm.setZjly("公司总部");
		xm.setYsje("3000000");
		xm.setXmfzr("易家洛");
		xm.setBz("18883646049");
		xm.setXmnrgy("实习生完成");
		xm.setPtyjjxtrj("普通pc");
		xm.setXmlx("收款");
		xm.setCjsj("2018-04-23");
		System.out.println();
		System.out.println(xmService.updataXmById(xm));
	}

	@Test
	public void testdelet(){
		DeleteFileUtil.delete("/Users/yijialuo/Desktop/广州港/项目管理/gzport_project_manage/target/classes/static/images/2018-04-19 10:08:34/审批表/test");
	}

	@Test
	public void addYh(){
		Yh yh=new Yh();
		yh.setYhmc("yijialuo");
		yh.setYhmm("1111");
		yhMapper.insert(yh);
	}

	@Test
	public void testSelectAll(){

		List<Xm> xms=xmService.selectAllXm();
		for(Xm i : xms){
			System.out.println(i.getXmmc());
		}
	}

	@Test
	public void path() throws FileNotFoundException {
		File path = new File(ResourceUtils.getURL("classpath:").getPath());
		if(!path.exists()) path = new File("");
		System.out.println("path:"+path.getAbsolutePath());

		//如果上传目录为/static/images/upload/，则可以如下获取：
		File upload = new File(path.getAbsolutePath(),"/src/main/resources/static/images/");
		if(!upload.exists()) upload.mkdirs();
		System.out.println("upload url:"+upload.getAbsolutePath());
//在开发测试模式时，得到的地址为：{项目跟目录}/target/static/images/upload/
//在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload/
	}

	@Test
	public void  readfile() throws FileNotFoundException, IOException {

			String filepath="/Users/yijialuo/Desktop/广州港/项目管理/gzport_project_manage/static/img/";
			File file = new File(filepath);
			if (!file.isDirectory()) {
				System.out.println();
				System.out.println("文件");
				System.out.println("path=" + file.getPath());
				System.out.println("absolutepath=" + file.getAbsolutePath());
				System.out.println("name=" + file.getName());

			} else if (file.isDirectory()) {
				System.out.println();
				System.out.println("文件夹");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						System.out.println("path=" + readfile.getPath());
						System.out.println("absolutepath="
								+ readfile.getAbsolutePath());
						System.out.println("name=" + readfile.getName());

					}
				}

			}


		//return true;
	}

	@Test
	public void testSelectYh(){
		Yh yh=new Yh();
		yh.setYhmc("yijialuo");
		yh.setYhmm("111111");
		Yh select=yhService.selectYh(yh);
		if(select!=null){
			System.out.println("nama:"+select.getYhmc()+"	"+"密码:"+select.getYhmm());
		}
		else {
			System.out.println("没找到");
		}
	}


}
