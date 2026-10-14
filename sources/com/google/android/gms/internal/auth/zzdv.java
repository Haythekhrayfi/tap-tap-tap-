package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv extends zzdx {
    public final /* synthetic */ zzee zza;
    private int zzb = 0;
    private final int zzc;

    public zzdv(zzee zzeeVar) {
        this.zza = zzeeVar;
        this.zzc = zzeeVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzdz
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
