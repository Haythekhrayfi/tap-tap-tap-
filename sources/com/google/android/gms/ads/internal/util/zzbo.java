package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzamq;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzfwm;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbo {
    private static zzaln zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbj zza = new zzbg();

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    public zzbo(Context context) {
        zzaln zzalnVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbbm.zza(context);
                if (ClientLibraryUtils.isPackageSide()) {
                    zzalnVarZza = zzamq.zza(context, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeg)).booleanValue()) {
                        zzalnVarZza = zzax.zzb(context);
                    } else {
                        zzalnVarZza = zzamq.zza(context, null);
                    }
                }
                zzb = zzalnVarZza;
            }
        }
    }

    public final zzfwm zza(String str) {
        zzcaj zzcajVar = new zzcaj();
        zzb.zza(new zzbn(str, null, zzcajVar));
        return zzcajVar;
    }

    public final zzfwm zzb(int i10, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbzq zzbzqVar = new zzbzq(null);
        zzbi zzbiVar = new zzbi(this, i10, str, zzblVar, zzbhVar, bArr, map, zzbzqVar);
        if (zzbzq.zzk()) {
            try {
                zzbzqVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzaks e10) {
                zzbzr.zzj(e10.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
