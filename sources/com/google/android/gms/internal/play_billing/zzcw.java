package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzcw implements zzdd {
    private final zzdd[] zza;

    public zzcw(zzdd... zzddVarArr) {
        this.zza = zzddVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final zzdc zzb(Class cls) {
        zzdd[] zzddVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzdd zzddVar = zzddVarArr[i10];
            if (zzddVar.zzc(cls)) {
                return zzddVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final boolean zzc(Class cls) {
        zzdd[] zzddVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzddVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
