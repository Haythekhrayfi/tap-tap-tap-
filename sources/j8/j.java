package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import jc.w;
import p0.e0;
import p0.m0;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends j8.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31771d;

    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31772a;

        public a(View view) {
            j0.i(view, "view");
            this.f31772a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.i(animator, "animation");
            this.f31772a.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            View view = this.f31772a;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.f.c(view, null);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static final class c extends Property<View, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f31773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f31774b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            j0.i(view, "view");
            this.f31773a = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        public void a(View view, float f10) {
            Rect rect;
            int width;
            int height;
            j0.i(view, "view");
            this.f31774b = f10;
            if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.f31773a.set(0, (int) ((-f10) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else {
                if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    rect = this.f31773a;
                    width = view.getWidth();
                    float f11 = 1;
                    height = (int) (((f11 - this.f31774b) * view.getHeight()) + f11);
                } else {
                    rect = this.f31773a;
                    width = view.getWidth();
                    height = view.getHeight();
                }
                rect.set(0, 0, width, height);
            }
            Rect rect2 = this.f31773a;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.f.c(view, rect2);
        }

        @Override // android.util.Property
        public Float get(View view) {
            j0.i(view, "view");
            return Float.valueOf(this.f31774b);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f10) {
            a(view, f10.floatValue());
        }
    }

    public static final class d extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(1);
            this.f31775c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31775c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:verticalTranslation:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(1);
            this.f31776c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31776c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:verticalTranslation:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this(f10, f10, 3, null);
    }

    public j(float f10, float f11) {
        this.f31770c = f10;
        this.f31771d = f11;
    }

    public /* synthetic */ j(float f10, float f11, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? -1.0f : f10, (i10 & 2) != 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : f11);
    }

    @Override // r1.b0, r1.l
    public void captureEndValues(r rVar) {
        j0.i(rVar, "transitionValues");
        super.captureEndValues(rVar);
        h.b(rVar, new d(rVar));
    }

    @Override // r1.b0, r1.l
    public void captureStartValues(r rVar) {
        j0.i(rVar, "transitionValues");
        super.captureStartValues(rVar);
        h.b(rVar, new e(rVar));
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        j0.i(rVar2, "endValues");
        float height = view.getHeight();
        float f10 = this.f31770c * height;
        float f11 = this.f31771d * height;
        Object obj = rVar2.f35132a.get("yandex:verticalTranslation:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View viewA = k.a(view, viewGroup, this, (int[]) obj);
        viewA.setTranslationY(f10);
        c cVar = new c(viewA);
        cVar.a(viewA, this.f31770c);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewA, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11), PropertyValuesHolder.ofFloat(cVar, this.f31770c, this.f31771d));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        j0.i(rVar, "startValues");
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(h.d(this, view, viewGroup, rVar, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.f31771d, this.f31770c * view.getHeight()), PropertyValuesHolder.ofFloat(new c(view), this.f31771d, this.f31770c));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }
}
