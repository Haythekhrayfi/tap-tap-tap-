package com.google.android.gms.common.stats;

import android.support.v4.media.session.e;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public interface Types {

        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long jZzc = zzc();
        int iZza = zza();
        long jZzb = zzb();
        String strZzd = zzd();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jZzc);
        sb2.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb2.append(iZza);
        sb2.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        return e.a(sb2, jZzb, strZzd);
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    public abstract String zzd();
}
