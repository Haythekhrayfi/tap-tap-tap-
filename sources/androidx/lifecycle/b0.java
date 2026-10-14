package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends e {
    public final /* synthetic */ a0 this$0;

    public class a extends e {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            b0.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            b0.this.this$0.b();
        }
    }

    public b0(a0 a0Var) {
        this.this$0 = a0Var;
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = c0.f2179d;
            ((c0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2180c = this.this$0.f2169j;
        }
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a0 a0Var = this.this$0;
        int i10 = a0Var.f2163d - 1;
        a0Var.f2163d = i10;
        if (i10 == 0) {
            a0Var.f2166g.postDelayed(a0Var.f2168i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        a0.c.a(activity, new a());
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a0 a0Var = this.this$0;
        int i10 = a0Var.f2162c - 1;
        a0Var.f2162c = i10;
        if (i10 == 0 && a0Var.f2164e) {
            a0Var.f2167h.f(i.b.ON_STOP);
            a0Var.f2165f = true;
        }
    }
}
