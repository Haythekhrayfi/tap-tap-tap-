package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import q.a;
import q.g;

/* JADX INFO: loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final a<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(a<ApiKey<?>, ConnectionResult> aVar) {
        this.zaa = aVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<O> apiKey = googleApi.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String strZab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb2.append("The given API (");
        sb2.append(strZab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (ApiKey apiKey : (g.c) this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
            z10 &= !connectionResult.isSuccess();
            String strZab = apiKey.zab();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZab).length() + 2 + strValueOf.length());
            sb2.append(strZab);
            sb2.append(": ");
            sb2.append(strValueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String strZab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb2.append("The given API (");
        sb2.append(strZab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }
}
