package com.hloou.everyday;
import java.util.Arrays;

/*将两个有序数组A,B，重新排列成有序数组，A可以容下A+B的长度*/
//学习点：1.进行归并排序，从最大的数往前，之前的数据就不会被覆盖，减少空间复杂度
public class MergeSortedArray11_21 {
	public int[] MergeSortedArrayWithAandB(){
		int[] arrA=new int[]{2,3,5,7,9,12,23,25};
		int[] arrB=new int[]{1,2,3,6,7,10,23};
		int divided=arrA.length-1;//拿到数组A与B的分界点
		//创建得到的A是原来的A与B合拼的数组A；
		arrA=Arrays.copyOf(arrA, arrA.length+arrB.length);
		int lengthOfA=arrA.length-1;//整个数组的数组下标上界
		int lengthOfB=arrB.length-1;//当前数组A的从B拼接过来的数组下标上界
		
		while(lengthOfA>=0){
			if(divided>=0&&lengthOfB>=0){
				if(arrA[divided]>arrB[lengthOfB]){
					arrA[lengthOfA]=arrA[divided];
					divided--;
				}else{
					arrA[lengthOfA]=arrB[lengthOfB];
					lengthOfB--;
				}
			}
			else if(divided>=0){
				arrA[lengthOfA]=arrA[divided];
				divided--;
			}
			else if(lengthOfB>=0){
				arrA[lengthOfA]=arrB[lengthOfB];
				lengthOfB--;
			}
			lengthOfA--;
		}
		return arrA;
	}
	public static void main(String[] args) {
		int[] accA=new int[0];
		MergeSortedArray11_21 mergeSortedArray=new MergeSortedArray11_21();
		accA=mergeSortedArray.MergeSortedArrayWithAandB();
		for(int i:accA){
			System.out.print(i+" ");
		}
	}
}
