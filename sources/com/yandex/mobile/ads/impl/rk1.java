package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f24762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse<String> f24763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.g f24764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final od f24765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dd f24766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xf0 f24767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xz f24768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sd f24769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bd f24770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f24771k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.yandex.mobile.ads.banner.c f24772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vz f24773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f24774c;

        public a(com.yandex.mobile.ads.banner.c cVar, vz vzVar, b bVar) {
            fd.j0.i(cVar, "contentController");
            fd.j0.i(vzVar, "htmlWebViewAdapter");
            fd.j0.i(bVar, "webViewListener");
            this.f24772a = cVar;
            this.f24773b = vzVar;
            this.f24774c = bVar;
        }

        public final com.yandex.mobile.ads.banner.c a() {
            return this.f24772a;
        }

        public final vz b() {
            return this.f24773b;
        }

        public final b c() {
            return this.f24774c;
        }
    }

    public static final class b implements b00 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k2 f24776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdResponse<String> f24777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rk1 f24778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.yandex.mobile.ads.banner.c f24779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private hl1<rk1> f24780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final rz f24781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private WebView f24782h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Map<String, String> f24783i;

        public /* synthetic */ b(Context context, k2 k2Var, AdResponse adResponse, rk1 rk1Var, com.yandex.mobile.ads.banner.c cVar, hl1 hl1Var) {
            this(context, k2Var, adResponse, rk1Var, cVar, hl1Var, new rz(context, k2Var));
        }

        public b(Context context, k2 k2Var, AdResponse<String> adResponse, rk1 rk1Var, com.yandex.mobile.ads.banner.c cVar, hl1<rk1> hl1Var, rz rzVar) {
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            fd.j0.i(k2Var, "adConfiguration");
            fd.j0.i(adResponse, "adResponse");
            fd.j0.i(rk1Var, "bannerHtmlAd");
            fd.j0.i(cVar, "contentController");
            fd.j0.i(hl1Var, "creationListener");
            fd.j0.i(rzVar, "htmlClickHandler");
            this.f24775a = context;
            this.f24776b = k2Var;
            this.f24777c = adResponse;
            this.f24778d = rk1Var;
            this.f24779e = cVar;
            this.f24780f = hl1Var;
            this.f24781g = rzVar;
        }

        public final Map<String, String> a() {
            return this.f24783i;
        }

        @Override // com.yandex.mobile.ads.impl.b00
        public final void a(kp0 kp0Var, Map map) {
            fd.j0.i(kp0Var, "webView");
            this.f24782h = kp0Var;
            this.f24783i = map;
            this.f24780f.a(this.f24778d);
        }

        @Override // com.yandex.mobile.ads.impl.b00
        public final void a(t2 t2Var) {
            fd.j0.i(t2Var, "adFetchRequestError");
            this.f24780f.a(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.b00
        public final void a(String str) {
            fd.j0.i(str, "clickUrl");
            this.f24781g.a(str, this.f24777c, new z0(this.f24775a, this.f24776b.r(), this.f24779e.h()));
        }

        @Override // com.yandex.mobile.ads.impl.b00
        public final void a(boolean z10) {
        }

        public final WebView b() {
            return this.f24782h;
        }
    }

    public /* synthetic */ rk1(Context context, k2 k2Var, AdResponse adResponse, com.yandex.mobile.ads.banner.g gVar, com.yandex.mobile.ads.banner.e eVar) {
        dd ddVar = new dd();
        xf0 xf0Var = new xf0();
        xz xzVarA = xz.a();
        fd.j0.h(xzVarA, "getInstance()");
        this(context, k2Var, adResponse, gVar, eVar, ddVar, xf0Var, xzVarA, new sd(context, k2Var), new bd());
    }

    public rk1(Context context, k2 k2Var, AdResponse adResponse, com.yandex.mobile.ads.banner.g gVar, com.yandex.mobile.ads.banner.e eVar, dd ddVar, xf0 xf0Var, xz xzVar, sd sdVar, bd bdVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(gVar, "adView");
        fd.j0.i(eVar, "bannerShowEventListener");
        fd.j0.i(ddVar, "sizeValidator");
        fd.j0.i(xf0Var, "mraidCompatibilityDetector");
        fd.j0.i(xzVar, "htmlWebViewAdapterFactoryProvider");
        fd.j0.i(sdVar, "bannerWebViewFactory");
        fd.j0.i(bdVar, "bannerAdContentControllerFactory");
        this.f24761a = context;
        this.f24762b = k2Var;
        this.f24763c = adResponse;
        this.f24764d = gVar;
        this.f24765e = eVar;
        this.f24766f = ddVar;
        this.f24767g = xf0Var;
        this.f24768h = xzVar;
        this.f24769i = sdVar;
        this.f24770j = bdVar;
    }

    public final void a() {
        a aVar = this.f24771k;
        if (aVar != null) {
            aVar.b().invalidate();
            aVar.a().m();
        }
        this.f24771k = null;
    }

    public final void a(SizeInfo sizeInfo, String str, ve1 ve1Var, hl1<rk1> hl1Var) throws xi1 {
        fd.j0.i(sizeInfo, "configurationSizeInfo");
        fd.j0.i(str, "htmlResponse");
        fd.j0.i(ve1Var, "videoEventController");
        fd.j0.i(hl1Var, "creationListener");
        rd rdVarA = this.f24769i.a(this.f24763c, sizeInfo);
        Objects.requireNonNull(this.f24767g);
        boolean zA = xf0.a(str);
        bd bdVar = this.f24770j;
        Context context = this.f24761a;
        AdResponse<String> adResponse = this.f24763c;
        k2 k2Var = this.f24762b;
        com.yandex.mobile.ads.banner.g gVar = this.f24764d;
        od odVar = this.f24765e;
        Objects.requireNonNull(bdVar);
        com.yandex.mobile.ads.banner.c cVarA = bd.a(context, adResponse, k2Var, gVar, odVar);
        v20 v20VarI = cVarA.i();
        fd.j0.h(v20VarI, "contentController.impressionEventsObservable");
        b bVar = new b(this.f24761a, this.f24762b, this.f24763c, this, cVarA, hl1Var);
        Objects.requireNonNull(this.f24768h);
        vz vzVarA = xz.a(zA).a(rdVarA, bVar, ve1Var, v20VarI);
        fd.j0.h(vzVarA, "htmlWebViewAdapterFactor…roller, eventsObservable)");
        this.f24771k = new a(cVarA, vzVarA, bVar);
        vzVarA.a(str);
    }

    public final void a(ok1 ok1Var) {
        fd.j0.i(ok1Var, "showEventListener");
        a aVar = this.f24771k;
        if (aVar == null) {
            t2 t2Var = v4.f25828k;
            fd.j0.h(t2Var, "INVALID_SDK_STATE");
            ok1Var.a(t2Var);
            return;
        }
        com.yandex.mobile.ads.banner.c cVarA = aVar.a();
        WebView webViewB = aVar.c().b();
        Map<String, String> mapA = aVar.c().a();
        if (webViewB instanceof rd) {
            rd rdVar = (rd) webViewB;
            SizeInfo sizeInfoK = rdVar.k();
            SizeInfo sizeInfoN = this.f24762b.n();
            if ((sizeInfoK == null || sizeInfoN == null) ? false : c21.a(this.f24761a, this.f24763c, sizeInfoK, this.f24766f, sizeInfoN)) {
                this.f24764d.setVisibility(0);
                sg1.a(this.f24764d, webViewB, this.f24761a, rdVar.k(), new tk1(this.f24761a, this.f24764d, this.f24762b, cVarA));
                cVarA.a(mapA);
                ok1Var.a();
                return;
            }
        }
        t2 t2Var2 = v4.f25826i;
        fd.j0.h(t2Var2, "BANNER_RESPONSE_INVALID_SIZE");
        ok1Var.a(t2Var2);
    }
}
