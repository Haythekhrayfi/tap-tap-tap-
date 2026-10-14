package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzsv implements zzty, zzqp {
    public final /* synthetic */ zzsx zza;
    private final Object zzb;
    private zztx zzc;
    private zzqo zzd;

    public zzsv(zzsx zzsxVar, Object obj) {
        this.zza = zzsxVar;
        this.zzc = zzsxVar.zze(null);
        this.zzd = zzsxVar.zzc(null);
        this.zzb = obj;
    }

    private final zztk zzf(zztk zztkVar) {
        zzsx zzsxVar = this.zza;
        Object obj = this.zzb;
        long j10 = zztkVar.zzc;
        zzsxVar.zzw(obj, j10);
        zzsx zzsxVar2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zztkVar.zzd;
        zzsxVar2.zzw(obj2, j11);
        return (j10 == zztkVar.zzc && j11 == zztkVar.zzd) ? zztkVar : new zztk(1, zztkVar.zza, zztkVar.zzb, 0, null, j10, j11);
    }

    private final boolean zzg(int i10, zzto zztoVar) {
        zzto zztoVarZzx;
        if (zztoVar != null) {
            zztoVarZzx = this.zza.zzx(this.zzb, zztoVar);
            if (zztoVarZzx == null) {
                return false;
            }
        } else {
            zztoVarZzx = null;
        }
        this.zza.zzv(this.zzb, 0);
        zztx zztxVar = this.zzc;
        int i11 = zztxVar.zza;
        if (!zzfj.zzC(zztxVar.zzb, zztoVarZzx)) {
            this.zzc = this.zza.zzf(0, zztoVarZzx);
        }
        zzqo zzqoVar = this.zzd;
        int i12 = zzqoVar.zza;
        if (zzfj.zzC(zzqoVar.zzb, zztoVarZzx)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zztoVarZzx);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzac(int i10, zzto zztoVar, zztk zztkVar) {
        if (zzg(0, zztoVar)) {
            this.zzc.zzc(zzf(zztkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzad(int i10, zzto zztoVar, zztf zztfVar, zztk zztkVar) {
        if (zzg(0, zztoVar)) {
            this.zzc.zzd(zztfVar, zzf(zztkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzae(int i10, zzto zztoVar, zztf zztfVar, zztk zztkVar) {
        if (zzg(0, zztoVar)) {
            this.zzc.zze(zztfVar, zzf(zztkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzaf(int i10, zzto zztoVar, zztf zztfVar, zztk zztkVar, IOException iOException, boolean z10) {
        if (zzg(0, zztoVar)) {
            this.zzc.zzf(zztfVar, zzf(zztkVar), iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzty
    public final void zzag(int i10, zzto zztoVar, zztf zztfVar, zztk zztkVar) {
        if (zzg(0, zztoVar)) {
            this.zzc.zzg(zztfVar, zzf(zztkVar));
        }
    }
}
