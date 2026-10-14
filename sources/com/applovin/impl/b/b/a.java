package com.applovin.impl.b.b;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.fragment.app.w;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f8727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<c> f8729e;

    public a(o oVar) {
        ArrayList arrayList = new ArrayList();
        this.f8729e = arrayList;
        this.f8725a = oVar;
        e eVarN = oVar.N();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(o.au());
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f8726b = (Integer) eVarN.b(com.applovin.impl.sdk.c.d.f10405w, (Object) null, defaultSharedPreferences);
        this.f8728d = (String) eVarN.b(com.applovin.impl.sdk.c.d.f10406x, (Object) null, defaultSharedPreferences);
        this.f8727c = (Integer) e.a(com.applovin.impl.sdk.c.d.f10407y.a(), (Object) null, Integer.class, defaultSharedPreferences);
        arrayList.add(new c(f()));
    }

    private String a(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            return "SFBX CMP";
        }
        if (iIntValue == 3) {
            return "Liveramp CMP";
        }
        if (iIntValue == 5) {
            return "Usercentrics CMP";
        }
        if (iIntValue == 6) {
            return "Sourcepoint Dialogue CMP";
        }
        if (iIntValue == 7) {
            return "Didomi CMP";
        }
        switch (iIntValue) {
            case 10:
                return "Quantcast Choices CMP";
            case 21:
                return "Traffective CMP";
            case 28:
                return "Onetrust / Cookiepro CMP";
            case 31:
                return "Consentmanager CMP";
            case 76:
                return "Sibbo CMP";
            case 90:
                return "Commanders ACT CMP";
            case 123:
                return "Iubenda CMP";
            case 300:
                return "Google consent management solutions";
            case 303:
                return "Impala CMP";
            case 306:
                return "mobile.de CMP";
            case 309:
                return "Kleinanzeigen CMP";
            case 348:
                return "Outfit7 CMP";
            default:
                return null;
        }
    }

    private String a(String str, String str2) {
        return w.a("\n", str, " - ", str2);
    }

    private JSONObject f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, 755);
            jSONObject.put("name", "Google Advertising Products\n(AdMob / Google Ad Manager)");
            jSONObject.put("purposes", CollectionUtils.toJSONArray(Arrays.asList(1, 3, 4)));
            jSONObject.put("legIntPurposes", CollectionUtils.toJSONArray(Arrays.asList(2, 7, 9, 10)));
            jSONObject.put("flexiblePurposes", CollectionUtils.toJSONArray(Arrays.asList(2, 7, 9, 10)));
            jSONObject.put("personalizedAdPurposes", CollectionUtils.toJSONArray(Arrays.asList(1, 2, 3, 4, 7, 9, 10)));
            jSONObject.put("nonPersonalizedAdPurposes", CollectionUtils.toJSONArray(Arrays.asList(1, 2, 7, 9, 10)));
            jSONObject.put("limitedAdPurposes", CollectionUtils.toJSONArray(Arrays.asList(2, 7, 9, 10)));
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String a() {
        return a(this.f8726b);
    }

    public String b() {
        return a("CMP Name", a()) + a("IABTCF_TCString", this.f8728d) + a("IABTCF_gdprApplies", String.valueOf(this.f8727c));
    }

    public Integer c() {
        return this.f8727c;
    }

    public String d() {
        return this.f8728d;
    }

    public List<c> e() {
        return this.f8729e;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String strValueOf;
        int i10;
        Integer num;
        if (!str.equals(com.applovin.impl.sdk.c.d.f10405w.a())) {
            if (str.equals(com.applovin.impl.sdk.c.d.f10407y.a())) {
                num = (Integer) e.a(str, (Object) null, Integer.class, sharedPreferences);
                this.f8727c = num;
            } else if (str.equals(com.applovin.impl.sdk.c.d.f10406x.a())) {
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                this.f8728d = strValueOf;
            } else if (str.equals(com.applovin.impl.sdk.c.d.A.a())) {
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                Iterator<c> it = this.f8729e.iterator();
                while (it.hasNext()) {
                    it.next().a(strValueOf);
                }
            } else if (str.equals(com.applovin.impl.sdk.c.d.B.a())) {
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                Iterator<c> it2 = this.f8729e.iterator();
                while (it2.hasNext()) {
                    it2.next().b(strValueOf);
                }
            } else if (str.equals(com.applovin.impl.sdk.c.d.C.a())) {
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                Iterator<c> it3 = this.f8729e.iterator();
                while (it3.hasNext()) {
                    it3.next().c(strValueOf);
                }
            } else if (str.equals(com.applovin.impl.sdk.c.d.D.a())) {
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                Iterator<c> it4 = this.f8729e.iterator();
                while (it4.hasNext()) {
                    it4.next().d(strValueOf);
                }
            } else {
                if (!str.contains("IABTCF_PublisherRestrictions")) {
                    return;
                }
                strValueOf = (String) e.a(str, (Object) null, String.class, sharedPreferences);
                String strReplace = str.replace("IABTCF_PublisherRestrictions", "");
                if (StringUtils.isNumeric(strReplace) && b.EnumC0118b.ONE.f8750l <= (i10 = Integer.parseInt(strReplace)) && i10 <= b.EnumC0118b.values().length) {
                    Iterator<c> it5 = this.f8729e.iterator();
                    while (it5.hasNext()) {
                        it5.next().a(i10, strValueOf);
                    }
                }
            }
            this.f8725a.F();
            if (y.a()) {
                this.f8725a.F().b("TcfManager", w.a("SharedPreference entry updated - key: ", str, ", value: ", strValueOf));
            }
            this.f8725a.k();
        }
        num = (Integer) e.a(str, (Object) null, Integer.class, sharedPreferences);
        this.f8726b = num;
        strValueOf = String.valueOf(num);
        this.f8725a.F();
        if (y.a()) {
            this.f8725a.F().b("TcfManager", w.a("SharedPreference entry updated - key: ", str, ", value: ", strValueOf));
        }
        this.f8725a.k();
    }
}
