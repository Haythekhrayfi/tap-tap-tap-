package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzajy {
    private final List zza;
    private final zzabz[] zzb;

    public zzajy(List list) {
        this.zza = list;
        this.zzb = new zzabz[list.size()];
    }

    public final void zza(long j10, zzfa zzfaVar) {
        if (zzfaVar.zza() < 9) {
            return;
        }
        int iZze = zzfaVar.zze();
        int iZze2 = zzfaVar.zze();
        int iZzk = zzfaVar.zzk();
        if (iZze == 434 && iZze2 == 1195456820 && iZzk == 3) {
            zzaaj.zzb(j10, zzfaVar, this.zzb);
        }
    }

    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzajvVar.zzc();
            zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i10);
            String str = zzamVar.zzm;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzdy.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzajvVar.zzb());
            zzakVar.zzS(str);
            zzakVar.zzU(zzamVar.zze);
            zzakVar.zzK(zzamVar.zzd);
            zzakVar.zzu(zzamVar.zzE);
            zzakVar.zzI(zzamVar.zzo);
            zzabzVarZzv.zzk(zzakVar.zzY());
            this.zzb[i10] = zzabzVarZzv;
        }
    }
}
