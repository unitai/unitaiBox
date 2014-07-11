package githave;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k001 {
	public static void main(String[] args){
		int hp;
		int exp;
		int money;
		String name;

		Scanner s = new Scanner(System.in);
		System.out.println("HP入力してください");
		hp= s.nextInt();

		System.out.println("EXPを入力して下しあ");
		exp=s.nextInt();

		System.out.println("MONEYを入力");
		money=s.nextInt();

		System.out.println("名前入力");
		name=s.next();

		System.out.println("ーーーーーーーーステータスーーーーーーーー");
		System.out.println("HP："+hp);
		System.out.println("exp："+exp);
		System.out.println("MONEY："+money);
		System.out.println("NAME："+name);



		
		try{
			String a[] = new String[4];
			a[0] = String.valueOf(hp);
			a[1] = String.valueOf(exp);
			a[2] = String.valueOf(money);
			a[3] = name;

			//クラスのインスタンス化、引数でファイル名を指定
			FileWriter fw = new FileWriter("I:\\java提出のメモ\\商品表サンプル.txt");

			for(int b=0;b<4;b++){
				//書き込む文字＋改行を書き込む
				fw.write(a[b]+"\r\n");
			}
			//ファイルを閉じる
			fw.close();
		} catch(Exception e){

		}

		
		
		System.out.println("ステータスの初期化");
		hp=0;
		exp=0;
		money=0;
		name=null;
		System.out.println("ーーーーーーーーステータスーーーーーーーー");
		System.out.println("HP："+hp);
		System.out.println("exp："+exp);
		System.out.println("MONEY："+money);
		System.out.println("NAME："+name);
		
		
		
		System.out.println("ロード");

		String a[] = new String[4];
		try{
			File file = new File("I:\\java提出のメモ\\商品表サンプル.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));

			String str;
			int i=0;

			while((str = br.readLine()) != null){
				a[i]=str;
				++i;
			}
			br.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}

		hp=Integer.valueOf(a[0]);
		exp=Integer.valueOf(a[1]);
		money=Integer.valueOf(a[2]);
		name=a[3];

		System.out.println("ーーーーーーーーステータスーーーーーーーー");
		System.out.println("HP："+hp);
		System.out.println("exp："+exp);
		System.out.println("MONEY："+money);
		System.out.println("NAME："+name);
	}
}
