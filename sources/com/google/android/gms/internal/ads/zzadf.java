package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzadf extends zzade {
    private final zzfa zzb;
    private final zzfa zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadf(zzabz zzabzVar) {
        super(zzabzVar);
        this.zzb = new zzfa(zzfu.zza);
        this.zzc = new zzfa(4);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zza(zzfa zzfaVar) throws zzadd {
        int iZzk = zzfaVar.zzk();
        int i10 = iZzk >> 4;
        int i11 = iZzk & 15;
        if (i11 != 7) {
            throw new zzadd(android.support.v4.media.a.a("Video format not supported: ", i11));
        }
        this.zzg = i10;
        return i10 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzb(zzfa zzfaVar, long j10) throws zzcd {
        int iZzk = zzfaVar.zzk();
        long jZzf = zzfaVar.zzf();
        if (iZzk == 0) {
            if (!this.zze) {
                zzfa zzfaVar2 = new zzfa(new byte[zzfaVar.zza()]);
                zzfaVar.zzB(zzfaVar2.zzH(), 0, zzfaVar.zza());
                zzaab zzaabVarZza = zzaab.zza(zzfaVar2);
                this.zzd = zzaabVarZza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzS("video/avc");
                zzakVar.zzx(zzaabVarZza.zzi);
                zzakVar.zzX(zzaabVarZza.zzc);
                zzakVar.zzF(zzaabVarZza.zzd);
                zzakVar.zzP(zzaabVarZza.zzh);
                zzakVar.zzI(zzaabVarZza.zza);
                this.zza.zzk(zzakVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (iZzk == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i10 == 0) {
                return false;
            }
            byte[] bArrZzH = this.zzc.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzfaVar.zza() > 0) {
                zzfaVar.zzB(this.zzc.zzH(), i11, this.zzd);
                this.zzc.zzF(0);
                int iZzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfaVar, iZzn);
                i12 = i12 + 4 + iZzn;
            }
            this.zza.zzs((jZzf * 1000) + j10, i10, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
