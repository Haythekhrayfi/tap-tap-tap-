package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxt {
    private final zzgkp zza;

    private zzfxt(zzgkp zzgkpVar) {
        this.zza = zzgkpVar;
    }

    public static zzfxt zzb(String str, byte[] bArr, int i10) {
        zzglq zzglqVar;
        zzgko zzgkoVarZza = zzgkp.zza();
        zzgkoVarZza.zzb(str);
        zzgkoVarZza.zzc(zzgoe.zzv(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        if (i11 != 0) {
            zzglqVar = i11 != 1 ? zzglq.RAW : zzglq.LEGACY;
        } else {
            zzglqVar = zzglq.TINK;
        }
        zzgkoVarZza.zza(zzglqVar);
        return new zzfxt((zzgkp) zzgkoVarZza.zzal());
    }

    public final zzfyf zza() throws GeneralSecurityException {
        try {
            zzgkp zzgkpVarZze = zzgkp.zze(this.zza.zzax(), zzgoy.zza());
            zzgeg zzgegVarZzc = zzgeg.zzc();
            zzgfb zzgfbVarZza = zzgfb.zza(zzgkpVarZze);
            return !zzgegVarZzc.zzi(zzgfbVarZza) ? new zzgdx(zzgfbVarZza) : zzgegVarZzc.zzb(zzgfbVarZza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
