package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class lq implements y7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22761a;

    public lq(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f22761a = context;
    }

    @Override // y7.a
    public final Typeface getBold() {
        tv tvVarA = uv.a(this.f22761a);
        if (tvVarA != null) {
            return tvVarA.a();
        }
        return null;
    }

    @Override // y7.a
    public final Typeface getLight() {
        tv tvVarA = uv.a(this.f22761a);
        if (tvVarA != null) {
            return tvVarA.b();
        }
        return null;
    }

    @Override // y7.a
    public final Typeface getMedium() {
        tv tvVarA = uv.a(this.f22761a);
        if (tvVarA != null) {
            return tvVarA.c();
        }
        return null;
    }

    @Override // y7.a
    public final Typeface getRegular() {
        tv tvVarA = uv.a(this.f22761a);
        if (tvVarA != null) {
            return tvVarA.d();
        }
        return null;
    }

    @Deprecated
    public Typeface getRegularLegacy() {
        return getRegular();
    }
}
