package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghs {
    private final zzfxs zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzghs(zzfxs zzfxsVar, int i10, String str, String str2, zzghr zzghrVar) {
        this.zza = zzfxsVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghs)) {
            return false;
        }
        zzghs zzghsVar = (zzghs) obj;
        return this.zza == zzghsVar.zza && this.zzb == zzghsVar.zzb && this.zzc.equals(zzghsVar.zzc) && this.zzd.equals(zzghsVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
