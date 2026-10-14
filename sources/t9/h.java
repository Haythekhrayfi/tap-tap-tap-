package t9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35824a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.d f35825b;

    public h(e.d dVar) {
        this.f35825b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f35824a = true;
        this.f35825b.f35805u = 1.0f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f35824a) {
            return;
        }
        e.d dVar = this.f35825b;
        dVar.f35790f = dVar.f35806v;
        dVar.f35791g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }
}
