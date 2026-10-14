package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class xg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f26514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26517d;

    public xg0(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f26514a = z8.a(context);
        this.f26515b = true;
        this.f26516c = true;
        this.f26517d = true;
    }

    public final void a() {
        if (this.f26517d) {
            this.f26514a.a(new fw0(fw0.b.N, kc.f0.d(new jc.h("event_type", "first_auto_swipe"))));
            this.f26517d = false;
        }
    }

    public final void b() {
        if (this.f26515b) {
            this.f26514a.a(new fw0(fw0.b.N, kc.f0.d(new jc.h("event_type", "first_click_on_controls"))));
            this.f26515b = false;
        }
    }

    public final void c() {
        if (this.f26516c) {
            this.f26514a.a(new fw0(fw0.b.N, kc.f0.d(new jc.h("event_type", "first_user_swipe"))));
            this.f26516c = false;
        }
    }
}
