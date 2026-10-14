package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabn {
    private final zzfa zza = new zzfa(10);

    public final zzbz zza(zzaax zzaaxVar, zzaek zzaekVar) throws Throwable {
        zzbz zzbzVarZza = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzaam) zzaaxVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int iZzj = this.zza.zzj();
                int i11 = iZzj + 10;
                if (zzbzVarZza == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzaam) zzaaxVar).zzm(bArr, 10, iZzj, false);
                    zzbzVarZza = zzaem.zza(bArr, i11, zzaekVar, new zzadn());
                } else {
                    ((zzaam) zzaaxVar).zzl(iZzj, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzaaxVar.zzj();
        ((zzaam) zzaaxVar).zzl(i10, false);
        return zzbzVarZza;
    }
}
