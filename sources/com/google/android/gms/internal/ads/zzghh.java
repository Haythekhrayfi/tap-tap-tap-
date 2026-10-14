package com.google.android.gms.internal.ads;

import androidx.activity.k;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzghh implements zzfyn {
    private static final Logger zza = Logger.getLogger(zzghh.class.getName());
    private static final byte[] zzb = {0};
    private static final zzghh zzc = new zzghh();

    public static void zze() throws GeneralSecurityException {
        zzfyp.zzf(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final Class zza() {
        return zzfye.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final Class zzb() {
        return zzfye.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final /* bridge */ /* synthetic */ Object zzc(zzfym zzfymVar) throws GeneralSecurityException {
        Iterator it = zzfymVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzfyi zzfyiVar : (List) it.next()) {
                if (zzfyiVar.zzb() instanceof zzghd) {
                    zzghd zzghdVar = (zzghd) zzfyiVar.zzb();
                    zzgnk zzgnkVarZzb = zzgnk.zzb(zzfyiVar.zzg());
                    if (!zzgnkVarZzb.equals(zzghdVar.zzb())) {
                        String strValueOf = String.valueOf(zzghdVar.zza());
                        String string = zzghdVar.zzb().toString();
                        throw new GeneralSecurityException(k.a(q2.a.a("Mac Key with parameters ", strValueOf, " has wrong output prefix (", string, ") instead of ("), zzgnkVarZzb.toString(), ")"));
                    }
                }
            }
        }
        return new zzghg(zzfymVar, null);
    }
}
