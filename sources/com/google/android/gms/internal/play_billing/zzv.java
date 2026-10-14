package com.google.android.gms.internal.play_billing;

import androidx.fragment.app.d0;
import q2.a;

/* JADX INFO: loaded from: classes2.dex */
final class zzv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzv(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(d0.a(a.a("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
