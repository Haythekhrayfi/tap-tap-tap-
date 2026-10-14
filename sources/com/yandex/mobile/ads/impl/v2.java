package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 {
    public static final void a(String str) {
        fd.j0.i(str, "adConfigurationInfo");
        String str2 = String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1));
        fd.j0.h(str2, "format(this, *args)");
        o60.b(str2, new Object[0]);
    }

    public static final void a(String str, ArrayList arrayList) {
        fd.j0.i(str, "adType");
        fd.j0.i(arrayList, "errors");
        if (!arrayList.isEmpty()) {
            String str2 = String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, kc.t.w(arrayList, "\n - ", "\n - ", null, 0, null, null, 60)}, 2));
            fd.j0.h(str2, "format(this, *args)");
            o60.a(str2, new Object[0]);
        }
    }
}
