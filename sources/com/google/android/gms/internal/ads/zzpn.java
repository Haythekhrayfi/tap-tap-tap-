package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpn {
    private boolean zzb;
    private zzpp zzd;
    private zzph zze;
    private zzoe zza = zzoe.zza;
    private final zzpm zzc = zzpm.zza;

    @Deprecated
    public zzpn() {
    }

    @Deprecated
    public final zzpn zzc(zzoe zzoeVar) {
        this.zza = zzoeVar;
        return this;
    }

    public final zzpn zzd(zzdr[] zzdrVarArr) {
        this.zzd = new zzpp(zzdrVarArr);
        return this;
    }

    public final zzpz zze() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        if (this.zzd == null) {
            this.zzd = new zzpp(new zzdr[0]);
        }
        zzpy zzpyVar = null;
        if (this.zze == null) {
            this.zze = new zzph(null);
        }
        return new zzpz(this, zzpyVar);
    }
}
