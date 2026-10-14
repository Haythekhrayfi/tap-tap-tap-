package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxr {
    private static final Logger zza = Logger.getLogger(zzfxr.class.getName());
    private final ConcurrentMap zzb;

    public zzfxr() {
        this.zzb = new ConcurrentHashMap();
    }

    public zzfxr(zzfxr zzfxrVar) {
        this.zzb = new ConcurrentHashMap(zzfxrVar.zzb);
    }

    private final synchronized zzfxq zze(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfxq) this.zzb.get(str);
    }

    private final synchronized void zzf(zzfxq zzfxqVar, boolean z10) throws GeneralSecurityException {
        String strZzc = zzfxqVar.zza().zzc();
        zzfxq zzfxqVar2 = (zzfxq) this.zzb.get(strZzc);
        if (zzfxqVar2 != null && !zzfxqVar2.zza.getClass().equals(zzfxqVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzc, zzfxqVar2.zza.getClass().getName(), zzfxqVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(strZzc, zzfxqVar);
    }

    public final zzfxo zza(String str, Class cls) throws GeneralSecurityException {
        zzfxq zzfxqVarZze = zze(str);
        if (zzfxqVarZze.zza.zzl().contains(cls)) {
            try {
                return new zzfxp(zzfxqVarZze.zza, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzfxqVarZze.zza.getClass());
        Set<Class> setZzl = zzfxqVarZze.zza.zzl();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : setZzl) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String string = sb2.toString();
        StringBuilder sbA = q2.a.a("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", supported primitives: ");
        sbA.append(string);
        throw new GeneralSecurityException(sbA.toString());
    }

    public final zzfxo zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    public final synchronized void zzc(zzgdu zzgduVar) throws GeneralSecurityException {
        if (!zzgdh.zza(zzgduVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgduVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzf(new zzfxq(zzgduVar), false);
    }

    public final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }
}
