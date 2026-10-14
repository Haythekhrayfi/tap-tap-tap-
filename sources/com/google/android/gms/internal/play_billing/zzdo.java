package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzdo implements zzdc {
    private final zzdf zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzdo(zzdf zzdfVar, String str, Object[] objArr) {
        this.zza = zzdfVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.zzd = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final zzdf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final int zzc() {
        return (this.zzd & 1) != 0 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
