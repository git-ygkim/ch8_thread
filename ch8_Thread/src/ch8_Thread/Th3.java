package ch8_Thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.nio.file.FileSystemNotFoundException;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomTh extends Thread {
	Container contentPane;
	boolean flag = false;
	
	public RandomTh(Container contentPane) {
		this.contentPane = contentPane;
	}
	void finish() {
		flag = true;
	}
	
	@Override
	public void run() {
		while (true) {
			
			// 화면에 있는 좌표값 안에서 random 정수(int)값을 생성
			JLabel la = new JLabel("꽃");
			la.setSize(80, 30);
			la.setFont(new Font("고딕체", Font.BOLD, 14));
			la.setForeground(Color.YELLOW);
			int x = (int) (Math.random() * contentPane.getWidth());
			int y = (int) (Math.random() * contentPane.getHeight());
						
			// 좌표값 얻어와서 좌표값 찍기
			la.setLocation(x, y);
			
			contentPane.add(la);
			contentPane.repaint();
			
			try {
				// 1초 내에서 랜던 값을 주어 sleep 하겠다. 
				sleep( (int) ( Math.random() * 1000 ) );
				
				if(flag == true) {
					contentPane.removeAll();
					
					JLabel finishLabel = new JLabel("끝났습니다.");
					finishLabel.setFont(new Font("고딕체", Font.PLAIN, 26));
					finishLabel.setSize(1000, 100);
					finishLabel.setLocation(contentPane.getWidth() / 2 - 400 ,
												contentPane.getHeight()/2-100);
					contentPane.add(finishLabel);
					contentPane.repaint();
					return;
				}
				
			}catch (InterruptedException e) {
				return;
			}
			
			
		}
	}
}

public class Th3 extends JFrame {
	RandomTh rt;
	
	// 생성자
	Th3() {
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent e) {
				rt.finish();
				
			}
			
		});
		
		rt = new RandomTh(contentPane);
		
		setSize(1300, 700);
		setVisible(true);
		
		rt.start();
		
	}

	public static void main(String[] args) {
		
		

	}

}
