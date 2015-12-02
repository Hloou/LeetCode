package com.hloou.everyday;
//对数组为有序数组A[1,1,1,2,2,2,2,2,3,3,3，4],去重+1后的数据为A[1，1，2，2，3，3，4]
//思路：当数据一样的时候还是进行数据的置换，对循环的控制可以调节
public class RemoveDuplicatesFromSortedArray11_18 {
	public static void main(String[] args) {
		int[] arrInt=new int[]{1,1,1,2,2,2,2,2,3,3,3,4};
		int j=0;
		int count=0;
		for(int i=1;i<arrInt.length;i++){
			if(arrInt[j]!=arrInt[i]){
				arrInt[++j]=arrInt[i];
				count=0;
			}else{
				count++;
				if(count<2){
					arrInt[++j]=arrInt[i];
				}
			}
		}
		System.out.println();
		System.out.println("=======最后的数据");
		for(int i:arrInt){
			System.out.print(i+"  ");
		}
	}}