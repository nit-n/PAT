package ClassB;
import java.util.Scanner;

import org.junit.Test;

/**
 *  题目：
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
输入格式：

每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10100。
输出格式：

在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。

出处：pat乙级1002号题
 * */

public class write_number1002 {
	static write_number1002 wr;
	public static void main(String[] args) {
		 	Scanner in = new Scanner(System.in);
	        String sin=in.nextLine();
			wr=new write_number1002();
			wr.GetWriteNumberThree(sin);
	}
	/**
	 *	 通过toCharArray()把输入的字符串转换为char数组
	 * */
	@Test
	public void GetWriteNumberTwo(String in) {
		int [] EmOne= {0,1,2,3,4,5,6,7,8,9};
		String [] EmTwo= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		char [] EmThree= {'0','1','2','3','4','5','6','7','8','9'};
		char [] cs=in.toCharArray();
		int sum=0;
		for(int i=0;i<cs.length;i++) {
			for(int j=0;j<EmThree.length;j++) {
				if(EmThree[j]==cs[i]) {sum+=EmOne[j];};
			}
		}
		char [] css=String.valueOf(sum).toCharArray();
		for(int z=0;z<css.length;z++) {
			for(int x=0;x<EmThree.length;x++) {
				if(EmThree[x]==css[z]) {
						if(z!=css.length-1) {
							System.out.print(EmTwo[x]+" ");
						}else {
							{System.out.print(EmTwo[x]);};
						}
					}
			}
		}
	}
	/**
	 * 通过String类的split()方法将输入的字符串转换为String数组
	 * */
	/**
	  *  优化方向从性能角度，当字符串读进来 然后用charCode - '0'来做累加计算，然后用对10的模取和除法来计算每一位数
	 * */
	public void GetWriteNumberThree(String in) {
			String [] sin=in.split("");
			String [] EmOne= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
			String [] sint="0123456789".split("");
			int sum=0;
			int sint1=Integer.valueOf(in);
			while(sint1!=0) {
				sum+=sint1%10;
				sint1=sint1/10;
			}
//			for(int i=0;i<sin.length;i++) {
//				sum+=Integer.valueOf(sin[i]);
//			}
			String [] sumin=String.valueOf(sum).split("");
			for(int i=0;i<sumin.length;i++) {
				for(int j=0;j<sint.length;j++) {
					if(sumin[i].equals(sint[j])) {
						if(i==sumin.length-1) {
							System.out.print(EmOne[j]);
							}else{
								System.out.print(EmOne[j]+" ");
						}
					}
				}
			}
	}
	/**
	 * 比较呆的方法
	 * */
	public void GetWriteNumberOne(String in) {
		 char [] bs=in.toCharArray();
		    int sum=0;
		    for(int i=0;i<bs.length;i++) {
		    	switch (bs[i]) {
		    		case '1':
		    			sum+=1;break;
		    		case '2':
		    			sum+=2;break;
		    		case '3':
		    			sum+=3;break;
		    		case '4':
		    			sum+=4;break;
		    		case '5':
		    			sum+=5;break;
		    		case '6':
		    			sum+=6;break;
		    		case '7':
		    			sum+=7;break;
		    		case '8':
		    			sum+=8;break;
		    		case '9':
		    			sum+=9;break;
		    	}
		    }
		    char [] bss=String.valueOf(sum).toCharArray();
		    for(int j=0;j<bss.length;j++) {
		    	switch (bss[j]) {
		    		case '1':
		    			if(j==bss.length-1) {
		    				System.out.print("yi");
		    			}else {
		    			System.out.print("yi"+" ");
		    			}
		    			break;
		    		case '2':
		    			if(j==bss.length-1) {
		    				System.out.print("er");
		    			}else {
		    			System.out.print("er"+" ");
		    			}
		    			break;
		    		case '3':
		    			if(j==bss.length-1) {
		    				System.out.print("san");
		    			}else {
		    			System.out.print("san"+" ");
		    			}
		    			break;
		    		case '4':
		    			if(j==bss.length-1) {
		    				System.out.print("si");
		    			}else {
		    			System.out.print("si"+" ");
		    			}
		    			break;
		    		case '5':
		    			if(j==bss.length-1) {
		    				System.out.print("wu");
		    			}else {
		    			System.out.print("wu"+" ");
		    			}
		    			break;
		    		case '6':
		    			if(j==bss.length-1) {
		    				System.out.print("liu");
		    			}else {
		    			System.out.print("liu"+" ");
		    			}
		    			break;
		    		case '7':
		    			if(j==bss.length-1) {
		    				System.out.print("qi");
		    			}else {
		    			System.out.print("qi"+" ");
		    			}
		    			break;
		    		case '8':
		    			if(j==bss.length-1) {
			    			System.out.print("ba");
		    			}else {
		    			System.out.print("ba"+" ");
		    			}
		    			break;
		    		case '9':
		    			if(j==bss.length-1) {
		    				System.out.print("jiu");
		    			}else {
		    			System.out.print("jiu"+" ");
		    			break;
		    	}
		    	}
		    }
	}
}