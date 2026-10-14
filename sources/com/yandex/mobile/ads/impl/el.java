package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class el implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xg0 f20268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ug0 f20269b;

    public static final class a extends el {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final eh0 f20270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eh0 eh0Var, xg0 xg0Var, ug0 ug0Var) {
            super(xg0Var, ug0Var, 0);
            fd.j0.i(eh0Var, "multiBannerSwiper");
            fd.j0.i(xg0Var, "multiBannerEventTracker");
            this.f20270c = eh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.el, android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f20270c.b();
            super.onClick(view);
        }
    }

    public static final class b extends el {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final eh0 f20271c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eh0 eh0Var, xg0 xg0Var, ug0 ug0Var) {
            super(xg0Var, ug0Var, 0);
            fd.j0.i(eh0Var, "multiBannerSwiper");
            fd.j0.i(xg0Var, "multiBannerEventTracker");
            this.f20271c = eh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.el, android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f20271c.a();
            super.onClick(view);
        }
    }

    private el(xg0 xg0Var, ug0 ug0Var) {
        this.f20268a = xg0Var;
        this.f20269b = ug0Var;
    }

    public /* synthetic */ el(xg0 xg0Var, ug0 ug0Var, int i10) {
        this(xg0Var, ug0Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ug0 ug0Var = this.f20269b;
        if (ug0Var != null) {
            ug0Var.a();
        }
        this.f20268a.b();
    }
}
