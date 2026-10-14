package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class yh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<wk0, xh0> f26847a = new a();

    public class a extends HashMap<wk0, xh0> {
        public a() {
            put(wk0.f26300b, new bk0());
            put(wk0.f26301c, new qj0());
            put(wk0.f26302d, new l21());
        }
    }

    public static xh0 a(wk0 wk0Var) {
        return (xh0) ((HashMap) f26847a).get(wk0Var);
    }
}
