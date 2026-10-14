package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb f22071a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p91 f22073c = new p91();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n80 f22072b = new n80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t20 f22074d = new t20();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dq f22075e = new dq();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p20 f22076f = new p20();

    public jk0(Context context) {
        this.f22071a = new lb(context);
    }

    public static String a(String str, JSONObject jSONObject) throws JSONException, zi0 {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new zi0("Native Ad json has not required attributes");
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final cj0 a(String str) throws JSONException, zi0 {
        List<qh0> listD;
        boolean z10;
        String str2;
        Iterator<String> it;
        String str3;
        AdImpressionData adImpressionData;
        boolean z11;
        JSONObject jSONObject = new JSONObject(str);
        boolean z12 = false;
        cj0 cj0Var = (cj0) iv0.a(cj0.class, new Object[0]);
        if (cj0Var != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(PluginErrorDetails.Platform.NATIVE);
            String str4 = "ads";
            if (!kk0.a(jSONObject2, "ads")) {
                throw new zi0("Native Ad json has not required attributes");
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (str4.equals(next)) {
                    ArrayList arrayList = new ArrayList();
                    ?? jSONArray = jSONObject2.getJSONArray(str4);
                    for (?? r15 = z12; r15 < jSONArray.length(); r15++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(r15);
                        String str5 = "adType";
                        String str6 = "link";
                        if (!kk0.a(jSONObject3, "adType", "assets", "link")) {
                            throw new zi0("Native Ad json has not required attributes");
                        }
                        String str7 = str4;
                        qh0 qh0Var = new qh0();
                        Iterator<String> itKeys2 = jSONObject3.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            if (str5.equals(next2)) {
                                qh0Var.c(a(next2, jSONObject3));
                            } else if ("assets".equals(next2)) {
                                qh0Var.c(this.f22071a.a(jSONObject3));
                            } else {
                                if (str6.equals(next2)) {
                                    str2 = str5;
                                    qh0Var.a(this.f22072b.a(jSONObject3.getJSONObject(next2)));
                                } else {
                                    str2 = str5;
                                    if ("showNotice".equals(next2)) {
                                        qh0Var.a(a(jSONObject3.getJSONObject(next2)));
                                    } else {
                                        if ("showNotices".equals(next2)) {
                                            ArrayList arrayList2 = new ArrayList();
                                            JSONArray jSONArray2 = jSONObject3.getJSONArray("showNotices");
                                            it = itKeys;
                                            str3 = str6;
                                            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                                                arrayList2.add(a(jSONArray2.getJSONObject(i10)));
                                            }
                                            qh0Var.b(arrayList2);
                                        } else {
                                            it = itKeys;
                                            str3 = str6;
                                            if ("info".equals(next2)) {
                                                qh0Var.d(jSONObject3.optString(next2, null));
                                            } else if ("hideConditions".equals(next2)) {
                                                qh0Var.a(new fk().a(next2, jSONObject3));
                                            } else if ("showConditions".equals(next2)) {
                                                qh0Var.b(new fk().a(next2, jSONObject3));
                                            } else if ("renderTrackingUrl".equals(next2)) {
                                                Objects.requireNonNull(this.f22073c);
                                                qh0Var.a(p91.a(next2, jSONObject3));
                                            } else if ("renderTrackingUrls".equals(next2)) {
                                                ArrayList arrayList3 = new ArrayList();
                                                JSONArray jSONArray3 = jSONObject3.getJSONArray("renderTrackingUrls");
                                                for (int i11 = 0; i11 < jSONArray3.length(); i11++) {
                                                    arrayList3.add(jSONArray3.getString(i11));
                                                }
                                                qh0Var.a(arrayList3);
                                            } else if (FacebookMediationAdapter.KEY_ID.equals(next2)) {
                                                qh0Var.b(jSONObject3.optString(FacebookMediationAdapter.KEY_ID, null));
                                            } else if ("impressionData".equals(next2)) {
                                                Objects.requireNonNull(this.f22074d);
                                                try {
                                                    adImpressionData = new AdImpressionData(r70.a("impressionData", jSONObject3));
                                                } catch (Exception e10) {
                                                    Log.e("ImpressionDataParser", e10.getMessage());
                                                    adImpressionData = null;
                                                }
                                                qh0Var.a(adImpressionData);
                                            }
                                        }
                                        str5 = str2;
                                        itKeys = it;
                                        str6 = str3;
                                    }
                                }
                                str5 = str2;
                            }
                        }
                        Iterator<String> it2 = itKeys;
                        List<qa<?>> listB = qh0Var.b();
                        m80 m80VarE = qh0Var.e();
                        int iG = qh0Var.g();
                        if (listB.isEmpty()) {
                            z10 = false;
                        } else if (!(m80VarE != null) || iG == 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            throw new zi0("Native Ad json has not required attributes");
                        }
                        arrayList.add(qh0Var);
                        str4 = str7;
                        itKeys = it2;
                    }
                    cj0Var.a((List<qh0>) arrayList);
                } else {
                    String str8 = str4;
                    Iterator<String> it3 = itKeys;
                    if ("assets".equals(next)) {
                        ArrayList arrayListA = this.f22071a.a(jSONObject2);
                        cj0Var.a(arrayListA.isEmpty() ? null : arrayListA);
                        str4 = str8;
                        itKeys = it3;
                    } else {
                        if ("settings".equals(next)) {
                            z11 = false;
                            d11 d11Var = (d11) iv0.a(d11.class, new Object[0]);
                            if (d11Var != null) {
                                JSONObject jSONObject4 = jSONObject2.getJSONObject("settings");
                                Iterator<String> itKeys3 = jSONObject4.keys();
                                while (itKeys3.hasNext()) {
                                    String next3 = itKeys3.next();
                                    if ("templateType".equals(next3)) {
                                        d11Var.a(a(next3, jSONObject4));
                                    } else if ("highlightingEnabled".equals(next3)) {
                                        d11Var.a(jSONObject4.getBoolean(next3));
                                    } else if ("multiBannerAutoScrollInterval".equals(next3)) {
                                        d11Var.a(Long.valueOf(jSONObject4.getLong(next3)));
                                    }
                                }
                            }
                            cj0Var.a(d11Var);
                        } else {
                            z11 = false;
                            if ("showNotices".equals(next)) {
                                ArrayList arrayList4 = new ArrayList();
                                JSONArray jSONArray4 = jSONObject2.getJSONArray("showNotices");
                                for (int i12 = 0; i12 < jSONArray4.length(); i12++) {
                                    arrayList4.add(a(jSONArray4.getJSONObject(i12)));
                                }
                                cj0Var.d(arrayList4);
                            } else if ("ver".equals(next)) {
                                cj0Var.a(a(next, jSONObject2));
                            } else if ("renderTrackingUrls".equals(next)) {
                                ArrayList arrayList5 = new ArrayList();
                                JSONArray jSONArray5 = jSONObject2.getJSONArray("renderTrackingUrls");
                                for (int i13 = 0; i13 < jSONArray5.length(); i13++) {
                                    arrayList5.add(jSONArray5.getString(i13));
                                }
                                cj0Var.c(arrayList5);
                            } else if ("designs".equals(next)) {
                                ArrayList arrayList6 = new ArrayList();
                                JSONArray jSONArray6 = jSONObject2.getJSONArray("designs");
                                for (int i14 = 0; i14 < jSONArray6.length(); i14++) {
                                    JSONObject jSONObject5 = jSONArray6.getJSONObject(i14);
                                    if (jSONObject5.has("type") && jSONObject5.has("layout") && jSONObject5.has("target")) {
                                        String string = jSONObject5.getString("type");
                                        String string2 = jSONObject5.getString("target");
                                        String string3 = jSONObject5.getString("layout");
                                        JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray("images");
                                        yp ypVarA = this.f22075e.a(new xo(string, string2, string3, jSONArrayOptJSONArray != null ? this.f22076f.a(jSONArrayOptJSONArray) : null));
                                        if (ypVarA != null) {
                                            arrayList6.add(ypVarA);
                                        }
                                    }
                                }
                                cj0Var.b(arrayList6);
                            } else if ("ad_pod_info".equals(next)) {
                                cj0Var.a(o4.a(jSONObject2.getJSONObject("ad_pod_info")));
                            }
                        }
                        z12 = z11;
                        str4 = str8;
                        itKeys = it3;
                    }
                }
                z12 = false;
            }
        }
        if ((cj0Var == null || (listD = cj0Var.d()) == null) ? z12 : true ^ listD.isEmpty()) {
            return cj0Var;
        }
        throw new zi0("Native Ad json has not required attributes");
    }

    public final g11 a(JSONObject jSONObject) throws JSONException, zi0 {
        if (!kk0.a(jSONObject, "delay", ImagesContract.URL)) {
            throw new zi0("Native Ad json has not required attributes");
        }
        g11 g11Var = new g11();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if ("delay".equals(next)) {
                g11Var.a(jSONObject.getLong(next));
            } else if (ImagesContract.URL.equals(next)) {
                Objects.requireNonNull(this.f22073c);
                g11Var.a(p91.a(next, jSONObject));
            } else if ("visibilityPercent".equals(next)) {
                g11Var.a(Math.max(Math.min(jSONObject.optInt(next, 0), 100), 0));
            }
        }
        return g11Var;
    }
}
