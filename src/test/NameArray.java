package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("伊藤");
		names.add("田原");
		names.add("中川");
		names.add("鈴木");
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("検索する名前を入力してください");
		String search = scanner.nextLine();
		scanner.close();
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			if(search.equals(it.next())) {
				result = true;
			}
		}
		
		if(result) {
			System.out.println(search + "さんは含まれています");
		}else{
			System.out.println(search + "さんは含まれていません");
		}
	}

}
