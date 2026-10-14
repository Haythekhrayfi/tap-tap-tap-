package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends zzai {
    public final boolean zza;
    public final boolean zzb;
    public final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z10, boolean z11) {
        super("log");
        this.zzc = zztVar;
        this.zza = z10;
        this.zzb = z11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[LOOP:0: B:24:0x0086->B:26:0x0090, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i10;
        ArrayList arrayList;
        List listEmptyList;
        zzr zzrVar;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
        } else {
            int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
            int i11 = 3;
            if (iZzb != 2) {
                if (iZzb == 3) {
                    i10 = 1;
                } else if (iZzb == 5) {
                    i10 = 5;
                } else if (iZzb == 6) {
                    i10 = 2;
                }
                String strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
                if (list.size() == 2) {
                    zzrVar = this.zzc.zza;
                    listEmptyList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                        arrayList.add(zzgVar.zzb((zzap) list.get(i12)).zzi());
                    }
                    zzrVar = this.zzc.zza;
                    listEmptyList = arrayList;
                }
                zzrVar.zza(i10, strZzi, listEmptyList, this.zza, this.zzb);
            } else {
                i11 = 4;
            }
            i10 = i11;
            String strZzi2 = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                zzrVar = this.zzc.zza;
                listEmptyList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                while (i12 < Math.min(list.size(), 5)) {
                    arrayList.add(zzgVar.zzb((zzap) list.get(i12)).zzi());
                }
                zzrVar = this.zzc.zza;
                listEmptyList = arrayList;
            }
            zzrVar.zza(i10, strZzi2, listEmptyList, this.zza, this.zzb);
        }
        return zzap.zzf;
    }
}
