package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.Objects;
import org.slf4j.Marker;
import p2.a;

/* JADX INFO: loaded from: classes.dex */
public class DuplicateMessageFilter extends TurboFilter {
    public static final int DEFAULT_ALLOWED_REPETITIONS = 5;
    public static final int DEFAULT_CACHE_SIZE = 100;
    public int allowedRepetitions = 5;
    public int cacheSize = 100;
    private a msgCache;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        Integer numValueOf;
        a aVar = this.msgCache;
        Objects.requireNonNull(aVar);
        int iIntValue = 0;
        if (str != null) {
            synchronized (aVar) {
                Integer num = aVar.get(str);
                numValueOf = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
                aVar.put(str, numValueOf);
            }
            iIntValue = numValueOf.intValue();
        }
        return iIntValue <= this.allowedRepetitions ? FilterReply.NEUTRAL : FilterReply.DENY;
    }

    public int getAllowedRepetitions() {
        return this.allowedRepetitions;
    }

    public int getCacheSize() {
        return this.cacheSize;
    }

    public void setAllowedRepetitions(int i10) {
        this.allowedRepetitions = i10;
    }

    public void setCacheSize(int i10) {
        this.cacheSize = i10;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.msgCache = new a(this.cacheSize);
        super.start();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.msgCache.clear();
        this.msgCache = null;
        super.stop();
    }
}
