package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzwx extends zzwu {
    private final boolean zze;
    private final zzwm zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    public zzwx(int i10, zzcy zzcyVar, int i11, zzwm zzwmVar, int i12, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        byte b10;
        boolean z13;
        zzam zzamVar;
        int i14;
        int i15;
        int i16;
        super(i10, zzcyVar, i11);
        this.zzf = zzwmVar;
        int i17 = 1;
        int i18 = true != zzwmVar.zzJ ? 16 : 24;
        if (z10) {
            zzam zzamVar2 = this.zzd;
            int i19 = zzamVar2.zzr;
            float f10 = zzamVar2.zzt;
            if (f10 == -1.0f || f10 <= 2.1474836E9f) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.zze = z11;
        if (!z10 || (((i14 = (zzamVar = this.zzd).zzr) != -1 && i14 < 0) || ((i15 = zzamVar.zzs) != -1 && i15 < 0))) {
            z12 = false;
        } else {
            float f11 = zzamVar.zzt;
            if ((f11 == -1.0f || f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) && ((i16 = zzamVar.zzi) == -1 || i16 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.zzg = z12;
        this.zzh = zzwy.zzn(i12, false);
        zzam zzamVar3 = this.zzd;
        this.zzi = zzamVar3.zzi;
        this.zzj = zzamVar3.zza();
        int i20 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        int i21 = this.zzd.zzf;
        this.zzm = true;
        int i22 = 0;
        while (true) {
            if (i22 >= zzwmVar.zzo.size()) {
                i22 = Integer.MAX_VALUE;
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwmVar.zzo.get(i22))) {
                break;
            } else {
                i22++;
            }
        }
        this.zzk = i22;
        this.zzo = (i12 & 384) == 128;
        this.zzp = (i12 & 64) == 64;
        zzam zzamVar4 = this.zzd;
        String str2 = zzamVar4.zzm;
        int i23 = 4;
        if (str2 == null) {
            i23 = 0;
        } else {
            switch (str2) {
                case "video/dolby-vision":
                    b10 = 0;
                    break;
                case "video/av01":
                    b10 = 1;
                    break;
                case "video/hevc":
                    b10 = 2;
                    break;
                case "video/avc":
                    b10 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i23 = 5;
            } else if (b10 != 1) {
                if (b10 == 2) {
                    i23 = 3;
                } else if (b10 == 3) {
                    i23 = 2;
                } else if (b10 != 4) {
                    i23 = 0;
                } else {
                    i23 = 1;
                }
            }
        }
        this.zzq = i23;
        zzwm zzwmVar2 = this.zzf;
        if (!zzwy.zzn(i12, zzwmVar2.zzR) || (!(z13 = this.zze) && !zzwmVar2.zzH)) {
            i17 = 0;
        } else if (zzwy.zzn(i12, false) && this.zzg && z13 && zzamVar4.zzi != -1 && (i18 & i12) != 0) {
            i17 = 2;
        }
        this.zzn = i17;
    }

    public static /* synthetic */ int zza(zzwx zzwxVar, zzwx zzwxVar2) {
        zzftl zzftlVarZza = (zzwxVar.zze && zzwxVar.zzh) ? zzwy.zzc : zzwy.zzc.zza();
        zzfrr zzfrrVarZzj = zzfrr.zzj();
        Integer numValueOf = Integer.valueOf(zzwxVar.zzi);
        Integer numValueOf2 = Integer.valueOf(zzwxVar2.zzi);
        boolean z10 = zzwxVar.zzf.zzA;
        return zzfrrVarZzj.zzc(numValueOf, numValueOf2, zzwy.zzd).zzc(Integer.valueOf(zzwxVar.zzj), Integer.valueOf(zzwxVar2.zzj), zzftlVarZza).zzc(Integer.valueOf(zzwxVar.zzi), Integer.valueOf(zzwxVar2.zzi), zzftlVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzwx zzwxVar, zzwx zzwxVar2) {
        zzfrr zzfrrVarZzc = zzfrr.zzj().zzd(zzwxVar.zzh, zzwxVar2.zzh).zzb(zzwxVar.zzl, zzwxVar2.zzl).zzd(true, true).zzd(zzwxVar.zze, zzwxVar2.zze).zzd(zzwxVar.zzg, zzwxVar2.zzg).zzc(Integer.valueOf(zzwxVar.zzk), Integer.valueOf(zzwxVar2.zzk), zzftl.zzc().zza());
        boolean z10 = zzwxVar.zzo;
        zzfrr zzfrrVarZzd = zzfrrVarZzc.zzd(z10, zzwxVar2.zzo);
        boolean z11 = zzwxVar.zzp;
        zzfrr zzfrrVarZzd2 = zzfrrVarZzd.zzd(z11, zzwxVar2.zzp);
        if (z10 && z11) {
            zzfrrVarZzd2 = zzfrrVarZzd2.zzb(zzwxVar.zzq, zzwxVar2.zzq);
        }
        return zzfrrVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ boolean zzc(zzwu zzwuVar) {
        zzwx zzwxVar = (zzwx) zzwuVar;
        if (!zzfj.zzC(this.zzd.zzm, zzwxVar.zzd.zzm)) {
            return false;
        }
        boolean z10 = this.zzf.zzK;
        return this.zzo == zzwxVar.zzo && this.zzp == zzwxVar.zzp;
    }
}
