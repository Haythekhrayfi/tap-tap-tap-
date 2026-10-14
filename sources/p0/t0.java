package p0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34437a;

    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f34438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f34439b;

        public a(Window window, View view) {
            this.f34438a = window;
            this.f34439b = view;
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // p0.t0.e
        public void b(boolean z10) {
            if (!z10) {
                View decorView = this.f34438a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            } else {
                this.f34438a.clearFlags(67108864);
                this.f34438a.addFlags(Integer.MIN_VALUE);
                View decorView2 = this.f34438a.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
            }
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // p0.t0.e
        public void a(boolean z10) {
            if (!z10) {
                View decorView = this.f34438a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
            } else {
                this.f34438a.clearFlags(134217728);
                this.f34438a.addFlags(Integer.MIN_VALUE);
                View decorView2 = this.f34438a.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
            }
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f34440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Window f34441b;

        public d(Window window, t0 t0Var) {
            WindowInsetsController insetsController = window.getInsetsController();
            new q.h();
            this.f34440a = insetsController;
            this.f34441b = window;
        }

        @Override // p0.t0.e
        public void a(boolean z10) {
            if (z10) {
                Window window = this.f34441b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f34440a.setSystemBarsAppearance(16, 16);
                return;
            }
            Window window2 = this.f34441b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f34440a.setSystemBarsAppearance(0, 16);
        }

        @Override // p0.t0.e
        public void b(boolean z10) {
            if (z10) {
                Window window = this.f34441b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                this.f34440a.setSystemBarsAppearance(8, 8);
                return;
            }
            Window window2 = this.f34441b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f34440a.setSystemBarsAppearance(0, 8);
        }
    }

    public static class e {
        public void a(boolean z10) {
        }

        public void b(boolean z10) {
            throw null;
        }
    }

    public t0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f34437a = new d(window, this);
        } else {
            this.f34437a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }
}
