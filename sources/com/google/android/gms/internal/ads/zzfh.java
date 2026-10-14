package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfh {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfh(long j10) {
        zzf(0L);
    }

    public final synchronized long zza(long j10) {
        if (this.zzb == -9223372036854775807L) {
            long jLongValue = this.zza;
            if (jLongValue == 9223372036854775806L) {
                Long l10 = (Long) this.zzd.get();
                Objects.requireNonNull(l10);
                jLongValue = l10.longValue();
            }
            this.zzb = jLongValue - j10;
            notifyAll();
        }
        this.zzc = j10;
        return j10 + this.zzb;
    }

    public final synchronized long zzb(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = (((-1) + j13) * 8589934592L) + j10;
            long j15 = (j13 * 8589934592L) + j10;
            j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
        }
        return zza((j10 * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j10 = this.zza;
        if (j10 == RecyclerView.FOREVER_NS || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long zzd() {
        long j10;
        j10 = this.zzc;
        return j10 != -9223372036854775807L ? j10 + this.zzb : zzc();
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j10) {
        this.zza = j10;
        this.zzb = j10 == RecyclerView.FOREVER_NS ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
