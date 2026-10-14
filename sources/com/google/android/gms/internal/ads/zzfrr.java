package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfrr {
    private static final zzfrr zza = new zzfro();
    private static final zzfrr zzb = new zzfrp(-1);
    private static final zzfrr zzc = new zzfrp(1);

    public /* synthetic */ zzfrr(zzfrq zzfrqVar) {
    }

    public static zzfrr zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfrr zzb(int i10, int i11);

    public abstract zzfrr zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfrr zzd(boolean z10, boolean z11);

    public abstract zzfrr zze(boolean z10, boolean z11);
}
