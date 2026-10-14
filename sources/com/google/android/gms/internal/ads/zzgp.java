package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgp extends zzfrs {
    private final Map zza;

    public zzgp(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final Set entrySet() {
        return zzfty.zzb(this.zza.entrySet(), new zzfpi() { // from class: com.google.android.gms.internal.ads.zzgn
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final boolean isEmpty() {
        return this.zza.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final Set keySet() {
        return zzfty.zzb(this.zza.keySet(), new zzfpi() { // from class: com.google.android.gms.internal.ads.zzgo
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, com.google.android.gms.internal.ads.zzfrt
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Map zzb() {
        return this.zza;
    }
}
