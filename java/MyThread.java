/** 
* 一个计数器，计数到10，在每1个数字之间暂停1秒，每隔1个数字输出一个字符串
* 
* @author will 2015-3-11  
*/ 

import java.lang.*;

public class MyThread extends Thread {

  public void run(){
    for(int i=0; i<10; i++){
      Thread.sleep(1);
      System.out.println(i + "----now print!");
    }
  }

  public void main(){
    Mythread t = new MyThread();
    t.start();
  }
}
