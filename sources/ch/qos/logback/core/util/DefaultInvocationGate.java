package ch.qos.logback.core.util;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {
    public static final int DEFAULT_MASK = 15;
    public static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    private long invocationCounter;
    public long lowerLimitForMaskMatch;
    private volatile long mask;
    private long maxDelayThreshold;
    private long minDelayThreshold;
    public long upperLimitForNoMaskMatch;

    public DefaultInvocationGate() {
        this(100L, MASK_DECREASE_THRESHOLD, System.currentTimeMillis());
    }

    public DefaultInvocationGate(long j10, long j11, long j12) {
        this.mask = 15L;
        this.invocationCounter = 0L;
        this.minDelayThreshold = j10;
        this.maxDelayThreshold = j11;
        this.lowerLimitForMaskMatch = j10 + j12;
        this.upperLimitForNoMaskMatch = j12 + j11;
    }

    private void decreaseMask() {
        this.mask >>>= 2;
    }

    private void increaseMask() {
        if (this.mask >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        this.mask = (this.mask << 1) | 1;
    }

    private void updateLimits(long j10) {
        this.lowerLimitForMaskMatch = this.minDelayThreshold + j10;
        this.upperLimitForNoMaskMatch = j10 + this.maxDelayThreshold;
    }

    public long getInvocationCounter() {
        return this.invocationCounter;
    }

    public long getMask() {
        return this.mask;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j10) {
        long j11 = this.invocationCounter;
        this.invocationCounter = 1 + j11;
        boolean z10 = (j11 & this.mask) == this.mask;
        if (z10) {
            if (j10 < this.lowerLimitForMaskMatch) {
                increaseMask();
            }
            updateLimits(j10);
        } else if (j10 > this.upperLimitForNoMaskMatch) {
            decreaseMask();
            updateLimits(j10);
            return false;
        }
        return !z10;
    }
}
