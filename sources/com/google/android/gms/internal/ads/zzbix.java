package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbix implements zzbij {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbiw zzbiwVar = (zzbiw) this.zzb.remove(str);
            if (zzbiwVar == null) {
                zzbzr.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbiwVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbiwVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbiwVar.zzb(jSONObject);
            } catch (JSONException e10) {
                zzbiwVar.zza(e10.getMessage());
            }
        }
    }

    public final zzfwm zzb(zzblp zzblpVar, String str, JSONObject jSONObject) {
        zzcaj zzcajVar = new zzcaj();
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbiv(this, zzcajVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, string);
            jSONObject2.put("args", jSONObject);
            zzblpVar.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzcajVar.zze(e10);
        }
        return zzcajVar;
    }

    public final void zzc(String str, zzbiw zzbiwVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbiwVar);
        }
    }
}
