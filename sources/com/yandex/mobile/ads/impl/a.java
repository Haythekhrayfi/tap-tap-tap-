package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t91 f18748a;

    public a(t91 t91Var) {
        fd.j0.i(t91Var, "urlUtils");
        this.f18748a = t91Var;
    }

    public final boolean a(String str) {
        List<String> pathSegments;
        Objects.requireNonNull(this.f18748a);
        String str2 = null;
        try {
            pathSegments = Uri.parse(str).getPathSegments();
        } catch (Throwable unused) {
            pathSegments = null;
        }
        if (pathSegments != null && !pathSegments.isEmpty()) {
            str2 = pathSegments.get(0);
        }
        return fd.j0.d("appcry", str2);
    }
}
