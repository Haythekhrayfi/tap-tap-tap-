package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzajp implements zzaji {
    public final /* synthetic */ zzajr zza;
    private final zzez zzb = new zzez(new byte[4], 4);

    public zzajp(zzajr zzajrVar) {
        this.zza = zzajrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zza(zzfa zzfaVar) {
        if (zzfaVar.zzk() == 0 && (zzfaVar.zzk() & 128) != 0) {
            zzfaVar.zzG(6);
            int iZza = zzfaVar.zza() / 4;
            for (int i10 = 0; i10 < iZza; i10++) {
                zzfaVar.zzA(this.zzb, 4);
                int iZzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (iZzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzf.get(iZzd2) == null) {
                        zzajr zzajrVar = this.zza;
                        zzajrVar.zzf.put(iZzd2, new zzajj(new zzajq(zzajrVar, iZzd2)));
                        this.zza.zzl++;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void zzb(zzfh zzfhVar, zzaaz zzaazVar, zzajv zzajvVar) {
    }
}
