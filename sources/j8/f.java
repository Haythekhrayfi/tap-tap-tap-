package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.Map;
import java.util.Objects;
import jc.w;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31740e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f31742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f31743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f31744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f31745e;

        public b(f fVar, View view, float f10, float f11) {
            j0.i(fVar, "this$0");
            j0.i(view, "view");
            this.f31745e = fVar;
            this.f31741a = view;
            this.f31742b = f10;
            this.f31743c = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.i(animator, "animation");
            this.f31741a.setScaleX(this.f31742b);
            this.f31741a.setScaleY(this.f31743c);
            if (this.f31744d) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f31741a.resetPivot();
                } else {
                    View view = this.f31741a;
                    view.setPivotX(view.getWidth() * 0.5f);
                    View view2 = this.f31741a;
                    view2.setPivotY(view2.getHeight() * 0.5f);
                }
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.i(animator, "animation");
            this.f31741a.setVisibility(0);
            f fVar = this.f31745e;
            if (fVar.f31739d == 0.5f) {
                if (fVar.f31740e == 0.5f) {
                    return;
                }
            }
            this.f31744d = true;
            View view = this.f31741a;
            view.setPivotX(view.getWidth() * this.f31745e.f31739d);
            View view2 = this.f31741a;
            view2.setPivotY(view2.getHeight() * this.f31745e.f31740e);
        }
    }

    public static final class c extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(1);
            this.f31746c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31746c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:scale:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(1);
            this.f31747c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31747c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:scale:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    static {
        new a(null);
    }

    public f(float f10, float f11, float f12) {
        this.f31738c = f10;
        this.f31739d = f11;
        this.f31740e = f12;
    }

    public /* synthetic */ f(float f10, float f11, float f12, int i10, vc.g gVar) {
        this(f10, (i10 & 2) != 0 ? 0.5f : f11, (i10 & 4) != 0 ? 0.5f : f12);
    }

    public final Animator b(View view, float f10, float f11, float f12, float f13) {
        if (f10 == f12) {
            if (f11 == f13) {
                return null;
            }
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f11, f13));
        objectAnimatorOfPropertyValuesHolder.addListener(new b(this, view, view.getScaleX(), view.getScaleY()));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final float c(r rVar, float f10) {
        Map<String, Object> map;
        Object obj = (rVar == null || (map = rVar.f35132a) == null) ? null : map.get("yandex:scale:scaleX");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 == null ? f10 : f11.floatValue();
    }

    @Override // r1.b0, r1.l
    public void captureEndValues(r rVar) {
        Map<String, Object> map;
        j0.i(rVar, "transitionValues");
        float scaleX = rVar.f35133b.getScaleX();
        float scaleY = rVar.f35133b.getScaleY();
        View view = rVar.f35133b;
        Float fValueOf = Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        rVar.f35133b.setScaleY(1.0f);
        super.captureEndValues(rVar);
        rVar.f35133b.setScaleX(scaleX);
        rVar.f35133b.setScaleY(scaleY);
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                Map<String, Object> map2 = rVar.f35132a;
                j0.h(map2, "transitionValues.values");
                map2.put("yandex:scale:scaleX", Float.valueOf(this.f31738c));
                map = rVar.f35132a;
                j0.h(map, "transitionValues.values");
                fValueOf = Float.valueOf(this.f31738c);
            }
            h.b(rVar, new c(rVar));
        }
        Map<String, Object> map3 = rVar.f35132a;
        j0.h(map3, "transitionValues.values");
        map3.put("yandex:scale:scaleX", fValueOf);
        map = rVar.f35132a;
        j0.h(map, "transitionValues.values");
        map.put("yandex:scale:scaleY", fValueOf);
        h.b(rVar, new c(rVar));
    }

    @Override // r1.b0, r1.l
    public void captureStartValues(r rVar) {
        Map<String, Object> map;
        float scaleY;
        j0.i(rVar, "transitionValues");
        float scaleX = rVar.f35133b.getScaleX();
        float scaleY2 = rVar.f35133b.getScaleY();
        rVar.f35133b.setScaleX(1.0f);
        rVar.f35133b.setScaleY(1.0f);
        super.captureStartValues(rVar);
        rVar.f35133b.setScaleX(scaleX);
        rVar.f35133b.setScaleY(scaleY2);
        View view = rVar.f35133b;
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                Map<String, Object> map2 = rVar.f35132a;
                j0.h(map2, "transitionValues.values");
                map2.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
                map = rVar.f35132a;
                j0.h(map, "transitionValues.values");
                scaleY = view.getScaleY();
            }
            h.b(rVar, new d(rVar));
        }
        Map<String, Object> map3 = rVar.f35132a;
        j0.h(map3, "transitionValues.values");
        map3.put("yandex:scale:scaleX", Float.valueOf(this.f31738c));
        map = rVar.f35132a;
        j0.h(map, "transitionValues.values");
        scaleY = this.f31738c;
        map.put("yandex:scale:scaleY", Float.valueOf(scaleY));
        h.b(rVar, new d(rVar));
    }

    public final float d(r rVar, float f10) {
        Map<String, Object> map;
        Object obj = (rVar == null || (map = rVar.f35132a) == null) ? null : map.get("yandex:scale:scaleY");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 == null ? f10 : f11.floatValue();
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(rVar2, "endValues");
        if (view == null) {
            return null;
        }
        float fC = c(rVar, this.f31738c);
        float fD = d(rVar, this.f31738c);
        float fC2 = c(rVar2, 1.0f);
        float fD2 = d(rVar2, 1.0f);
        Object obj = rVar2.f35132a.get("yandex:scale:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return b(k.a(view, viewGroup, this, (int[]) obj), fC, fD, fC2, fD2);
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(rVar, "startValues");
        if (view == null) {
            return null;
        }
        return b(h.d(this, view, viewGroup, rVar, "yandex:scale:screenPosition"), c(rVar, 1.0f), d(rVar, 1.0f), c(rVar2, this.f31738c), d(rVar2, this.f31738c));
    }
}
