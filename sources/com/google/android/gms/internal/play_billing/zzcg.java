package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcg {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final Charset zzb = Charset.forName("UTF-8");
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzbe zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzbe.zza;
        zzbc zzbcVar = new zzbc(bArr, 0, 0, false, null);
        try {
            zzbcVar.zza(0);
            zzf = zzbcVar;
        } catch (zzci e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object zzc(Object obj, String str) {
        Objects.requireNonNull(obj, "messageType");
        return obj;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
