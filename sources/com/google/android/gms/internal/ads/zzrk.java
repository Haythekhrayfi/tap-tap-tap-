package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzrk {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j10) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j10) + this.zza;
    }

    public final long zza(zzam zzamVar) {
        return zzd(zzamVar.zzA);
    }

    public final long zzb(zzam zzamVar, zzhp zzhpVar) {
        if (this.zzb == 0) {
            this.zza = zzhpVar.zzd;
        }
        if (this.zzc) {
            return zzhpVar.zzd;
        }
        ByteBuffer byteBuffer = zzhpVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iZzc = zzabq.zzc(i10);
        if (iZzc != -1) {
            long jZzd = zzd(zzamVar.zzA);
            this.zzb += (long) iZzc;
            return jZzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzhpVar.zzd;
        zzer.zzf("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzhpVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
