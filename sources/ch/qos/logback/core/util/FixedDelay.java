package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDelay(int i10) {
        long j10 = i10;
        this(j10, j10);
    }

    public FixedDelay(long j10, long j11) {
        this.nextDelay = j10;
        this.subsequentDelay = j11;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j10 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j10;
    }
}
