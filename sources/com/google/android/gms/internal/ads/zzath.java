package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzath implements Callable {
    public final String zza = getClass().getSimpleName();
    public final zzart zzb;
    public final String zzc;
    public final String zzd;
    public final zzanq zze;
    public Method zzf;
    public final int zzg;
    public final int zzh;

    public zzath(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        this.zzb = zzartVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzanqVar;
        this.zzg = i10;
        this.zzh = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzaqn zzaqnVarZzd = this.zzb.zzd();
            if (zzaqnVarZzd != null && (i10 = this.zzg) != Integer.MIN_VALUE) {
                zzaqnVarZzd.zzc(this.zzh, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }
}
