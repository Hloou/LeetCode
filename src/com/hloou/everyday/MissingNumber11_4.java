package com.hloou.everyday;
/*给定一个数组，求出他遗失的数据，如[0，1，2，4] 缺失的数据为3，
 * 要求时间复杂度为O(n)
 * */
/**
 * 学习点： 1.进行异或计算，CPU的效率最高
 * 		   2.java中用^ 表示异或
 * 		   3.成对出现的数据经过异或运算得到0，而运算结束得到的值则是缺失的值
 * */
public class MissingNumber11_4 {
	public static void main(String[] args) {
		int[] arrAll=new int[]{0,1,2,3,4,5};
		int[] arrNew=new int[]{0,1,3,4,5};
		int rs=0;
		for(int i=0;i<arrNew.length;i++){
			rs^=arrNew[i];
		}
		for(int i=0;i<arrAll.length;i++){
			rs^=arrAll[i];
		}
		System.out.println(rs);
	}
}


