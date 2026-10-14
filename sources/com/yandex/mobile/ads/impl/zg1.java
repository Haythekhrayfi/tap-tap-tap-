package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f27330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xg1 f27331b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zg1(Context context) {
        this(f11.a(new f11(), context, "ViewSizeInfoStorage"), new xg1());
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public zg1(SharedPreferences sharedPreferences, xg1 xg1Var) {
        fd.j0.i(sharedPreferences, "preferences");
        fd.j0.i(xg1Var, "viewSizeInfoParser");
        this.f27330a = sharedPreferences;
        this.f27331b = xg1Var;
    }

    public final String a(bh1 bh1Var) {
        fd.j0.i(bh1Var, "viewSizeKey");
        return this.f27330a.getString(bh1Var.a() + CoreConstants.DASH_CHAR + bh1Var.b(), null);
    }

    public final void a(bh1 bh1Var, wg1 wg1Var) {
        fd.j0.i(bh1Var, "viewSizeKey");
        fd.j0.i(wg1Var, "viewSizeInfo");
        String str = bh1Var.a() + CoreConstants.DASH_CHAR + bh1Var.b();
        Objects.requireNonNull(this.f27331b);
        String string = xg1.a(wg1Var).toString();
        fd.j0.h(string, "viewSizeInfoParser.toJson(viewSizeInfo).toString()");
        this.f27330a.edit().putString(str, string).apply();
    }
}
