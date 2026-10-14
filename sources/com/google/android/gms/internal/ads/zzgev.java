package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgev {
    private final Map zza;
    private final Map zzb;

    private zzgev() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgev(zzgeu zzgeuVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgev(zzgez zzgezVar, zzgeu zzgeuVar) {
        this.zza = new HashMap(zzgezVar.zza);
        this.zzb = new HashMap(zzgezVar.zzb);
    }

    public final zzgev zza(zzges zzgesVar) throws GeneralSecurityException {
        zzgex zzgexVar = new zzgex(zzgesVar.zzc(), zzgesVar.zzd(), null);
        if (this.zza.containsKey(zzgexVar)) {
            zzges zzgesVar2 = (zzges) this.zza.get(zzgexVar);
            if (!zzgesVar2.equals(zzgesVar) || !zzgesVar.equals(zzgesVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgexVar.toString()));
            }
        } else {
            this.zza.put(zzgexVar, zzgesVar);
        }
        return this;
    }

    public final zzgev zzb(zzfyn zzfynVar) throws GeneralSecurityException {
        Objects.requireNonNull(zzfynVar, "wrapper must be non-null");
        Map map = this.zzb;
        Class clsZzb = zzfynVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzfyn zzfynVar2 = (zzfyn) this.zzb.get(clsZzb);
            if (!zzfynVar2.equals(zzfynVar) || !zzfynVar.equals(zzfynVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzfynVar);
        }
        return this;
    }
}
