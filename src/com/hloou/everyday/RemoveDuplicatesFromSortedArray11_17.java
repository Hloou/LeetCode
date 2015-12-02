package com.hloou.everyday;
/*数组中重复的元素去除*/
//因为是有序的数列，当前后的数据不一致的时候，就是要求移位的数据
public class RemoveDuplicatesFromSortedArray11_17 {
	public static void main(String[] args) {
		int[] arrInt=new int[]{1,2,2,2,4};
		int j=0;
		for(int i=1;i<arrInt.length;i++){
			if(arrInt[j]!=arrInt[i]){
				arrInt[++j]=arrInt[i];
				System.out.println("当前的数据");
				for(int k:arrInt){
					System.out.print(k+"  ");
				}
			}
		}
		System.out.println();
		System.out.println("=======最后的数据");
		for(int i:arrInt){
			System.out.print(i+"  ");
		}
	}
}
