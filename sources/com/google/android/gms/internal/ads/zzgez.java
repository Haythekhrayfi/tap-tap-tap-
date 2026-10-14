package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgez {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgez(zzgev zzgevVar, zzgey zzgeyVar) {
        this.zza = new HashMap(zzgevVar.zza);
        this.zzb = new HashMap(zzgevVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzfyn) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(j.a("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzfxn zzfxnVar, Class cls) throws GeneralSecurityException {
        zzgex zzgexVar = new zzgex(zzfxnVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgexVar)) {
            return ((zzges) this.zza.get(zzgexVar)).zza(zzfxnVar);
        }
        throw new GeneralSecurityException(j.a("No PrimitiveConstructor for ", zzgexVar.toString(), " available"));
    }

    public final Object zzc(zzfym zzfymVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzfyn zzfynVar = (zzfyn) this.zzb.get(cls);
        if (zzfymVar.zzc().equals(zzfynVar.zza()) && zzfynVar.zza().equals(zzfymVar.zzc())) {
            return zzfynVar.zzc(zzfymVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
