package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgng {
    private static final ThreadLocal zza = new zzgnf();

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
