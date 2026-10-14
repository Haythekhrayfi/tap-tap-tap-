package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdh {
    private final zzfsc zzd;
    public static final zzdh zza = new zzdh(zzfsc.zzl());
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzde
    };

    public zzdh(List list) {
        this.zzd = zzfsc.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdh.class != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzdh) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfsc zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            zzdg zzdgVar = (zzdg) this.zzd.get(i11);
            if (zzdgVar.zzc() && zzdgVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
