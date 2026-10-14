package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabr {
    public static int zza(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get(26) + Ascii.ESC;
        return (int) ((zze(byteBuffer.get(i10), byteBuffer.limit() > 1 ? byteBuffer.get(i10 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (int) ((zze(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzc(byte[] bArr) {
        return zze(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zzd(byte[] bArr) {
        int i10 = bArr[11] & 255;
        int i11 = bArr[10] & 255;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzg(zzf((i10 << 8) | i11)));
        arrayList.add(zzg(zzf(3840L)));
        return arrayList;
    }

    private static long zze(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = b11 & 63;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i15 & 1);
        } else {
            i10 = i15 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i15;
        }
        return ((long) i13) * ((long) i10);
    }

    private static long zzf(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzg(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
