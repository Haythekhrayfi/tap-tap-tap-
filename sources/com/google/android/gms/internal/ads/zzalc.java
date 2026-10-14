package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalc {
    private final String zza;
    private final String zzb;

    public zzalc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzalc.class == obj.getClass()) {
            zzalc zzalcVar = (zzalc) obj;
            if (TextUtils.equals(this.zza, zzalcVar.zza) && TextUtils.equals(this.zzb, zzalcVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return q.a("Header[name=", this.zza, ",value=", this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
