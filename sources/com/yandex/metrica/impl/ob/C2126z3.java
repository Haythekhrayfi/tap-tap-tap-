package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2126z3 {
    public static final com.yandex.metrica.billing_interface.a a() {
        Field field;
        String str = null;
        try {
            Class clsB = B2.b("com.android.billingclient.BuildConfig");
            str = (String) ((clsB == null || (field = clsB.getField(CoreConstants.VERSION_NAME_KEY)) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        if (str == null) {
            return com.yandex.metrica.billing_interface.a.NONE;
        }
        if (ed.q.u(str, "2.", false, 2) || ed.q.u(str, "3.", false, 2)) {
            return com.yandex.metrica.billing_interface.a.LIBRARY_V3;
        }
        ed.q.u(str, "4.", false, 2);
        return com.yandex.metrica.billing_interface.a.LIBRARY_V4;
    }
}
