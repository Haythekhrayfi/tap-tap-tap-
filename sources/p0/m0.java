package p0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f34395a;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f34396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f34397b;

        public a(m0 m0Var, n0 n0Var, View view) {
            this.f34396a = n0Var;
            this.f34397b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34396a.a(this.f34397b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34396a.b(this.f34397b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34396a.c(this.f34397b);
        }
    }

    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public m0(View view) {
        this.f34395a = new WeakReference<>(view);
    }

    public m0 a(float f10) {
        View view = this.f34395a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = this.f34395a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public m0 c(long j10) {
        View view = this.f34395a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public m0 d(n0 n0Var) {
        View view = this.f34395a.get();
        if (view != null) {
            e(view, n0Var);
        }
        return this;
    }

    public final void e(View view, n0 n0Var) {
        if (n0Var != null) {
            view.animate().setListener(new a(this, n0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public m0 f(final p0 p0Var) {
        final View view = this.f34395a.get();
        if (view != null) {
            b.a(view.animate(), p0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: p0.l0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ((View) ((androidx.appcompat.app.z.c) p0Var).f759a.f734d.getParent()).invalidate();
                }
            } : null);
        }
        return this;
    }

    public m0 g(float f10) {
        View view = this.f34395a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
