package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzic {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzic(float f10, float f11, long j10, float f12, long j11, long j12, float f13, zzib zzibVar) {
        this.zza = j11;
        this.zzb = j12;
    }

    private static long zzf(long j10, long j11, float f10) {
        return (long) ((j11 * 9.999871E-4f) + (j10 * 0.999f));
    }

    private final void zzg() {
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            long j11 = this.zzd;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.zzf;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.zzg;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j10, long j11) {
        long jZzf;
        long j12;
        float fMax = 1.0f;
        if (this.zzc != -9223372036854775807L) {
            long j13 = j10 - j11;
            long j14 = this.zzm;
            if (j14 == -9223372036854775807L) {
                this.zzm = j13;
                jZzf = 0;
            } else {
                long jMax = Math.max(j13, zzf(j14, j13, 0.999f));
                this.zzm = jMax;
                jZzf = zzf(this.zzn, Math.abs(j13 - jMax), 0.999f);
            }
            this.zzn = jZzf;
            if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long j15 = (this.zzn * 3) + this.zzm;
            if (this.zzh > j15) {
                float fZzo = zzfj.zzo(1000L);
                long[] jArr = {j15, this.zze, this.zzh - (((long) ((this.zzk - 1.0f) * fZzo)) + ((long) ((this.zzi - 1.0f) * fZzo)))};
                j12 = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j16 = jArr[i10];
                    if (j16 > j12) {
                        j12 = j16;
                    }
                }
                this.zzh = j12;
            } else {
                long jMax2 = Math.max(this.zzh, Math.min(j10 - ((long) (Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.zzk - 1.0f) / 1.0E-7f)), j15));
                this.zzh = jMax2;
                long j17 = this.zzg;
                if (j17 == -9223372036854775807L || jMax2 <= j17) {
                    j12 = jMax2;
                } else {
                    this.zzh = j17;
                    j12 = j17;
                }
            }
            long j18 = j10 - j12;
            fMax = Math.abs(j18) >= this.zza ? Math.max(this.zzj, Math.min((j18 * 1.0E-7f) + 1.0f, this.zzi)) : 1.0f;
            this.zzk = fMax;
        }
        return fMax;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzbf zzbfVar) {
        long j10 = zzbfVar.zzc;
        this.zzc = zzfj.zzo(-9223372036854775807L);
        this.zzf = zzfj.zzo(-9223372036854775807L);
        this.zzg = zzfj.zzo(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }
}
