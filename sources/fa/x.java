package fa;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import fd.g0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.PhShimmerBaseAdView$loadAd$1", f = "PhShimmerBaseAdView.kt", l = {113}, m = "invokeSuspend")
public final class x extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f29514g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, mc.d<? super x> dVar) {
        super(2, dVar);
        this.f29514g = yVar;
    }

    @Override // oc.a
    public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
        x xVar = new x(this.f29514g, dVar);
        xVar.f29513f = obj;
        return xVar;
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
        x xVar = new x(this.f29514g, dVar);
        xVar.f29513f = g0Var;
        return xVar.invokeSuspend(jc.w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout.LayoutParams layoutParams;
        View view;
        long j10;
        jc.w wVar;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f29512e;
        if (i10 == 0) {
            h9.d.t(obj);
            g0 g0Var = (g0) this.f29513f;
            y yVar = this.f29514g;
            int i11 = y.f29515f;
            Objects.requireNonNull(yVar);
            View view2 = new View(yVar.getContext());
            view2.setBackground(new ColorDrawable(yVar.f29517d.getDefaultColor()));
            if (yVar.getLayoutParams().height == -2) {
                int minHeight = yVar.getMinHeight();
                int minimumHeight = yVar.getMinimumHeight();
                if (minHeight < minimumHeight) {
                    minHeight = minimumHeight;
                }
                layoutParams = new FrameLayout.LayoutParams(-1, minHeight);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            yVar.addView(view2, layoutParams);
            long jCurrentTimeMillis = System.currentTimeMillis();
            va.a.f36772c.a().f36774a++;
            this.f29514g.startShimmer();
            y yVar2 = this.f29514g;
            o adLoadingListener = yVar2.getAdLoadingListener();
            this.f29513f = g0Var;
            this.f29510c = view2;
            this.f29511d = jCurrentTimeMillis;
            this.f29512e = 1;
            obj = yVar2.a(adLoadingListener, this);
            if (obj == aVar) {
                return aVar;
            }
            view = view2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f29511d;
            view = (View) this.f29510c;
            h9.d.t(obj);
        }
        View view3 = (View) obj;
        if (view3 != null) {
            y yVar3 = this.f29514g;
            yVar3.addView(view3);
            yVar3.removeView(view);
            yVar3.hideShimmer();
            wVar = jc.w.f31842a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f29514g.setVisibility(8);
        }
        this.f29514g.removeView(view);
        this.f29514g.hideShimmer();
        va.a aVarA = va.a.f36772c.a();
        aVarA.a(new va.b(System.currentTimeMillis() - j10, aVarA));
        return jc.w.f31842a;
    }
}
