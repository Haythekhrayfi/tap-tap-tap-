package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.d f2661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2664d;

    public k(f fVar, f.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2664d = fVar;
        this.f2661a = dVar;
        this.f2662b = viewPropertyAnimator;
        this.f2663c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2662b.setListener(null);
        this.f2663c.setAlpha(1.0f);
        this.f2663c.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2663c.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2664d.h(this.f2661a.f2627b);
        this.f2664d.f2619r.remove(this.f2661a.f2627b);
        this.f2664d.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        f fVar = this.f2664d;
        RecyclerView.c0 c0Var = this.f2661a.f2627b;
        Objects.requireNonNull(fVar);
    }
}
