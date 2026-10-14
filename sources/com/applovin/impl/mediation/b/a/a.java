package com.applovin.impl.mediation.b.a;

import android.text.TextUtils;
import androidx.fragment.app.w;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.e.d;
import com.applovin.impl.sdk.e.x;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9208g;

    public a(String str, String str2, String str3, o oVar) {
        super("NimbusApiService", oVar);
        this.f9205d = str;
        this.f9208g = UUID.randomUUID().toString().toLowerCase(Locale.US);
        oVar.F();
        if (y.a()) {
            y yVarF = oVar.F();
            String str4 = this.f9221b;
            StringBuilder sbA = q2.a.a("Initializing Nimbus with apiKey=", str, ", pubId=", str2, ", sessionId=");
            sbA.append(this.f9208g);
            yVarF.b(str4, sbA.toString());
        }
        this.f9206e = w.a("https://", str2, ".", StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        com.applovin.impl.mediation.b.c<String> cVar = com.applovin.impl.mediation.b.c.f9256c;
        String string = (String) oVar.b(cVar, null, this.f9222c);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            oVar.a(cVar, string, this.f9222c);
        }
        this.f9207f = string;
        oVar.F();
        if (y.a()) {
            a0.a("Setting Nimbus instanceId=", string, oVar.F(), this.f9221b);
        }
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("session_id");
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f9220a.F();
                if (y.a()) {
                    this.f9220a.F().b(this.f9221b, "Updating Nimbus sessionId to " + obj);
                }
                this.f9208g = str;
            }
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9220a.F();
        if (y.a()) {
            y yVarF = this.f9220a.F();
            String str = this.f9221b;
            StringBuilder sbA = defpackage.a.a("Loading Nimbus ");
            sbA.append(maxAdFormat.getLabel());
            sbA.append(" ad with position: ");
            sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
            yVarF.b(str, sbA.toString());
        }
        a(maxAdapterResponseParameters);
        Map<String, Object> mapB = this.f9220a.M() != null ? this.f9220a.M().b() : this.f9220a.K().d();
        HashMap mapA = c.a("x-openrtb-version", "2.5");
        mapA.put("Nimbus-Api-Key", this.f9205d);
        mapA.put("Nimbus-Sdkv", "2.0.0");
        mapA.put("Nimbus-Instance-Id", this.f9207f);
        mapA.put("User-Agent", String.valueOf(mapB.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session_id", this.f9208g);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.f9220a.G().a((d) new x<JSONObject>(a(this.f9206e, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, com.applovin.impl.mediation.b.b.a.a().a(jSONObject).d(a()).b(jSONObject2).c(b()).a(), mapA, true, this.f9220a), this.f9220a) { // from class: com.applovin.impl.mediation.b.a.a.1
            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(int i10, String str2, JSONObject jSONObject3) {
                if (jSONObject3 != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject3, "message", null))) {
                    Object object = JsonUtils.getObject(jSONObject3, "nbr", null);
                    if (y.a()) {
                        y yVar = this.f10536h;
                        String str3 = this.f10535g;
                        StringBuilder sbA2 = defpackage.a.a("Nimbus request for ");
                        sbA2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
                        sbA2.append(" returned with no fill code: ");
                        sbA2.append(object);
                        yVar.e(str3, sbA2.toString());
                    }
                    appLovinAdLoadListener.failedToReceiveAd(204);
                }
                if (y.a()) {
                    y yVar2 = this.f10536h;
                    String str4 = this.f10535g;
                    StringBuilder sbA3 = defpackage.a.a("Unable to fetch ");
                    sbA3.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
                    sbA3.append(" Nimbus ad: server returned ");
                    sbA3.append(i10);
                    yVar2.e(str4, sbA3.toString());
                }
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }

            @Override // com.applovin.impl.sdk.e.x, com.applovin.impl.sdk.network.b.d
            public void a(JSONObject jSONObject3, int i10) {
                if (i10 == 200 && jSONObject3 != null) {
                    this.f10534f.G().a((d) new b(jSONObject3, maxAdapterResponseParameters, maxAdFormat, a.this.f9208g, appLovinAdLoadListener, this.f10534f));
                    return;
                }
                if (y.a()) {
                    y yVar = this.f10536h;
                    String str2 = this.f10535g;
                    StringBuilder sbA2 = defpackage.a.a("Unable to fetch ");
                    sbA2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
                    sbA2.append(" Nimbus ad: server returned ");
                    sbA2.append(i10);
                    yVar.e(str2, sbA2.toString());
                }
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }
        });
    }
}
