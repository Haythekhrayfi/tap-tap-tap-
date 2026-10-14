package e8;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Visibility {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29106c;

    public k(float f10) {
        this.f29106c = f10;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        j0.i(view, "view");
        j0.i(transitionValues, "startValues");
        j0.i(transitionValues2, "endValues");
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.f29106c, view.getScaleX()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.f29106c, view.getScaleY()));
        j0.h(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…Y\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        j0.i(view, "view");
        j0.i(transitionValues, "startValues");
        j0.i(transitionValues2, "endValues");
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), this.f29106c), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), this.f29106c));
        j0.h(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…r\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }
}
