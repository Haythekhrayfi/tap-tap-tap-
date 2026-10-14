package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzajl implements zzaah {
    private final zzfh zza;
    private final zzfa zzb = new zzfa();
    private final int zzc;

    public zzajl(int i10, zzfh zzfhVar, int i11) {
        this.zzc = i10;
        this.zza = zzfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzaag zza(zzaax zzaaxVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long j11;
        long jZzf = zzaaxVar.zzf();
        int iMin = (int) Math.min(112800L, zzaaxVar.zzd() - jZzf);
        this.zzb.zzC(iMin);
        ((zzaam) zzaaxVar).zzm(this.zzb.zzH(), 0, iMin, false);
        zzfa zzfaVar = this.zzb;
        int iZzd = zzfaVar.zzd();
        long j12 = -1;
        long j13 = -9223372036854775807L;
        long j14 = -1;
        while (zzfaVar.zza() >= 188 && (iZza2 = (iZza = zzajx.zza(zzfaVar.zzH(), zzfaVar.zzc(), iZzd)) + 188) <= iZzd) {
            long jZzb = zzajx.zzb(zzfaVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j10) {
                    if (j13 == -9223372036854775807L) {
                        return zzaag.zzd(jZzb2, jZzf);
                    }
                    j11 = jZzf + j14;
                } else if (100000 + jZzb2 > j10) {
                    j11 = jZzf + ((long) iZza);
                } else {
                    j14 = iZza;
                    j13 = jZzb2;
                }
                return zzaag.zze(j11);
            }
            zzfaVar.zzF(iZza2);
            j12 = iZza2;
        }
        return j13 != -9223372036854775807L ? zzaag.zzf(j13, jZzf + j12) : zzaag.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() {
        zzfa zzfaVar = this.zzb;
        byte[] bArr = zzfj.zzf;
        int length = bArr.length;
        zzfaVar.zzD(bArr, 0);
    }
}
