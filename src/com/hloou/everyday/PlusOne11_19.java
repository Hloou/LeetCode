package com.hloou.everyday;
//对数组的最后值进行操作，array.length
public class PlusOne11_19 {
	public static void main(String[] args) {
		int[] arrInt=new int[]{1,2,3,6,9,9};
		int number=2;
		for(int i=0;i<arrInt.length;i++){
			System.out.print(arrInt[i]);
		}
		System.out.println();
		System.out.println("--------------");
		//For循环是应用于加数为1的情况
		/*for(int i=arrInt.length-1;i>=0;i--){
			if(arrInt[i]+number==10){
				arrInt[i]=0;
			}else{
				arrInt[i]=arrInt[i]+number;
				break;
			}
		}*/
		//For应用与10以内的加法
		
		arrInt[arrInt.length-1]=(arrInt[arrInt.length-1]+number)%10; //对最后一个值进行操作，后面的值与加一的方式相似
		for(int i=arrInt.length-2;i>=0;i--){
			if(arrInt[i]+1==10){
				arrInt[i]=0;
			}else{
				arrInt[i]=arrInt[i]+1;
				break;
			}
		}
		
		for(int i=0;i<arrInt.length;i++){
			System.out.print(arrInt[i]);
		}
		
	}
}

