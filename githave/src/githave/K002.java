package githave;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class K002 extends JFrame{
	public static void main(String args[]){
		K002 frame = new K002("メモ帳");
		frame.setVisible(true);
	}

	K002(String title){
		setTitle(title);
		setBounds(300, 200, 700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		final JTextArea text1 = new JTextArea();//テキストエリアの設定
		text1.setPreferredSize(new Dimension(650, 400)); //テキストエリアのサイズ
		text1.setLineWrap(true);//文章の折り返し
		text1.setBorder(new EtchedBorder(EtchedBorder.LOWERED));//枠線？
		JScrollPane scrollpane = new JScrollPane(text1);//スクロールバー

		//保存ボタン
		JButton btn1 = new JButton("保存");//ボタン保存
		btn1.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						try {
							BufferedWriter bw = new BufferedWriter(new FileWriter("I:\\JavaTest\\test.txt"));
							//bw.flush();   //?
							bw.write(text1.getText());
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});

		//保存ボタン
		JButton btn2 = new JButton("読込"); //ボタン読み込み
		btn2.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						try{
							text1.setText("");
							BufferedReader br = new BufferedReader(new FileReader("I:\\JavaTest\\test.txt"));  // ファイルを開く
							String line;
							while ((line = br.readLine()) != null) {  // 1行ずつ読み込む
								// 読み込んだ1行をテキストエリアに表示
								text1.append(line + "\n");
							}
						} catch (Exception e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
					}
				});

		p.add(text1);
		p.add(btn1);
		p.add(btn2);
		p.add(scrollpane);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}