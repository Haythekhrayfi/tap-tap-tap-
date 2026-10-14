package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f21989a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<? extends qa<?>> f21990a = kc.w.f32009c;

        public final j80 a() {
            return new j80(this.f21990a, 0);
        }

        public final void a(m80 m80Var) {
            fd.j0.i(m80Var, "link");
        }

        public final void a(List<? extends qa<?>> list) {
            fd.j0.i(list, "assets");
            this.f21990a = list;
        }
    }

    private j80(List list) {
        this.f21989a = list;
    }

    public /* synthetic */ j80(List list, int i10) {
        this(list);
    }

    public final List<qa<?>> a() {
        return this.f21989a;
    }
}
