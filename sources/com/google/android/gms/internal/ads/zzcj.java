package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcj {
    private final zzaf zza = new zzaf();

    public final zzcj zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzcj zzb(zzcl zzclVar) {
        zzaf zzafVar = this.zza;
        zzah zzahVar = zzclVar.zzd;
        for (int i10 = 0; i10 < zzahVar.zzb(); i10++) {
            zzafVar.zza(zzahVar.zza(i10));
        }
        return this;
    }

    public final zzcj zzc(int... iArr) {
        zzaf zzafVar = this.zza;
        for (int i10 = 0; i10 < 19; i10++) {
            zzafVar.zza(iArr[i10]);
        }
        return this;
    }

    public final zzcj zzd(int i10, boolean z10) {
        zzaf zzafVar = this.zza;
        if (z10) {
            zzafVar.zza(i10);
        }
        return this;
    }

    public final zzcl zze() {
        return new zzcl(this.zza.zzb(), null);
    }
}
