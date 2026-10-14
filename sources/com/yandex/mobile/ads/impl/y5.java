package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rp0 f26696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f26697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f26698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f26699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z5 f26703h;

    private y5(rp0 rp0Var, String str, ArrayList arrayList) {
        z5 z5Var = z5.f27219c;
        ArrayList arrayList2 = new ArrayList();
        this.f26698c = arrayList2;
        this.f26699d = new HashMap();
        this.f26696a = rp0Var;
        this.f26697b = null;
        this.f26700e = str;
        this.f26703h = z5Var;
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rb1 rb1Var = (rb1) it.next();
            this.f26699d.put(UUID.randomUUID().toString(), rb1Var);
        }
        this.f26702g = null;
        this.f26701f = null;
    }

    public static y5 a(rp0 rp0Var, String str, ArrayList arrayList) {
        in1.a(str, "OM SDK JS script content is null");
        return new y5(rp0Var, str, arrayList);
    }

    public final z5 a() {
        return this.f26703h;
    }

    public final String b() {
        return this.f26702g;
    }

    public final String c() {
        return this.f26701f;
    }

    public final Map<String, rb1> d() {
        return Collections.unmodifiableMap(this.f26699d);
    }

    public final String e() {
        return this.f26700e;
    }

    public final rp0 f() {
        return this.f26696a;
    }

    public final List<rb1> g() {
        return Collections.unmodifiableList(this.f26698c);
    }

    public final WebView h() {
        return this.f26697b;
    }
}
