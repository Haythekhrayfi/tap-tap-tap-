package com.applovin.exoplayer2.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8179a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8180b;

    public /* synthetic */ m(d dVar) {
        this.f8180b = dVar;
    }

    public /* synthetic */ m(t9.e.d dVar) {
        this.f8180b = dVar;
    }

    public /* synthetic */ m(t9.e eVar) {
        this.f8180b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8179a) {
            case 0:
                ((d) this.f8180b).a(valueAnimator);
                break;
            case 1:
                t9.e eVar = (t9.e) this.f8180b;
                TimeInterpolator timeInterpolator = t9.e.G;
                Objects.requireNonNull(eVar);
                eVar.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                t9.e.d dVar = (t9.e.d) this.f8180b;
                int i10 = t9.e.d.f35786x;
                Objects.requireNonNull(dVar);
                dVar.f35805u = 1.0f - valueAnimator.getAnimatedFraction();
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.d.k(dVar);
                break;
        }
    }
}
