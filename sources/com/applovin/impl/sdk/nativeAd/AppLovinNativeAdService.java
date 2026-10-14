package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final y logger;
    private final o sdk;

    public AppLovinNativeAdService(o oVar) {
        this.sdk = oVar;
        this.logger = oVar.F();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        AppLovinError appLovinError;
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            y.j(TAG, "Empty ad token");
            com.applovin.impl.sdk.utils.o.a(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(strTrim, this.sdk);
        if (cVar.b() == com.applovin.impl.sdk.ad.c.a.REGULAR) {
            if (y.a()) {
                this.logger.b(TAG, "Loading next ad for token: " + cVar);
            }
            this.sdk.G().a(new b(cVar, appLovinNativeAdLoadListener, this.sdk), r.b.MAIN);
            return;
        }
        if (cVar.b() == com.applovin.impl.sdk.ad.c.a.AD_RESPONSE_JSON) {
            JSONObject jSONObjectD = cVar.d();
            if (jSONObjectD == null) {
                StringBuilder sbA = defpackage.a.a("Unable to retrieve ad response JSON from token: ");
                sbA.append(cVar.a());
                String string = sbA.toString();
                AppLovinError appLovinError2 = new AppLovinError(-8, string);
                y.j(TAG, string);
                com.applovin.impl.sdk.utils.o.a(appLovinNativeAdLoadListener, appLovinError2);
                return;
            }
            i.g(jSONObjectD, this.sdk);
            i.e(jSONObjectD, this.sdk);
            i.d(jSONObjectD, this.sdk);
            i.f(jSONObjectD, this.sdk);
            if (JsonUtils.getJSONArray(jSONObjectD, "ads", new JSONArray()).length() > 0) {
                if (y.a()) {
                    this.logger.b(TAG, "Rendering ad for token: " + cVar);
                }
                this.sdk.G().a(new d(jSONObjectD, appLovinNativeAdLoadListener, this.sdk), r.b.MAIN);
                return;
            }
            if (y.a()) {
                this.logger.e(TAG, "No ad returned from the server for token: " + cVar);
            }
            appLovinError = AppLovinError.NO_FILL;
        } else {
            appLovinError = new AppLovinError(-8, "Invalid token type");
            y.j(TAG, "Invalid token type");
        }
        com.applovin.impl.sdk.utils.o.a(appLovinNativeAdLoadListener, appLovinError);
    }
}
