package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final we1 f19503a;

    public cg1(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f19503a = new we1(context);
    }

    public final void a(bg1 bg1Var, String str) {
        fd.j0.i(bg1Var, "trackable");
        fd.j0.i(str, "eventName");
        List<String> list = bg1Var.a().get(str);
        Objects.toString(list);
        Objects.requireNonNull(System.out);
        if (list != null) {
            this.f19503a.a((List<String>) list, (Map<String, String>) null);
        }
    }

    public final void a(bg1 bg1Var, String str, Map<String, String> map) {
        fd.j0.i(bg1Var, "trackable");
        fd.j0.i(str, "eventName");
        fd.j0.i(map, "macros");
        List<String> list = bg1Var.a().get(str);
        Objects.toString(list);
        Objects.requireNonNull(System.out);
        if (list != null) {
            this.f19503a.a(list, map);
        }
    }
}
