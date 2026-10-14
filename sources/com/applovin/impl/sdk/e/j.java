package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import androidx.appcompat.widget.r0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.l f10576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinPostbackListener f10577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r.b f10578c;

    public j(com.applovin.impl.sdk.network.l lVar, r.b bVar, com.applovin.impl.sdk.o oVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", oVar);
        if (lVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f10576a = lVar;
        this.f10577b = appLovinPostbackListener;
        this.f10578c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        x<Object> xVar = new x<Object>(this.f10576a, d()) { // from class: com.applovin.impl.sdk.e.j.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10580a;

            {
                this.f10580a = j.this.f10576a.a();
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str, Object obj) {
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVar = this.f10536h;
                    String str2 = this.f10535g;
                    StringBuilder sbA = r0.a("Failed to dispatch postback. Error code: ", i10, " URL: ");
                    sbA.append(this.f10580a);
                    yVar.e(str2, sbA.toString());
                }
                if (j.this.f10577b != null) {
                    j.this.f10577b.onPostbackFailure(this.f10580a, i10);
                }
                if (j.this.f10576a.s()) {
                    this.f10534f.X().a(j.this.f10576a.t(), this.f10580a, i10, obj, str, false);
                }
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(Object obj, int i10) {
                if (obj instanceof String) {
                    for (String str : this.f10534f.b(com.applovin.impl.sdk.c.b.f10351be)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.i.e(jSONObject, this.f10534f);
                                    com.applovin.impl.sdk.utils.i.d(jSONObject, this.f10534f);
                                    com.applovin.impl.sdk.utils.i.f(jSONObject, this.f10534f);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (j.this.f10577b != null) {
                    j.this.f10577b.onPostbackSuccess(this.f10580a);
                }
                if (j.this.f10576a.s()) {
                    this.f10534f.X().a(j.this.f10576a.t(), this.f10580a, i10, obj, null, true);
                }
            }
        };
        xVar.a(this.f10578c);
        d().G().a((d) xVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f10576a.a())) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f10536h.c(this.f10535g, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f10577b;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f10576a.a(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (!this.f10576a.u()) {
            a();
            return;
        }
        AppLovinPostbackListener appLovinPostbackListener2 = new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.j.1
            @Override // com.applovin.sdk.AppLovinPostbackListener
            public void onPostbackFailure(String str, int i10) {
                j.this.a();
            }

            @Override // com.applovin.sdk.AppLovinPostbackListener
            public void onPostbackSuccess(String str) {
                if (j.this.f10577b != null) {
                    j.this.f10577b.onPostbackSuccess(j.this.f10576a.a());
                }
            }
        };
        if (((Boolean) d().a(com.applovin.impl.sdk.c.b.gG)).booleanValue()) {
            d().W().a(this.f10576a, appLovinPostbackListener2);
        } else {
            com.applovin.impl.adview.d.a(this.f10576a, d(), appLovinPostbackListener2);
        }
    }
}
