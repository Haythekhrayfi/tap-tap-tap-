package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzt extends zzu {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzu zzc;

    public zzt(zzu zzuVar, int i10, int i11) {
        this.zzc = zzuVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzu subList(int i10, int i11) {
        zzm.zzd(i10, i11, this.zzb);
        zzu zzuVar = this.zzc;
        int i12 = this.zza;
        return zzuVar.subList(i10 + i12, i11 + i12);
    }
}
