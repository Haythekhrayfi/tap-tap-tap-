package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.d implements a.InterfaceC0142a, AppLovinAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f10793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f10794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f10798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f10799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f10800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f10801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Uri f10802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.c.a f10803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f10804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f10805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Uri f10806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f10807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<String> f10808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<String> f10809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List<l> f10810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<l> f10811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<l> f10812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List<l> f10813x;

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, o oVar) {
        super("TaskRenderNativeAd", oVar);
        this.f10796d = "";
        this.f10797e = "";
        this.f10798i = "";
        this.f10799j = null;
        this.f10800k = "";
        this.f10801l = null;
        this.f10802m = null;
        this.f10804o = null;
        this.f10805p = null;
        this.f10806q = null;
        this.f10807r = null;
        this.f10808s = new ArrayList();
        this.f10809t = new ArrayList();
        this.f10810u = new ArrayList();
        this.f10811v = new ArrayList();
        this.f10812w = new ArrayList();
        this.f10813x = new ArrayList();
        this.f10793a = jSONObject;
        this.f10794b = jSONObject2;
        this.f10795c = appLovinNativeAdLoadListener;
    }

    private void a() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f10793a), JsonUtils.shallowCopy(this.f10794b), this.f10534f).setTitle(this.f10796d).setAdvertiser(this.f10797e).setBody(this.f10798i).setCallToAction(this.f10800k).setStarRating(this.f10799j).setIconUri(this.f10801l).setMainImageUri(this.f10802m).setPrivacyIconUri(this.f10804o).setVastAd(this.f10803n).setPrivacyDestinationUri(this.f10805p).setClickDestinationUri(this.f10806q).setClickDestinationBackupUri(this.f10807r).setClickTrackingUrls(this.f10808s).setJsTrackers(this.f10809t).setImpressionRequests(this.f10810u).setViewableMRC50Requests(this.f10811v).setViewableMRC100Requests(this.f10812w).setViewableVideo50Requests(this.f10813x).build();
        appLovinNativeAdImplBuild.getAdEventTracker().b();
        if (y.a()) {
            y yVar = this.f10536h;
            String str = this.f10535g;
            StringBuilder sbA = defpackage.a.a("Starting cache task for type: ");
            sbA.append(appLovinNativeAdImplBuild.getType());
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        this.f10534f.G().a(new a(appLovinNativeAdImplBuild, this.f10534f, this), r.b.MAIN);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, ImagesContract.URL, null);
        if (StringUtils.isValidString(string)) {
            this.f10806q = Uri.parse(string);
            if (y.a()) {
                y yVar = this.f10536h;
                String str = this.f10535g;
                StringBuilder sbA = defpackage.a.a("Processed click destination URL: ");
                sbA.append(this.f10806q);
                yVar.b(str, sbA.toString());
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f10807r = Uri.parse(string2);
            if (y.a()) {
                y yVar2 = this.f10536h;
                String str2 = this.f10535g;
                StringBuilder sbA2 = defpackage.a.a("Processed click destination backup URL: ");
                sbA2.append(this.f10807r);
                yVar2.b(str2, sbA2.toString());
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f10808s.addAll(JsonUtils.toList(jSONArray));
                if (y.a()) {
                    this.f10536h.b(this.f10535g, "Processed click tracking URLs: " + this.f10808s);
                }
            } catch (Throwable th) {
                if (y.a()) {
                    this.f10536h.b(this.f10535g, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = e.this.f10536h;
                if (y.a()) {
                    e.this.f10536h.b(e.this.f10535g, "Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    y unused2 = e.this.f10536h;
                    if (y.a()) {
                        e.this.f10536h.b(e.this.f10535g, "Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.f10795c.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    y unused3 = e.this.f10536h;
                    if (y.a()) {
                        e.this.f10536h.b(e.this.f10535g, "Failed to prepare native ad view components", th);
                    }
                    e.this.b(th.getMessage());
                    e.this.f10534f.ag().a(e.this.f10535g, "prepareNativeComponents", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f10795c.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0142a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (y.a()) {
            this.f10536h.b(this.f10535g, "Successfully cached and loaded ad");
        }
        b(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (y.a()) {
            this.f10536h.b(this.f10535g, "VAST ad rendered successfully");
        }
        this.f10803n = (com.applovin.impl.c.a) appLovinAd;
        a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (y.a()) {
            this.f10536h.e(this.f10535g, "VAST ad failed to render");
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String, org.json.JSONObject] */
    @Override // java.lang.Runnable
    public void run() {
        String str;
        y yVar;
        String str2;
        String str3;
        y yVar2;
        String str4;
        StringBuilder sb2;
        String str5;
        y yVar3;
        String str6;
        StringBuilder sbA;
        String str7;
        Object obj;
        y yVar4;
        String str8;
        StringBuilder sb3;
        String str9;
        String string;
        String str10;
        String string2;
        ?? r10 = 0;
        String string3 = JsonUtils.getString(this.f10793a, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string3)) {
            this.f10804o = Uri.parse(string3);
        }
        String string4 = JsonUtils.getString(this.f10793a, "privacy_url", null);
        if (URLUtil.isValidUrl(string4)) {
            this.f10805p = Uri.parse(string4);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f10793a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (y.a()) {
                y yVar5 = this.f10536h;
                String str11 = this.f10535g;
                StringBuilder sbA2 = defpackage.a.a("No oRtb response provided: ");
                sbA2.append(this.f10793a);
                yVar5.e(str11, sbA2.toString());
            }
            str = "No oRtb response provided";
        } else {
            String string5 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
            if (y.a()) {
                a0.a("Rendering native ad for oRTB version: ", string5, this.f10536h, this.f10535g);
            }
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, PluginErrorDetails.Platform.NATIVE, jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String string6 = "";
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r10);
                    if (jSONObject4.has("title")) {
                        this.f10796d = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r10), "text", r10);
                        if (y.a()) {
                            yVar3 = this.f10536h;
                            str6 = this.f10535g;
                            sbA = defpackage.a.a("Processed title: ");
                            sbA.append(this.f10796d);
                            string2 = sbA.toString();
                            yVar3.b(str6, string2);
                        }
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r10));
                    } else if (jSONObject4.has("img")) {
                        int i11 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r10);
                        int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string7 = JsonUtils.getString(jSONObject5, ImagesContract.URL, r10);
                        if (i12 == 1 || 3 == i11) {
                            this.f10801l = Uri.parse(string7);
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                sbA = defpackage.a.a("Processed icon URL: ");
                                obj = this.f10801l;
                                sbA.append(obj);
                                string2 = sbA.toString();
                                yVar3.b(str6, string2);
                            }
                        } else if (i12 == 3 || 2 == i11) {
                            this.f10802m = Uri.parse(string7);
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                sbA = defpackage.a.a("Processed main image URL: ");
                                obj = this.f10802m;
                                sbA.append(obj);
                                string2 = sbA.toString();
                                yVar3.b(str6, string2);
                            }
                        } else {
                            if (y.a()) {
                                this.f10536h.d(this.f10535g, "Unrecognized image: " + jSONObject4);
                            }
                            int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                            int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                            if (i13 <= 0 || i14 <= 0) {
                                if (y.a()) {
                                    yVar4 = this.f10536h;
                                    str10 = this.f10535g;
                                    string = "Skipping...";
                                    yVar4.d(str10, string);
                                }
                            } else if (i13 / i14 > 1.0d) {
                                if (y.a()) {
                                    this.f10536h.b(this.f10535g, j1.e.a("Inferring main image from ", i13, "x", i14, "..."));
                                }
                                this.f10802m = Uri.parse(string7);
                            } else {
                                if (y.a()) {
                                    this.f10536h.b(this.f10535g, j1.e.a("Inferring icon image from ", i13, "x", i14, "..."));
                                }
                                this.f10801l = Uri.parse(string7);
                            }
                        }
                    } else if (jSONObject4.has("video")) {
                        string6 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(string6)) {
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                string2 = "Processed VAST video";
                                yVar3.b(str6, string2);
                            }
                        } else if (y.a()) {
                            yVar4 = this.f10536h;
                            str8 = this.f10535g;
                            sb3 = new StringBuilder();
                            str9 = "Ignoring invalid \"vasttag\" for video: ";
                            sb3.append(str9);
                            sb3.append(jSONObject4);
                            String str12 = str8;
                            string = sb3.toString();
                            str10 = str12;
                            yVar4.d(str10, string);
                        }
                    } else if (jSONObject4.has("data")) {
                        int i15 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                        int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string8 = JsonUtils.getString(jSONObject6, "value", null);
                        if (i16 == 1 || i15 == 8) {
                            this.f10797e = string8;
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                sbA = defpackage.a.a("Processed advertiser: ");
                                str7 = this.f10797e;
                                sbA.append(str7);
                                string2 = sbA.toString();
                                yVar3.b(str6, string2);
                            }
                        } else if (i16 == 2 || i15 == 4) {
                            this.f10798i = string8;
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                sbA = defpackage.a.a("Processed body: ");
                                str7 = this.f10798i;
                                sbA.append(str7);
                                string2 = sbA.toString();
                                yVar3.b(str6, string2);
                            }
                        } else if (i16 == 12 || i15 == 5) {
                            this.f10800k = string8;
                            if (y.a()) {
                                yVar3 = this.f10536h;
                                str6 = this.f10535g;
                                sbA = defpackage.a.a("Processed cta: ");
                                str7 = this.f10800k;
                                sbA.append(str7);
                                string2 = sbA.toString();
                                yVar3.b(str6, string2);
                            }
                        } else if (i16 == 3 || i15 == 6) {
                            double dA = w.a(string8, -1.0d);
                            if (dA != -1.0d) {
                                this.f10799j = Double.valueOf(dA);
                                if (y.a()) {
                                    yVar3 = this.f10536h;
                                    str6 = this.f10535g;
                                    sbA = defpackage.a.a("Processed star rating: ");
                                    obj = this.f10799j;
                                    sbA.append(obj);
                                    string2 = sbA.toString();
                                    yVar3.b(str6, string2);
                                }
                            } else if (y.a()) {
                                a0.a("Received invalid star rating: ", string8, this.f10536h, this.f10535g);
                            }
                        } else if (y.a()) {
                            yVar4 = this.f10536h;
                            str8 = this.f10535g;
                            sb3 = new StringBuilder();
                            str9 = "Skipping unsupported data: ";
                            sb3.append(str9);
                            sb3.append(jSONObject4);
                            String str13 = str8;
                            string = sb3.toString();
                            str10 = str13;
                            yVar4.d(str10, string);
                        }
                    } else if (y.a()) {
                        this.f10536h.e(this.f10535g, "Unsupported asset object: " + jSONObject4);
                    }
                    i10++;
                    r10 = 0;
                }
                String string9 = JsonUtils.getString(jSONObject3, "jstracker", null);
                if (StringUtils.isValidString(string9)) {
                    this.f10809t.add(string9);
                    if (y.a()) {
                        a0.a("Processed jstracker: ", string9, this.f10536h, this.f10535g);
                    }
                }
                Object obj2 = null;
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
                if (jSONArray2 != null) {
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj2);
                        if (objectAtIndex instanceof String) {
                            String str14 = (String) objectAtIndex;
                            if (!TextUtils.isEmpty(str14)) {
                                this.f10810u.add(new l.a(this.f10534f).a(str14).f(false).d(false).a());
                                if (y.a()) {
                                    a0.a("Processed imptracker URL: ", str14, this.f10536h, this.f10535g);
                                }
                            }
                        }
                        i17++;
                        obj2 = null;
                    }
                }
                ?? r11 = 0;
                JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray3 != null) {
                    int i18 = 0;
                    while (i18 < jSONArray3.length()) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r11);
                        int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                        int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string10 = JsonUtils.getString(jSONObject7, ImagesContract.URL, r11);
                        if (!TextUtils.isEmpty(string10)) {
                            if (i20 == 1 || i20 == 2) {
                                if (i20 == 2 && string10.startsWith("<script")) {
                                    this.f10809t.add(string10);
                                } else {
                                    l lVarA = new l.a(this.f10534f).a(string10).f(false).d(false).i(i20 == 2).a();
                                    if (i19 == 1) {
                                        this.f10810u.add(lVarA);
                                        if (y.a()) {
                                            a0.a("Processed impression URL: ", string10, this.f10536h, this.f10535g);
                                        }
                                    } else {
                                        if (i19 == 2) {
                                            this.f10811v.add(lVarA);
                                            if (y.a()) {
                                                yVar2 = this.f10536h;
                                                str4 = this.f10535g;
                                                sb2 = new StringBuilder();
                                                str5 = "Processed viewable MRC50 URL: ";
                                            }
                                        } else if (i19 == 3) {
                                            this.f10812w.add(lVarA);
                                            if (y.a()) {
                                                yVar2 = this.f10536h;
                                                str4 = this.f10535g;
                                                sb2 = new StringBuilder();
                                                str5 = "Processed viewable MRC100 URL: ";
                                            }
                                        } else if (i19 == 4) {
                                            this.f10813x.add(lVarA);
                                            if (y.a()) {
                                                yVar = this.f10536h;
                                                str2 = this.f10535g;
                                                str3 = "Processed viewable video 50 URL: ";
                                                a0.a(str3, string10, yVar, str2);
                                            }
                                        } else if (i19 == 555) {
                                            if (y.a()) {
                                                yVar = this.f10536h;
                                                str2 = this.f10535g;
                                                str3 = "Ignoring processing of OMID URL: ";
                                                a0.a(str3, string10, yVar, str2);
                                            }
                                        } else if (y.a()) {
                                            this.f10536h.e(this.f10535g, "Unsupported event tracker: " + jSONObject7);
                                        }
                                        sb2.append(str5);
                                        sb2.append(string10);
                                        yVar2.b(str4, sb2.toString());
                                    }
                                }
                            } else if (y.a()) {
                                this.f10536h.e(this.f10535g, "Unsupported method for event tracker: " + jSONObject7);
                            }
                        }
                        i18++;
                        r11 = 0;
                    }
                }
                if (!StringUtils.isValidString(string6)) {
                    a();
                    return;
                }
                if (y.a()) {
                    this.f10536h.b(this.f10535g, "Processing VAST video...");
                }
                this.f10534f.G().a((com.applovin.impl.sdk.e.d) u.a(string6, JsonUtils.shallowCopy(this.f10793a), JsonUtils.shallowCopy(this.f10794b), com.applovin.impl.sdk.ad.b.UNKNOWN, this, this.f10534f));
                return;
            }
            if (y.a()) {
                y yVar6 = this.f10536h;
                String str15 = this.f10535g;
                StringBuilder sbA3 = defpackage.a.a("Unable to retrieve assets - failing ad load: ");
                sbA3.append(this.f10793a);
                yVar6.e(str15, sbA3.toString());
            }
            str = "Unable to retrieve assets";
        }
        b(str);
    }
}
