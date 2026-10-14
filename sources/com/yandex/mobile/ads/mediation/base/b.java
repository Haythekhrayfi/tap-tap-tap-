package com.yandex.mobile.ads.mediation.base;

import com.yandex.mobile.ads.impl.x60;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static HashMap a(a aVar) {
        HashMap map = new HashMap();
        try {
            MediatedAdapterInfo adapterInfo = aVar.getAdapterInfo();
            String adapterVersion = adapterInfo.getAdapterVersion();
            String str = "null";
            if (adapterVersion == null) {
                adapterVersion = "null";
            }
            map.put("mediation_adapter_version", adapterVersion);
            String networkName = adapterInfo.getNetworkName();
            if (networkName == null) {
                networkName = "null";
            }
            map.put("mediation_network_name", networkName);
            String networkSdkVersion = adapterInfo.getNetworkSdkVersion();
            if (networkSdkVersion != null) {
                str = networkSdkVersion;
            }
            map.put("mediation_network_sdk_version", str);
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
        }
        return map;
    }
}
