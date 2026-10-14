package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie1 f25376a = new ie1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj1 f25377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oj1 f25378c;

    public tj1(Context context, ac1 ac1Var) {
        this.f25377b = new yj1(ac1Var);
        this.f25378c = new oj1(context, ac1Var);
    }

    public final List<ac1> a(List<ac1> list) {
        wj1 wj1VarA = this.f25377b.a();
        if (wj1VarA == null) {
            return list;
        }
        if (!wj1VarA.b()) {
            Objects.requireNonNull(this.f25376a);
            list = ie1.a(list).a();
        }
        if (!wj1VarA.a() && !list.isEmpty()) {
            list = Collections.singletonList(list.get(0));
        }
        return this.f25378c.a(list);
    }
}
