package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwi extends zzgwa {
    private static final zzgwr zza = zzgwf.zza(Collections.emptyMap());

    public /* synthetic */ zzgwi(Map map, zzgwg zzgwgVar) {
        super(map);
    }

    public static zzgwh zzc(int i10) {
        return new zzgwh(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzgwb.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzgwr) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
