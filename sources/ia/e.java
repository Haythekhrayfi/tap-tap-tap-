package ia;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.inscode.autoclicker.R;
import fd.g0;
import fd.i;
import fd.j0;
import fd.s0;
import fd.s1;
import gb.x;
import java.util.Objects;
import jc.w;
import kd.q;
import kotlin.reflect.KProperty;
import oc.h;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.exitads.ExitAds$loadNativeAppLovinExitAd$2$1", f = "ExitAds.kt", l = {321, 324}, m = "invokeSuspend")
public final class e extends h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f31533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ia.a f31535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i<View> f31536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f31537g;

    @oc.e(c = "com.zipoapps.ads.exitads.ExitAds$loadNativeAppLovinExitAd$2$1$nativeAdView$1", f = "ExitAds.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<g0, mc.d<? super MaxNativeAdView>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ia.a f31538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f31539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ia.a aVar, Context context, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f31538c = aVar;
            this.f31539d = context;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new a(this.f31538c, this.f31539d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super MaxNativeAdView> dVar) {
            return new a(this.f31538c, this.f31539d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            ia.a aVar2 = this.f31538c;
            Context context = this.f31539d;
            KProperty<Object>[] kPropertyArr = ia.a.f31508e;
            Objects.requireNonNull(aVar2);
            MaxNativeAdViewBinder maxNativeAdViewBinderBuild = new MaxNativeAdViewBinder.Builder(R.layout.max_exit_ad_native_layout).setTitleTextViewId(R.id.title_text_view).setBodyTextViewId(R.id.body_text_view).setAdvertiserTextViewId(R.id.advertiser_textView).setIconImageViewId(R.id.icon_image_view).setMediaContentViewGroupId(R.id.media_view_container).setOptionsContentViewGroupId(R.id.ad_options_view).setCallToActionButtonId(R.id.cta_button).build();
            j0.h(maxNativeAdViewBinderBuild, "Builder(R.layout.max_exi…\n                .build()");
            return new MaxNativeAdView(maxNativeAdViewBinderBuild, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(ia.a aVar, i<? super View> iVar, Context context, mc.d<? super e> dVar) {
        super(2, dVar);
        this.f31535e = aVar;
        this.f31536f = iVar;
        this.f31537g = context;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new e(this.f31535e, this.f31536f, this.f31537g, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new e(this.f31535e, this.f31536f, this.f31537g, dVar).invokeSuspend(w.f31842a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        x xVar;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31534d;
        if (i10 != 0) {
            if (i10 == 1) {
                h9.d.t(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (x) this.f31533c;
                h9.d.t(obj);
            }
            MaxNativeAdView maxNativeAdView = (MaxNativeAdView) obj;
            ha.h hVar = (ha.h) ((x.c) xVar).f30417b;
            hVar.f31053a.render(maxNativeAdView, hVar.f31054b);
            i<View> iVar = this.f31536f;
            jc.i.a aVar2 = jc.i.f31813c;
            iVar.resumeWith(maxNativeAdView);
            return w.f31842a;
        }
        h9.d.t(obj);
        com.zipoapps.ads.a aVar3 = this.f31535e.f31509a;
        this.f31534d = 1;
        KProperty<Object>[] kPropertyArr = com.zipoapps.ads.a.f28022o;
        obj = aVar3.g(true, null, this);
        if (obj == aVar) {
            return aVar;
        }
        x xVar2 = (x) obj;
        if (!(xVar2 instanceof x.c)) {
            ia.a aVar4 = this.f31535e;
            KProperty<Object>[] kPropertyArr2 = ia.a.f31508e;
            ta.d dVarA = aVar4.a();
            StringBuilder sbA = defpackage.a.a("AppLovin exit ad failed to load. Error: ");
            sbA.append(c0.j(xVar2));
            dVarA.b(sbA.toString(), new Object[0]);
            if (this.f31536f.a()) {
                i<View> iVar2 = this.f31536f;
                jc.i.a aVar5 = jc.i.f31813c;
                iVar2.resumeWith(null);
            }
        } else if (this.f31536f.a()) {
            fd.c0 c0Var = s0.f29619a;
            s1 s1Var = q.f32064a;
            a aVar6 = new a(this.f31535e, this.f31537g, null);
            this.f31533c = xVar2;
            this.f31534d = 2;
            Object objV = c0.V(s1Var, aVar6, this);
            if (objV == aVar) {
                return aVar;
            }
            xVar = xVar2;
            obj = objV;
            MaxNativeAdView maxNativeAdView2 = (MaxNativeAdView) obj;
            ha.h hVar2 = (ha.h) ((x.c) xVar).f30417b;
            hVar2.f31053a.render(maxNativeAdView2, hVar2.f31054b);
            i<View> iVar3 = this.f31536f;
            jc.i.a aVar7 = jc.i.f31813c;
            iVar3.resumeWith(maxNativeAdView2);
        }
        return w.f31842a;
    }
}
