package com.google.android.gms.internal.ads;

import android.support.v4.media.b;
import j1.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzan;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbz zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzs zzy;
    public final int zzz;
    private static final zzam zzG = new zzam(new zzak());
    private static final String zzH = Integer.toString(0, 36);
    private static final String zzI = Integer.toString(1, 36);
    private static final String zzJ = Integer.toString(2, 36);
    private static final String zzK = Integer.toString(3, 36);
    private static final String zzL = Integer.toString(4, 36);
    private static final String zzM = Integer.toString(5, 36);
    private static final String zzN = Integer.toString(6, 36);
    private static final String zzO = Integer.toString(7, 36);
    private static final String zzP = Integer.toString(8, 36);
    private static final String zzQ = Integer.toString(9, 36);
    private static final String zzR = Integer.toString(10, 36);
    private static final String zzS = Integer.toString(11, 36);
    private static final String zzT = Integer.toString(12, 36);
    private static final String zzU = Integer.toString(13, 36);
    private static final String zzV = Integer.toString(14, 36);
    private static final String zzW = Integer.toString(15, 36);
    private static final String zzX = Integer.toString(16, 36);
    private static final String zzY = Integer.toString(17, 36);
    private static final String zzZ = Integer.toString(18, 36);
    private static final String zzaa = Integer.toString(19, 36);
    private static final String zzab = Integer.toString(20, 36);
    private static final String zzac = Integer.toString(21, 36);
    private static final String zzad = Integer.toString(22, 36);
    private static final String zzae = Integer.toString(23, 36);
    private static final String zzaf = Integer.toString(24, 36);
    private static final String zzag = Integer.toString(25, 36);
    private static final String zzah = Integer.toString(26, 36);
    private static final String zzai = Integer.toString(27, 36);
    private static final String zzaj = Integer.toString(28, 36);
    private static final String zzak = Integer.toString(29, 36);
    private static final String zzal = Integer.toString(30, 36);
    private static final String zzam = Integer.toString(31, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    private zzam(zzak zzakVar) {
        this.zzb = zzakVar.zza;
        this.zzc = zzakVar.zzb;
        this.zzd = zzfj.zzz(zzakVar.zzc);
        this.zze = zzakVar.zzd;
        this.zzf = 0;
        int i10 = zzakVar.zze;
        this.zzg = i10;
        int i11 = zzakVar.zzf;
        this.zzh = i11;
        this.zzi = i11 != -1 ? i11 : i10;
        this.zzj = zzakVar.zzg;
        this.zzk = zzakVar.zzh;
        this.zzl = zzakVar.zzi;
        this.zzm = zzakVar.zzj;
        this.zzn = zzakVar.zzk;
        this.zzo = zzakVar.zzl == null ? Collections.emptyList() : zzakVar.zzl;
        zzad zzadVar = zzakVar.zzm;
        this.zzp = zzadVar;
        this.zzq = zzakVar.zzn;
        this.zzr = zzakVar.zzo;
        this.zzs = zzakVar.zzp;
        this.zzt = zzakVar.zzq;
        this.zzu = zzakVar.zzr == -1 ? 0 : zzakVar.zzr;
        this.zzv = zzakVar.zzs == -1.0f ? 1.0f : zzakVar.zzs;
        this.zzw = zzakVar.zzt;
        this.zzx = zzakVar.zzu;
        this.zzy = zzakVar.zzv;
        this.zzz = zzakVar.zzw;
        this.zzA = zzakVar.zzx;
        this.zzB = zzakVar.zzy;
        this.zzC = zzakVar.zzz == -1 ? 0 : zzakVar.zzz;
        this.zzD = zzakVar.zzA != -1 ? zzakVar.zzA : 0;
        this.zzE = zzakVar.zzB;
        this.zzF = (zzakVar.zzC != 0 || zzadVar == null) ? zzakVar.zzC : 1;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzam.class == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            int i11 = this.zzan;
            if ((i11 == 0 || (i10 = zzamVar.zzan) == 0 || i11 == i10) && this.zze == zzamVar.zze && this.zzg == zzamVar.zzg && this.zzh == zzamVar.zzh && this.zzn == zzamVar.zzn && this.zzq == zzamVar.zzq && this.zzr == zzamVar.zzr && this.zzs == zzamVar.zzs && this.zzu == zzamVar.zzu && this.zzx == zzamVar.zzx && this.zzz == zzamVar.zzz && this.zzA == zzamVar.zzA && this.zzB == zzamVar.zzB && this.zzC == zzamVar.zzC && this.zzD == zzamVar.zzD && this.zzE == zzamVar.zzE && this.zzF == zzamVar.zzF && Float.compare(this.zzt, zzamVar.zzt) == 0 && Float.compare(this.zzv, zzamVar.zzv) == 0 && zzfj.zzC(this.zzb, zzamVar.zzb) && zzfj.zzC(this.zzc, zzamVar.zzc) && zzfj.zzC(this.zzj, zzamVar.zzj) && zzfj.zzC(this.zzl, zzamVar.zzl) && zzfj.zzC(this.zzm, zzamVar.zzm) && zzfj.zzC(this.zzd, zzamVar.zzd) && Arrays.equals(this.zzw, zzamVar.zzw) && zzfj.zzC(this.zzk, zzamVar.zzk) && zzfj.zzC(this.zzy, zzamVar.zzy) && zzfj.zzC(this.zzp, zzamVar.zzp) && zzd(zzamVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzan;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = iHashCode + 527;
        String str3 = this.zzd;
        int iHashCode3 = (((((((((i11 * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
        String str4 = this.zzj;
        int iHashCode4 = ((iHashCode3 * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbz zzbzVar = this.zzk;
        int iHashCode5 = (iHashCode4 + (zzbzVar == null ? 0 : zzbzVar.hashCode())) * 31;
        String str5 = this.zzl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzm;
        int iFloatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.zzv) + ((((Float.floatToIntBits(this.zzt) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31)) * 31) + this.zzu) * 31)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31) + this.zzF;
        this.zzan = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzl;
        String str4 = this.zzm;
        String str5 = this.zzj;
        int i10 = this.zzi;
        String str6 = this.zzd;
        int i11 = this.zzr;
        int i12 = this.zzs;
        float f10 = this.zzt;
        String strValueOf = String.valueOf(this.zzy);
        int i13 = this.zzz;
        int i14 = this.zzA;
        StringBuilder sbA = q2.a.a("Format(", str, ", ", str2, ", ");
        d.a(sbA, str3, ", ", str4, ", ");
        sbA.append(str5);
        sbA.append(", ");
        sbA.append(i10);
        sbA.append(", ");
        sbA.append(str6);
        sbA.append(", [");
        sbA.append(i11);
        sbA.append(", ");
        sbA.append(i12);
        sbA.append(", ");
        sbA.append(f10);
        sbA.append(", ");
        sbA.append(strValueOf);
        sbA.append("], [");
        sbA.append(i13);
        sbA.append(", ");
        return b.a(sbA, i14, "])");
    }

    public final int zza() {
        int i10;
        int i11 = this.zzr;
        if (i11 == -1 || (i10 = this.zzs) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int i10) {
        zzak zzakVar = new zzak(this, null);
        zzakVar.zzA(i10);
        return new zzam(zzakVar);
    }

    public final boolean zzd(zzam zzamVar) {
        if (this.zzo.size() != zzamVar.zzo.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i10), (byte[]) zzamVar.zzo.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
