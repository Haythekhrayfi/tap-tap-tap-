package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzfrv extends zzfrw {
    public Object[] zza;
    public int zzb = 0;
    public boolean zzc;

    public zzfrv(int i10) {
        this.zza = new Object[i10];
    }

    private final void zzf(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            this.zza = Arrays.copyOf(objArr, zzfrw.zze(length, i10));
        } else if (!this.zzc) {
            return;
        } else {
            this.zza = (Object[]) objArr.clone();
        }
        this.zzc = false;
    }

    public final zzfrv zza(Object obj) {
        Objects.requireNonNull(obj);
        zzf(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public /* bridge */ /* synthetic */ zzfrw zzb(Object obj) {
        throw null;
    }

    public final zzfrw zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size() + this.zzb);
            if (collection instanceof zzfrx) {
                this.zzb = ((zzfrx) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i10) {
        zzftk.zzb(objArr, 2);
        zzf(this.zzb + 2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
