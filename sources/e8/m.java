package e8;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends Visibility {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.d f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f29111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29112e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29113a;

        static {
            int[] iArr = new int[x7.d.values().length];
            iArr[x7.d.TOP_LEFT.ordinal()] = 1;
            iArr[x7.d.LEFT.ordinal()] = 2;
            iArr[x7.d.BOTTOM_LEFT.ordinal()] = 3;
            iArr[x7.d.TOP_RIGHT.ordinal()] = 4;
            iArr[x7.d.RIGHT.ordinal()] = 5;
            iArr[x7.d.BOTTOM_RIGHT.ordinal()] = 6;
            iArr[x7.d.TOP.ordinal()] = 7;
            iArr[x7.d.BOTTOM.ordinal()] = 8;
            f29113a = iArr;
        }
    }

    public m(x7.d dVar, Float f10) {
        j0.i(dVar, "position");
        this.f29110c = dVar;
        this.f29111d = f10;
        this.f29112e = k9.i.a(10.0f);
    }

    public /* synthetic */ m(x7.d dVar, Float f10, int i10, vc.g gVar) {
        this(dVar, (i10 & 2) != 0 ? null : f10);
    }

    public final int b(x7.d dVar) {
        switch (a.f29113a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return -1;
            case 7:
            case 8:
                return 0;
            default:
                throw new jc.g();
        }
    }

    public final int c(x7.d dVar) {
        switch (a.f29113a[dVar.ordinal()]) {
            case 1:
            case 4:
            case 7:
                return 1;
            case 2:
            case 5:
                return 0;
            case 3:
            case 6:
            case 8:
                return -1;
            default:
                throw new jc.g();
        }
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        j0.i(transitionValues, "startValues");
        j0.i(transitionValues2, "endValues");
        int iB = b(this.f29110c);
        int iC = c(this.f29110c);
        view.setTranslationX(iB * (this.f29111d != null ? this.f29111d.floatValue() * view.getWidth() : this.f29112e));
        view.setTranslationY(iC * (this.f29111d != null ? this.f29111d.floatValue() * view.getHeight() : this.f29112e));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        j0.h(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…f\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float fFloatValue;
        float fFloatValue2;
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        j0.i(transitionValues, "startValues");
        j0.i(transitionValues2, "endValues");
        int iB = b(this.f29110c);
        int iC = c(this.f29110c);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        float f10 = iB;
        if (this.f29111d != null) {
            fFloatValue = this.f29111d.floatValue() * view.getWidth();
        } else {
            fFloatValue = this.f29112e;
        }
        fArr[1] = f10 * fFloatValue;
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat((Property<?, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[2];
        fArr2[0] = 0.0f;
        float f11 = iC;
        if (this.f29111d != null) {
            fFloatValue2 = this.f29111d.floatValue() * view.getHeight();
        } else {
            fFloatValue2 = this.f29112e;
        }
        fArr2[1] = f11 * fFloatValue2;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr2);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        j0.h(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…n\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }
}
