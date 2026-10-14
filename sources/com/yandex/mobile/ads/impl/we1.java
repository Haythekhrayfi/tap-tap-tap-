package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class we1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg1 f26266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jg1 f26267c;

    public we1(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f26265a = context.getApplicationContext();
        this.f26266b = new dg1();
        this.f26267c = new jg1();
    }

    public final void a(List<String> list, Map<String, String> map) {
        fd.j0.i(list, "rawUrls");
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        for (String strA : list) {
            boolean z10 = map != null;
            if (z10) {
                Objects.requireNonNull(this.f26266b);
                strA = dg1.a(strA, map);
            } else if (z10) {
                throw new jc.g();
            }
            fd.j0.h(strA, "when (macros != null) {\n…e -> rawUrl\n            }");
            arrayList.add(strA);
        }
        Objects.requireNonNull(this.f26267c);
        for (String str : jg1.a(arrayList)) {
            df1.a aVar = df1.f19855c;
            Context context = this.f26265a;
            fd.j0.h(context, "applicationContext");
            aVar.a(context).a(str);
        }
    }
}
