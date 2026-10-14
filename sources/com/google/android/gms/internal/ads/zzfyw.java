package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyw implements zzfxh {
    private final zzfym zza;
    private final zzgho zzb;
    private final zzgho zzc;

    public /* synthetic */ zzfyw(zzfym zzfymVar, zzfyv zzfyvVar) {
        zzgho zzghoVarZza;
        this.zza = zzfymVar;
        if (zzfymVar.zzf()) {
            zzghp zzghpVarZzb = zzged.zza().zzb();
            zzghu zzghuVarZza = zzgea.zza(zzfymVar);
            this.zzb = zzghpVarZzb.zza(zzghuVarZza, "aead", "encrypt");
            zzghoVarZza = zzghpVarZzb.zza(zzghuVarZza, "aead", "decrypt");
        } else {
            zzghoVarZza = zzgea.zza;
            this.zzb = zzghoVarZza;
        }
        this.zzc = zzghoVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfyi zzfyiVar : this.zza.zze(bArrCopyOf)) {
                try {
                    byte[] bArrZza = ((zzfxh) zzfyiVar.zze()).zza(bArrCopyOfRange, bArr2);
                    zzfyiVar.zza();
                    int length2 = bArrCopyOfRange.length;
                    return bArrZza;
                } catch (GeneralSecurityException e10) {
                    zzfyx.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (zzfyi zzfyiVar2 : this.zza.zze(zzfxm.zza)) {
            try {
                byte[] bArrZza2 = ((zzfxh) zzfyiVar2.zze()).zza(bArr, bArr2);
                zzfyiVar2.zza();
                return bArrZza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
