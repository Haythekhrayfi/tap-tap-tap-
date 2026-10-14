package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnd implements zzghv {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzgnd(String str, Key key) throws GeneralSecurityException {
        byte b10;
        int i10;
        zzgnc zzgncVar = new zzgnc(this);
        this.zza = zzgncVar;
        if (!zzgdh.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b10 = 0;
                break;
            case "HMACSHA224":
                b10 = 1;
                break;
            case "HMACSHA256":
                b10 = 2;
                break;
            case "HMACSHA384":
                b10 = 3;
                break;
            case "HMACSHA512":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            i10 = 20;
        } else if (b10 == 1) {
            i10 = 28;
        } else if (b10 == 2) {
            i10 = 32;
        } else if (b10 == 3) {
            i10 = 48;
        } else {
            if (b10 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i10 = 64;
        }
        this.zzd = i10;
        zzgncVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.zza.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i10);
    }
}
