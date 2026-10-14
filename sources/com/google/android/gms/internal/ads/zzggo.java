package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
final class zzggo extends zzget {
    public zzggo(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final /* bridge */ /* synthetic */ Object zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgjz zzgjzVar = (zzgjz) zzgqwVar;
        int iZzg = zzgjzVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgjzVar.zzh().zzA(), "HMAC");
        int iZza = zzgjzVar.zzg().zza();
        int i10 = iZzg - 2;
        if (i10 == 1) {
            return new zzgne(new zzgnd("HMACSHA1", secretKeySpec), iZza);
        }
        if (i10 == 2) {
            return new zzgne(new zzgnd("HMACSHA384", secretKeySpec), iZza);
        }
        if (i10 == 3) {
            return new zzgne(new zzgnd("HMACSHA256", secretKeySpec), iZza);
        }
        if (i10 == 4) {
            return new zzgne(new zzgnd("HMACSHA512", secretKeySpec), iZza);
        }
        if (i10 == 5) {
            return new zzgne(new zzgnd("HMACSHA224", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
