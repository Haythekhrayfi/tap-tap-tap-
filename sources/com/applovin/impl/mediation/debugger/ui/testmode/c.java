package com.applovin.impl.mediation.debugger.ui.testmode;

import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9844c;

    public c(o oVar) {
        this.f9842a = oVar;
        d<Boolean> dVar = d.P;
        this.f9843b = ((Boolean) oVar.b(dVar, Boolean.FALSE)).booleanValue();
        oVar.b(dVar);
    }

    private void e() {
        l lVarX = this.f9842a.X();
        if (this.f9843b) {
            lVarX.b(this.f9844c);
        } else {
            lVarX.a(this.f9844c);
        }
    }

    public void a(String str) {
        if (str == null && this.f9844c == null) {
            return;
        }
        if (str == null || !str.equals(this.f9844c)) {
            this.f9844c = str;
            e();
        }
    }

    public void a(JSONObject jSONObject) {
        String strB;
        boolean zG;
        if (this.f9843b) {
            return;
        }
        JSONArray jSONArrayA = k.a(jSONObject, "test_mode_idfas");
        if (this.f9842a.M() != null) {
            strB = this.f9842a.L().d().b();
            zG = this.f9842a.L().D();
        } else {
            strB = this.f9842a.K().l().b();
            zG = this.f9842a.K().g();
        }
        this.f9843b = JsonUtils.containsCaseInsensitiveString(strB, jSONArrayA) || zG || AppLovinSdkUtils.isEmulator();
    }

    public boolean a() {
        return this.f9843b;
    }

    public boolean b() {
        return this.f9844c != null;
    }

    public String c() {
        return this.f9844c;
    }

    public void d() {
        this.f9842a.a(d.P, Boolean.TRUE);
    }
}
