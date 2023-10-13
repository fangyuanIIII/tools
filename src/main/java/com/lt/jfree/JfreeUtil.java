package com.lt.jfree;

import cn.afterturn.easypoi.entity.ImageEntity;
import lombok.extern.slf4j.Slf4j;

import org.jfree.chart.*;
 
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CenterTextMode;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.RingPlot;

import org.jfree.data.general.DefaultPieDataset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import java.awt.*;

import java.io.*;

import java.util.Map;

 
/**
 * 处理图片
 * //jfreechart-1.5.0.jar  (能解决新版本的乱码问题)
 //jcommon-1.0.24.jar
 */
@Slf4j
public class JfreeUtil {
 
    private static String tempImgPath="D:\\tempJfree.jpeg";
    
    private static final Logger log = LoggerFactory.getLogger(JfreeUtil.class);
 
    /**
     * 将图片转化为字节数组
     * @return 字节数组
     */
    private static byte[] imgToByte(){
        File file = new File(tempImgPath);
        byte[] buffer = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        //删除临时文件
        file.delete();
        return buffer;
    }
    public static ImageEntity pieRingChartCenter(String title, Map<String, Integer> datas, int width, int height,String centerInfo) {
        //创建主题样式
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体
        standardChartTheme.setExtraLargeFont(new Font("宋体", Font.BOLD, 20));
        //设置图例的字体
        standardChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
        //设置轴向的字体
        standardChartTheme.setLargeFont(new Font("宋体", Font.PLAIN, 15));
        //设置主题样式
        ChartFactory.setChartTheme(standardChartTheme);
 
        //根据jfree生成一个本地饼状图
        DefaultPieDataset pds = new DefaultPieDataset();
        datas.forEach(pds::setValue);
        //图标标题、数据集合、是否显示图例标识、是否显示tooltips、是否支持超链接
        JFreeChart chart = ChartFactory.createRingChart(title, pds, false, false, false);
        chart.setTextAntiAlias(false);
        chart.setBackgroundPaint(Color.white);   // 图片背景色
 
 
        RingPlot plot = (RingPlot) chart.getPlot();//获得图形面板
        plot.setCenterTextFont(new Font("宋体", Font.PLAIN, 15));
        plot.setCenterTextMode(CenterTextMode.FIXED);
        plot.setCenterText(centerInfo);
        plot.setCircular(true);
        //忽略无值的分类
        plot.setIgnoreNullValues(true);
        plot.setBackgroundAlpha(0f);
        plot.setOutlinePaint(Color.WHITE);
        //设置标签阴影颜色
      //  plot.setShadowPaint(new Color(255,255,255));
 
        // 指定饼图轮廓线的颜色
        plot.setBaseSectionOutlinePaint(Color.WHITE);
        plot.setBaseSectionPaint(Color.WHITE);
 
        //设置标签生成器(默认{0})
        plot.setLabelGenerator(null);
        try {
//            ChartUtils.saveChartAsJPEG(new File(tempImgPath), chart, width, height);
            FileOutputStream fos_jpg = new FileOutputStream(tempImgPath);
            ChartUtilities.writeChartAsPNG(fos_jpg,chart, 235, 230, null);
        } catch (IOException e1) {
//            log.error("生成饼状图失败！");
            
        }
        ImageEntity imageEntity = new ImageEntity(imgToByte(), width, height);
        Assert.notNull(imageEntity.getData(),"生成饼状图对象失败！");
        return imageEntity;
    }
    public static ImageEntity pieRingChart(String title, Map<String, Integer> datas, int width, int height) {
        //创建主题样式
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体
        standardChartTheme.setExtraLargeFont(new Font("宋体", Font.BOLD, 20));
        //设置图例的字体
        standardChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
        //设置轴向的字体
        standardChartTheme.setLargeFont(new Font("宋体", Font.PLAIN, 15));
        //设置主题样式
        ChartFactory.setChartTheme(standardChartTheme);
 
        //根据jfree生成一个本地饼状图
        DefaultPieDataset pds = new DefaultPieDataset();
        datas.forEach(pds::setValue);
        //图标标题、数据集合、是否显示图例标识、是否显示tooltips、是否支持超链接
        JFreeChart chart = ChartFactory.createRingChart(title, pds, false, false, false);
 
        //设置抗锯齿
        chart.setTextAntiAlias(false);
//        chart.getLegend().setHorizontalAlignment(HorizontalAlignment.CENTER);//设置水平对齐 左对齐;
//        chart.getLegend().setMargin(0,0,0,0);//参数是:上,左,下,右. 设置饼图的位置
//        chart.getLegend().setPadding(0, 0, 80, 0);// 设置饼图右边文字的位置
//        chart.getLegend().setFrame(new BlockBorder(0,0,0,0));// 设置饼图右边文字边框的位置
//        chart.getLegend().setVisible(true);
//        chart.getLegend().setPosition(RectangleEdge.RIGHT);//饼图文字居右显示
//        chart.getLegend().setItemFont(new Font("宋体",0,14));
//        chart.getLegend().setBackgroundPaint(Color.WHITE);
//        chart.getLegend().setFrame(new BlockBorder(Color.WHITE));//设置饼图右边文字边框为白色,就可以达到隐藏边框的效果
 
        //图表
//        PiePlot plot = (PiePlot) chart.getPlot();
//        plot.setNoDataMessage("暂无数据");
        RingPlot plot = (RingPlot) chart.getPlot();//获得图形面板
        plot.setCenterTextFont(new Font("宋体", Font.PLAIN, 15));
        plot.setCenterTextMode(CenterTextMode.FIXED);
        plot.setCenterText("2名/23名");
//        DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
//        NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
//        StandardPieSectionLabelGenerator sp = new StandardPieSectionLabelGenerator(
//                "{0}{2}", nf, df);//获得StandardPieSectionLabelGenerator对象
//        plot.setLabelGenerator(sp);//设置饼图显示百分比
//
//        //忽略无值的分类
//        plot.setIgnoreNullValues(true);
//        plot.setBackgroundAlpha(0f);
//        //设置标签阴影颜色
//        plot.setShadowPaint(new Color(255,255,255));
        //设置标签生成器(默认{0})
        plot.setLabelGenerator(null);
        try {
//            ChartUtils.saveChartAsJPEG(new File(tempImgPath), chart, width, height);
            FileOutputStream fos_jpg = new FileOutputStream(tempImgPath);
            Rectangle rectangle=new Rectangle(100,100,100,100);
 
            StandardEntityCollection standardEntityCollection=new StandardEntityCollection();
            standardEntityCollection.add(new ChartEntity(rectangle,"abc"));
            ChartRenderingInfo info=new ChartRenderingInfo(standardEntityCollection);
            info.setChartArea(rectangle);
            ChartUtilities.writeChartAsPNG(fos_jpg,chart, 235, 230, info);
        } catch (IOException e1) {
            log.error("生成饼状图失败！");
        }
        ImageEntity imageEntity = new ImageEntity(imgToByte(), width, height);
        Assert.notNull(imageEntity.getData(),"生成饼状图对象失败！");
        return imageEntity;
    }
    public static ImageEntity pieChart(String title, Map<String, Integer> datas, int width, int height) {
 
        //创建主题样式
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体
        standardChartTheme.setExtraLargeFont(new Font("宋体", Font.BOLD, 20));
        //设置图例的字体
        standardChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
        //设置轴向的字体
        standardChartTheme.setLargeFont(new Font("宋体", Font.PLAIN, 15));
        //设置主题样式
        ChartFactory.setChartTheme(standardChartTheme);
 
        //根据jfree生成一个本地饼状图
        DefaultPieDataset pds = new DefaultPieDataset();
        datas.forEach(pds::setValue);
        //图标标题、数据集合、是否显示图例标识、是否显示tooltips、是否支持超链接
        JFreeChart chart = ChartFactory.createPieChart(title, pds, true, false, false);
        //设置抗锯齿
        chart.setTextAntiAlias(false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setNoDataMessage("暂无数据");
        //忽略无值的分类
        plot.setIgnoreNullValues(true);
        plot.setBackgroundAlpha(0f);
        //设置标签阴影颜色
        plot.setShadowPaint(new Color(255,255,255));
        //设置标签生成器(默认{0})
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}({1})/{2}"));
        try {
//            ChartUtils.saveChartAsJPEG(new File(tempImgPath), chart, width, height);
           FileOutputStream fos_jpg = new FileOutputStream(tempImgPath);
           ChartUtilities.writeChartAsPNG(fos_jpg,chart, 235, 230, null);
        } catch (IOException e1) {
//            log.error("生成饼状图失败！");
        }
        ImageEntity imageEntity = new ImageEntity(imgToByte(), width, height);
        Assert.notNull(imageEntity.getData(),"生成饼状图对象失败！");
        return imageEntity;
    }
}
