package org.joda.time;

import androidx.activity.j;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j10, String str) {
        super(createMessage(j10, str));
    }

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j10, String str) {
        return j.a("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j10)), str != null ? j.a(" (", str, ")") : "");
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }
}
