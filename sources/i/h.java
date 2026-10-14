package i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p0.m0;
import p0.n0;
import p0.o0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f31176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f31177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31178e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31175b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f31179f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<m0> f31174a = new ArrayList<>();

    public class a extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31180a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31181b = 0;

        public a() {
        }

        @Override // p0.o0, p0.n0
        public void b(View view) {
            int i10 = this.f31181b + 1;
            this.f31181b = i10;
            if (i10 == h.this.f31174a.size()) {
                n0 n0Var = h.this.f31177d;
                if (n0Var != null) {
                    n0Var.b(null);
                }
                this.f31181b = 0;
                this.f31180a = false;
                h.this.f31178e = false;
            }
        }

        @Override // p0.o0, p0.n0
        public void c(View view) {
            if (this.f31180a) {
                return;
            }
            this.f31180a = true;
            n0 n0Var = h.this.f31177d;
            if (n0Var != null) {
                n0Var.c(null);
            }
        }
    }

    public void a() {
        if (this.f31178e) {
            Iterator<m0> it = this.f31174a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f31178e = false;
        }
    }

    public void b() {
        View view;
        if (this.f31178e) {
            return;
        }
        for (m0 m0Var : this.f31174a) {
            long j10 = this.f31175b;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = this.f31176c;
            if (interpolator != null && (view = m0Var.f34395a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f31177d != null) {
                m0Var.d(this.f31179f);
            }
            View view2 = m0Var.f34395a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f31178e = true;
    }
}
