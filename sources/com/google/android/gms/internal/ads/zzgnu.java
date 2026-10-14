package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnu extends zzgnw {
    public final /* synthetic */ zzgoe zza;
    private int zzb = 0;
    private final int zzc;

    public zzgnu(zzgoe zzgoeVar) {
        this.zza = zzgoeVar;
        this.zzc = zzgoeVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgny
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
