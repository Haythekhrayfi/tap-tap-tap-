package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzaxj;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzae {
    private final String zza;

    public /* synthetic */ zzae(zzac zzacVar, zzad zzadVar) {
        this.zza = zzacVar.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzaxj zza() {
        byte b10;
        switch (this.zza) {
            case "NATIVE":
                b10 = 2;
                break;
            case "INTERSTITIAL":
                b10 = 1;
                break;
            case "REWARDED":
                b10 = 3;
                break;
            case "BANNER":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return zzaxj.BANNER;
        }
        if (b10 == 1) {
            return zzaxj.INTERSTITIAL;
        }
        if (b10 != 2) {
            return b10 != 3 ? zzaxj.AD_INITIATER_UNSPECIFIED : zzaxj.REWARD_BASED_VIDEO_AD;
        }
        return zzaxj.AD_LOADER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
