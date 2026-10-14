package l9;

import fd.j0;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class b<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue<E> f33024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f33025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Condition f33026e;

    public b(Queue<E> queue) {
        j0.i(queue, "backingQueue");
        this.f33024c = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f33025d = reentrantLock;
        this.f33026e = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e10) {
        offer(e10);
        return true;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e10) {
        this.f33025d.lock();
        try {
            this.f33024c.offer(e10);
            this.f33026e.signal();
            return true;
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) {
        j0.i(timeUnit, "unit");
        offer(e10);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        this.f33025d.lock();
        try {
            return this.f33024c.peek();
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        this.f33025d.lock();
        try {
            return this.f33024c.poll();
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        j0.i(timeUnit, "unit");
        this.f33025d.lockInterruptibly();
        try {
            long nanos = timeUnit.toNanos(j10);
            while (this.f33024c.isEmpty() && nanos > 0) {
                nanos = this.f33026e.awaitNanos(nanos);
            }
            return this.f33024c.poll();
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) {
        offer(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.f33025d.lock();
        try {
            return this.f33024c.remove(obj);
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.f33025d.lock();
        try {
            return this.f33024c.size();
        } finally {
            this.f33025d.unlock();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.f33025d.lockInterruptibly();
        while (this.f33024c.isEmpty()) {
            try {
                this.f33026e.await();
            } catch (Throwable th) {
                this.f33025d.unlock();
                throw th;
            }
        }
        E ePoll = this.f33024c.poll();
        this.f33025d.unlock();
        return ePoll;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        throw new UnsupportedOperationException();
    }
}
