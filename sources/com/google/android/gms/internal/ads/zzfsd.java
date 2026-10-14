package com.google.android.gms.internal.ads;

import androidx.fragment.app.d0;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsd {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzfsd(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(d0.a(q2.a.a("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
