package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjb implements zzbij {
    private final zzdsx zza;

    public zzbjb(zzdsx zzdsxVar) {
        Preconditions.checkNotNull(zzdsxVar, "The Inspector Manager must not be null");
        this.zza = zzdsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        boolean zContainsKey = map.containsKey("expires");
        long j10 = RecyclerView.FOREVER_NS;
        if (zContainsKey) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j10);
    }
}
