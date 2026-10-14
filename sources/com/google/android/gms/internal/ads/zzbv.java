package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv {
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;

    @Deprecated
    public final Integer zzl;
    public final Boolean zzm;

    @Deprecated
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final Integer zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final CharSequence zzy;
    public final Integer zzz;
    public static final zzbv zza = new zzbv(new zzbt());
    private static final String zzA = Integer.toString(0, 36);
    private static final String zzB = Integer.toString(1, 36);
    private static final String zzC = Integer.toString(2, 36);
    private static final String zzD = Integer.toString(3, 36);
    private static final String zzE = Integer.toString(4, 36);
    private static final String zzF = Integer.toString(5, 36);
    private static final String zzG = Integer.toString(6, 36);
    private static final String zzH = Integer.toString(8, 36);
    private static final String zzI = Integer.toString(9, 36);
    private static final String zzJ = Integer.toString(10, 36);
    private static final String zzK = Integer.toString(11, 36);
    private static final String zzL = Integer.toString(12, 36);
    private static final String zzM = Integer.toString(13, 36);
    private static final String zzN = Integer.toString(14, 36);
    private static final String zzO = Integer.toString(15, 36);
    private static final String zzP = Integer.toString(16, 36);
    private static final String zzQ = Integer.toString(17, 36);
    private static final String zzR = Integer.toString(18, 36);
    private static final String zzS = Integer.toString(19, 36);
    private static final String zzT = Integer.toString(20, 36);
    private static final String zzU = Integer.toString(21, 36);
    private static final String zzV = Integer.toString(22, 36);
    private static final String zzW = Integer.toString(23, 36);
    private static final String zzX = Integer.toString(24, 36);
    private static final String zzY = Integer.toString(25, 36);
    private static final String zzZ = Integer.toString(26, 36);
    private static final String zzaa = Integer.toString(27, 36);
    private static final String zzab = Integer.toString(28, 36);
    private static final String zzac = Integer.toString(29, 36);
    private static final String zzad = Integer.toString(30, 36);
    private static final String zzae = Integer.toString(31, 36);
    private static final String zzaf = Integer.toString(32, 36);
    private static final String zzag = Integer.toString(1000, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbr
    };

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    private zzbv(zzbt zzbtVar) {
        Boolean boolValueOf = zzbtVar.zzk;
        Integer numValueOf = zzbtVar.zzj;
        Integer numValueOf2 = zzbtVar.zzw;
        int i10 = 1;
        int i11 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                } else {
                    i10 = 0;
                }
                numValueOf = Integer.valueOf(i10);
            }
        } else if (numValueOf != null) {
            boolValueOf = Boolean.valueOf(numValueOf.intValue() != -1);
            if (boolValueOf.booleanValue() && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i11);
            }
        }
        this.zzc = zzbtVar.zza;
        this.zzd = zzbtVar.zzb;
        this.zze = zzbtVar.zzc;
        this.zzf = zzbtVar.zzd;
        this.zzg = zzbtVar.zze;
        this.zzh = zzbtVar.zzf;
        this.zzi = zzbtVar.zzg;
        this.zzj = zzbtVar.zzh;
        this.zzk = zzbtVar.zzi;
        this.zzl = numValueOf;
        this.zzm = boolValueOf;
        this.zzn = zzbtVar.zzl;
        this.zzo = zzbtVar.zzl;
        this.zzp = zzbtVar.zzm;
        this.zzq = zzbtVar.zzn;
        this.zzr = zzbtVar.zzo;
        this.zzs = zzbtVar.zzp;
        this.zzt = zzbtVar.zzq;
        this.zzu = zzbtVar.zzr;
        this.zzv = zzbtVar.zzs;
        this.zzw = zzbtVar.zzt;
        this.zzx = zzbtVar.zzu;
        this.zzy = zzbtVar.zzv;
        this.zzz = numValueOf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbv.class == obj.getClass()) {
            zzbv zzbvVar = (zzbv) obj;
            if (zzfj.zzC(this.zzc, zzbvVar.zzc) && zzfj.zzC(this.zzd, zzbvVar.zzd) && zzfj.zzC(this.zze, zzbvVar.zze) && zzfj.zzC(this.zzf, zzbvVar.zzf) && zzfj.zzC(null, null) && zzfj.zzC(null, null) && zzfj.zzC(this.zzg, zzbvVar.zzg) && zzfj.zzC(null, null) && zzfj.zzC(null, null) && Arrays.equals(this.zzh, zzbvVar.zzh) && zzfj.zzC(this.zzi, zzbvVar.zzi) && zzfj.zzC(null, null) && zzfj.zzC(this.zzj, zzbvVar.zzj) && zzfj.zzC(this.zzk, zzbvVar.zzk) && zzfj.zzC(this.zzl, zzbvVar.zzl) && zzfj.zzC(this.zzm, zzbvVar.zzm) && zzfj.zzC(null, null) && zzfj.zzC(this.zzo, zzbvVar.zzo) && zzfj.zzC(this.zzp, zzbvVar.zzp) && zzfj.zzC(this.zzq, zzbvVar.zzq) && zzfj.zzC(this.zzr, zzbvVar.zzr) && zzfj.zzC(this.zzs, zzbvVar.zzs) && zzfj.zzC(this.zzt, zzbvVar.zzt) && zzfj.zzC(this.zzu, zzbvVar.zzu) && zzfj.zzC(this.zzv, zzbvVar.zzv) && zzfj.zzC(this.zzw, zzbvVar.zzw) && zzfj.zzC(null, null) && zzfj.zzC(null, null) && zzfj.zzC(this.zzx, zzbvVar.zzx) && zzfj.zzC(null, null) && zzfj.zzC(this.zzy, zzbvVar.zzy) && zzfj.zzC(this.zzz, zzbvVar.zzz)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, null, null, this.zzx, null, this.zzy, this.zzz});
    }

    public final zzbt zza() {
        return new zzbt(this, null);
    }
}
