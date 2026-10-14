package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Map;
import java.util.Objects;
import jc.w;
import r1.r;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends j8.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f31748e = new e(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f31749f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f31750g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f31751h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f31752i = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0325g f31754d;

    public static final class a extends i {
        @Override // j8.g.InterfaceC0325g
        public float a(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY() + e.a(g.f31748e, i10, viewGroup.getHeight() - view.getTop());
        }
    }

    public static final class b extends f {
        @Override // j8.g.InterfaceC0325g
        public float b(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX() - e.a(g.f31748e, i10, view.getRight());
        }
    }

    public static final class c extends f {
        @Override // j8.g.InterfaceC0325g
        public float b(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX() + e.a(g.f31748e, i10, viewGroup.getWidth() - view.getLeft());
        }
    }

    public static final class d extends i {
        @Override // j8.g.InterfaceC0325g
        public float a(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY() - e.a(g.f31748e, i10, view.getBottom());
        }
    }

    public static final class e {
        public e() {
        }

        public e(vc.g gVar) {
        }

        public static final int a(e eVar, int i10, int i11) {
            Objects.requireNonNull(eVar);
            return i10 == -1 ? i11 : i10;
        }
    }

    public static abstract class f implements InterfaceC0325g {
        @Override // j8.g.InterfaceC0325g
        public float a(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: j8.g$g, reason: collision with other inner class name */
    public interface InterfaceC0325g {
        float a(ViewGroup viewGroup, View view, int i10);

        float b(ViewGroup viewGroup, View view, int i10);
    }

    public static final class h extends AnimatorListenerAdapter implements r1.l.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f31756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f31757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f31758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f31761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f31762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f31763i;

        public h(View view, View view2, int i10, int i11, float f10, float f11) {
            j0.i(view, "originalView");
            j0.i(view2, "movingView");
            this.f31755a = view;
            this.f31756b = view2;
            this.f31757c = f10;
            this.f31758d = f11;
            this.f31759e = i10 - xc.b.c(view2.getTranslationX());
            this.f31760f = i11 - xc.b.c(view2.getTranslationY());
            Object tag = view.getTag(R.id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.f31761g = iArr;
            if (iArr != null) {
                view.setTag(R.id.div_transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            j0.i(animator, "animation");
            if (this.f31761g == null) {
                this.f31761g = new int[]{xc.b.c(this.f31756b.getTranslationX()) + this.f31759e, xc.b.c(this.f31756b.getTranslationY()) + this.f31760f};
            }
            this.f31755a.setTag(R.id.div_transition_position, this.f31761g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            j0.i(animator, "animator");
            this.f31762h = this.f31756b.getTranslationX();
            this.f31763i = this.f31756b.getTranslationY();
            this.f31756b.setTranslationX(this.f31757c);
            this.f31756b.setTranslationY(this.f31758d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            j0.i(animator, "animator");
            this.f31756b.setTranslationX(this.f31762h);
            this.f31756b.setTranslationY(this.f31763i);
        }

        @Override // r1.l.g
        public void onTransitionCancel(r1.l lVar) {
            j0.i(lVar, "transition");
        }

        @Override // r1.l.g
        public void onTransitionEnd(r1.l lVar) {
            j0.i(lVar, "transition");
            this.f31756b.setTranslationX(this.f31757c);
            this.f31756b.setTranslationY(this.f31758d);
            lVar.removeListener(this);
        }

        @Override // r1.l.g
        public void onTransitionPause(r1.l lVar) {
            j0.i(lVar, "transition");
        }

        @Override // r1.l.g
        public void onTransitionResume(r1.l lVar) {
            j0.i(lVar, "transition");
        }

        @Override // r1.l.g
        public void onTransitionStart(r1.l lVar) {
            j0.i(lVar, "transition");
        }
    }

    public static abstract class i implements InterfaceC0325g {
        @Override // j8.g.InterfaceC0325g
        public float b(ViewGroup viewGroup, View view, int i10) {
            return view.getTranslationX();
        }
    }

    public static final class j extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31764c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar) {
            super(1);
            this.f31764c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31764c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:slide:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<int[], w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f31765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r rVar) {
            super(1);
            this.f31765c = rVar;
        }

        @Override // uc.l
        public w invoke(int[] iArr) {
            int[] iArr2 = iArr;
            j0.i(iArr2, "position");
            Map<String, Object> map = this.f31765c.f35132a;
            j0.h(map, "transitionValues.values");
            map.put("yandex:slide:screenPosition", iArr2);
            return w.f31842a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public g(int i10, int i11) {
        this.f31753c = i10;
        this.f31754d = i11 != 3 ? i11 != 5 ? i11 != 48 ? f31752i : f31750g : f31751h : f31749f;
    }

    public /* synthetic */ g(int i10, int i11, int i12, vc.g gVar) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? 80 : i11);
    }

    public final Animator b(View view, r1.l lVar, r rVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = rVar.f35133b.getTag(R.id.div_transition_position);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iC = xc.b.c(f14 - translationX) + i10;
        int iC2 = xc.b.c(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12) {
            if (f15 == f13) {
                return null;
            }
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        j0.h(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…, startY, endY)\n        )");
        View view2 = rVar.f35133b;
        j0.h(view2, "values.view");
        h hVar = new h(view2, view, iC, iC2, translationX, translationY);
        lVar.addListener(hVar);
        objectAnimatorOfPropertyValuesHolder.addListener(hVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(hVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // r1.b0, r1.l
    public void captureEndValues(r rVar) {
        j0.i(rVar, "transitionValues");
        super.captureEndValues(rVar);
        j8.h.b(rVar, new j(rVar));
    }

    @Override // r1.b0, r1.l
    public void captureStartValues(r rVar) {
        j0.i(rVar, "transitionValues");
        super.captureStartValues(rVar);
        j8.h.b(rVar, new k(rVar));
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        if (rVar2 == null) {
            return null;
        }
        Object obj = rVar2.f35132a.get("yandex:slide:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return b(j8.k.a(view, viewGroup, this, iArr), this, rVar2, iArr[0], iArr[1], this.f31754d.b(viewGroup, view, this.f31753c), this.f31754d.a(viewGroup, view, this.f31753c), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        j0.i(viewGroup, "sceneRoot");
        j0.i(view, "view");
        if (rVar == null) {
            return null;
        }
        Object obj = rVar.f35132a.get("yandex:slide:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return b(j8.h.d(this, view, viewGroup, rVar, "yandex:slide:screenPosition"), this, rVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f31754d.b(viewGroup, view, this.f31753c), this.f31754d.a(viewGroup, view, this.f31753c), getInterpolator());
    }
}
