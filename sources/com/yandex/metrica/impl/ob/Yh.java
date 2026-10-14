package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class Yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1607ec f15594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f15595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Qi f15599f;

    public Yh(Context context, Qi qi) {
        this(context, qi, P0.i().t());
    }

    public Yh(Context context, Qi qi, C1607ec c1607ec) {
        this.f15598e = false;
        this.f15595b = context;
        this.f15599f = qi;
        this.f15594a = c1607ec;
    }

    private void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    public String a() {
        C1507ac c1507ac;
        C1507ac c1507ac2;
        JSONObject jSONObject = new JSONObject();
        if (!this.f15598e) {
            C1657gc c1657gcA = this.f15594a.a(this.f15595b);
            C1532bc c1532bcA = c1657gcA.a();
            String str = null;
            this.f15596c = (!c1532bcA.a() || (c1507ac2 = c1532bcA.f15827a) == null) ? null : c1507ac2.f15739b;
            C1532bc c1532bcB = c1657gcA.b();
            if (c1532bcB.a() && (c1507ac = c1532bcB.f15827a) != null) {
                str = c1507ac.f15739b;
            }
            this.f15597d = str;
            this.f15598e = true;
        }
        try {
            a(jSONObject, "uuid", this.f15599f.V());
            a(jSONObject, "device_id", this.f15599f.i());
            a(jSONObject, "google_aid", this.f15596c);
            a(jSONObject, "huawei_aid", this.f15597d);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public void a(Qi qi) {
        this.f15599f = qi;
    }
}
