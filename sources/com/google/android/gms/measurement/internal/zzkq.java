package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzkq implements zzeq {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzkz zzb;

    public zzkq(zzkz zzkzVar, String str) {
        this.zzb = zzkzVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zza(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i10, th, bArr, this.zza);
    }
}
