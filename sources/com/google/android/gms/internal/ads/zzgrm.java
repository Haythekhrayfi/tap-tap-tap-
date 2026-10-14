package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrm implements Iterator {
    private final ArrayDeque zza;
    private zzgnz zzb;

    public /* synthetic */ zzgrm(zzgoe zzgoeVar, zzgrl zzgrlVar) {
        zzgnz zzgnzVarZzb;
        if (zzgoeVar instanceof zzgro) {
            zzgro zzgroVar = (zzgro) zzgoeVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgroVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgroVar);
            zzgnzVarZzb = zzb(zzgroVar.zzd);
        } else {
            this.zza = null;
            zzgnzVarZzb = (zzgnz) zzgoeVar;
        }
        this.zzb = zzgnzVarZzb;
    }

    private final zzgnz zzb(zzgoe zzgoeVar) {
        while (zzgoeVar instanceof zzgro) {
            zzgro zzgroVar = (zzgro) zzgoeVar;
            this.zza.push(zzgroVar);
            zzgoeVar = zzgroVar.zzd;
        }
        return (zzgnz) zzgoeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgnz next() {
        zzgnz zzgnzVarZzb;
        zzgnz zzgnzVar = this.zzb;
        if (zzgnzVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgnzVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgnzVarZzb = zzb(((zzgro) this.zza.pop()).zze);
        } while (zzgnzVarZzb.zzd() == 0);
        this.zzb = zzgnzVarZzb;
        return zzgnzVar;
    }
}
