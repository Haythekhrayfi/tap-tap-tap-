package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzwg extends zzwu implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzwm zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzwg(int i10, zzcy zzcyVar, int i11, zzwm zzwmVar, int i12, boolean z10, zzfpi zzfpiVar) {
        int i13;
        int iZza;
        int iZza2;
        boolean z11;
        super(i10, zzcyVar, i11);
        this.zzh = zzwmVar;
        this.zzg = zzwy.zzg(this.zzd.zzd);
        int i14 = 0;
        this.zzi = zzwy.zzn(i12, false);
        int i15 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i15 >= zzwmVar.zzq.size()) {
                iZza = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZza = zzwy.zza(this.zzd, (String) zzwmVar.zzq.get(i15), false);
                if (iZza > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzk = i15;
        this.zzj = iZza;
        int i16 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i17 = zzamVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        this.zzf = zzfpiVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzfj.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzfj.zzx(configuration.locale)};
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = zzfj.zzz(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                iZza2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iZza2 = zzwy.zza(this.zzd, strArrSplit[i19], false);
                if (iZza2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzn = i19;
        this.zzo = iZza2;
        for (int i20 = 0; i20 < zzwmVar.zzu.size(); i20++) {
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwmVar.zzu.get(i20))) {
                i13 = i20;
                break;
            }
        }
        this.zzt = i13;
        this.zzu = (i12 & 384) == 128;
        this.zzv = (i12 & 64) == 64;
        zzwm zzwmVar2 = this.zzh;
        if (zzwy.zzn(i12, zzwmVar2.zzR) && ((z11 = this.zzf) || zzwmVar2.zzL)) {
            i14 = (!zzwy.zzn(i12, false) || !z11 || this.zzd.zzi == -1 || (!zzwmVar2.zzT && z10)) ? 1 : 2;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwg zzwgVar) {
        zzftl zzftlVarZza = (this.zzf && this.zzi) ? zzwy.zzc : zzwy.zzc.zza();
        zzfrr zzfrrVarZzc = zzfrr.zzj().zzd(this.zzi, zzwgVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwgVar.zzk), zzftl.zzc().zza()).zzb(this.zzj, zzwgVar.zzj).zzb(this.zzl, zzwgVar.zzl).zzd(this.zzp, zzwgVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwgVar.zzn), zzftl.zzc().zza()).zzb(this.zzo, zzwgVar.zzo).zzd(this.zzf, zzwgVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwgVar.zzt), zzftl.zzc().zza());
        Integer numValueOf = Integer.valueOf(this.zzs);
        Integer numValueOf2 = Integer.valueOf(zzwgVar.zzs);
        boolean z10 = this.zzh.zzA;
        zzfrr zzfrrVarZzc2 = zzfrrVarZzc.zzc(numValueOf, numValueOf2, zzwy.zzd).zzd(this.zzu, zzwgVar.zzu).zzd(this.zzv, zzwgVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwgVar.zzq), zzftlVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwgVar.zzr), zzftlVarZza);
        Integer numValueOf3 = Integer.valueOf(this.zzs);
        Integer numValueOf4 = Integer.valueOf(zzwgVar.zzs);
        if (!zzfj.zzC(this.zzg, zzwgVar.zzg)) {
            zzftlVarZza = zzwy.zzd;
        }
        return zzfrrVarZzc2.zzc(numValueOf3, numValueOf4, zzftlVarZza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ boolean zzc(zzwu zzwuVar) {
        String str;
        zzwg zzwgVar = (zzwg) zzwuVar;
        boolean z10 = this.zzh.zzO;
        zzam zzamVar = this.zzd;
        int i10 = zzamVar.zzz;
        if (i10 == -1) {
            return false;
        }
        zzam zzamVar2 = zzwgVar.zzd;
        if (i10 != zzamVar2.zzz || (str = zzamVar.zzm) == null || !TextUtils.equals(str, zzamVar2.zzm)) {
            return false;
        }
        boolean z11 = this.zzh.zzN;
        int i11 = this.zzd.zzA;
        return i11 != -1 && i11 == zzwgVar.zzd.zzA && this.zzu == zzwgVar.zzu && this.zzv == zzwgVar.zzv;
    }
}
