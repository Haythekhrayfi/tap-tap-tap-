package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzei extends zzka implements zzlm {
    private zzei() {
        super(zzej.zza);
    }

    public /* synthetic */ zzei(zzef zzefVar) {
        super(zzej.zza);
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.zzi((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i10, zzel zzelVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.zzj((zzej) this.zza, i10, zzelVar);
        return this;
    }

    public final zzel zzd(int i10) {
        return ((zzej) this.zza).zze(i10);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }
}
