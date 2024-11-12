package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		CoinCase mycase = new CoinCase();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("硬貨の種類は？");
			int kind = Integer.parseInt(br.readLine());
			System.out.print("硬貨の枚数は？");
			int count = Integer.parseInt(br.readLine());
			
			mycase.AddCoins(kind, count);
		}
		
		System.out.println("500円は" + mycase.Getcount(500) + "枚、" + mycase.GetAmount(500) + "円");
		System.out.println("100円は" + mycase.Getcount(100) + "枚、" + mycase.GetAmount(100) + "円");
		System.out.println("50円は" + mycase.Getcount(50) + "枚、" + mycase.GetAmount(50) + "円");
		System.out.println("10円は" + mycase.Getcount(10) + "枚、" + mycase.GetAmount(10) + "円");
		System.out.println("5円は" + mycase.Getcount(5) + "枚、" + mycase.GetAmount(5) + "円");
		System.out.println("1円は" + mycase.Getcount(1) + "枚、" + mycase.GetAmount(1) + "円");
		
		System.out.println("総額は" + mycase.GetAmount() + "円");
	}
}

