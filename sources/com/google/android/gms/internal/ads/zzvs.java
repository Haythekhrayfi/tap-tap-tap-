package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvs {
    public final long zza;
    public final long zzb;

    public zzvs(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvs)) {
            return false;
        }
        zzvs zzvsVar = (zzvs) obj;
        return this.zza == zzvsVar.zza && this.zzb == zzvsVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
