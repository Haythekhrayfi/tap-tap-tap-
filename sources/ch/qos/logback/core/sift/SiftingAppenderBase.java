package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.ComponentTracker;
import ch.qos.logback.core.util.Duration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class SiftingAppenderBase<E> extends AppenderBase<E> {
    public AppenderFactory<E> appenderFactory;
    public AppenderTracker<E> appenderTracker;
    public Discriminator<E> discriminator;
    public Duration timeout = new Duration(ComponentTracker.DEFAULT_TIMEOUT);
    public int maxAppenderCount = Integer.MAX_VALUE;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e10) {
        if (isStarted()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e10);
            long timestamp = getTimestamp(e10);
            Appender<E> orCreate = this.appenderTracker.getOrCreate(discriminatingValue, timestamp);
            if (eventMarksEndOfLife(e10)) {
                this.appenderTracker.endOfLife(discriminatingValue);
            }
            this.appenderTracker.removeStaleComponents(timestamp);
            orCreate.doAppend(e10);
        }
    }

    public abstract boolean eventMarksEndOfLife(E e10);

    public AppenderTracker<E> getAppenderTracker() {
        return this.appenderTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getDiscriminatorKey() {
        Discriminator<E> discriminator = this.discriminator;
        if (discriminator != null) {
            return discriminator.getKey();
        }
        return null;
    }

    public int getMaxAppenderCount() {
        return this.maxAppenderCount;
    }

    public Duration getTimeout() {
        return this.timeout;
    }

    public abstract long getTimestamp(E e10);

    public void setAppenderFactory(AppenderFactory<E> appenderFactory) {
        this.appenderFactory = appenderFactory;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setMaxAppenderCount(int i10) {
        this.maxAppenderCount = i10;
    }

    public void setTimeout(Duration duration) {
        this.timeout = duration;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i10;
        if (this.discriminator == null) {
            addError("Missing discriminator. Aborting");
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.discriminator.isStarted()) {
            addError("Discriminator has not started successfully. Aborting");
            i10++;
        }
        AppenderFactory<E> appenderFactory = this.appenderFactory;
        if (appenderFactory == null) {
            addError("AppenderFactory has not been set. Aborting");
            i10++;
        } else {
            AppenderTracker<E> appenderTracker = new AppenderTracker<>(this.context, appenderFactory);
            this.appenderTracker = appenderTracker;
            appenderTracker.setMaxComponents(this.maxAppenderCount);
            this.appenderTracker.setTimeout(this.timeout.getMilliseconds());
        }
        if (i10 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        Iterator<Appender<E>> it = this.appenderTracker.allComponents().iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
    }
}
