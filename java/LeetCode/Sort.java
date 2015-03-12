import java.util.*;
import java.lang.*;

public class Sort{

  public static long start,stop;

  public static void main(String[] args){
    
    int[] a = generate((int)Math.pow(2,24));
    start();
    int[] b = sort(a);
    //try{
      //new Thread().sleep(1000);
    //}catch(Exception e){
      //e.printStackTrace();
    //}
    stop();
  }

  public static int[] sort(int[] a){
    int len = a.length;
    for (int i=len; i>0; i--){
      for (int j=0; j<i-1; j++){
        if(a[j] > a[j+1]){
          int temp = a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }  
      }
    }
    return a;
  }

  public static void start(){
    start = new Date().getTime();
    System.out.println("Start at:" + start);
  }

  public static void stop(){
    stop = new Date().getTime();
    System.out.println("Time(ms): " + (stop-start));
  }

  public static int[] generate(int n){
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = new Random().nextInt(1000);
    }
    return a;
  }
}
