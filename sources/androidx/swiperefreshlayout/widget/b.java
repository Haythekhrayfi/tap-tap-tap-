package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2896b;

    public b(c cVar, c.a aVar) {
        this.f2896b = cVar;
        this.f2895a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f2896b.a(1.0f, this.f2895a, true);
        c.a aVar = this.f2895a;
        aVar.f2915k = aVar.f2909e;
        aVar.f2916l = aVar.f2910f;
        aVar.f2917m = aVar.f2911g;
        aVar.a((aVar.f2914j + 1) % aVar.f2913i.length);
        c cVar = this.f2896b;
        if (!cVar.f2904g) {
            cVar.f2903f += 1.0f;
            return;
        }
        cVar.f2904g = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        c.a aVar2 = this.f2895a;
        if (aVar2.f2918n) {
            aVar2.f2918n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f2896b.f2903f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }
}
