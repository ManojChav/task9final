package com.bellinfo.task9final;

public class deadlock {

	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Thread thr1 = new Thread(new SynchronizeThread(obj1,obj2), "thr1");
		Thread thr2 = new Thread(new SynchronizeThread(obj2,obj1), "thr2");

		thr1.start();
			Thread.sleep(3000);
		thr2.start();
			Thread.sleep(5000);
		
	}

}

class SynchronizeThread implements Runnable{
	private Object obj1;
	private Object obj2;
	
	public SynchronizeThread(Object obj1, Object obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (obj1){
			System.out.println(name+ " acquired lock on object 1 "+ obj1);
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (obj2){
			System.out.println(name+ " acquired lock on object 2 "+ obj2);
		}
		System.out.println(name+ " released lock on object 2 "+ obj2);
		}
		System.out.println(name+ " released lock on object 1 "+ obj1);
		
	}
}