package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<la1.a> f20936b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h30 f20937a = new h30();

    public class a extends ArrayList<la1.a> {
        public a() {
            add(la1.a.f22656b);
            add(la1.a.f22657c);
            add(la1.a.f22662h);
        }
    }

    public final void a(FrameLayout frameLayout) {
        this.f20937a.a(frameLayout);
    }

    public final void a(la1 la1Var, FrameLayout frameLayout) {
        this.f20937a.a(frameLayout, la1Var, !((ArrayList) f20936b).contains(la1Var.e()));
    }
}
