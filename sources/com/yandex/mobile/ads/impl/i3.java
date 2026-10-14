package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3 f21579a = l3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j3 f21580b = new j3();

    public final String a(Context context) {
        ArrayList arrayListA = this.f21579a.a();
        Objects.requireNonNull(this.f21580b);
        nz0 nz0VarA = i01.b().a(context);
        return TextUtils.join(",", arrayListA.subList(arrayListA.size() - Math.min((nz0VarA == null || nz0VarA.c() == 0) ? 5 : nz0VarA.c(), arrayListA.size()), arrayListA.size()));
    }

    public final String b(Context context) {
        ArrayList arrayListC = this.f21579a.c();
        Objects.requireNonNull(this.f21580b);
        nz0 nz0VarA = i01.b().a(context);
        return TextUtils.join(",", arrayListC.subList(arrayListC.size() - Math.min((nz0VarA == null || nz0VarA.c() == 0) ? 5 : nz0VarA.c(), arrayListC.size()), arrayListC.size()));
    }
}
