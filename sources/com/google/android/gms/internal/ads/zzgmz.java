package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmz {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(i10 >> 4));
            sb2.append("0123456789abcdef".charAt(i10 & 15));
        }
        return sb2.toString();
    }
}
