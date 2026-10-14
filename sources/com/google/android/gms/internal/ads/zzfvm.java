package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfvm extends zzfvb {

    @CheckForNull
    private List zza;

    public zzfvm(zzfrx zzfrxVar, boolean z10) {
        super(zzfrxVar, true, true);
        List listEmptyList = zzfrxVar.isEmpty() ? Collections.emptyList() : zzfsq.zza(zzfrxVar.size());
        for (int i10 = 0; i10 < zzfrxVar.size(); i10++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    public abstract Object zzH(List list);

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzg(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzfvl(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzz(int i10) {
        super.zzz(i10);
        this.zza = null;
    }
}
