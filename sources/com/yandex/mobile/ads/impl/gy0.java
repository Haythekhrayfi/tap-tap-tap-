package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gy0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f21233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lk0 f21234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ci0 f21235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q0 f21236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uk f21237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wi f21238f = new wi();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private lw f21239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private gy0<V>.b f21240h;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uk f21241a;

        public a(uk ukVar) {
            this.f21241a = ukVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f21241a.e();
        }
    }

    public class b implements r0 {
        private b() {
        }

        public /* synthetic */ b(gy0 gy0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void a() {
            if (gy0.this.f21239g != null) {
                gy0.this.f21239g.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.r0
        public final void b() {
            if (gy0.this.f21239g != null) {
                gy0.this.f21239g.pause();
            }
        }
    }

    public static class c implements zi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f21243a;

        public c(View view) {
            this.f21243a = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.zi
        public final void a() {
            View view = this.f21243a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public gy0(AdResponse adResponse, q0 q0Var, uk ukVar, ei0 ei0Var, lk0 lk0Var) {
        this.f21233a = adResponse;
        this.f21234b = lk0Var;
        this.f21236d = q0Var;
        this.f21237e = ukVar;
        this.f21235c = ei0Var;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        View viewB = this.f21235c.b(v10);
        if (viewB == null) {
            this.f21237e.e();
            return;
        }
        int i10 = 0;
        gy0<V>.b bVar = new b(this, i10);
        this.f21240h = bVar;
        this.f21236d.a(bVar);
        nz0 nz0VarA = i01.b().a(viewB.getContext());
        boolean z10 = nz0VarA != null && nz0VarA.X();
        if ("divkit".equals(this.f21233a.w()) && z10) {
            i10 = 1;
        }
        if ((i10 ^ 1) != 0) {
            viewB.setOnClickListener(new a(this.f21237e));
        }
        viewB.setVisibility(8);
        c cVar = new c(viewB);
        wi wiVar = this.f21238f;
        AdResponse<?> adResponse = this.f21233a;
        lk0 lk0Var = this.f21234b;
        Objects.requireNonNull(wiVar);
        lw lwVarA = wi.a(adResponse, cVar, lk0Var);
        this.f21239g = lwVarA;
        lwVarA.start();
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        gy0<V>.b bVar = this.f21240h;
        if (bVar != null) {
            this.f21236d.b(bVar);
        }
        lw lwVar = this.f21239g;
        if (lwVar != null) {
            lwVar.invalidate();
        }
    }
}
