package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<la1.a, String> f23081a = new a();

    public class a extends HashMap<la1.a, String> {
        public a() {
            put(la1.a.f22657c, "Screen is locked");
            put(la1.a.f22658d, "Asset value %s doesn't match view value");
            put(la1.a.f22659e, "No ad view");
            put(la1.a.f22660f, "No valid ads in ad unit");
            put(la1.a.f22661g, "No visible required assets");
            put(la1.a.f22662h, "Ad view is not added to hierarchy");
            put(la1.a.f22663i, "Ad is not visible for percent");
            put(la1.a.f22664j, "Required asset %s is not visible in ad view");
            put(la1.a.f22665k, "Required asset %s is not subview of ad view");
            put(la1.a.f22656b, "Unknown error, that shouldn't happen");
            put(la1.a.f22666l, "Ad view is hidden");
            put(la1.a.f22667m, "View is too small");
            put(la1.a.f22668n, "Visible area of an ad view is too small");
        }
    }

    public final String a(la1 la1Var) {
        String strA = la1Var.a();
        String str = (String) ((HashMap) this.f23081a).get(la1Var.e());
        return str != null ? String.format(str, strA) : "Visibility error";
    }
}
