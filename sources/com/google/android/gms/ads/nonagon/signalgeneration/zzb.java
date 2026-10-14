package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends LinkedHashMap {
    public final /* synthetic */ zzc zza;

    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            if (size <= zzcVar.zza) {
                return false;
            }
            zzcVar.zzf.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            return size() > this.zza.zza;
        }
    }
}
