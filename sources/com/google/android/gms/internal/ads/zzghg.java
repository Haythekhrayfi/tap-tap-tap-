package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class zzghg implements zzfye {
    private final zzfym zza;
    private final zzgho zzb;
    private final zzgho zzc;

    public /* synthetic */ zzghg(zzfym zzfymVar, zzghf zzghfVar) {
        zzgho zzghoVarZza;
        this.zza = zzfymVar;
        if (zzfymVar.zzf()) {
            zzghp zzghpVarZzb = zzged.zza().zzb();
            zzghu zzghuVarZza = zzgea.zza(zzfymVar);
            this.zzb = zzghpVarZzb.zza(zzghuVarZza, "mac", "compute");
            zzghoVarZza = zzghpVarZzb.zza(zzghuVarZza, "mac", "verify");
        } else {
            zzghoVarZza = zzgea.zza;
            this.zzb = zzghoVarZza;
        }
        this.zzc = zzghoVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzfyi zzfyiVar : this.zza.zze(bArrCopyOf)) {
            try {
                ((zzfye) zzfyiVar.zze()).zza(bArrCopyOfRange, zzfyiVar.zzc().equals(zzglq.LEGACY) ? zzgmg.zzb(bArr2, zzghh.zzb) : bArr2);
                zzfyiVar.zza();
                return;
            } catch (GeneralSecurityException e10) {
                zzghh.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
            }
        }
        for (zzfyi zzfyiVar2 : this.zza.zze(zzfxm.zza)) {
            try {
                ((zzfye) zzfyiVar2.zze()).zza(bArr, bArr2);
                zzfyiVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
