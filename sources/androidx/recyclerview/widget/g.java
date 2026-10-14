package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f2643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2646d;

    public g(f fVar, RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2646d = fVar;
        this.f2643a = c0Var;
        this.f2644b = viewPropertyAnimator;
        this.f2645c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2644b.setListener(null);
        this.f2645c.setAlpha(1.0f);
        this.f2646d.h(this.f2643a);
        this.f2646d.f2618q.remove(this.f2643a);
        this.f2646d.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2646d);
    }
}
