package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfb {
    public static final zzfb zza = new zzfb(-1, -1);
    public static final zzfb zzb = new zzfb(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfb(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfb) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zzc == zzfbVar.zzc && this.zzd == zzfbVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        int i11 = this.zzc;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
