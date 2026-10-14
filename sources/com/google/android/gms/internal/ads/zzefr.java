package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.activity.j;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefr {
    private final Clock zza;
    private final zzefs zzb;
    private final zzfgr zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgF)).booleanValue();
    private final zzech zzf;

    public zzefr(Clock clock, zzefs zzefsVar, zzech zzechVar, zzfgr zzfgrVar) {
        this.zza = clock;
        this.zzb = zzefsVar;
        this.zzf = zzechVar;
        this.zzc = zzfgrVar;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzefr zzefrVar, String str, int i10, long j10, String str2, Integer num) {
        String strA = str + "." + i10 + "." + j10;
        if (!TextUtils.isEmpty(str2)) {
            strA = j.a(strA, ".", str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzby)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            strA = strA + "." + num;
        }
        zzefrVar.zzd.add(strA);
    }

    public final zzfwm zze(zzezz zzezzVar, zzezn zzeznVar, zzfwm zzfwmVar, zzfgn zzfgnVar) {
        zzezq zzezqVar = zzezzVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzeznVar.zzx;
        if (str != null) {
            zzfwc.zzq(zzfwmVar, new zzefq(this, jElapsedRealtime, str, zzeznVar, zzezqVar, zzfgnVar, zzezzVar), zzcae.zzf);
        }
        return zzfwmVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
