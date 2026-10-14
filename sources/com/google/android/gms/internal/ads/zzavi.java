package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavi {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzavi(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzavi)) {
            zzavi zzaviVar = (zzavi) obj;
            if (zzaviVar.zza == this.zza && zzaviVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
