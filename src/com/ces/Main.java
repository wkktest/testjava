package com.ces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class Main {
    static String username="15000345819";
    static String Password="ayulan";








        public static void main(String[] args ) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
//        driver.get("D:\\111\\test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> s = driver.findElements(By.xpath("//div[@id='u1']/a"));
        for(int i=0;i<s.size();i++) {
            String a = s.get(i).getText();
            if(a.equals("设置")){
                driver.findElement(By.linkText(a)).click();
                String url = driver.getCurrentUrl();
                System.out.println(url);
            }
        }
        List<String> s1 = new ArrayList<String>();
        for(int i=0;i<s.size();i++){
                s1.add(s.get(i).getText());

        }
        System.out.println(s1);
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<s1.size();i++){
            map.put(s1.get(i),i);
        }
        System.out.println(map);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
             System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
        }
        //迭代循环输出map的键值对
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey()+"-----"+entry.getValue());

        }
//键值对 集合：
        Set<Map.Entry<String,Integer>> ent = map.entrySet();
        for (Map.Entry<String,Integer> EN:ent){
            System.out.println(EN.getKey()+ EN.getValue());
        }


//            for(String list:s1){
//                System.out.println(list);
//            }

//        }

//        List<String> list = new
//        System.out.println(s);
//        List<String> list = new ArrayList<s>();
//        list.add(s);
//        System.out.println(list);
//        Iterator<String> lt = s.iterator();
//        while (lt.hasNext()){
//            String a = lt.next();
//
//            if(a.equals("data1")){
//                break;
//            }
//            System.out.println(a+"\n");
//
//        }
        driver.quit();
//        System.out.println("--------:");
//
//        for(String key : list){
//            System.out.println(key);
//        }
//        System.out.println("===========");
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        map.put(list.get(1),1);
//        map.put(list.get(2),2);
//
//        Set<String> keys = map.keySet();
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()){
//            String key = it.next();//key
//            Integer value = map.get(key);//value
//            System.out.println(key +"----"+value);
//        }
//
//        Map<String,Integer> map1 = new HashMap<String,Integer>();
//        map1.put("q",1);
//        map1.put("w",2);
//        for (String s:map1.keySet()){
//            Integer a = map1.get(s);
//            System.out.println(s + "--------" + a);//key+value
//        }

    }
}
class  test {

//    public static int add(int a) {
//        return a ;
//    }
//    public static double add(double a){
//        return a ;
//    }
//    public static String add(String a){
//        return a;
//    }
//
//    public static double add(double a, double b) {
//        return a + b;
//    }
//
//    public static String add(String a, String b) {
//        return a + b;
//    }

}