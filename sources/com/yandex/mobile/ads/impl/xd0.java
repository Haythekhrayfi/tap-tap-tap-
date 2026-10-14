package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id0<?, ?> f26499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f26500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f26501c;

    public xd0(Context context, id0 id0Var, HashMap map) {
        this.f26501c = context;
        this.f26499a = id0Var;
        this.f26500b = map;
    }

    public final void a() {
        this.f26499a.b(this.f26501c, this.f26500b);
    }
}
