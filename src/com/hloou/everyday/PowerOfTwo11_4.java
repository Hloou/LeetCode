package com.hloou.everyday;
/*给定一个整数，判断它是否为2的幂*/
/***解题思路： 1.将数据转换成二进制
 * 			  2.得到的数据能表示为1…………0即可
 *    学习点: 1.Integer.toBinaryString(int) 方法获取int的二进制字符串
 *            2.对值得比较多数是用equals()
 * */
public class PowerOfTwo11_4 {
	public static void main(String[] args) {
		int number=1024;
		char[] charNu=Integer.toBinaryString(number).toCharArray();
		boolean flag = false;
		for(int i=0;i<charNu.length;i++){
			if(i==0){
				if(String.valueOf(charNu[0]).equals("1")){
					flag=true;
					continue;
				}else{
					flag=false;
					break;
				}
			}else{
				if(String.valueOf(charNu[i]).equals("0")){
					flag=true;
					continue;
				}else{
					flag=false;
					break;
				}
			}
		}
		if(flag){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}
		
		
	}
}
