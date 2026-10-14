package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzff implements zzei {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzff(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzfe zzfeVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzfeVar);
            }
        }
    }

    private static zzfe zzm() {
        zzfe zzfeVar;
        List list = zza;
        synchronized (list) {
            zzfeVar = list.isEmpty() ? new zzfe(null) : (zzfe) list.remove(list.size() - 1);
        }
        return zzfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzb(int i10) {
        zzfe zzfeVarZzm = zzm();
        zzfeVarZzm.zzb(this.zzb.obtainMessage(i10), this);
        return zzfeVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzc(int i10, Object obj) {
        zzfe zzfeVarZzm = zzm();
        zzfeVarZzm.zzb(this.zzb.obtainMessage(i10, obj), this);
        return zzfeVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzd(int i10, int i11, int i12) {
        zzfe zzfeVarZzm = zzm();
        zzfeVarZzm.zzb(this.zzb.obtainMessage(1, i11, i12), this);
        return zzfeVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzk(zzeh zzehVar) {
        return ((zzfe) zzehVar).zzc(this.zzb);
    }
}
