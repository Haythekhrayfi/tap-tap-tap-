package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqn implements zzgqu {
    private final zzgqu[] zza;

    public zzgqn(zzgqu... zzgquVarArr) {
        this.zza = zzgquVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgqu
    public final zzgqt zzb(Class cls) {
        zzgqu[] zzgquVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzgqu zzgquVar = zzgquVarArr[i10];
            if (zzgquVar.zzc(cls)) {
                return zzgquVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgqu
    public final boolean zzc(Class cls) {
        zzgqu[] zzgquVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzgquVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
