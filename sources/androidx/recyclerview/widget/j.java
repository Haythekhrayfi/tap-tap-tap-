package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.d f2657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f2660d;

    public j(f fVar, f.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2660d = fVar;
        this.f2657a = dVar;
        this.f2658b = viewPropertyAnimator;
        this.f2659c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2658b.setListener(null);
        this.f2659c.setAlpha(1.0f);
        this.f2659c.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2659c.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2660d.h(this.f2657a.f2626a);
        this.f2660d.f2619r.remove(this.f2657a.f2626a);
        this.f2660d.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        f fVar = this.f2660d;
        RecyclerView.c0 c0Var = this.f2657a.f2626a;
        Objects.requireNonNull(fVar);
    }
}
