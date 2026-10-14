package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzafq {
    private final zzfa zza = new zzfa(8);
    private int zzb;

    private final long zzb(zzaax zzaaxVar) throws IOException {
        zzaam zzaamVar = (zzaam) zzaaxVar;
        int i10 = 0;
        zzaamVar.zzm(this.zza.zzH(), 0, 1, false);
        int i11 = this.zza.zzH()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        zzaamVar.zzm(this.zza.zzH(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.zza.zzH()[i10] & 255) + (i14 << 8);
        }
        this.zzb = i13 + 1 + this.zzb;
        return i14;
    }

    public final boolean zza(zzaax zzaaxVar) throws IOException {
        long jZzd = zzaaxVar.zzd();
        long j10 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j10 = jZzd;
        }
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(this.zza.zzH(), 0, 4, false);
        long jZzs = this.zza.zzs();
        this.zzb = 4;
        while (jZzs != 440786851) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzaamVar.zzm(this.zza.zzH(), 0, 1, false);
            jZzs = ((jZzs << 8) & (-256)) | ((long) (this.zza.zzH()[0] & 255));
        }
        long jZzb = zzb(zzaaxVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE && (jZzd == -1 || j11 + jZzb < jZzd)) {
            while (true) {
                long j12 = this.zzb;
                long j13 = j11 + jZzb;
                if (j12 < j13) {
                    if (zzb(zzaaxVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jZzb2 = zzb(zzaaxVar);
                    if (jZzb2 < 0) {
                        return false;
                    }
                    if (jZzb2 != 0) {
                        int i12 = (int) jZzb2;
                        zzaamVar.zzl(i12, false);
                        this.zzb += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
        }
        return false;
    }
}
