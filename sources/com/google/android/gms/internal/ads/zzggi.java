package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggi implements zzfyn {
    private static final zzggi zza = new zzggi();

    private zzggi() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzfyp.zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final Class zza() {
        return zzggf.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final Class zzb() {
        return zzggf.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final /* bridge */ /* synthetic */ Object zzc(zzfym zzfymVar) throws GeneralSecurityException {
        if (zzfymVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = zzfymVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((zzfyi) it2.next()).zzd();
            }
        }
        return new zzggh(zzfymVar, null);
    }
}
