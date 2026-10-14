package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgea {
    public static final zzgho zza = new zzgdz(null);

    public static zzghu zza(zzfym zzfymVar) {
        zzfxs zzfxsVar;
        zzghq zzghqVar = new zzghq();
        zzghqVar.zzb(zzfymVar.zzb());
        Iterator it = zzfymVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzfyi zzfyiVar : (List) it.next()) {
                int iZzh = zzfyiVar.zzh() - 2;
                if (iZzh == 1) {
                    zzfxsVar = zzfxs.zza;
                } else if (iZzh == 2) {
                    zzfxsVar = zzfxs.zzb;
                } else {
                    if (iZzh != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzfxsVar = zzfxs.zzc;
                }
                int iZza = zzfyiVar.zza();
                String strZzf = zzfyiVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzghqVar.zza(zzfxsVar, iZza, strZzf, zzfyiVar.zzc().name());
            }
        }
        if (zzfymVar.zza() != null) {
            zzghqVar.zzc(zzfymVar.zza().zza());
        }
        try {
            return zzghqVar.zzd();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
