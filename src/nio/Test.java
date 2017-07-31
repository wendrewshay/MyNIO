package nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import aio.Client;  
/** 
 * 测试方法 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public class Test {  
    //测试主方法  
    @SuppressWarnings("resource")  
    public static void main(String[] args) throws Exception{  
        //运行服务器  
        Server.start();  
        //避免客户端先于服务器启动前执行代码  
        Thread.sleep(100);  
        //运行客户端   
        Client.start();  
       
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("calculate.txt")));
        String line = null;
        while((line = bufferedReader.readLine()) != null) {
        	Thread.sleep(500);
        	Client.sendMsg(line);
        }
//        while(Client.sendMsg(new Scanner(System.in).nextLine()));  
    }  
} 