package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;

/* JADX INFO: loaded from: classes2.dex */
final class zzpb {
    private final zzpa zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpb(AudioTrack audioTrack) {
        int i10 = zzfj.zza;
        this.zza = new zzpa(audioTrack);
        zzh(0);
    }

    private final void zzh(int i10) {
        this.zzb = i10;
        long j10 = AbstractComponentTracker.LINGERING_TIMEOUT;
        if (i10 == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzd = AbstractComponentTracker.LINGERING_TIMEOUT;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzd = j10;
    }

    @TargetApi(19)
    public final long zza() {
        return this.zza.zza();
    }

    @TargetApi(19)
    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    @TargetApi(19)
    public final boolean zzg(long j10) {
        zzpa zzpaVar = this.zza;
        if (j10 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j10;
        boolean zZzc = zzpaVar.zzc();
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (zZzc) {
                        return true;
                    }
                    zzh(0);
                    return false;
                }
                if (i10 == 3) {
                    if (!zZzc) {
                        return false;
                    }
                    zzh(0);
                    return true;
                }
            } else if (!zZzc) {
                zzh(0);
            } else if (this.zza.zza() > this.zzf) {
                zzh(2);
                return true;
            }
        } else {
            if (zZzc) {
                if (this.zza.zzb() < this.zzc) {
                    return false;
                }
                this.zzf = this.zza.zza();
                zzh(1);
                return true;
            }
            if (j10 - this.zzc > 500000) {
                zzh(3);
                return false;
            }
        }
        return zZzc;
    }
}
