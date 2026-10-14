package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzakc implements zzakb {
    private final zzaaz zza;
    private final zzabz zzb;
    private final zzake zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzakc(zzaaz zzaazVar, zzabz zzabzVar, zzake zzakeVar, String str, int i10) throws zzcd {
        this.zza = zzaazVar;
        this.zzb = zzabzVar;
        this.zzc = zzakeVar;
        int i11 = zzakeVar.zzb * zzakeVar.zze;
        int i12 = zzakeVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzcd.zza("Expected block size: " + i13 + "; got: " + i12, null);
        }
        int i14 = zzakeVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        zzakVar.zzv(i15);
        zzakVar.zzO(i15);
        zzakVar.zzL(iMax);
        zzakVar.zzw(zzakeVar.zzb);
        zzakVar.zzT(zzakeVar.zzc);
        zzakVar.zzN(i10);
        this.zzd = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(int i10, long j10) {
        this.zza.zzN(new zzakh(this.zzc, 1, i10, j10));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final boolean zzc(zzaax zzaaxVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZza = zzabx.zza(this.zzb, zzaaxVar, (int) Math.min(i11 - i10, j11), true);
            if (iZza == -1) {
                j11 = 0;
            } else {
                this.zzg += iZza;
                j11 -= (long) iZza;
            }
        }
        zzake zzakeVar = this.zzc;
        int i12 = zzakeVar.zzd;
        int i13 = this.zzg / i12;
        if (i13 > 0) {
            long jZzp = this.zzf + zzfj.zzp(this.zzh, 1000000L, zzakeVar.zzc);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zzs(jZzp, 1, i14, i15, null);
            this.zzh += (long) i13;
            this.zzg = i15;
        }
        return j11 <= 0;
    }
}
