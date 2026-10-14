package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LinkedHashMap f19785a = new LinkedHashMap();

    public static final b90 a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return a(context, "YadPreferenceFile");
    }

    public static final b90 a(Context context, String str) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(str, "filename");
        LinkedHashMap linkedHashMap = f19785a;
        b90 b90Var = (b90) linkedHashMap.get(str);
        if (b90Var != null) {
            return b90Var;
        }
        c90 c90Var = new c90(context, str);
        linkedHashMap.put(str, c90Var);
        return c90Var;
    }
}
