package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2650d;

    public h(f fVar, RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2650d = fVar;
        this.f2647a = c0Var;
        this.f2648b = view;
        this.f2649c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2648b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2649c.setListener(null);
        this.f2650d.h(this.f2647a);
        this.f2650d.f2616o.remove(this.f2647a);
        this.f2650d.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2650d);
    }
}
