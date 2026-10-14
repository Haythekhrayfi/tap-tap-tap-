package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zziu extends zziw {
    public final /* synthetic */ zzjd zza;
    private int zzb = 0;
    private final int zzc;

    public zziu(zzjd zzjdVar) {
        this.zza = zzjdVar;
        this.zzc = zzjdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
