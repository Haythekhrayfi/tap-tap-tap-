package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfy implements zzge {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgj zzd;

    public zzfy(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
        Objects.requireNonNull(zzhgVar);
        if (this.zzb.contains(zzhgVar)) {
            return;
        }
        this.zzb.add(zzhgVar);
        this.zzc++;
    }

    public final void zzg(int i10) {
        zzgj zzgjVar = this.zzd;
        int i11 = zzfj.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzhg) this.zzb.get(i12)).zza(this, zzgjVar, this.zza, i10);
        }
    }

    public final void zzh() {
        zzgj zzgjVar = this.zzd;
        int i10 = zzfj.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhg) this.zzb.get(i11)).zzb(this, zzgjVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgj zzgjVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhg) this.zzb.get(i10)).zzc(this, zzgjVar, this.zza);
        }
    }

    public final void zzj(zzgj zzgjVar) {
        this.zzd = zzgjVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhg) this.zzb.get(i10)).zzd(this, zzgjVar, this.zza);
        }
    }
}
