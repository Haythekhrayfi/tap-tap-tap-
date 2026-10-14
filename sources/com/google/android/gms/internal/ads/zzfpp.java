package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpp extends zzfps {
    public final /* synthetic */ zzfpq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpp(zzfpq zzfpqVar, zzfpu zzfpuVar, CharSequence charSequence) {
        super(zzfpuVar, charSequence);
        this.zza = zzfpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final int zzc(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final int zzd(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzfps) this).zzb.length()) {
            return i11;
        }
        return -1;
    }
}
