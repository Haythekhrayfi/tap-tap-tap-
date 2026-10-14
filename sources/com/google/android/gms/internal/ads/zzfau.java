package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfau {
    public zzfau() {
        try {
            zzfys.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgob zzgobVarZzt = zzgoe.zzt();
        try {
            zzfxk.zzb(zzfyb.zzc(zzfxu.zza("AES128_GCM").zza()), zzfxj.zzb(zzgobVarZzt));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgobVarZzt.zzb().zzA(), 11);
        zzgobVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpv zzdpvVar) {
        zzfyb zzfybVarZzc = zzc(str);
        if (zzfybVarZzc == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzfxh) zzfybVarZzc.zze(zzgfc.zza(), zzfxh.class)).zza(bArr, bArr2);
            zzdpvVar.zza().put("ds", "1");
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.decrypt");
            zzdpvVar.zza().put("dsf", e10.toString());
            return null;
        }
    }

    @Nullable
    private static final zzfyb zzc(String str) {
        try {
            return zzfxk.zza(zzfxi.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
