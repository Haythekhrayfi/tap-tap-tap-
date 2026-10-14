package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7 f19115a = new c7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr0 f19116b = new wr0();

    public final Map<String, Object> a(AdRequest adRequest) {
        gw0 gw0Var = new gw0(new HashMap());
        if (adRequest != null) {
            Map<String, String> parameters = adRequest.getParameters();
            Objects.requireNonNull(this.f19115a);
            gw0 gw0Var2 = new gw0(new HashMap());
            if (parameters != null) {
                String str = parameters.get("adapter_network_name");
                String str2 = parameters.get("adapter_version");
                String str3 = parameters.get("adapter_network_sdk_version");
                gw0Var2.a(str, "adapter_network_name");
                gw0Var2.a(str2, "adapter_version");
                gw0Var2.a(str3, "adapter_network_sdk_version");
            }
            Map<String, Object> mapA = gw0Var2.a();
            Objects.requireNonNull(this.f19116b);
            gw0 gw0Var3 = new gw0(new HashMap());
            if (parameters != null) {
                String str4 = parameters.get("plugin_type");
                String str5 = parameters.get("plugin_version");
                gw0Var3.a(str4, "plugin_type");
                gw0Var3.a(str5, "plugin_version");
            }
            Map<String, Object> mapA2 = gw0Var3.a();
            gw0Var.a(mapA);
            gw0Var.a(mapA2);
        }
        return gw0Var.a();
    }
}
