package com.applovin.impl.mediation.c;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.network.j;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f9312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f9313e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxError f9314i;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, o oVar, boolean z10) {
        super("TaskFireMediationPostbacks", oVar);
        this.f9309a = str;
        this.f9310b = i.f.a(str, "_urls");
        this.f9312d = w.a(map, oVar);
        this.f9314i = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f9311c = fVar;
        HashMap map2 = new HashMap(7);
        map2.put("AppLovin-Event-Type", str);
        if (z10) {
            map2.put("AppLovin-Ad-Network-Name", fVar.ac());
        }
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            map2.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            map2.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            if (z10) {
                map2.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.x());
            }
        }
        if (maxError != null) {
            map2.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map2.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f9313e = map2;
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f10534f.a(com.applovin.impl.sdk.c.a.f10324i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().ai().a(j.p().c(str).b("POST").b(this.f9313e).a(false).c(map).b(((Boolean) this.f10534f.a(com.applovin.impl.sdk.c.a.f10316ab)).booleanValue()).a());
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listG = this.f9311c.g(this.f9310b);
        Map<String, String> mapA = a();
        Iterator<String> it = listG.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b(it.next(), this.f9312d), this.f9314i));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(mapA.size());
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapA.containsKey(queryParameter)) {
                    map.put(str, this.f9311c.h(mapA.get(queryParameter)));
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            a(builderClearQuery.build().toString(), map);
        }
    }
}
