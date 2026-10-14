package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyd {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfyc zza(String str) throws GeneralSecurityException {
        for (zzfyc zzfycVar : zza) {
            if (zzfycVar.zza()) {
                return zzfycVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
