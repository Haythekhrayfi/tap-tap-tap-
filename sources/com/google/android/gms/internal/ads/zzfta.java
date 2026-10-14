package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzfta extends zzfte {
    public final /* synthetic */ Comparator zza;

    public zzfta(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfte
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
