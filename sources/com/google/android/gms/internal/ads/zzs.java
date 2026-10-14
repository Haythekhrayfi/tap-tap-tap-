package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {
    public static final zzs zza = new zzs(1, 2, 3, null);
    public static final zzs zzb;
    public static final zzn zzc;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    private int zzl;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzb(1);
        zzrVar.zza(1);
        zzrVar.zzc(2);
        zzb = zzrVar.zzd();
        zzh = Integer.toString(0, 36);
        zzi = Integer.toString(1, 36);
        zzj = Integer.toString(2, 36);
        zzk = Integer.toString(3, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
        };
    }

    @Deprecated
    public zzs(int i10, int i11, int i12, byte[] bArr) {
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = bArr;
    }

    @Pure
    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzf(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    private static String zzg(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color space" : "BT601";
        }
        return "BT709";
    }

    private static String zzh(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (this.zzd == zzsVar.zzd && this.zze == zzsVar.zze && this.zzf == zzsVar.zzf && Arrays.equals(this.zzg, zzsVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzl;
        if (i10 != 0) {
            return i10;
        }
        int i11 = ((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf;
        int iHashCode = Arrays.hashCode(this.zzg) + (i11 * 31);
        this.zzl = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strZzg = zzg(this.zzd);
        String strZzf = zzf(this.zze);
        String strZzh = zzh(this.zzf);
        byte[] bArr = this.zzg;
        StringBuilder sbA = q2.a.a("ColorInfo(", strZzg, ", ", strZzf, ", ");
        sbA.append(strZzh);
        sbA.append(", ");
        sbA.append(bArr != null);
        sbA.append(")");
        return sbA.toString();
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        return !zze() ? "NA" : String.format(Locale.US, "%s/%s/%s", zzg(this.zzd), zzf(this.zze), zzh(this.zzf));
    }

    public final boolean zze() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
