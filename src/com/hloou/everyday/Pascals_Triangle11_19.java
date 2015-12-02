package com.hloou.everyday;
//打印出帕斯卡三角
/*图形如下：[
      [1],
     [1,1],
    [1,2,1],
   [1,3,3,1],
  [1,4,6,4,1]
      ]*/
//使用二维数组，相当于树的结构（twoDimensionArray[i]=new int[j+1];）学会使用
public class Pascals_Triangle11_19 {
	public static void main(String[] args) {
		int[][] twoDimensionArray=new int[10][];
		for(int i=0;i<twoDimensionArray.length;i++){
			for(int j=0;j<i+1;j++){
				twoDimensionArray[i]=new int[j+1];
				twoDimensionArray[i][j]=1;
				twoDimensionArray[i][0]=1;
			}
		}
		for(int i=0;i<twoDimensionArray.length;i++){
			for(int j=0;j<twoDimensionArray[i].length;j++){
				if(twoDimensionArray[i][j]==0&&(i>=2||j>=2)){
					twoDimensionArray[i][j]=twoDimensionArray[i-1][j]+twoDimensionArray[i-1][j-1];
				}
			}
		}
		for(int i=0;i<twoDimensionArray.length;i++){
			/*for(int p=twoDimensionArray.length;p>i;p--){
				System.out.print(" ");
			}*/
			for(int j=0;j<twoDimensionArray[i].length;j++){
				System.out.print(twoDimensionArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
