package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzacv implements zzaah {
    private final zzabj zza;
    private final int zzb;
    private final zzabe zzc = new zzabe();

    public /* synthetic */ zzacv(zzabj zzabjVar, int i10, zzacu zzacuVar) {
        this.zza = zzabjVar;
        this.zzb = i10;
    }

    private final long zzc(zzaax zzaaxVar) throws IOException {
        while (zzaaxVar.zze() < zzaaxVar.zzd() - 6) {
            zzabj zzabjVar = this.zza;
            int i10 = this.zzb;
            zzabe zzabeVar = this.zzc;
            long jZze = zzaaxVar.zze();
            byte[] bArr = new byte[2];
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzaaxVar.zzj();
                zzaamVar.zzl((int) (jZze - zzaaxVar.zzf()), false);
            } else {
                zzfa zzfaVar = new zzfa(16);
                System.arraycopy(bArr, 0, zzfaVar.zzH(), 0, 2);
                zzfaVar.zzE(zzaba.zza(zzaaxVar, zzfaVar.zzH(), 2, 14));
                zzaaxVar.zzj();
                zzaamVar.zzl((int) (jZze - zzaaxVar.zzf()), false);
                if (zzabf.zzc(zzfaVar, zzabjVar, i10, zzabeVar)) {
                    break;
                }
            }
            zzaamVar.zzl(1, false);
        }
        if (zzaaxVar.zze() < zzaaxVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzaam) zzaaxVar).zzl((int) (zzaaxVar.zzd() - zzaaxVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzaag zza(zzaax zzaaxVar, long j10) throws IOException {
        long jZzf = zzaaxVar.zzf();
        long jZzc = zzc(zzaaxVar);
        long jZze = zzaaxVar.zze();
        ((zzaam) zzaaxVar).zzl(Math.max(6, this.zza.zzc), false);
        long jZzc2 = zzc(zzaaxVar);
        long jZze2 = zzaaxVar.zze();
        if (jZzc > j10 || jZzc2 <= j10) {
            return jZzc2 <= j10 ? zzaag.zzf(jZzc2, jZze2) : zzaag.zzd(jZzc, jZzf);
        }
        return zzaag.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final /* synthetic */ void zzb() {
    }
}
