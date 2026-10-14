package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
final class zzacz extends zzade {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzacz(zzabz zzabzVar) {
        super(zzabzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zza(zzfa zzfaVar) throws zzadd {
        zzam zzamVarZzY;
        if (this.zzc) {
            zzfaVar.zzG(1);
        } else {
            int iZzk = zzfaVar.zzk();
            int i10 = iZzk >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(iZzk >> 2) & 3];
                zzak zzakVar = new zzak();
                zzakVar.zzS("audio/mpeg");
                zzakVar.zzw(1);
                zzakVar.zzT(i11);
                zzamVarZzY = zzakVar.zzY();
            } else {
                if (i10 == 7 || i10 == 8) {
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzS(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                    zzakVar2.zzw(1);
                    zzakVar2.zzT(8000);
                    zzamVarZzY = zzakVar2.zzY();
                } else if (i10 != 10) {
                    throw new zzadd(android.support.v4.media.a.a("Audio format not supported: ", i10));
                }
                this.zzc = true;
            }
            this.zza.zzk(zzamVarZzY);
            this.zzd = true;
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzb(zzfa zzfaVar, long j10) throws zzcd {
        if (this.zze == 2) {
            int iZza = zzfaVar.zza();
            this.zza.zzq(zzfaVar, iZza);
            this.zza.zzs(j10, 1, iZza, 0, null);
            return true;
        }
        int iZzk = zzfaVar.zzk();
        if (iZzk != 0 || this.zzd) {
            if (this.zze == 10 && iZzk != 1) {
                return false;
            }
            int iZza2 = zzfaVar.zza();
            this.zza.zzq(zzfaVar, iZza2);
            this.zza.zzs(j10, 1, iZza2, 0, null);
            return true;
        }
        int iZza3 = zzfaVar.zza();
        byte[] bArr = new byte[iZza3];
        zzfaVar.zzB(bArr, 0, iZza3);
        zzzt zzztVarZza = zzzu.zza(bArr);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/mp4a-latm");
        zzakVar.zzx(zzztVarZza.zzc);
        zzakVar.zzw(zzztVarZza.zzb);
        zzakVar.zzT(zzztVarZza.zza);
        zzakVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzakVar.zzY());
        this.zzd = true;
        return false;
    }
}
