package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* JADX INFO: loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    public CyclicBuffer<E> f3716cb;
    public int maxSize = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e10) {
        if (isStarted()) {
            this.f3716cb.add(e10);
        }
    }

    public E get(int i10) {
        if (isStarted()) {
            return this.f3716cb.get(i10);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f3716cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.f3716cb.clear();
    }

    public void setMaxSize(int i10) {
        this.maxSize = i10;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f3716cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f3716cb = null;
        super.stop();
    }
}
