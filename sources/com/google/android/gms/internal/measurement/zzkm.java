package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkm {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final Charset zzb = Charset.forName("UTF-8");
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzjh zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzjh.zza;
        zzjf zzjfVar = new zzjf(bArr, 0, 0, false, null);
        try {
            zzjfVar.zza(0);
            zzf = zzjfVar;
        } catch (zzko e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int iZzd = zzd(length, bArr, 0, length);
        if (iZzd == 0) {
            return 1;
        }
        return iZzd;
    }

    public static int zzc(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int zzd(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object zze(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object zzf(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static Object zzg(Object obj, Object obj2) {
        return ((zzll) obj).zzbG().zzay((zzll) obj2).zzaG();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(byte[] bArr) {
        return zznc.zze(bArr);
    }
}
