package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vm f26318a;

    public wm(Context context, Map<String, ? extends Object> map) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(map, "debugParams");
        this.f26318a = new vm(z8.a(context), map);
    }

    public final vm a() {
        return this.f26318a;
    }
}
