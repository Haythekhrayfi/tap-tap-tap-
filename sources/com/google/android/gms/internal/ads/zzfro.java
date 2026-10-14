package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfro extends zzfrr {
    public zzfro() {
        super(null);
    }

    public static final zzfrr zzf(int i10) {
        if (i10 < 0) {
            return zzfrr.zzb;
        }
        return i10 > 0 ? zzfrr.zzc : zzfrr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zzb(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        return zzf(i12);
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zzd(boolean z10, boolean z11) {
        return zzf(zzfuj.zza(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final zzfrr zze(boolean z10, boolean z11) {
        return zzf(zzfuj.zza(false, false));
    }
}
