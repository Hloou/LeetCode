package com.hloou.everyday;

import java.util.Arrays;
import java.util.Timer;

/*图形如下：打印出杨辉三角
    [1],
   [1,1],
  [1,2,1],
 [1,3,3,1],
[1,4,6,4,1]
  要求给出K层，则打印出K层的数据K=5则打印[1,4,6,4,1]，空间为O(K)*/
//学习点：1.使用递归方法
//        2.创建数组：当创建一个数组是原数组长度+1的数组使用arrNow=Arrays.copyOf(arrNow,arrNow.length+n); n可以是任意长度
//        3.不需要再声明数组，从数组的后面开始计算
//        4.System.nanoTime() 获取当前时间 ，两个时间做差即可

/**
 * 递归方法
 */
public class Pascals_Triangle11_20 {
	int[] arrNow = new int[] { 1 };
	public int[] getPascalsByIndex(int x) {
		int lengthNext = arrNow.length + 1;
		arrNow = Arrays.copyOf(arrNow, lengthNext);
		arrNow[lengthNext - 1] = 1;
		int temp = 0;
		if (arrNow.length <= x) {
			int[] Arrtemp = arrNow.clone();
			for (int i = 0; i < arrNow.length - 1; i++) {
				if (i == 0) {
					arrNow[i] = 1;
				} else {
					temp = Arrtemp[i];
					arrNow[i] = Arrtemp[i - 1] + temp;
				}
			}
			getPascalsByIndex(x);
		}
		return arrNow;
	}

	/**
	 * 
	 */
	public int[] getPascalsByIndexNoOtherArrays(int x) {
		int lengthNext = arrNow.length + 1;
		arrNow = Arrays.copyOf(arrNow, lengthNext);
		arrNow[lengthNext - 1] = 1;
		int temp = 0;
		if (arrNow.length <= (x-1)) {
			for (int i = arrNow.length-1; i >=0 ;i--) {
				if (i == 0) {
					arrNow[i] = 1;
				} else {
					temp = arrNow[i];
					arrNow[i] = arrNow[i - 1] + temp;
				}
			}
			getPascalsByIndexNoOtherArrays(x);
		}
		
		return arrNow;
	}

	public static void main(String[] args) {
		Pascals_Triangle11_20 pascals_Triangle11_20=null;
		int[] arrC = null;
		int[] arrA=null;
		int number = 30;
		long startTime1=0;
		long endTime1=0;
		long startTime2=0;
		long endTime2=0;
		startTime1=System.nanoTime();
		pascals_Triangle11_20 = new Pascals_Triangle11_20();
		arrA = Arrays.copyOf(pascals_Triangle11_20.getPascalsByIndexNoOtherArrays(number), number);
		endTime1=System.nanoTime();
		System.out.println("历时"+(endTime1-startTime1));
		for (int i : arrA) {
			System.out.print(i + " ");
		}
	
		System.out.println("我是分割线");
		
		startTime2=System.nanoTime();
		pascals_Triangle11_20 = new Pascals_Triangle11_20();
		arrC = Arrays.copyOf(pascals_Triangle11_20.getPascalsByIndex(number), number);
		endTime2=System.nanoTime();
		System.out.println("历时"+(endTime2-startTime2));
		for (int i : arrC) {
			System.out.print(i + " ");
		}
		

	}
}
