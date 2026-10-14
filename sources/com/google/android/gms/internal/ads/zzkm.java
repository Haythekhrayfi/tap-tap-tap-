package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzkm {
    public final zztm zza;
    public final Object zzb;
    public final zzvf[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkn zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlk[] zzi;
    private final zzxg zzj;
    private final zzlb zzk;
    private zzkm zzl;
    private zzvn zzm;
    private zzxh zzn;
    private long zzo;

    public zzkm(zzlk[] zzlkVarArr, long j10, zzxg zzxgVar, zzxp zzxpVar, zzlb zzlbVar, zzkn zzknVar, zzxh zzxhVar) {
        this.zzi = zzlkVarArr;
        this.zzo = j10;
        this.zzj = zzxgVar;
        this.zzk = zzlbVar;
        zzto zztoVar = zzknVar.zza;
        this.zzb = zztoVar.zza;
        this.zzf = zzknVar;
        this.zzm = zzvn.zza;
        this.zzn = zzxhVar;
        this.zzc = new zzvf[2];
        this.zzh = new boolean[2];
        long j11 = zzknVar.zzb;
        long j12 = zzknVar.zzd;
        zztm zztmVarZzo = zzlbVar.zzo(zztoVar, zzxpVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zzst(zztmVarZzo, true, 0L, j12) : zztmVarZzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzxh zzxhVar = this.zzn;
            if (i10 >= zzxhVar.zza) {
                return;
            }
            zzxhVar.zzb(i10);
            zzxa zzxaVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzxh zzxhVar = this.zzn;
            if (i10 >= zzxhVar.zza) {
                return;
            }
            zzxhVar.zzb(i10);
            zzxa zzxaVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzxh zzxhVar, long j10, boolean z10) {
        return zzb(zzxhVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzxh zzxhVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzxhVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzxhVar.zza(this.zzn, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlk[] zzlkVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzlkVarArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzxhVar;
        zzt();
        long jZzf = this.zza.zzf(zzxhVar.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzlk[] zzlkVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzlkVarArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zzc;
            if (i13 >= 2) {
                return jZzf;
            }
            if (zzvfVarArr[i13] != null) {
                zzdy.zzf(zzxhVar.zzb(i13));
                this.zzi[i13].zzb();
                this.zze = true;
            } else {
                zzdy.zzf(zzxhVar.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkm zzg() {
        return this.zzl;
    }

    public final zzvn zzh() {
        return this.zzm;
    }

    public final zzxh zzi() {
        return this.zzn;
    }

    public final zzxh zzj(float f10, zzcw zzcwVar) throws zzih {
        zzxh zzxhVarZzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcwVar);
        for (zzxa zzxaVar : zzxhVarZzo.zzc) {
        }
        return zzxhVarZzo;
    }

    public final void zzk(long j10) {
        zzdy.zzf(zzu());
        this.zza.zzo(j10 - this.zzo);
    }

    public final void zzl(float f10, zzcw zzcwVar) throws zzih {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxh zzxhVarZzj = zzj(f10, zzcwVar);
        zzkn zzknVar = this.zzf;
        long jMax = zzknVar.zzb;
        long j10 = zzknVar.zze;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZza = zza(zzxhVarZzj, jMax, false);
        long j11 = this.zzo;
        zzkn zzknVar2 = this.zzf;
        this.zzo = (zzknVar2.zzb - jZza) + j11;
        this.zzf = zzknVar2.zzb(jZza);
    }

    public final void zzm(long j10) {
        zzdy.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzlb zzlbVar = this.zzk;
        zztm zztmVar = this.zza;
        try {
            if (zztmVar instanceof zzst) {
                zzlbVar.zzh(((zzst) zztmVar).zza);
            } else {
                zzlbVar.zzh(zztmVar);
            }
        } catch (RuntimeException e10) {
            zzer.zzd("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzkm zzkmVar) {
        if (zzkmVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkmVar;
        zzt();
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztm zztmVar = this.zza;
        if (zztmVar instanceof zzst) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzst) zztmVar).zzn(0L, j10);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
