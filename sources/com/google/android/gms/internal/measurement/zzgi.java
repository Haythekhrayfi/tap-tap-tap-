package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgi extends zzka implements zzlm {
    private zzgi() {
        super(zzgj.zza);
    }

    public /* synthetic */ zzgi(zzfj zzfjVar) {
        super(zzgj.zza);
    }

    public final zzgi zza(Iterable iterable) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzgj.zzh((zzgj) this.zza, iterable);
        return this;
    }

    public final zzgi zzb(int i10) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzgj.zzg((zzgj) this.zza, i10);
        return this;
    }
}
