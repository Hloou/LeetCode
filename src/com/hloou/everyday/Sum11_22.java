package com.hloou.everyday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//给定一个数组和一个数字，求出这个数组里的两个值得和为给定的数字
//按顺序输出数组中两个值得下标，但是坐标不能从0开始
//如：Input:	numbers={2,	7,	11,	15},number=9 Output:index1=1,index2=2
//学习点：1.握手定理
//        2.map.get(ObjectKey)获取value值     
public class Sum11_22 {
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,6,7,12,14,23,35,43};
		int number=3;
		int leave=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			map.put(i+1,array[i]);
		}
		/*Set<Entry<Integer, Integer>> set=map.entrySet();
		Iterator<Entry<Integer, Integer>>  it=set.iterator();
		while(it.hasNext()){
			Entry<Integer, Integer> en=it.next();
			
			System.out.println(en.getKey()+" "+en.getValue()); 
		}*/
		System.out.println("-----------------------------");
		for(int i=1;i<map.size()+1;i++){
			//System.out.println(map.get(i+1));
			leave=number-map.get(i);
			for(int j=i+1;j<map.size();j++){
				if(map.get(j)==leave){
					System.out.println("index1="+i+" index2="+j+" number="+number);
					return;
				}
			}
		}
		
	}
}
