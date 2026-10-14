package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ba1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z91 f19154a;

    public ba1(z91 z91Var) {
        fd.j0.i(z91Var, "userAgentCreatorProvider");
        this.f19154a = z91Var;
    }

    public final String a(Context context) {
        Objects.requireNonNull(this.f19154a);
        return ((context == null || !z91.a.a(context)) ? new v51() : new j01(new aa1())).a();
    }
}
