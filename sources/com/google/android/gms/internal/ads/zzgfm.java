package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfm {
    public static final Charset zza = Charset.forName("UTF-8");

    public static final zzgnk zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzgfl("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zzgnk.zzb(bArr);
    }
}
