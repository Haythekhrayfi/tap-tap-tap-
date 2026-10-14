package ch.qos.logback.core.recovery;

/* JADX INFO: loaded from: classes.dex */
public class RecoveryCoordinator {
    public static long BACKOFF_COEFFICIENT_MAX = 327680;
    public static final long BACKOFF_COEFFICIENT_MIN = 20;
    public static long BACKOFF_MULTIPLIER = 4;
    private static long UNSET = -1;
    private long backOffCoefficient;
    private long currentTime;
    private long next;

    public RecoveryCoordinator() {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    public RecoveryCoordinator(long j10) {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.currentTime = j10;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    private long getBackoffCoefficient() {
        long j10 = this.backOffCoefficient;
        if (j10 < BACKOFF_COEFFICIENT_MAX) {
            this.backOffCoefficient = BACKOFF_MULTIPLIER * j10;
        }
        return j10;
    }

    private long getCurrentTime() {
        long j10 = this.currentTime;
        return j10 != UNSET ? j10 : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long currentTime = getCurrentTime();
        if (currentTime <= this.next) {
            return true;
        }
        this.next = currentTime + getBackoffCoefficient();
        return false;
    }

    public void setCurrentTime(long j10) {
        this.currentTime = j10;
    }
}
