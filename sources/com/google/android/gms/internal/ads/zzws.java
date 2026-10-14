package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzws extends zzwu implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzws(int i10, zzcy zzcyVar, int i11, zzwm zzwmVar, int i12, String str) {
        int iZza;
        super(i10, zzcyVar, i11);
        int i13 = 0;
        this.zzf = zzwy.zzn(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzwmVar.zzy;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzfsc zzfscVarZzm = zzwmVar.zzw.isEmpty() ? zzfsc.zzm("") : zzwmVar.zzw;
        int i16 = 0;
        while (true) {
            if (i16 >= zzfscVarZzm.size()) {
                i16 = Integer.MAX_VALUE;
                iZza = 0;
                break;
            } else {
                iZza = zzwy.zza(this.zzd, (String) zzfscVarZzm.get(i16), false);
                if (iZza > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZza;
        int i17 = this.zzd.zzf;
        int iBitCount = Integer.bitCount(0);
        this.zzk = iBitCount;
        int i18 = this.zzd.zzf;
        this.zzm = false;
        int iZza2 = zzwy.zza(this.zzd, str, zzwy.zzg(str) == null);
        this.zzl = iZza2;
        boolean z10 = iZza > 0 || (zzwmVar.zzw.isEmpty() && iBitCount > 0) || this.zzg || (this.zzh && iZza2 > 0);
        if (zzwy.zzn(i12, zzwmVar.zzR) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzws zzwsVar) {
        zzfrr zzfrrVarZzb = zzfrr.zzj().zzd(this.zzf, zzwsVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzwsVar.zzi), zzftl.zzc().zza()).zzb(this.zzj, zzwsVar.zzj).zzb(this.zzk, zzwsVar.zzk).zzd(this.zzg, zzwsVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzwsVar.zzh), this.zzj == 0 ? zzftl.zzc() : zzftl.zzc().zza()).zzb(this.zzl, zzwsVar.zzl);
        if (this.zzk == 0) {
            zzfrrVarZzb = zzfrrVarZzb.zze(false, false);
        }
        return zzfrrVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ boolean zzc(zzwu zzwuVar) {
        return false;
    }
}
