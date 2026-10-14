package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmt extends zzfnm {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfnm
    public final zzfnm zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnm
    public final zzfnm zzb(int i10) {
        this.zza = i10;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnm
    public final zzfnn zzc() {
        if (this.zzc == 1) {
            return new zzfmv(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
