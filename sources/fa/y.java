package fa;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import fd.g0;
import fd.j0;
import fd.j1;
import fd.o1;
import fd.s0;
import fd.z;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends ShimmerFrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29515f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f29516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f29517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f29518e;

    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (ma.h.f33410y.a().i() || y.this.getLayoutParams().height != -2) {
                return;
            }
            y yVar = y.this;
            ViewGroup.LayoutParams layoutParams = yVar.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            y yVar2 = y.this;
            int minHeight = yVar2.getMinHeight();
            int minimumHeight = y.this.getMinimumHeight();
            if (minHeight < minimumHeight) {
                minHeight = minimumHeight;
            }
            yVar2.setMinimumHeight(minHeight);
            yVar.setLayoutParams(layoutParams);
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhShimmerBaseAdView$onAttachedToWindow$2", f = "PhShimmerBaseAdView.kt", l = {93}, m = "invokeSuspend")
    public static final class b extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29520c;

        public static final class a<T> implements id.e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f29522c;

            public a(y yVar) {
                this.f29522c = yVar;
            }

            @Override // id.e
            public Object emit(Object obj, mc.d dVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f29522c.setVisibility(zBooleanValue ^ true ? 0 : 8);
                if (zBooleanValue) {
                    y yVar = this.f29522c;
                    int i10 = y.f29515f;
                    yVar.b();
                } else {
                    y yVar2 = this.f29522c;
                    c0.z(yVar2.f29516c, null, null, new x(yVar2, null), 3, null);
                }
                return jc.w.f31842a;
            }
        }

        public b(mc.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return y.this.new b(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return y.this.new b(dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f29520c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.u<Boolean> uVar = ma.h.f33410y.a().f33427p.f30214h;
                a aVar2 = new a(y.this);
                this.f29520c = 1;
                if (uVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        mc.f.a aVarB = z.b(null, 1, null);
        fd.c0 c0Var = s0.f29619a;
        this.f29516c = z.a(mc.f.a.C0363a.d((o1) aVarB, kd.q.f32064a));
        LayoutTransition layoutTransition = new LayoutTransition();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ma.v.f33518b);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-1);
            j0.h(colorStateList, "valueOf(\n                Color.WHITE)");
        }
        this.f29517d = colorStateList;
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(3);
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(-3355444);
            j0.h(colorStateList2, "valueOf(\n                Color.LTGRAY)");
        }
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(4, 300));
        Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num != null) {
            layoutTransition.setDuration(num.intValue());
            setLayoutTransition(layoutTransition);
        }
        typedArrayObtainStyledAttributes.recycle();
        setShimmer(new Shimmer.ColorHighlightBuilder().setBaseColor(colorStateList.getDefaultColor()).setHighlightColor(colorStateList2.getDefaultColor()).build());
    }

    public /* synthetic */ y(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public abstract Object a(o oVar, mc.d<? super View> dVar);

    public final void b() {
        BaseAdView baseAdView;
        hideShimmer();
        try {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (!(childAt instanceof AdView)) {
                    if (childAt instanceof AdManagerAdView) {
                        baseAdView = (AdManagerAdView) childAt;
                    }
                    removeAllViews();
                }
                baseAdView = (AdView) childAt;
                baseAdView.destroy();
                removeAllViews();
            }
        } catch (Exception e10) {
            xe.a.f37601c.c(e10);
        }
    }

    public final o getAdLoadingListener() {
        return this.f29518e;
    }

    public abstract int getAdWidth();

    public abstract int getMinHeight();

    @Override // com.facebook.shimmer.ShimmerFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (!e0.g.c(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new a());
        } else if (!ma.h.f33410y.a().i() && getLayoutParams().height == -2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            int minHeight = getMinHeight();
            int minimumHeight = getMinimumHeight();
            if (minHeight < minimumHeight) {
                minHeight = minimumHeight;
            }
            setMinimumHeight(minHeight);
            setLayoutParams(layoutParams);
        }
        mc.f fVarW = this.f29516c.w();
        int i10 = j1.f29579x1;
        j1 j1Var = (j1) fVarW.b(j1.b.f29580c);
        if (!(j1Var != null ? j1Var.a() : true)) {
            mc.f.a aVarB = z.b(null, 1, null);
            fd.c0 c0Var = s0.f29619a;
            this.f29516c = z.a(mc.f.a.C0363a.d((o1) aVarB, kd.q.f32064a));
        }
        c0.z(this.f29516c, null, null, new b(null), 3, null);
    }

    @Override // com.facebook.shimmer.ShimmerFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        z.g(this.f29516c, null, 1);
        b();
        super.onDetachedFromWindow();
    }

    public final void setAdLoadingListener(o oVar) {
        this.f29518e = oVar;
    }
}
