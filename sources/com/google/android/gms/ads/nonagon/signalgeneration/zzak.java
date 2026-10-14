package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzduw;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwm;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzak implements zzfvj {
    private final Executor zza;
    private final zzduw zzb;

    public zzak(Executor executor, zzduw zzduwVar) {
        this.zza = executor;
        this.zzb = zzduwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final /* bridge */ /* synthetic */ zzfwm zza(Object obj) throws Exception {
        final zzbue zzbueVar = (zzbue) obj;
        return zzfwc.zzm(this.zzb.zzb(zzbueVar), new zzfvj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj2) {
                zzbue zzbueVar2 = zzbueVar;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().zzh(zzbueVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzfwc.zzh(zzamVar);
            }
        }, this.zza);
    }
}
