package com.company;

import java.util.Scanner;

/**
 *假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 2022-06-11
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 */

public class PaLouTi {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = louti(num);
        System.out.println(num);


    }

    public  static  int  louti(int num){
        if (num == 1 || num == 2 ){
            return num;
        }else {
            return num = louti(num -1 ) + louti(num - 2 );
        }
    }


}
