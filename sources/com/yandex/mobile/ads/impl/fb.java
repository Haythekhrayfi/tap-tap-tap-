package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, eb> f20590a = new a();

    public class a extends HashMap<String, eb> {
        public a() {
            put("image", new y10());
            put("string", new w41());
            put("media", new bb0());
        }
    }

    public static eb a(String str) {
        Objects.requireNonNull(str);
        String str2 = "media";
        switch (str) {
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (eb) ((HashMap) f20590a).get(str2);
    }
}
