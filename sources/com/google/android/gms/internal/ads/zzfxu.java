package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxu {
    public static zzfxt zza(String str) throws GeneralSecurityException {
        zzfxt zzfxtVar = (zzfxt) zzfyp.zzd().get("AES128_GCM");
        if (zzfxtVar != null) {
            return zzfxtVar;
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}
