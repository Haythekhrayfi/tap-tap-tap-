package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbd zza(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.zza.size()) {
            double dDoubleValue = ((Double) this.zzc.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        this.zza.add(i10, str);
        this.zzc.add(i10, Double.valueOf(d10));
        this.zzb.add(i10, Double.valueOf(d11));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
