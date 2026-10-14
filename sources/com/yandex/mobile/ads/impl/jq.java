package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f22124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q70 f22125b;

    public /* synthetic */ jq(Context context) {
        this(context, z8.a(context), new q70());
    }

    public jq(Context context, iw0 iw0Var, q70 q70Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(iw0Var, "reporter");
        fd.j0.i(q70Var, "jsonConvertor");
        this.f22124a = iw0Var;
        this.f22125b = q70Var;
    }

    public final void a(Uri uri, JSONObject jSONObject) {
        HashMap map;
        fd.j0.i(uri, "uri");
        String queryParameter = uri.getQueryParameter("eventName");
        if (queryParameter != null) {
            if (queryParameter.length() == 0) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                if (jSONObject != null) {
                    Objects.requireNonNull(this.f22125b);
                    map = q70.a(jSONObject);
                } else {
                    map = new HashMap();
                }
                this.f22124a.a(new fw0(queryParameter, map));
            }
        }
    }
}
