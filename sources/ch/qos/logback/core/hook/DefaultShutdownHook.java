package ch.qos.logback.core.hook;

import ch.qos.logback.core.util.Duration;
import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public class DefaultShutdownHook extends ShutdownHookBase {
    public static final Duration DEFAULT_DELAY = Duration.buildByMilliseconds(0.0d);
    private Duration delay = DEFAULT_DELAY;

    public Duration getDelay() {
        return this.delay;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.delay.getMilliseconds() > 0) {
            StringBuilder sbA = a.a("Sleeping for ");
            sbA.append(this.delay);
            addInfo(sbA.toString());
            try {
                Thread.sleep(this.delay.getMilliseconds());
            } catch (InterruptedException unused) {
            }
        }
        super.stop();
    }

    public void setDelay(Duration duration) {
        this.delay = duration;
    }
}
