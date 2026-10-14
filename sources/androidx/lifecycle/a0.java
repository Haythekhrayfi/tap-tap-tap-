package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a0 f2161k = new a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f2166g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2162c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2163d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2164e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2165f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f2167h = new q(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Runnable f2168i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0.a f2169j = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0 a0Var = a0.this;
            if (a0Var.f2163d == 0) {
                a0Var.f2164e = true;
                a0Var.f2167h.f(i.b.ON_PAUSE);
            }
            a0 a0Var2 = a0.this;
            if (a0Var2.f2162c == 0 && a0Var2.f2164e) {
                a0Var2.f2167h.f(i.b.ON_STOP);
                a0Var2.f2165f = true;
            }
        }
    }

    public class b implements c0.a {
        public b() {
        }
    }

    public static class c {
        public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public void a() {
        int i10 = this.f2163d + 1;
        this.f2163d = i10;
        if (i10 == 1) {
            if (!this.f2164e) {
                this.f2166g.removeCallbacks(this.f2168i);
            } else {
                this.f2167h.f(i.b.ON_RESUME);
                this.f2164e = false;
            }
        }
    }

    public void b() {
        int i10 = this.f2162c + 1;
        this.f2162c = i10;
        if (i10 == 1 && this.f2165f) {
            this.f2167h.f(i.b.ON_START);
            this.f2165f = false;
        }
    }

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f2167h;
    }
}
