package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzcr extends zzct {
    private zzcr() {
        super(null);
    }

    public /* synthetic */ zzcr(zzcq zzcqVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zza(Object obj, long j10) {
        ((zzcf) zzeq.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zzb(Object obj, Object obj2, long j10) {
        zzcf zzcfVarZzd = (zzcf) zzeq.zzf(obj, j10);
        zzcf zzcfVar = (zzcf) zzeq.zzf(obj2, j10);
        int size = zzcfVarZzd.size();
        int size2 = zzcfVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzcfVarZzd.zzc()) {
                zzcfVarZzd = zzcfVarZzd.zzd(size2 + size);
            }
            zzcfVarZzd.addAll(zzcfVar);
        }
        if (size > 0) {
            zzcfVar = zzcfVarZzd;
        }
        zzeq.zzs(obj, j10, zzcfVar);
    }
}
