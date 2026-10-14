package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f10190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f10191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f10192c;
    public final b source;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, b bVar, o oVar) {
        super(jSONObject, jSONObject2, oVar);
        this.f10190a = new Bundle();
        this.source = bVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdB;
        if ((obj instanceof f) && (appLovinAdB = ((f) obj).b()) != null) {
            obj = appLovinAdB;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    public d getAdZone() {
        d dVar = this.f10191b;
        if (dVar != null) {
            if (dVar.c() != null && this.f10191b.d() != null) {
                return this.f10191b;
            }
            if (getSize() == null && getType() == null) {
                return this.f10191b;
            }
        }
        d dVarA = d.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f10191b = dVarA;
        return dVarA;
    }

    public f getDummyAd() {
        return this.f10192c;
    }

    public Bundle getMAXAdValues() {
        return this.f10190a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    public b getSource() {
        return this.source;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().e()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.F();
        if (!y.a()) {
            return false;
        }
        this.sdk.F().e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(f fVar) {
        this.f10192c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setHasShown(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.adObjectLock     // Catch: java.lang.Throwable -> Lf
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lf
            org.json.JSONObject r1 = r3.adObject     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "shown"
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.ad.AppLovinAdImpl.setHasShown(boolean):void");
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f10190a);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinAd{adIdNumber=");
        sbA.append(getAdIdNumber());
        sbA.append(", source=");
        sbA.append(getSource());
        sbA.append(", zoneId=\"");
        sbA.append(getZoneId());
        sbA.append("\"");
        sbA.append('}');
        return sbA.toString();
    }
}
