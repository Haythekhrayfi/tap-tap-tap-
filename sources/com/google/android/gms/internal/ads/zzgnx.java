package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnx extends zzgoa {
    private final int zzc;
    private final int zzd;

    public zzgnx(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgoe.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa, com.google.android.gms.internal.ads.zzgoe
    public final byte zza(int i10) {
        zzgoe.zzy(i10, this.zzd);
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgoa, com.google.android.gms.internal.ads.zzgoe
    public final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa, com.google.android.gms.internal.ads.zzgoe
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa, com.google.android.gms.internal.ads.zzgoe
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc + i10, bArr, i11, i12);
    }
}
