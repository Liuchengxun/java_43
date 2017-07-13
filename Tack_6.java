/*import java.util.Scanner;

public class Tack_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Scanner input = new Scanner(System.in);
       double score=0;//一天的学习时间
       double sum =0;//总共学习的时间
       double averageScore=0;//平均时间
       for(int i=1;i<=5;i++){
    	   System.out.print("请输入第"+i+"天学习的时间：");
    	   score=input.nextDouble();
    	   sum=score+sum;
    	   continue;  
	}
      averageScore=sum/5;
       System.out.print("平均时间为"+averageScore);
	}
}
*/


/*import java.util.Scanner;

public class Tack_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Scanner input = new Scanner(System.in);
       for(int i=0;i<=100;i++){
    	   if(i%3==0){  //能被3整除的数
    		   System.out.println("Flip");
    	   }else if(i%5==0){  //能被5整除的数
    		   System.out.println("Flop");
    	   }else if((i%3==0)&&(i%5==0)){  //能同时被3和5整除的数
    		   System.out.println("FlioFlop");
    	   }else{   //不是3和5的可以整除的数
    		   System.out.println(i);
    	   }
       }
	}
}*/
