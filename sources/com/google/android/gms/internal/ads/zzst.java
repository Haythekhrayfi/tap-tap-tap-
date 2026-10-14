package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzst implements zztm, zztl {
    public final zztm zza;
    public long zzb;
    private zztl zzc;
    private zzss[] zzd = new zzss[0];
    private long zze = 0;

    public zzst(zztm zztmVar, boolean z10, long j10, long j11) {
        this.zza = zztmVar;
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zza(long j10, zzlm zzlmVar) {
        if (j10 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(zzlmVar.zzf, j10));
        long j11 = zzlmVar.zzg;
        long j12 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j11, j12 == Long.MIN_VALUE ? RecyclerView.FOREVER_NS : j12 - j10));
        if (jMax != zzlmVar.zzf || jMax2 != zzlmVar.zzg) {
            zzlmVar = new zzlm(jMax, jMax2);
        }
        return this.zza.zza(j10, zzlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzb < j10) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzc < j10) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzd() {
        if (zzq()) {
            long j10 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j10;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzdy.zzf(jZzd2 >= 0);
        long j11 = this.zzb;
        zzdy.zzf(j11 == Long.MIN_VALUE || jZzd2 <= j11);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zztm
    public final long zze(long j10) {
        this.zze = -9223372036854775807L;
        boolean z10 = false;
        for (zzss zzssVar : this.zzd) {
            if (zzssVar != null) {
                zzssVar.zzc();
            }
        }
        long jZze = this.zza.zze(j10);
        if (jZze == j10) {
            z10 = true;
        } else if (jZze >= 0) {
            long j11 = this.zzb;
            if (j11 == Long.MIN_VALUE || jZze <= j11) {
                z10 = true;
            }
        }
        zzdy.zzf(z10);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzf(zzxa[] zzxaVarArr, boolean[] zArr, zzvf[] zzvfVarArr, boolean[] zArr2, long j10) {
        int length = zzvfVarArr.length;
        this.zzd = new zzss[length];
        zzvf[] zzvfVarArr2 = new zzvf[length];
        int i10 = 0;
        while (true) {
            zzvf zzvfVar = null;
            if (i10 >= zzvfVarArr.length) {
                break;
            }
            zzss[] zzssVarArr = this.zzd;
            zzss zzssVar = (zzss) zzvfVarArr[i10];
            zzssVarArr[i10] = zzssVar;
            if (zzssVar != null) {
                zzvfVar = zzssVar.zza;
            }
            zzvfVarArr2[i10] = zzvfVar;
            i10++;
        }
        long jZzf = this.zza.zzf(zzxaVarArr, zArr, zzvfVarArr2, zArr2, j10);
        long j11 = (zzq() && j10 == 0) ? 0L : j10;
        this.zze = -9223372036854775807L;
        boolean z10 = true;
        if (jZzf != j11) {
            if (jZzf >= 0) {
                long j12 = this.zzb;
                if (j12 != Long.MIN_VALUE && jZzf > j12) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        zzdy.zzf(z10);
        for (int i11 = 0; i11 < zzvfVarArr.length; i11++) {
            zzvf zzvfVar2 = zzvfVarArr2[i11];
            if (zzvfVar2 == null) {
                this.zzd[i11] = null;
            } else {
                zzss[] zzssVarArr2 = this.zzd;
                zzss zzssVar2 = zzssVarArr2[i11];
                if (zzssVar2 == null || zzssVar2.zza != zzvfVar2) {
                    zzssVarArr2[i11] = new zzss(this, zzvfVar2);
                }
            }
            zzvfVarArr[i11] = this.zzd[i11];
        }
        return jZzf;
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
        this.zza.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl(zztl zztlVar, long j10) {
        this.zzc = zztlVar;
        this.zza.zzl(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    public final void zzn(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        return this.zza.zzo(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
