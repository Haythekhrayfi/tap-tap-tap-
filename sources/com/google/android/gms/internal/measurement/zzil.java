package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzil {
    public static zzih zza(zzih zzihVar) {
        if ((zzihVar instanceof zzij) || (zzihVar instanceof zzii)) {
            return zzihVar;
        }
        return zzihVar instanceof Serializable ? new zzii(zzihVar) : new zzij(zzihVar);
    }

    public static zzih zzb(Object obj) {
        return new zzik(obj);
    }
}
