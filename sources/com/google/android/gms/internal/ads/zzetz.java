package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzetz implements zzeqy {
    public static final /* synthetic */ zzetz zza = new zzetz();

    private /* synthetic */ zzetz() {
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return zzfwc.zzh(new zzeqx() { // from class: com.google.android.gms.internal.ads.zzeua
            @Override // com.google.android.gms.internal.ads.zzeqx
            public final void zzh(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
