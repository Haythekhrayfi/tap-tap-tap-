package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbzr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzar extends QueryInfoGenerationCallback {
    public final /* synthetic */ String zza;
    public final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzar(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zzb = taggingLibraryJsInterface;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzbzr.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.zzb.zzb.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.zza, str), null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.zza, queryInfo.getQuery());
        }
        this.zzb.zzb.evaluateJavascript(str, null);
    }
}
