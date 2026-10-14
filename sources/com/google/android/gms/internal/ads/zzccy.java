package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzccy extends zzams {
    public static final zzccy zzb = new zzccy();

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzamw zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzamy();
        }
        return "mvhd".equals(str) ? new zzamz() : new zzana(str);
    }
}
