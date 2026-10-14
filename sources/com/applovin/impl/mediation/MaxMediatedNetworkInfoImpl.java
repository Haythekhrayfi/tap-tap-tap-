package com.applovin.impl.mediation;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8987a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f8987a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.f8987a, Action.CLASS_ATTRIBUTE, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.f8987a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.f8987a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.f8987a, "sdk_version", "");
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MaxMediatedNetworkInfo{name=");
        sbA.append(getName());
        sbA.append(", adapterClassName=");
        sbA.append(getAdapterClassName());
        sbA.append(", adapterVersion=");
        sbA.append(getAdapterVersion());
        sbA.append(", sdkVersion=");
        sbA.append(getSdkVersion());
        sbA.append('}');
        return sbA.toString();
    }
}
