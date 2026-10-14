package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class Ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ek f14230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ck f14231b;

    public Ik(Context context) {
        this(new Ek(context), new Ck());
    }

    public Ik(Ek ek, Ck ck) {
        this.f14230a = ek;
        this.f14231b = ck;
    }

    public EnumC2119yl a(Activity activity, Il il) {
        if (il == null) {
            return EnumC2119yl.NULL_UI_ACCESS_CONFIG;
        }
        if (!il.f14232a) {
            return EnumC2119yl.UI_PARING_FEATURE_DISABLED;
        }
        C1542bm c1542bm = il.f14236e;
        if (c1542bm == null) {
            return EnumC2119yl.NULL_UI_PARSING_CONFIG;
        }
        if (this.f14230a.a(activity, c1542bm)) {
            return EnumC2119yl.FORBIDDEN_FOR_APP;
        }
        return this.f14231b.a(activity, il.f14236e) ? EnumC2119yl.FORBIDDEN_FOR_ACTIVITY : EnumC2119yl.OK;
    }
}
