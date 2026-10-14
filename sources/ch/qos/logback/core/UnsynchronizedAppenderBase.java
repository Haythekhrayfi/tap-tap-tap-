package ch.qos.logback.core;

import androidx.activity.k;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnsynchronizedAppenderBase<E> extends ContextAwareBase implements Appender<E> {
    public static final int ALLOWED_REPEATS = 3;
    public String name;
    public boolean started = false;
    private ThreadLocal<Boolean> guard = new ThreadLocal<>();
    private FilterAttachableImpl<E> fai = new FilterAttachableImpl<>();
    private int statusRepeatCount = 0;
    private int exceptionCount = 0;

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void addFilter(Filter<E> filter) {
        this.fai.addFilter(filter);
    }

    public abstract void append(E e10);

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void clearAllFilters() {
        this.fai.clearAllFilters();
    }

    @Override // ch.qos.logback.core.Appender
    public void doAppend(E e10) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.guard.get())) {
            return;
        }
        try {
            try {
                this.guard.set(bool);
                if (!this.started) {
                    int i10 = this.statusRepeatCount;
                    this.statusRepeatCount = i10 + 1;
                    if (i10 < 3) {
                        addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
                    }
                } else if (getFilterChainDecision(e10) != FilterReply.DENY) {
                    append(e10);
                }
            } catch (Exception e11) {
                int i11 = this.exceptionCount;
                this.exceptionCount = i11 + 1;
                if (i11 < 3) {
                    addError("Appender [" + this.name + "] failed to append.", e11);
                }
            }
        } finally {
            this.guard.set(Boolean.FALSE);
        }
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public List<Filter<E>> getCopyOfAttachedFiltersList() {
        return this.fai.getCopyOfAttachedFiltersList();
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public FilterReply getFilterChainDecision(E e10) {
        return this.fai.getFilterChainDecision(e10);
    }

    @Override // ch.qos.logback.core.Appender
    public String getName() {
        return this.name;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.Appender
    public void setName(String str) {
        this.name = str;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[");
        return k.a(sb2, this.name, "]");
    }
}
