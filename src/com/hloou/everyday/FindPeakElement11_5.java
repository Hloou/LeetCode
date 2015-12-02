package com.hloou.everyday;
/*查找Peak元素，该数比他两边的数都大*/
/*学习点： 1.使用二分法
 * 		  2.处理好边界值,*/
public class FindPeakElement11_5 {
	public static void main(String[] args) {
		int[] arrNumber=new int[]{1,2,3,4,5,6,7,5,2,4,6,7,9,0,5,4,8,11};
		int start=0;
		int end=arrNumber.length;
		int min=0;
		System.out.println(end);
		while(start<=end){
			min=(start+end)/2;
			if((min==0||(arrNumber[min]>arrNumber[min+1]))&&(min==arrNumber.length-1||arrNumber[min]>arrNumber[min-1])){
				System.out.println(arrNumber[min]);
				break;
			}else if(arrNumber[min]<arrNumber[min-1]){
				end=min-1;
			}else{
				start=min+1;
			}
		}
	}
}
