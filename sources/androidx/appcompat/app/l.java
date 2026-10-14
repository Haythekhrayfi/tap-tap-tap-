package androidx.appcompat.app;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import p0.e0;
import p0.m0;
import p0.o0;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f682c;

    public class a extends o0 {
        public a() {
        }

        @Override // p0.o0, p0.n0
        public void b(View view) {
            l.this.f682c.f616x.setAlpha(1.0f);
            l.this.f682c.A.d(null);
            l.this.f682c.A = null;
        }

        @Override // p0.o0, p0.n0
        public void c(View view) {
            l.this.f682c.f616x.setVisibility(0);
        }
    }

    public l(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f682c = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f682c;
        appCompatDelegateImpl.f617y.showAtLocation(appCompatDelegateImpl.f616x, 55, 0, 0);
        this.f682c.L();
        if (!this.f682c.Z()) {
            this.f682c.f616x.setAlpha(1.0f);
            this.f682c.f616x.setVisibility(0);
            return;
        }
        this.f682c.f616x.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        AppCompatDelegateImpl appCompatDelegateImpl2 = this.f682c;
        m0 m0VarB = e0.b(appCompatDelegateImpl2.f616x);
        m0VarB.a(1.0f);
        appCompatDelegateImpl2.A = m0VarB;
        m0 m0Var = this.f682c.A;
        a aVar = new a();
        View view = m0Var.f34395a.get();
        if (view != null) {
            m0Var.e(view, aVar);
        }
    }
}
