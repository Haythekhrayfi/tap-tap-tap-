package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghl {
    private HashMap zza = new HashMap();

    public final zzghn zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzghn zzghnVar = new zzghn(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzghnVar;
    }
}
