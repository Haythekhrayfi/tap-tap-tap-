package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgrk() {
    }

    public /* synthetic */ zzgrk(zzgrj zzgrjVar) {
    }

    public static /* bridge */ /* synthetic */ zzgoe zza(zzgrk zzgrkVar, zzgoe zzgoeVar, zzgoe zzgoeVar2) {
        zzgrkVar.zzb(zzgoeVar);
        zzgrkVar.zzb(zzgoeVar2);
        zzgoe zzgroVar = (zzgoe) zzgrkVar.zza.pop();
        while (!zzgrkVar.zza.isEmpty()) {
            zzgroVar = new zzgro((zzgoe) zzgrkVar.zza.pop(), zzgroVar);
        }
        return zzgroVar;
    }

    private final void zzb(zzgoe zzgoeVar) {
        zzgrn zzgrnVar;
        if (!zzgoeVar.zzh()) {
            if (!(zzgoeVar instanceof zzgro)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgoeVar.getClass())));
            }
            zzgro zzgroVar = (zzgro) zzgoeVar;
            zzb(zzgroVar.zzd);
            zzb(zzgroVar.zze);
            return;
        }
        int iZzc = zzc(zzgoeVar.zzd());
        int iZzc2 = zzgro.zzc(iZzc + 1);
        if (this.zza.isEmpty() || ((zzgoe) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgoeVar);
            return;
        }
        int iZzc3 = zzgro.zzc(iZzc);
        zzgoe zzgroVar2 = (zzgoe) this.zza.pop();
        while (true) {
            zzgrnVar = null;
            if (this.zza.isEmpty() || ((zzgoe) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgroVar2 = new zzgro((zzgoe) this.zza.pop(), zzgroVar2);
            }
        }
        zzgro zzgroVar3 = new zzgro(zzgroVar2, zzgoeVar);
        while (!this.zza.isEmpty()) {
            if (((zzgoe) this.zza.peek()).zzd() >= zzgro.zzc(zzc(zzgroVar3.zzd()) + 1)) {
                break;
            } else {
                zzgroVar3 = new zzgro((zzgoe) this.zza.pop(), zzgroVar3);
            }
        }
        this.zza.push(zzgroVar3);
    }

    private static final int zzc(int i10) {
        int iBinarySearch = Arrays.binarySearch(zzgro.zza, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
