package ch8_Thread;

// Thread 클래스
// Runnable 인터페이스 - 딱 하나의 메소드만 가지고 있는 인터페이스
// 예시) 쓰레드는 상속받을 수 없으므로, 인터페이스를 implement하면 상속도하고 run메소드도 가져올 수 있음.  
//interface Runnable {
//	public abstract void run();
//	
//}
//
//class MyRunnable implements Runnable{
//	
//	@Override
//	public void run() {
//		
//	}
//	
//}

class MyRunnable implements Runnable{
	
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


public class Th1 {

	public static void main(String[] args) {

		
		MyRunnable mr = new MyRunnable();
		Thread th1 = new Thread(mr);
		th1.start();
		
		
		
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
