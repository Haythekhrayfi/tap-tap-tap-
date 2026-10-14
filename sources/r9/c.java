package r9;

import android.animation.ValueAnimator;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f35312b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f35311a = i10;
        this.f35312b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35311a) {
            case 0:
                d dVar = this.f35312b;
                j0.i(dVar, "this$0");
                j0.i(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                dVar.f35328r = ((Float) animatedValue).floatValue();
                dVar.postInvalidateOnAnimation();
                break;
            default:
                d dVar2 = this.f35312b;
                j0.i(dVar2, "this$0");
                j0.i(valueAnimator, "it");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                dVar2.f35331u = Float.valueOf(((Float) animatedValue2).floatValue());
                dVar2.postInvalidateOnAnimation();
                break;
        }
    }
}
