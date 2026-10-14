package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfrh implements Iterator {
    public int zzb;
    public int zzc;
    public int zzd = -1;
    public final /* synthetic */ zzfrl zze;

    public /* synthetic */ zzfrh(zzfrl zzfrlVar, zzfrg zzfrgVar) {
        this.zze = zzfrlVar;
        this.zzb = zzfrlVar.zzf;
        this.zzc = zzfrlVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object objZza = zza(i10);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfph.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfrl zzfrlVar = this.zze;
        int i10 = this.zzd;
        Object[] objArr = zzfrlVar.zzb;
        Objects.requireNonNull(objArr);
        zzfrlVar.remove(objArr[i10]);
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
