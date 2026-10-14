package com.google.android.gms.internal.ads;

import android.support.v4.media.session.e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabw {
    public static final zzabw zza = new zzabw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzabw(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabw.class == obj.getClass()) {
            zzabw zzabwVar = (zzabw) obj;
            if (this.zzb == zzabwVar.zzb && this.zzc == zzabwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        return e.a(i2.a.a("[timeUs=", j10, ", position="), this.zzc, "]");
    }
}
