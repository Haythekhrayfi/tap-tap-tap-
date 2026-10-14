package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvk extends zzfvm {
    public zzfvk(zzfrx zzfrxVar, boolean z10) {
        super(zzfrxVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final /* bridge */ /* synthetic */ Object zzH(List list) {
        ArrayList arrayListZza = zzfsq.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfvl zzfvlVar = (zzfvl) it.next();
            arrayListZza.add(zzfvlVar != null ? zzfvlVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
