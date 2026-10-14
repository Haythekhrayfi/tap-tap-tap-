package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzkx extends zzkz {
    private zzkx() {
        super(null);
    }

    public /* synthetic */ zzkx(zzkw zzkwVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zza(Object obj, long j10) {
        ((zzkl) zzmx.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zzb(Object obj, Object obj2, long j10) {
        zzkl zzklVarZzd = (zzkl) zzmx.zzf(obj, j10);
        zzkl zzklVar = (zzkl) zzmx.zzf(obj2, j10);
        int size = zzklVarZzd.size();
        int size2 = zzklVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzklVarZzd.zzc()) {
                zzklVarZzd = zzklVarZzd.zzd(size2 + size);
            }
            zzklVarZzd.addAll(zzklVar);
        }
        if (size > 0) {
            zzklVar = zzklVarZzd;
        }
        zzmx.zzs(obj, j10, zzklVar);
    }
}
