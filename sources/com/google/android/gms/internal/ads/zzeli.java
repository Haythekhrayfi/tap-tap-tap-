package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzeli implements zzeqy {
    private final Set zza;

    public zzeli(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzfwc.zzh(new zzeqx() { // from class: com.google.android.gms.internal.ads.zzelh
            @Override // com.google.android.gms.internal.ads.zzeqx
            public final void zzh(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
