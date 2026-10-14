package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.b.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabp {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iA;
        int i18;
        int i19;
        int i20;
        if (!zzabq.zzm(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i11;
        this.zzb = zzabq.zza[3 - i12];
        int i21 = zzabq.zzb[i14];
        this.zzd = i21;
        if (i11 != 2) {
            if (i11 == 0) {
                i21 /= 4;
            }
            i15 = (i10 >>> 9) & 1;
            this.zzg = zzabq.zzl(i11, i12);
            if (i12 == 3) {
                i19 = i13 - 1;
                if (i11 == 3) {
                    i20 = zzabq.zzc[i19];
                } else {
                    i20 = zzabq.zzd[i19];
                }
                this.zzf = i20;
                iA = (((i20 * 12) / i21) + i15) * 4;
            } else {
                i16 = SyslogConstants.LOG_LOCAL2;
                i17 = i13 - 1;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i18 = zzabq.zze[i17];
                    } else {
                        i18 = zzabq.zzf[i17];
                    }
                    this.zzf = i18;
                    iA = h0.a(i18, SyslogConstants.LOG_LOCAL2, i21, i15);
                } else {
                    int i22 = zzabq.zzg[i17];
                    this.zzf = i22;
                    if (i12 == 1) {
                        i16 = 72;
                    }
                    iA = h0.a(i16, i22, i21, i15);
                }
            }
            this.zzc = iA;
            this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
        i21 /= 2;
        this.zzd = i21;
        i15 = (i10 >>> 9) & 1;
        this.zzg = zzabq.zzl(i11, i12);
        if (i12 == 3) {
            i19 = i13 - 1;
            if (i11 == 3) {
                i20 = zzabq.zzc[i19];
            } else {
                i20 = zzabq.zzd[i19];
            }
            this.zzf = i20;
            iA = (((i20 * 12) / i21) + i15) * 4;
        } else {
            i16 = SyslogConstants.LOG_LOCAL2;
            i17 = i13 - 1;
            if (i11 == 3) {
                if (i12 == 2) {
                    i18 = zzabq.zze[i17];
                } else {
                    i18 = zzabq.zzf[i17];
                }
                this.zzf = i18;
                iA = h0.a(i18, SyslogConstants.LOG_LOCAL2, i21, i15);
            } else {
                int i23 = zzabq.zzg[i17];
                this.zzf = i23;
                if (i12 == 1) {
                    i16 = 72;
                }
                iA = h0.a(i16, i23, i21, i15);
            }
        }
        this.zzc = iA;
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
