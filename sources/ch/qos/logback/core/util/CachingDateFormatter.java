package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class CachingDateFormatter {
    public String cachedStr;
    public long lastTimestamp;
    public final SimpleDateFormat sdf;

    public CachingDateFormatter(String str) {
        this(str, Locale.US);
    }

    public CachingDateFormatter(String str, Locale locale) {
        this.lastTimestamp = -1L;
        this.cachedStr = null;
        this.sdf = new SimpleDateFormat(str, locale);
    }

    public final String format(long j10) {
        String str;
        synchronized (this) {
            if (j10 != this.lastTimestamp) {
                this.lastTimestamp = j10;
                this.cachedStr = this.sdf.format(new Date(j10));
            }
            str = this.cachedStr;
        }
        return str;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.sdf.setTimeZone(timeZone);
    }
}
