package com.google.android.gms.internal.ads;

import androidx.activity.j;
import ch.qos.logback.classic.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzid implements zzkk {
    private final zzxp zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zzid() {
        zzxp zzxpVar = new zzxp(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(Level.TRACE_INT, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, Level.TRACE_INT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzxpVar;
        this.zzc = zzfj.zzo(50000L);
        this.zzd = zzfj.zzo(50000L);
        this.zze = zzfj.zzo(2500L);
        this.zzf = zzfj.zzo(5000L);
        this.zzh = 13107200;
        this.zzg = zzfj.zzo(0L);
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        zzdy.zze(i10 >= i11, j.a(str, " cannot be less than ", str2));
    }

    private final void zzk(boolean z10) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zze(zzcw zzcwVar, zzbw zzbwVar, zzli[] zzliVarArr, zzvn zzvnVar, zzxa[] zzxaVarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzliVarArr.length;
            if (i10 >= 2) {
                int iMax = Math.max(13107200, i11);
                this.zzh = iMax;
                this.zzb.zzf(iMax);
                return;
            } else {
                if (zzxaVarArr[i10] != null) {
                    i11 += zzliVarArr[i10].zzb() != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzg(long j10, long j11, float f10) {
        int iZza = this.zzb.zza();
        int i10 = this.zzh;
        long jMin = this.zzc;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfj.zzm(jMin, f10), this.zzd);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z10 = iZza < i10;
            this.zzi = z10;
            if (!z10 && j11 < 500000) {
                zzer.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzd || iZza >= i10) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzh(zzcw zzcwVar, zzbw zzbwVar, long j10, float f10, boolean z10, long j11) {
        long jZzn = zzfj.zzn(j10, f10);
        long jMin = z10 ? this.zzf : this.zze;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || jZzn >= jMin || this.zzb.zza() >= this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzxp zzi() {
        return this.zzb;
    }
}
