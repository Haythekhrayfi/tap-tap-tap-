package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, ya> f27262a = new a();

    public class a extends HashMap<String, ya> {
        public a() {
            put("image", new k20());
            put("number", new pn0());
            put("close_button", new pi());
            put("media", new ab0());
            put("string", new v41());
        }
    }

    public static ya a(String str) {
        Objects.requireNonNull(str);
        String str2 = "media";
        switch (str) {
            case "close_button":
                str2 = "close_button";
                break;
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "rating":
            case "review_count":
                str2 = "number";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (ya) ((HashMap) f27262a).get(str2);
    }
}
