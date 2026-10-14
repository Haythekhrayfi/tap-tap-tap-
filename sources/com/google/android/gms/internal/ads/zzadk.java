package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzadk implements zzabv {
    public final /* synthetic */ zzabv zza;
    public final /* synthetic */ zzadl zzb;

    public zzadk(zzadl zzadlVar, zzabv zzabvVar) {
        this.zzb = zzadlVar;
        this.zza = zzabvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        zzabt zzabtVarZzg = this.zza.zzg(j10);
        zzabw zzabwVar = zzabtVarZzg.zza;
        zzabw zzabwVar2 = new zzabw(zzabwVar.zzb, this.zzb.zzb + zzabwVar.zzc);
        zzabw zzabwVar3 = zzabtVarZzg.zzb;
        return new zzabt(zzabwVar2, new zzabw(zzabwVar3.zzb, this.zzb.zzb + zzabwVar3.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
