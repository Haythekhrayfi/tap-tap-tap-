package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzkp {
    private final zzct zza = new zzct();
    private final zzcv zzb = new zzcv();
    private final zzls zzc;
    private final zzei zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkm zzh;
    private zzkm zzi;
    private zzkm zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkp(zzls zzlsVar, zzei zzeiVar) {
        this.zzc = zzlsVar;
        this.zzd = zzeiVar;
    }

    private final boolean zzA(zzcw zzcwVar, zzto zztoVar) {
        if (zzC(zztoVar)) {
            return zzcwVar.zze(zzcwVar.zzn(zztoVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzcwVar.zza(zztoVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcw zzcwVar) {
        zzkm zzkmVarZzg = this.zzh;
        if (zzkmVarZzg == null) {
            return true;
        }
        int iZza = zzcwVar.zza(zzkmVarZzg.zzb);
        while (true) {
            iZza = zzcwVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzkmVarZzg.zzg() != null && !zzkmVarZzg.zzf.zzg) {
                zzkmVarZzg = zzkmVarZzg.zzg();
            }
            zzkm zzkmVarZzg2 = zzkmVarZzg.zzg();
            if (iZza == -1 || zzkmVarZzg2 == null || zzcwVar.zza(zzkmVarZzg2.zzb) != iZza) {
                break;
            }
            zzkmVarZzg = zzkmVarZzg2;
        }
        boolean zZzm = zzm(zzkmVarZzg);
        zzkmVarZzg.zzf = zzg(zzcwVar, zzkmVarZzg.zzf);
        return !zZzm;
    }

    private static final boolean zzC(zzto zztoVar) {
        return !zztoVar.zzb() && zztoVar.zze == -1;
    }

    private final long zzs(zzcw zzcwVar, Object obj, int i10) {
        zzcwVar.zzn(obj, this.zza);
        this.zza.zzi(i10);
        this.zza.zzk(i10);
        return 0L;
    }

    private final zzkn zzt(zzcw zzcwVar, zzkm zzkmVar, long j10) {
        int iZze;
        Object obj;
        long jMax;
        long j11;
        Object obj2;
        int i10;
        long j12;
        long j13;
        zzkn zzknVar = zzkmVar.zzf;
        long jZze = (zzkmVar.zze() + zzknVar.zze) - j10;
        if (zzknVar.zzg) {
            long j14 = 0;
            int iZzi = zzcwVar.zzi(zzcwVar.zza(zzknVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i11 = zzcwVar.zzd(iZzi, this.zza, true).zzd;
                Object obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
                long j15 = zzknVar.zza.zzd;
                if (zzcwVar.zze(i11, this.zzb, 0L).zzo == iZzi) {
                    Pair pairZzm = zzcwVar.zzm(this.zzb, this.zza, i11, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj3 = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        zzkm zzkmVarZzg = zzkmVar.zzg();
                        if (zzkmVarZzg == null || !zzkmVarZzg.zzb.equals(obj3)) {
                            j15 = this.zze;
                            this.zze = 1 + j15;
                        } else {
                            j15 = zzkmVarZzg.zzf.zza.zzd;
                        }
                        j13 = jLongValue;
                        j14 = -9223372036854775807L;
                    }
                } else {
                    j13 = 0;
                }
                zzto zztoVarZzx = zzx(zzcwVar, obj3, j13, j15, this.zzb, this.zza);
                if (j14 != -9223372036854775807L && zzknVar.zzc != -9223372036854775807L) {
                    zzcwVar.zzn(zzknVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcwVar, zztoVarZzx, j14, j13);
            }
        } else {
            zzto zztoVar = zzknVar.zza;
            zzcwVar.zzn(zztoVar.zza, this.zza);
            if (!zztoVar.zzb()) {
                int i12 = zztoVar.zze;
                if (i12 != -1) {
                    this.zza.zzm(i12);
                }
                iZze = this.zza.zze(zztoVar.zze);
                this.zza.zzn(zztoVar.zze);
                if (iZze != this.zza.zza(zztoVar.zze)) {
                    obj2 = zztoVar.zza;
                    i10 = zztoVar.zze;
                    j12 = zzknVar.zze;
                    return zzv(zzcwVar, obj2, i10, iZze, j12, zztoVar.zzd);
                }
                zzs(zzcwVar, zztoVar.zza, zztoVar.zze);
                obj = zztoVar.zza;
                jMax = 0;
                j11 = zzknVar.zze;
                return zzw(zzcwVar, obj, jMax, j11, zztoVar.zzd);
            }
            i10 = zztoVar.zzb;
            if (this.zza.zza(i10) != -1) {
                iZze = this.zza.zzf(i10, zztoVar.zzc);
                if (iZze < 0) {
                    obj2 = zztoVar.zza;
                    j12 = zzknVar.zzc;
                    return zzv(zzcwVar, obj2, i10, iZze, j12, zztoVar.zzd);
                }
                long jLongValue2 = zzknVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    zzcv zzcvVar = this.zzb;
                    zzct zzctVar = this.zza;
                    Pair pairZzm2 = zzcwVar.zzm(zzcvVar, zzctVar, zzctVar.zzd, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                zzs(zzcwVar, zztoVar.zza, zztoVar.zzb);
                obj = zztoVar.zza;
                jMax = Math.max(0L, jLongValue2);
                j11 = zzknVar.zzc;
                return zzw(zzcwVar, obj, jMax, j11, zztoVar.zzd);
            }
        }
        return null;
    }

    private final zzkn zzu(zzcw zzcwVar, zzto zztoVar, long j10, long j11) {
        zzcwVar.zzn(zztoVar.zza, this.zza);
        boolean zZzb = zztoVar.zzb();
        Object obj = zztoVar.zza;
        return zZzb ? zzv(zzcwVar, obj, zztoVar.zzb, zztoVar.zzc, j10, zztoVar.zzd) : zzw(zzcwVar, obj, j11, j10, zztoVar.zzd);
    }

    private final zzkn zzv(zzcw zzcwVar, Object obj, int i10, int i11, long j10, long j11) {
        zzto zztoVar = new zzto(obj, i10, i11, j11);
        long jZzh = zzcwVar.zzn(zztoVar.zza, this.zza).zzh(zztoVar.zzb, zztoVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztoVar.zzb);
        return new zzkn(zztoVar, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j10, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final zzkn zzw(zzcw zzcwVar, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        zzcwVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzm(iZzc);
        }
        zzct zzctVar = this.zza;
        if (iZzc == -1) {
            zzctVar.zzb();
        } else {
            zzctVar.zzn(iZzc);
        }
        zzto zztoVar = new zzto(obj, j12, iZzc);
        boolean zZzC = zzC(zztoVar);
        boolean zZzA = zzA(zzcwVar, zztoVar);
        boolean zZzz = zzz(zzcwVar, zztoVar, zZzC);
        if (iZzc != -1) {
            this.zza.zzn(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzi(iZzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.zza.zze;
        }
        if (j15 != -9223372036854775807L && jMax >= j15) {
            jMax = Math.max(0L, j15 - 1);
        }
        return new zzkn(zztoVar, jMax, j11, j14, j15, false, zZzC, zZzA, zZzz);
    }

    private static zzto zzx(zzcw zzcwVar, Object obj, long j10, long j11, zzcv zzcvVar, zzct zzctVar) {
        zzcwVar.zzn(obj, zzctVar);
        zzcwVar.zze(zzctVar.zzd, zzcvVar, 0L);
        zzcwVar.zza(obj);
        zzctVar.zzb();
        zzcwVar.zzn(obj, zzctVar);
        int iZzd = zzctVar.zzd(j10);
        return iZzd == -1 ? new zzto(obj, j11, zzctVar.zzc(j10)) : new zzto(obj, iZzd, zzctVar.zze(iZzd), j11);
    }

    private final void zzy() {
        final zzfrz zzfrzVar = new zzfrz();
        for (zzkm zzkmVarZzg = this.zzh; zzkmVarZzg != null; zzkmVarZzg = zzkmVarZzg.zzg()) {
            zzfrzVar.zzf(zzkmVarZzg.zzf.zza);
        }
        zzkm zzkmVar = this.zzi;
        final zzto zztoVar = zzkmVar == null ? null : zzkmVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzko
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(zzfrzVar, zztoVar);
            }
        });
    }

    private final boolean zzz(zzcw zzcwVar, zzto zztoVar, boolean z10) {
        int iZza = zzcwVar.zza(zztoVar.zza);
        return !zzcwVar.zze(zzcwVar.zzd(iZza, this.zza, false).zzd, this.zzb, 0L).zzi && zzcwVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z10;
    }

    public final zzkm zza() {
        zzkm zzkmVar = this.zzh;
        if (zzkmVar == null) {
            return null;
        }
        if (zzkmVar == this.zzi) {
            this.zzi = zzkmVar.zzg();
        }
        zzkmVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzkm zzkmVar2 = this.zzh;
            this.zzl = zzkmVar2.zzb;
            this.zzm = zzkmVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzkm zzb() {
        zzkm zzkmVar = this.zzi;
        boolean z10 = false;
        if (zzkmVar != null && zzkmVar.zzg() != null) {
            z10 = true;
        }
        zzdy.zzf(z10);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzkm zzc() {
        return this.zzj;
    }

    public final zzkm zzd() {
        return this.zzh;
    }

    public final zzkm zze() {
        return this.zzi;
    }

    public final zzkn zzf(long j10, zzlc zzlcVar) {
        zzkm zzkmVar = this.zzj;
        return zzkmVar == null ? zzu(zzlcVar.zza, zzlcVar.zzb, zzlcVar.zzc, zzlcVar.zzr) : zzt(zzlcVar.zza, zzkmVar, j10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final zzkn zzg(zzcw zzcwVar, zzkn zzknVar) {
        long j10;
        long jZzh;
        long j11;
        long j12;
        int i10;
        int i11;
        zzto zztoVar = zzknVar.zza;
        boolean zZzC = zzC(zztoVar);
        boolean zZzA = zzA(zzcwVar, zztoVar);
        boolean zZzz = zzz(zzcwVar, zztoVar, zZzC);
        zzcwVar.zzn(zzknVar.zza.zza, this.zza);
        if (zztoVar.zzb() || (i11 = zztoVar.zze) == -1) {
            j10 = -9223372036854775807L;
        } else {
            this.zza.zzi(i11);
            j10 = 0;
        }
        if (!zztoVar.zzb()) {
            if (j10 != -9223372036854775807L) {
                j11 = 0;
                j12 = 0;
            } else {
                jZzh = this.zza.zze;
            }
            if (zztoVar.zzb()) {
                this.zza.zzn(zztoVar.zzb);
            } else {
                i10 = zztoVar.zze;
                if (i10 != -1) {
                    this.zza.zzn(i10);
                }
            }
            return new zzkn(zztoVar, zzknVar.zzb, zzknVar.zzc, j11, j12, false, zZzC, zZzA, zZzz);
        }
        jZzh = this.zza.zzh(zztoVar.zzb, zztoVar.zzc);
        j11 = j10;
        j12 = jZzh;
        if (zztoVar.zzb()) {
            this.zza.zzn(zztoVar.zzb);
        } else {
            i10 = zztoVar.zze;
            if (i10 != -1) {
                this.zza.zzn(i10);
            }
        }
        return new zzkn(zztoVar, zzknVar.zzb, zzknVar.zzc, j11, j12, false, zZzC, zZzA, zZzz);
    }

    public final zzto zzh(zzcw zzcwVar, Object obj, long j10) {
        long j11;
        int iZza;
        int i10 = zzcwVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzcwVar.zza(obj2)) == -1 || zzcwVar.zzd(iZza, this.zza, false).zzd != i10) {
            zzkm zzkmVarZzg = this.zzh;
            while (true) {
                if (zzkmVarZzg == null) {
                    zzkmVarZzg = this.zzh;
                    while (true) {
                        if (zzkmVarZzg == null) {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                            if (this.zzh != null) {
                                break;
                            }
                            this.zzl = obj;
                            this.zzm = j11;
                            break;
                        }
                        int iZza2 = zzcwVar.zza(zzkmVarZzg.zzb);
                        if (iZza2 == -1 || zzcwVar.zzd(iZza2, this.zza, false).zzd != i10) {
                            zzkmVarZzg = zzkmVarZzg.zzg();
                        }
                    }
                } else if (!zzkmVarZzg.zzb.equals(obj)) {
                    zzkmVarZzg = zzkmVarZzg.zzg();
                }
                j11 = zzkmVarZzg.zzf.zza.zzd;
                break;
            }
        } else {
            j11 = this.zzm;
        }
        long j12 = j11;
        zzcwVar.zzn(obj, this.zza);
        zzcwVar.zze(this.zza.zzd, this.zzb, 0L);
        int iZza3 = zzcwVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcv zzcvVar = this.zzb;
            if (iZza3 < zzcvVar.zzo) {
                return zzx(zzcwVar, obj3, j10, j12, zzcvVar, this.zza);
            }
            zzcwVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzct zzctVar = this.zza;
            if (zzctVar.zzd(zzctVar.zze) != -1) {
                obj3 = this.zza.zzc;
                Objects.requireNonNull(obj3);
            }
            iZza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzkm zzkmVarZzg = this.zzh;
        zzdy.zzb(zzkmVarZzg);
        this.zzl = zzkmVarZzg.zzb;
        this.zzm = zzkmVarZzg.zzf.zza.zzd;
        while (zzkmVarZzg != null) {
            zzkmVarZzg.zzn();
            zzkmVarZzg = zzkmVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfrz zzfrzVar, zzto zztoVar) {
        this.zzc.zzQ(zzfrzVar.zzi(), zztoVar);
    }

    public final void zzk(long j10) {
        zzkm zzkmVar = this.zzj;
        if (zzkmVar != null) {
            zzkmVar.zzm(j10);
        }
    }

    public final boolean zzl(zztm zztmVar) {
        zzkm zzkmVar = this.zzj;
        return zzkmVar != null && zzkmVar.zza == zztmVar;
    }

    public final boolean zzm(zzkm zzkmVar) {
        boolean z10 = false;
        zzdy.zzf(zzkmVar != null);
        if (zzkmVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkmVar;
        while (zzkmVar.zzg() != null) {
            zzkmVar = zzkmVar.zzg();
            if (zzkmVar == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzkmVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z10;
    }

    public final boolean zzn() {
        zzkm zzkmVar = this.zzj;
        if (zzkmVar == null) {
            return true;
        }
        if (zzkmVar.zzf.zzi || !zzkmVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    public final boolean zzo(zzcw zzcwVar, long j10, long j11) {
        zzkn zzknVarZzg;
        boolean z10;
        zzkm zzkmVar = null;
        for (zzkm zzkmVarZzg = this.zzh; zzkmVarZzg != null; zzkmVarZzg = zzkmVarZzg.zzg()) {
            zzkn zzknVar = zzkmVarZzg.zzf;
            if (zzkmVar == null) {
                zzknVarZzg = zzg(zzcwVar, zzknVar);
            } else {
                zzkn zzknVarZzt = zzt(zzcwVar, zzkmVar, j10);
                if (zzknVarZzt == null) {
                    return !zzm(zzkmVar);
                }
                if (zzknVar.zzb != zzknVarZzt.zzb || !zzknVar.zza.equals(zzknVarZzt.zza)) {
                    return !zzm(zzkmVar);
                }
                zzknVarZzg = zzknVarZzt;
            }
            zzkmVarZzg.zzf = zzknVarZzg.zza(zzknVar.zzc);
            long j12 = zzknVar.zze;
            long j13 = zzknVarZzg.zze;
            if (j12 != -9223372036854775807L && j12 != j13) {
                zzkmVarZzg.zzq();
                long j14 = zzknVarZzg.zze;
                long jZze = j14 == -9223372036854775807L ? RecyclerView.FOREVER_NS : j14 + zzkmVarZzg.zze();
                if (zzkmVarZzg == this.zzi) {
                    boolean z11 = zzkmVarZzg.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= jZze) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                return (zzm(zzkmVarZzg) || z10) ? false : true;
            }
            zzkmVar = zzkmVarZzg;
        }
        return true;
    }

    public final boolean zzp(zzcw zzcwVar, int i10) {
        this.zzf = i10;
        return zzB(zzcwVar);
    }

    public final boolean zzq(zzcw zzcwVar, boolean z10) {
        this.zzg = z10;
        return zzB(zzcwVar);
    }

    public final zzkm zzr(zzlk[] zzlkVarArr, zzxg zzxgVar, zzxp zzxpVar, zzlb zzlbVar, zzkn zzknVar, zzxh zzxhVar) {
        zzkm zzkmVar = this.zzj;
        zzkm zzkmVar2 = new zzkm(zzlkVarArr, zzkmVar == null ? 1000000000000L : (zzkmVar.zze() + zzkmVar.zzf.zze) - zzknVar.zzb, zzxgVar, zzxpVar, zzlbVar, zzknVar, zzxhVar);
        zzkm zzkmVar3 = this.zzj;
        if (zzkmVar3 != null) {
            zzkmVar3.zzo(zzkmVar2);
        } else {
            this.zzh = zzkmVar2;
            this.zzi = zzkmVar2;
        }
        this.zzl = null;
        this.zzj = zzkmVar2;
        this.zzk++;
        zzy();
        return zzkmVar2;
    }
}
