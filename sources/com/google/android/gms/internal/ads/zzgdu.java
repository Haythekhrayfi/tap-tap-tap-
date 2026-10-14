package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgdu {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzgdu(Class cls, zzget... zzgetVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            zzget zzgetVar = zzgetVarArr[i10];
            if (map.containsKey(zzgetVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgetVar.zzb().getCanonicalName())));
            }
            map.put(zzgetVar.zzb(), zzgetVar);
        }
        this.zzc = zzgetVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(map);
    }

    public zzgdt zza() {
        throw null;
    }

    public abstract zzgkj zzb();

    public abstract zzgqw zzc(zzgoe zzgoeVar) throws zzgpy;

    public abstract String zzd();

    public abstract void zze(zzgqw zzgqwVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgqw zzgqwVar, Class cls) throws GeneralSecurityException {
        zzget zzgetVar = (zzget) this.zzb.get(cls);
        if (zzgetVar != null) {
            return zzgetVar.zza(zzgqwVar);
        }
        throw new IllegalArgumentException(j.a("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
