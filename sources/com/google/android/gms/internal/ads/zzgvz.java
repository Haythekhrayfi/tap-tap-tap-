package com.google.android.gms.internal.ads;

import ch.qos.logback.core.joran.action.Action;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class zzgvz {
    public final LinkedHashMap zza;

    public zzgvz(int i10) {
        this.zza = zzgwb.zzb(i10);
    }

    public final zzgvz zza(Object obj, zzgwr zzgwrVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgwm.zza(obj, Action.KEY_ATTRIBUTE);
        zzgwm.zza(zzgwrVar, "provider");
        linkedHashMap.put(obj, zzgwrVar);
        return this;
    }
}
