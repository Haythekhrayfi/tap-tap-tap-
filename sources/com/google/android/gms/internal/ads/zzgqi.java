package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqi extends zzgqk {
    private zzgqi() {
        super(null);
    }

    public /* synthetic */ zzgqi(zzgqh zzgqhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final List zza(Object obj, long j10) {
        zzgpv zzgpvVar = (zzgpv) zzgsq.zzh(obj, j10);
        if (zzgpvVar.zzc()) {
            return zzgpvVar;
        }
        int size = zzgpvVar.size();
        zzgpv zzgpvVarZzd = zzgpvVar.zzd(size == 0 ? 10 : size + size);
        zzgsq.zzv(obj, j10, zzgpvVarZzd);
        return zzgpvVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final void zzb(Object obj, long j10) {
        ((zzgpv) zzgsq.zzh(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgpv zzgpvVarZzd = (zzgpv) zzgsq.zzh(obj, j10);
        zzgpv zzgpvVar = (zzgpv) zzgsq.zzh(obj2, j10);
        int size = zzgpvVarZzd.size();
        int size2 = zzgpvVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzgpvVarZzd.zzc()) {
                zzgpvVarZzd = zzgpvVarZzd.zzd(size2 + size);
            }
            zzgpvVarZzd.addAll(zzgpvVar);
        }
        if (size > 0) {
            zzgpvVar = zzgpvVarZzd;
        }
        zzgsq.zzv(obj, j10, zzgpvVar);
    }
}
