package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;
    public static final int UNDEFINED = -1;
    public BlockingQueue<E> blockingQueue;
    public AppenderAttachableImpl<E> aai = new AppenderAttachableImpl<>();
    public int queueSize = 256;
    public int appenderCount = 0;
    public int discardingThreshold = -1;
    public boolean neverBlock = false;
    public AsyncAppenderBase<E>.a worker = new a();
    public int maxFlushTime = 1000;

    public class a extends Thread {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl<E> appenderAttachableImpl = asyncAppenderBase.aai;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.blockingQueue.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (Object obj : asyncAppenderBase.blockingQueue) {
                appenderAttachableImpl.appendLoopOnAppenders((E) obj);
                asyncAppenderBase.blockingQueue.remove(obj);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    private boolean isQueueBelowDiscardingThreshold() {
        return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
    }

    private void put(E e10) {
        if (this.neverBlock) {
            this.blockingQueue.offer(e10);
        } else {
            putUninterruptibly(e10);
        }
    }

    private void putUninterruptibly(E e10) {
        boolean z10 = false;
        while (true) {
            try {
                this.blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i10 = this.appenderCount;
        if (i10 == 0) {
            this.appenderCount = i10 + 1;
            StringBuilder sbA = defpackage.a.a("Attaching appender named [");
            sbA.append(appender.getName());
            sbA.append("] to AsyncAppender.");
            addInfo(sbA.toString());
            this.aai.addAppender(appender);
            return;
        }
        addWarn("One and only one appender may be attached to AsyncAppender.");
        addWarn("Ignoring additional appender named [" + appender.getName() + "]");
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e10) {
        if (isQueueBelowDiscardingThreshold() && isDiscardable(e10)) {
            return;
        }
        preprocess(e10);
        put(e10);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.aai.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.aai.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.aai.detachAppender(str);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.aai.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.discardingThreshold;
    }

    public int getMaxFlushTime() {
        return this.maxFlushTime;
    }

    public int getNumberOfElementsInQueue() {
        return this.blockingQueue.size();
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getRemainingCapacity() {
        return this.blockingQueue.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.aai.isAttached(appender);
    }

    public boolean isDiscardable(E e10) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.neverBlock;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.aai.iteratorForAppenders();
    }

    public void preprocess(E e10) {
    }

    public void setDiscardingThreshold(int i10) {
        this.discardingThreshold = i10;
    }

    public void setMaxFlushTime(int i10) {
        this.maxFlushTime = i10;
    }

    public void setNeverBlock(boolean z10) {
        this.neverBlock = z10;
    }

    public void setQueueSize(int i10) {
        this.queueSize = i10;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.appenderCount == 0) {
            addError("No attached appenders found.");
            return;
        }
        if (this.queueSize < 1) {
            StringBuilder sbA = defpackage.a.a("Invalid queue size [");
            sbA.append(this.queueSize);
            sbA.append("]");
            addError(sbA.toString());
            return;
        }
        this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
        if (this.discardingThreshold == -1) {
            this.discardingThreshold = this.queueSize / 5;
        }
        StringBuilder sbA2 = defpackage.a.a("Setting discardingThreshold to ");
        sbA2.append(this.discardingThreshold);
        addInfo(sbA2.toString());
        this.worker.setDaemon(true);
        AsyncAppenderBase<E>.a aVar = this.worker;
        StringBuilder sbA3 = defpackage.a.a("AsyncAppender-Worker-");
        sbA3.append(getName());
        aVar.setName(sbA3.toString());
        super.start();
        this.worker.start();
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.worker.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                try {
                    interruptUtil.maskInterruptFlag();
                    this.worker.join(this.maxFlushTime);
                    if (this.worker.isAlive()) {
                        addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. " + this.blockingQueue.size() + " queued events were possibly discarded.");
                    } else {
                        addInfo("Queue flush finished successfully within timeout.");
                    }
                } catch (InterruptedException e10) {
                    addError("Failed to join worker thread. " + this.blockingQueue.size() + " queued events may be discarded.", e10);
                }
            } finally {
                interruptUtil.unmaskInterruptFlag();
            }
        }
    }
}
