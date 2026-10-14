package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zztj extends zzvp {
    private final boolean zzb;
    private final zzcv zzc;
    private final zzct zzd;
    private zzth zze;
    private zztg zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztj(zztq zztqVar, boolean z10) {
        boolean z11;
        super(zztqVar);
        if (z10) {
            zztqVar.zzu();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        zztqVar.zzL();
        this.zze = zzth.zzq(zztqVar.zzI());
    }

    private final Object zzJ(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzth.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzK(long j10) {
        zztg zztgVar = this.zzf;
        int iZza = this.zze.zza(zztgVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        zzth zzthVar = this.zze;
        zzct zzctVar = this.zzd;
        zzthVar.zzd(iZza, zzctVar, false);
        long j11 = zzctVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zztgVar.zzs(j10);
    }

    public final zzcw zzB() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final zzto zzC(zzto zztoVar) {
        Object obj = zztoVar.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zzth.zzd;
        }
        return zztoVar.zzc(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzD(zzcw zzcwVar) {
        long j10;
        zzto zztoVarZzc = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzcwVar);
            zztg zztgVar = this.zzf;
            if (zztgVar != null) {
                zzK(zztgVar.zzn());
            }
        } else if (zzcwVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzcwVar) : zzth.zzr(zzcwVar, zzcv.zza, zzth.zzd);
        } else {
            zzcwVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzc;
            zztg zztgVar2 = this.zzf;
            if (zztgVar2 != null) {
                long jZzq = zztgVar2.zzq();
                this.zze.zzn(zztgVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j10 = jZzq;
                } else {
                    j10 = 0;
                }
            } else {
                j10 = 0;
            }
            Pair pairZzl = zzcwVar.zzl(this.zzc, this.zzd, 0, j10);
            Object obj2 = pairZzl.first;
            long jLongValue = ((Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzcwVar) : zzth.zzr(zzcwVar, obj, obj2);
            zztg zztgVar3 = this.zzf;
            if (zztgVar3 != null) {
                zzK(jLongValue);
                zzto zztoVar = zztgVar3.zza;
                zztoVarZzc = zztoVar.zzc(zzJ(zztoVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zztoVarZzc != null) {
            zztg zztgVar4 = this.zzf;
            Objects.requireNonNull(zztgVar4);
            zztgVar4.zzr(zztoVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzE() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzA(null, ((zzvp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzvp, com.google.android.gms.internal.ads.zztq
    public final void zzF(zztm zztmVar) {
        ((zztg) zztmVar).zzt();
        if (zztmVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp, com.google.android.gms.internal.ads.zztq
    /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
    public final zztg zzH(zzto zztoVar, zzxp zzxpVar, long j10) {
        zztg zztgVar = new zztg(zztoVar, zzxpVar, j10);
        zztgVar.zzu(((zzvp) this).zza);
        if (this.zzh) {
            zztgVar.zzr(zztoVar.zzc(zzJ(zztoVar.zza)));
        } else {
            this.zzf = zztgVar;
            if (!this.zzg) {
                this.zzg = true;
                zzA(null, ((zzvp) this).zza);
            }
        }
        return zztgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzsp
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zztq
    public final void zzy() {
    }
}
