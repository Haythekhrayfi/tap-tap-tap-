package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.b.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabq {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!zzm(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = zzb[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        int i18 = i13 - 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? zzc[i18] : zzd[i18]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? zze[i18] : zzf[i18];
        } else {
            i15 = zzg[i18];
        }
        int i19 = SyslogConstants.LOG_LOCAL2;
        if (i11 == 3) {
            return h0.a(i15, SyslogConstants.LOG_LOCAL2, i16, i17);
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return h0.a(i19, i15, i16, i17);
    }

    public static int zzc(int i10) {
        int i11;
        int i12;
        if (!zzm(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = i10 >>> 12;
        int i14 = (i10 >>> 10) & 3;
        int i15 = i13 & 15;
        if (i15 == 0 || i15 == 15 || i14 == 3) {
            return -1;
        }
        return zzl(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i10, int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 384 : 1152;
        }
        return i10 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }
}
