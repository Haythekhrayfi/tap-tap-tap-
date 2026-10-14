package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbur extends zzbut {
    private final String zza;
    private final int zzb;

    public zzbur(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbur)) {
            zzbur zzburVar = (zzbur) obj;
            if (Objects.equal(this.zza, zzburVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzburVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final String zzc() {
        return this.zza;
    }
}
