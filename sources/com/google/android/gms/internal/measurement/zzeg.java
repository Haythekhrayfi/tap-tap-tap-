package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeg extends zzka implements zzlm {
    private zzeg() {
        super(zzeh.zza);
    }

    public /* synthetic */ zzeg(zzef zzefVar) {
        super(zzeh.zza);
    }

    public final int zza() {
        return ((zzeh) this.zza).zzb();
    }

    public final int zzb() {
        return ((zzeh) this.zza).zzc();
    }

    public final zzeg zzc(int i10, zzei zzeiVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzeh.zzj((zzeh) this.zza, i10, (zzej) zzeiVar.zzaE());
        return this;
    }

    public final zzeg zzd(int i10, zzer zzerVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzeh.zzi((zzeh) this.zza, i10, (zzes) zzerVar.zzaE());
        return this;
    }

    public final zzej zze(int i10) {
        return ((zzeh) this.zza).zze(i10);
    }

    public final zzes zzf(int i10) {
        return ((zzeh) this.zza).zzf(i10);
    }
}
