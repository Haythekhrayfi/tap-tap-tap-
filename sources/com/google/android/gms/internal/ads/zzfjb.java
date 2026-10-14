package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjb {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfjb(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfjb zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(z10 ? new Runnable() { // from class: com.google.android.gms.internal.ads.zzfix
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.setResult(zzfld.zzb(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.setResult(zzfld.zzc());
            }
        });
        return new zzfjb(context, executor, taskCompletionSource.getTask(), z10);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfiz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        final zzanc zzancVarZza = zzang.zza();
        zzancVarZza.zza(this.zzb.getPackageName());
        zzancVarZza.zze(j10);
        zzancVarZza.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzancVarZza.zzf(stringWriter.toString());
            zzancVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzancVarZza.zzb(str2);
        }
        if (str != null) {
            zzancVarZza.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzanc zzancVar = zzancVarZza;
                int i11 = i10;
                int i12 = zzfjb.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                zzflc zzflcVarZza = ((zzfld) task.getResult()).zza(((zzang) zzancVar.zzal()).zzax());
                zzflcVarZza.zza(i11);
                zzflcVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public final Task zze(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }
}
