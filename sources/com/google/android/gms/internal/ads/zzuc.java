package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzuc implements zztm, zztl {
    private final zztm zza;
    private final long zzb;
    private zztl zzc;

    public zzuc(zztm zztmVar, long j10) {
        this.zza = zztmVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zza(long j10, zzlm zzlmVar) {
        return this.zza.zza(j10 - this.zzb, zzlmVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zze(long j10) {
        return this.zza.zze(j10 - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzf(zzxa[] zzxaVarArr, boolean[] zArr, zzvf[] zzvfVarArr, boolean[] zArr2, long j10) {
        zzvf[] zzvfVarArr2 = new zzvf[zzvfVarArr.length];
        int i10 = 0;
        while (true) {
            zzvf zzvfVarZzc = null;
            if (i10 >= zzvfVarArr.length) {
                break;
            }
            zzud zzudVar = (zzud) zzvfVarArr[i10];
            if (zzudVar != null) {
                zzvfVarZzc = zzudVar.zzc();
            }
            zzvfVarArr2[i10] = zzvfVarZzc;
            i10++;
        }
        long jZzf = this.zza.zzf(zzxaVarArr, zArr, zzvfVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzvfVarArr.length; i11++) {
            zzvf zzvfVar = zzvfVarArr2[i11];
            if (zzvfVar == null) {
                zzvfVarArr[i11] = null;
            } else {
                zzvf zzvfVar2 = zzvfVarArr[i11];
                if (zzvfVar2 == null || ((zzud) zzvfVar2).zzc() != zzvfVar) {
                    zzvfVarArr[i11] = new zzud(zzvfVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* bridge */ /* synthetic */ void zzg(zzvh zzvhVar) {
        zztl zztlVar = this.zzc;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final zzvn zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzi(zztm zztmVar) {
        zztl zztlVar = this.zzc;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl(zztl zztlVar, long j10) {
        this.zzc = zztlVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        return this.zza.zzo(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
