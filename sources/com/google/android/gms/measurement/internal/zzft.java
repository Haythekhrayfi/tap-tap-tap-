package com.google.android.gms.measurement.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
final class zzft extends FutureTask implements Comparable {
    public final boolean zza;
    public final /* synthetic */ zzfv zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfvVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.zzb = zzfvVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            a.a(zzfvVar.zzs, "Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfvVar, Callable callable, boolean z10, String str) {
        super(callable);
        this.zzb = zzfvVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            a.a(zzfvVar.zzs, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzft zzftVar = (zzft) obj;
        boolean z10 = this.zza;
        if (z10 != zzftVar.zza) {
            return !z10 ? 1 : -1;
        }
        long j10 = this.zzc;
        long j11 = zzftVar.zzc;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfr) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
