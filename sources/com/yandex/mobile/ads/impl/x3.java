package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<v3, String> f26414b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3 f26415a;

    public class a extends HashMap<v3, String> {
        public a() {
            put(v3.f25800c, "ad_loading_duration");
            put(v3.f25804g, "identifiers_loading_duration");
            put(v3.f25799b, "advertising_info_loading_duration");
            put(v3.f25802e, "autograb_loading_duration");
            put(v3.f25803f, "bidding_data_loading_duration");
            put(v3.f25807j, "network_request_durations");
            put(v3.f25805h, "image_loading_duration");
            put(v3.f25806i, "video_caching_duration");
            put(v3.f25798a, "adapter_loading_duration");
            put(v3.f25808k, "vast_loading_durations");
            put(v3.f25811n, "vmap_loading_duration");
        }
    }

    public x3(w3 w3Var) {
        this.f26415a = w3Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (u3 u3Var : this.f26415a.b()) {
            String str = (String) ((HashMap) f26414b).get(u3Var.a());
            if (str != null) {
                List list = (List) map.get(str);
                if (list != null) {
                    list.add(u3Var.b());
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(u3Var.b());
                    map.put(str, linkedList);
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put("durations", map);
        return map2;
    }

    public final Map<String, Object> b() {
        gw0 gw0Var = new gw0(new HashMap());
        for (u3 u3Var : this.f26415a.b()) {
            if (u3Var.a().ordinal() == 3) {
                gw0Var.b(u3Var.b(), "ad_rendering_duration");
            }
        }
        return gw0Var.a();
    }
}
