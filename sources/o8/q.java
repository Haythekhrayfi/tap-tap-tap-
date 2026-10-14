package o8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f34113a;

    public q(r rVar) {
        this.f34113a = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        j0.i(animator, "animation");
        uc.a<jc.w> swipeOutCallback = this.f34113a.getSwipeOutCallback();
        if (swipeOutCallback == null) {
            return;
        }
        swipeOutCallback.invoke();
    }
}
