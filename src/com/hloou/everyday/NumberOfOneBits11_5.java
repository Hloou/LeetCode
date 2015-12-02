package com.hloou.everyday;
/*给出一个整数，求出他包含二进制数1的个数
 * 即11的二进制：1011，则返回3
 * */
/*
 * 学习点：完成对数据的1的处理，另使用移位方法*/
public class NumberOfOneBits11_5 {
	public static void main(String[] args) {
	int number=8;
	char[] charBits=Integer.toBinaryString(number).toCharArray();
	int count=0;
	for(char c:charBits){
		if((c&1)==1){
			count++;
		}
	}
	System.out.println(count);
	
	}
	
}
