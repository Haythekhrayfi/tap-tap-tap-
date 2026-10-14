package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenr implements zzeqy {
    private final Context zza;
    private final zzfwn zzb;

    public zzenr(Context context, zzfwn zzfwnVar) {
        this.zza = context;
        this.zzb = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strZze;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzauz zzauzVarZzg = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzg();
                Bundle bundle = null;
                if (zzauzVarZzg != null && (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN())) {
                    if (zzauzVarZzg.zzh()) {
                        zzauzVarZzg.zzg();
                    }
                    zzaup zzaupVarZza = zzauzVarZzg.zza();
                    if (zzaupVarZza != null) {
                        strZzj = zzaupVarZza.zzd();
                        strZze = zzaupVarZza.zze();
                        strZzk = zzaupVarZza.zzf();
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzw(strZzj);
                        }
                        if (strZzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzy(strZzk);
                        }
                    } else {
                        strZzj = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzj();
                        strZzk = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzk();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            strZzk = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", strZzk);
                    }
                    if (strZzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzens(bundle);
            }
        });
    }
}
