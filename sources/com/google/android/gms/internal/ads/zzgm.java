package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgm implements zzgd {
    private zzhg zzb;
    private String zzc;
    private boolean zzf;
    private final zzha zza = new zzha();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgm zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzgm zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzgm zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzgm zze(zzhg zzhgVar) {
        this.zzb = zzhgVar;
        return this;
    }

    public final zzgm zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgr zza() {
        zzgr zzgrVar = new zzgr(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzhg zzhgVar = this.zzb;
        if (zzhgVar != null) {
            zzgrVar.zzf(zzhgVar);
        }
        return zzgrVar;
    }
}
