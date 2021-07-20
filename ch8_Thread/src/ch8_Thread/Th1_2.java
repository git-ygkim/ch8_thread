package ch8_Thread;

/*
		new() 생성
		  |
		start() 	runnable 상태 ---- JVM이 실행
		  |
		waite() 	blocked 상태 ---- notify ---- runnable 상태 
		 또는
		sleep()		blocked 상태 ---- 시간이 다 지나면 -- runnable 상태



 */

class MyThread extends Thread{
	
	@Override
	public void run() {

		for(int i = 0; i < 5; i++) {
			System.out.println("딩~");
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("딩~");
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
	}
}


public class Th1_2 {

	public static void main(String[] args) {

		// 방법2 Thread를 상속 받아서 생성
		MyThread mr = new MyThread();
		Thread th1 = new Thread(mr);
		th1.start();
		
		
		// 방법3 thread 안에 Runnable을 넣고 구현
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("딩~");
				
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		});
		
		
		// 방법4 익명 처리 
		Thread th4 = new Thread() {
			
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("딩~");
				
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		}
	}
	
		
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("땡~");
//		
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		
//		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("땡~");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
//		Thread th2 = new Thread(mr);
//		th2.start();
//		th1.start();

	}

}
