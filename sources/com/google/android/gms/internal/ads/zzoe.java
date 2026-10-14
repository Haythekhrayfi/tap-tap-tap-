package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.activity.j;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoe {
    public static final zzoe zza = new zzoe(new int[]{2}, 10);
    private static final zzfsc zzb = zzfsc.zzo(2, 5, 6);
    private static final zzfsf zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfse zzfseVar = new zzfse();
        zzfseVar.zza(5, 6);
        zzfseVar.zza(17, 6);
        zzfseVar.zza(7, 6);
        zzfseVar.zza(30, 10);
        zzfseVar.zza(18, 6);
        zzfseVar.zza(6, 8);
        zzfseVar.zza(8, 8);
        zzfseVar.zza(14, 8);
        zzc = zzfseVar.zzc();
    }

    public zzoe(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.zzd = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.zze = 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzoe) && Arrays.equals(this.zzd, ((zzoe) obj).zzd);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 10;
    }

    public final String toString() {
        return j.a("AudioCapabilities[maxChannelCount=10, supportedEncodings=", Arrays.toString(this.zzd), "]");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[PHI: r0
  0x0036: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002a, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    public final Pair zza(zzam zzamVar) {
        String str = zzamVar.zzm;
        Objects.requireNonNull(str);
        int iZza = zzcc.zza(str, zzamVar.zzj);
        zzfsf zzfsfVar = zzc;
        if (!zzfsfVar.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i10 = 6;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !zzc(30)) {
                    iZza = 7;
                }
            } else if (zzc(8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (zzc(18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (zzc(8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzc(iZza)) {
            return null;
        }
        int iIntValue = zzamVar.zzz;
        if (iIntValue == -1 || iZza == 18) {
            int i11 = zzamVar.zzA;
            if (i11 == -1) {
                i11 = 48000;
            }
            if (zzfj.zza >= 29) {
                iIntValue = zzod.zza(iZza, i11);
            } else {
                Integer num = (Integer) zzfsfVar.getOrDefault(Integer.valueOf(iZza), 0);
                Objects.requireNonNull(num);
                iIntValue = num.intValue();
            }
        } else if (zzamVar.zzm.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iIntValue > 10) {
                return null;
            }
        } else if (iIntValue > 10) {
            return null;
        }
        int i12 = zzfj.zza;
        if (i12 > 28) {
            i10 = iIntValue;
        } else if (iIntValue == 7) {
            i10 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i10 = iIntValue;
        }
        if (i12 <= 26 && "fugu".equals(zzfj.zzb) && i10 == 1) {
            i10 = 2;
        }
        int iZzf = zzfj.zzf(i10);
        if (iZzf == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzf));
    }

    public final boolean zzc(int i10) {
        return Arrays.binarySearch(this.zzd, i10) >= 0;
    }
}
