package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class rr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f24831a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n6 f24833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final in0 f24834d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ud f24832b = new ud();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f24835e = new Handler(Looper.getMainLooper());

    public final class a implements in0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final we f24836a;

        private a(we weVar) {
            this.f24836a = weVar;
        }

        public /* synthetic */ a(rr rrVar, we weVar, int i10) {
            this(weVar);
        }

        public final void a(JSONArray jSONArray) {
            rr.this.a(this.f24836a, rr.a(rr.this, jSONArray));
        }
    }

    public rr(k2 k2Var, BiddingSettings biddingSettings) {
        this.f24831a = k2Var;
        this.f24833c = new n6(biddingSettings);
        this.f24834d = new in0(new qd0(k2Var, null));
    }

    public static String a(rr rrVar, JSONArray jSONArray) {
        Objects.requireNonNull(rrVar);
        if (jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("networks", jSONArray);
                ud udVar = rrVar.f24832b;
                String string = jSONObject.toString();
                Objects.requireNonNull(udVar);
                return ud.a(string);
            } catch (JSONException e10) {
                x60.a(e10, "Can't create bidding data", new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(we weVar, String str) {
        this.f24835e.post(new do1(weVar, str));
    }

    public final void a(Context context, we weVar) {
        AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = this.f24833c.a(this.f24831a.c());
        if (adUnitIdBiddingSettingsA == null) {
            weVar.a(null);
        } else {
            this.f24834d.b(context, adUnitIdBiddingSettingsA.d(), new a(this, weVar, 0));
        }
    }
}
