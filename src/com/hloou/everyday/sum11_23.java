package com.hloou.everyday;

import java.util.Arrays;

//给定一个数组num[] 求出：num[i]+num[j]+num[k]=0 的i,j,k
//要求每组都不一样
public class sum11_23 {
	public static void main(String[] args) {
		int[] array=new int[]{1,23,34,2,4,34,56,43,23,77,4,33,4};
		Arrays.sort(array);
		for(int i:array){
			System.out.println(i);
		}
		for(int i=0;i<array.length;i++){
			
		}
	}
}
