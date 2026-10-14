package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzph {
    private Boolean zza;

    public zzph() {
    }

    public zzph(Context context) {
    }

    public final zzoh zza(zzam zzamVar, zzk zzkVar) {
        int iZzf;
        Objects.requireNonNull(zzamVar);
        Objects.requireNonNull(zzkVar);
        int i10 = zzfj.zza;
        if (i10 < 29 || zzamVar.zzA == -1) {
            return zzoh.zza;
        }
        Boolean bool = this.zza;
        if (bool == null) {
            bool = Boolean.FALSE;
            this.zza = bool;
        }
        bool.booleanValue();
        String str = zzamVar.zzm;
        Objects.requireNonNull(str);
        int iZza = zzcc.zza(str, zzamVar.zzj);
        if (iZza == 0) {
            return zzoh.zza;
        }
        if ((i10 >= 34 || iZza != 30) && (iZzf = zzfj.zzf(zzamVar.zzz)) != 0) {
            AudioFormat audioFormatZzs = zzfj.zzs(zzamVar.zzA, iZzf, iZza);
            AudioAttributes audioAttributes = zzkVar.zza().zza;
            return i10 >= 31 ? zzpg.zza(audioFormatZzs, audioAttributes, false) : zzpf.zza(audioFormatZzs, audioAttributes, false);
        }
        return zzoh.zza;
    }
}
