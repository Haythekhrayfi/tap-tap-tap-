package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyp {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzfyp.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzfxr());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfyp() {
    }

    public static synchronized zzgkk zza(zzgkp zzgkpVar) throws GeneralSecurityException {
        zzfxo zzfxoVarZzb;
        zzfxoVarZzb = ((zzfxr) zzc.get()).zzb(zzgkpVar.zzh());
        if (!((Boolean) zze.get(zzgkpVar.zzh())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgkpVar.zzh())));
        }
        return zzfxoVarZzb.zza(zzgkpVar.zzg());
    }

    @Nullable
    public static Class zzb(Class cls) {
        try {
            return zzgee.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(String str, zzgoe zzgoeVar, Class cls) throws GeneralSecurityException {
        return ((zzfxr) zzc.get()).zza(str, cls).zzb(zzgoeVar);
    }

    public static synchronized Map zzd() {
        return Collections.unmodifiableMap(zzg);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzgqw, java.lang.Object] */
    public static synchronized void zze(zzgdu zzgduVar, boolean z10) throws GeneralSecurityException {
        AtomicReference atomicReference = zzc;
        zzfxr zzfxrVar = new zzfxr((zzfxr) atomicReference.get());
        zzfxrVar.zzc(zzgduVar);
        Map mapZzc = zzgduVar.zza().zzc();
        String strZzd = zzgduVar.zzd();
        zzg(strZzd, mapZzc, true);
        if (!((zzfxr) atomicReference.get()).zzd(strZzd)) {
            zzd.put(strZzd, new zzfyo(zzgduVar));
            for (Map.Entry entry : zzgduVar.zza().zzc().entrySet()) {
                zzg.put((String) entry.getKey(), zzfxt.zzb(strZzd, ((zzgds) entry.getValue()).zza.zzax(), ((zzgds) entry.getValue()).zzb));
            }
        }
        zze.put(strZzd, Boolean.TRUE);
        zzc.set(zzfxrVar);
    }

    public static synchronized void zzf(zzfyn zzfynVar) throws GeneralSecurityException {
        zzgee.zza().zzf(zzfynVar);
    }

    private static synchronized void zzg(String str, Map map, boolean z10) throws GeneralSecurityException {
        ConcurrentMap concurrentMap = zze;
        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        if (((zzfxr) zzc.get()).zzd(str)) {
            for (Map.Entry entry : map.entrySet()) {
                if (!zzg.containsKey(entry.getKey())) {
                    throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                }
            }
        } else {
            for (Map.Entry entry2 : map.entrySet()) {
                if (zzg.containsKey(entry2.getKey())) {
                    throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                }
            }
        }
    }
}
