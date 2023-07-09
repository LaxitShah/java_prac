package advancethread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo1 {

	public static void main(String[] args) {

		ReentrantLock l = new ReentrantLock(true);
		
		l.lock();
		System.out.println(Thread.currentThread().getName());
		System.out.println(l.isLocked());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getQueueLength());
		System.out.println("count--" + l.getHoldCount());
		l.unlock();
		System.out.println("count--" + l.getHoldCount());
		System.out.println(l.isLocked());
		System.out.println(l.isFair());

	}
}
