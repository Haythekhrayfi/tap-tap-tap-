package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class d extends b0 {

    public class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f35078a;

        public a(d dVar, View view) {
            this.f35078a = view;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            View view = this.f35078a;
            a0 a0Var = u.f35140a;
            a0Var.e(view, 1.0f);
            a0Var.a(this.f35078a);
            lVar.removeListener(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f35079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35080b = false;

        public b(View view) {
            this.f35079a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.f35140a.e(this.f35079a, 1.0f);
            if (this.f35080b) {
                this.f35079a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f35079a;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.d.h(view) && this.f35079a.getLayerType() == 0) {
                this.f35080b = true;
                this.f35079a.setLayerType(2, null);
            }
        }
    }

    public d() {
    }

    public d(int i10) {
        setMode(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35103d);
        setMode(g0.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Animator b(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        u.f35140a.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, u.f35141b, f11);
        objectAnimatorOfFloat.addListener(new b(view));
        addListener(new a(this, view));
        return objectAnimatorOfFloat;
    }

    @Override // r1.b0, r1.l
    public void captureStartValues(r rVar) {
        super.captureStartValues(rVar);
        rVar.f35132a.put("android:fade:transitionAlpha", Float.valueOf(u.a(rVar.f35133b)));
    }

    @Override // r1.b0
    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        Float f10;
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        float fFloatValue = (rVar == null || (f10 = (Float) rVar.f35132a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
        if (fFloatValue != 1.0f) {
            f11 = fFloatValue;
        }
        return b(view, f11, 1.0f);
    }

    @Override // r1.b0
    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        Float f10;
        u.f35140a.c(view);
        return b(view, (rVar == null || (f10 = (Float) rVar.f35132a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f10.floatValue(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }
}
