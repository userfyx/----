package com.example;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/

    /*
    * 7.打印出杨辉三角形（要求打印出10行以上）
    * */
public class lianxi7 {
    //
    public static void main(String[] args) {
        //二级数组
        int[][] a = new int[10][10];

        for(int i=0;i<10;i++){

            a[i][i] = 1;
            a[i][0] = 1;
        }
        //
        for(int i=2; i<10; i++) {
            for(int j=1; j<i; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        for(int i=0; i<10; i++) {
            for(int k=0; k<2*(10-i)-1; k++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        } }
}
