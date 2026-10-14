package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
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
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31728c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f31730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f31731c;

        public b(View view, float f10) {
            j0.i(view, "view");
            this.f31729a = view;
            this.f31730b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.i(animator, "animation");
            this.f31729a.setAlpha(this.f31730b);
            if (this.f31731c) {
                this.f31729a.setLayerType(0, null);
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.i(animator, "animation");
            this.f31729a.setVisibility(0);
            View view = this.f31729a;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.d.h(view) && this.f31729a.getLayerType() == 0) {
                this.f31731c = true;
                this.f31729a.setLayerType(2, null);
            }
        }
    }

    public static final class c extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(1);
            this.f31732c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31732c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:fade:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    /* JADX INFO: renamed from: j8.d$d, reason: collision with other inner class name */
    public static final class C0324d extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31733c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0324d(r rVar) {
            super(1);
            this.f31733c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31733c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:fade:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    static {
        new a(null);
    }

    public d() {
        this(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1, null);
    }

    public d(float f10) {
        this.f31728c = f10;
    }

    public /* synthetic */ d(float f10, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : f10);
    }

    public final Animator b(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10, f11);
        objectAnimatorOfFloat.addListener(new b(view, view.getAlpha()));
        return objectAnimatorOfFloat;
    }

    public final float c(r rVar, float f10) {
        Map<String, Object> map;
        Object obj = (rVar == null || (map = rVar.f35132a) == null) ? null : map.get("yandex:fade:alpha");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 == null ? f10 : f11.floatValue();
    }

    @Override // r1.b0, r1.l
    public void captureEndValues(r rVar) {
        Map<String, Object> map;
        float alpha;
        j0.i(rVar, "transitionValues");
        super.captureEndValues(rVar);
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                map = rVar.f35132a;
                j0.h(map, "transitionValues.values");
                alpha = this.f31728c;
            }
            h.b(rVar, new c(rVar));
        }
        map = rVar.f35132a;
        j0.h(map, "transitionValues.values");
        alpha = rVar.f35133b.getAlpha();
        map.put("yandex:fade:alpha", Float.valueOf(alpha));
        h.b(rVar, new c(rVar));
    }

    @Override // r1.b0, r1.l
    public void captureStartValues(r rVar) {
        Map<String, Object> map;
        float alpha;
        j0.i(rVar, "transitionValues");
        super.captureStartValues(rVar);
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                map = rVar.f35132a;
                j0.h(map, "transitionValues.values");
                alpha = rVar.f35133b.getAlpha();
            }
            h.b(rVar, new C0324d(rVar));
        }
        map = rVar.f35132a;
        j0.h(map, "transitionValues.values");
        alpha = this.f31728c;
        map.put("yandex:fade:alpha", Float.valueOf(alpha));
        h.b(rVar, new C0324d(rVar));
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(rVar2, "endValues");
        if (view == null) {
            return null;
        }
        float fC = c(rVar, this.f31728c);
        float fC2 = c(rVar2, 1.0f);
        Object obj = rVar2.f35132a.get("yandex:fade:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return b(k.a(view, viewGroup, this, (int[]) obj), fC, fC2);
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(rVar, "startValues");
        if (view == null) {
            return null;
        }
        return b(h.d(this, view, viewGroup, rVar, "yandex:fade:screenPosition"), c(rVar, 1.0f), c(rVar2, this.f31728c));
    }
}
