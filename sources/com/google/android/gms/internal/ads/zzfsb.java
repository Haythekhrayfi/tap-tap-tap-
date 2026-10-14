package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsb extends zzfsc {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzfsc zzc;

    public zzfsb(zzfsc zzfscVar, int i10, int i11) {
        this.zzc = zzfscVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfph.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfsc, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzfsc subList(int i10, int i11) {
        zzfph.zzg(i10, i11, this.zzb);
        zzfsc zzfscVar = this.zzc;
        int i12 = this.zza;
        return zzfscVar.subList(i10 + i12, i11 + i12);
    }
}
