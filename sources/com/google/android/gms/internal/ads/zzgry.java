package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgry implements Iterator {
    public final /* synthetic */ zzgsc zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zzb.size()) {
            return !this.zza.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        return (Map.Entry) (i10 < this.zza.zzb.size() ? this.zza.zzb.get(this.zzb) : zza().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        if (this.zzb >= this.zza.zzb.size()) {
            zza().remove();
            return;
        }
        zzgsc zzgscVar = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 - 1;
        zzgscVar.zzl(i10);
    }
}
