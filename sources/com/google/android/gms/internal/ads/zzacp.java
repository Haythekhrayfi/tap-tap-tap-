package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzacp {
    public final zzabz zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzacp(int i10, int i11, long j10, int i12, zzabz zzabzVar) {
        i11 = i11 != 1 ? 2 : i11;
        this.zzd = j10;
        this.zze = i12;
        this.zza = zzabzVar;
        this.zzb = zzi(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.zzc = i11 == 2 ? zzi(i10, 1650720768) : -1;
        this.zzk = new long[512];
        this.zzl = new int[512];
    }

    private static int zzi(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzj(int i10) {
        return (this.zzd * ((long) i10)) / ((long) this.zze);
    }

    private final zzabw zzk(int i10) {
        return new zzabw(((long) this.zzl[i10]) * zzj(1), this.zzk[i10]);
    }

    public final zzabt zza(long j10) {
        int iZzj = (int) (j10 / zzj(1));
        int iZzb = zzfj.zzb(this.zzl, iZzj, true, true);
        if (this.zzl[iZzb] == iZzj) {
            zzabw zzabwVarZzk = zzk(iZzb);
            return new zzabt(zzabwVarZzk, zzabwVarZzk);
        }
        zzabw zzabwVarZzk2 = zzk(iZzb);
        int i10 = iZzb + 1;
        return i10 < this.zzk.length ? new zzabt(zzabwVarZzk2, zzk(i10)) : new zzabt(zzabwVarZzk2, zzabwVarZzk2);
    }

    public final void zzb(long j10) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i10 = this.zzj;
        jArr2[i10] = j10;
        this.zzl[i10] = this.zzi;
        this.zzj = i10 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i10) {
        this.zzf = i10;
        this.zzg = i10;
    }

    public final void zzf(long j10) {
        int i10;
        if (this.zzj == 0) {
            i10 = 0;
        } else {
            i10 = this.zzl[zzfj.zzc(this.zzk, j10, true, true)];
        }
        this.zzh = i10;
    }

    public final boolean zzg(int i10) {
        return this.zzb == i10 || this.zzc == i10;
    }

    public final boolean zzh(zzaax zzaaxVar) throws IOException {
        int i10 = this.zzg;
        int iZze = i10 - this.zza.zze(zzaaxVar, i10, false);
        this.zzg = iZze;
        boolean z10 = iZze == 0;
        if (z10) {
            if (this.zzf > 0) {
                this.zza.zzs(zzj(this.zzh), Arrays.binarySearch(this.zzl, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z10;
    }
}
