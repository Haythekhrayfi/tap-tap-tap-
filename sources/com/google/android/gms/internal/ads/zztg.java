package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zztg implements zztm, zztl {
    public final zzto zza;
    private final long zzb;
    private zztq zzc;
    private zztm zzd;
    private zztl zze;
    private long zzf = -9223372036854775807L;
    private final zzxp zzg;

    public zztg(zzto zztoVar, zzxp zzxpVar, long j10) {
        this.zza = zztoVar;
        this.zzg = zzxpVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zza(long j10, zzlm zzlmVar) {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zza(j10, zzlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzd() {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zze(long j10) {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzf(zzxa[] zzxaVarArr, boolean[] zArr, zzvf[] zzvfVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.zzf;
        if (j12 == -9223372036854775807L || j10 != this.zzb) {
            j11 = j10;
        } else {
            this.zzf = -9223372036854775807L;
            j11 = j12;
        }
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zzf(zzxaVarArr, zArr, zzvfVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* bridge */ /* synthetic */ void zzg(zzvh zzvhVar) {
        zztl zztlVar = this.zze;
        int i10 = zzfj.zza;
        zztlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final zzvn zzh() {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        return zztmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzi(zztm zztmVar) {
        zztl zztlVar = this.zze;
        int i10 = zzfj.zza;
        zztlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(long j10, boolean z10) {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        zztmVar.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk() throws IOException {
        try {
            zztm zztmVar = this.zzd;
            if (zztmVar != null) {
                zztmVar.zzk();
                return;
            }
            zztq zztqVar = this.zzc;
            if (zztqVar != null) {
                zztqVar.zzy();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl(zztl zztlVar, long j10) {
        this.zze = zztlVar;
        zztm zztmVar = this.zzd;
        if (zztmVar != null) {
            zztmVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
        zztm zztmVar = this.zzd;
        int i10 = zzfj.zza;
        zztmVar.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        zztm zztmVar = this.zzd;
        return zztmVar != null && zztmVar.zzo(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        zztm zztmVar = this.zzd;
        return zztmVar != null && zztmVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzto zztoVar) {
        long jZzv = zzv(this.zzb);
        zztq zztqVar = this.zzc;
        Objects.requireNonNull(zztqVar);
        zztm zztmVarZzH = zztqVar.zzH(zztoVar, this.zzg, jZzv);
        this.zzd = zztmVarZzH;
        if (this.zze != null) {
            zztmVarZzH.zzl(this, jZzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zztm zztmVar = this.zzd;
        if (zztmVar != null) {
            zztq zztqVar = this.zzc;
            Objects.requireNonNull(zztqVar);
            zztqVar.zzF(zztmVar);
        }
    }

    public final void zzu(zztq zztqVar) {
        zzdy.zzf(this.zzc == null);
        this.zzc = zztqVar;
    }
}
