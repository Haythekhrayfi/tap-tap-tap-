package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class od0<T extends com.yandex.mobile.ads.mediation.base.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd0 f23778a;

    public od0(qd0 qd0Var) {
        this.f23778a = qd0Var;
    }

    private void a(Context context, ce0 ce0Var, String str) {
        HashMap map = new HashMap();
        map.put("reason", "could_not_create_adapter");
        map.put("description", str);
        this.f23778a.a(context, ce0Var, map);
    }

    public final T a(Context context, ce0 ce0Var, Class<T> cls) {
        HashMap mapA;
        String str;
        T t10 = null;
        try {
            String strC = ce0Var.c();
            Object objA = iv0.a(Class.forName(strC), new Object[0]);
            T tCast = cls.cast(objA);
            if (tCast != null) {
                return tCast;
            }
            try {
                a(context, ce0Var, objA == null ? String.format("Instantiation failed for %s", strC) : String.format("Cast from %s to %s is failed", objA.getClass().getName(), cls.getName()));
                return tCast;
            } catch (ClassCastException e10) {
                e = e10;
                t10 = tCast;
                mapA = com.applovin.impl.mediation.b.a.c.a("reason", "does_not_conform_to_protocol");
                x60.a(e, e.getMessage(), new Object[0]);
                str = String.format("%s %s", e.getClass().getName(), e.getMessage());
                T t11 = t10;
                mapA.put("description", str);
                this.f23778a.a(context, ce0Var, mapA);
                return t11;
            } catch (Exception e11) {
                e = e11;
                t10 = tCast;
                mapA = com.applovin.impl.mediation.b.a.c.a("reason", "could_not_create_adapter");
                x60.a(e, e.getMessage(), new Object[0]);
                str = String.format("%s %s", e.getClass().getName(), e.getMessage());
                T t12 = t10;
                mapA.put("description", str);
                this.f23778a.a(context, ce0Var, mapA);
                return t12;
            }
        } catch (ClassCastException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }
}
