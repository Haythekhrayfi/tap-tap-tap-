package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.j;
import com.applovin.impl.b.a.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.a.c f10196d;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, o oVar) {
        super(jSONObject, jSONObject2, bVar, oVar);
        this.f10193a = b();
        this.f10194b = i();
        this.f10195c = aT();
        this.f10196d = new com.applovin.impl.sdk.a.c(this);
    }

    private String aT() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f10193a);
            JsonUtils.putString(this.adObject, "stream_url", this.f10195c);
        }
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.c o() {
        return this.f10196d;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f10194b;
    }

    public String e() {
        return this.f10195c;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return this.adObject.has("stream_url");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.fullResponseLock) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArrayA = k.a(jSONObjectDeepCopy, "ads");
        if (jSONArrayA.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayA, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f10193a);
            JsonUtils.putString(jSONObject, "video", this.f10194b);
            JsonUtils.putString(jSONObject, "stream_url", this.f10195c);
        }
        return jSONObjectDeepCopy;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        String strAT = aT();
        if (StringUtils.isValidString(strAT)) {
            return Uri.parse(strAT);
        }
        String strI = i();
        if (StringUtils.isValidString(strI)) {
            return Uri.parse(strI);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return h() != null;
    }

    public String i() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    public boolean m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public j.a n() {
        return a(getIntFromAdObject("expandable_style", j.a.INVISIBLE.a()));
    }
}
