package com.hloou.everyday;

/*给定一个数组和元素，去除数组的元素为给定的值，并求出新数组长度*/
/*用两个变量来获取值*/
public class RemoveElement11_6 {
	public static void main(String[] args) {
		int number = 2;
		int[] arrNum = new int[] { 1, 2, 34, 56, 78, 3, 4, 6, 23, 2, 2, 2 };
		int y = 0;
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == number) {
				continue;
			}
			arrNum[y] = arrNum[i];
			y++;
		}
		System.out.println(y);
	}
}
