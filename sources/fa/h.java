package fa;

import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.zipoapps.ads.config.PHAdSize;
import fd.f2;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.z;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import p0.e0;
import p0.m0;
import vc.b0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f29446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f29447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<PHAdSize.SizeType> f29448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f29449k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.b.a f29450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f29451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.e f29453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final id.n<a> f29454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29456g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final gb.x<View> f29457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PHAdSize f29458b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gb.x<? extends View> xVar, PHAdSize pHAdSize) {
            j0.i(xVar, "result");
            this.f29457a = xVar;
            this.f29458b = pHAdSize;
        }

        public /* synthetic */ a(gb.x xVar, PHAdSize pHAdSize, int i10, vc.g gVar) {
            this(xVar, (i10 & 2) != 0 ? null : pHAdSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return j0.d(this.f29457a, aVar.f29457a) && j0.d(this.f29458b, aVar.f29458b);
        }

        public int hashCode() {
            int iHashCode = this.f29457a.hashCode() * 31;
            PHAdSize pHAdSize = this.f29458b;
            return iHashCode + (pHAdSize == null ? 0 : pHAdSize.hashCode());
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("AdResultContainer(result=");
            sbA.append(this.f29457a);
            sbA.append(", size=");
            sbA.append(this.f29458b);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29459a;

        static {
            int[] iArr = new int[oa.b.a.values().length];
            try {
                iArr[oa.b.a.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oa.b.a.APPLOVIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29459a = iArr;
        }
    }

    @oc.e(c = "com.zipoapps.ads.BannerViewCache", f = "BannerViewCache.kt", l = {59, 64, 73}, m = "getBanner")
    public static final class d extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f29461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f29462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f29463f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f29465h;

        public d(mc.d<? super d> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f29463f = obj;
            this.f29465h |= Integer.MIN_VALUE;
            return h.this.a(null, null, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.BannerViewCache", f = "BannerViewCache.kt", l = {89, 92, 93, 102}, m = "getBannerFromProvider")
    public static final class e extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f29467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f29468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f29470g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f29472i;

        public e(mc.d<? super e> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f29470g = obj;
            this.f29472i |= Integer.MIN_VALUE;
            h hVar = h.this;
            b bVar = h.f29446h;
            return hVar.b(null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.BannerViewCache$preloadNextBanner$1", f = "BannerViewCache.kt", l = {203, 209}, m = "invokeSuspend")
    public static final class f extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29473c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ PHAdSize f29475e;

        public static final class a extends o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f29476a;

            public a(h hVar) {
                this.f29476a = hVar;
            }

            @Override // fa.o
            public void c(t tVar) {
                h hVar = this.f29476a;
                b bVar = h.f29446h;
                hVar.c().b("onAdFailedToLoad()-> called. Error: " + tVar, new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PHAdSize pHAdSize, mc.d<? super f> dVar) {
            super(2, dVar);
            this.f29475e = pHAdSize;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return h.this.new f(this.f29475e, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return h.this.new f(this.f29475e, dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f29473c;
            if (i10 != 0) {
                if (i10 == 1) {
                    h9.d.t(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(obj);
                }
                h.this.f29455f = false;
                return jc.w.f31842a;
            }
            h9.d.t(obj);
            h hVar = h.this;
            String str = hVar.f29452c;
            PHAdSize pHAdSize = this.f29475e;
            a aVar2 = new a(h.this);
            this.f29473c = 1;
            obj = hVar.d(str, pHAdSize, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            gb.x xVar = (gb.x) obj;
            h hVar2 = h.this;
            b bVar = h.f29446h;
            ta.d dVarC = hVar2.c();
            StringBuilder sbA = defpackage.a.a("preloadNextBanner()-> Banner load finished with success: ");
            sbA.append(c0.x(xVar));
            sbA.append(" Error: ");
            sbA.append(c0.j(xVar));
            dVarC.a(sbA.toString(), new Object[0]);
            id.n<a> nVar = h.this.f29454e;
            a aVar3 = new a(xVar, this.f29475e);
            this.f29473c = 2;
            if (nVar.emit(aVar3, this) == aVar) {
                return aVar;
            }
            h.this.f29455f = false;
            return jc.w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.BannerViewCache", f = "BannerViewCache.kt", l = {223}, m = "waitForBanner")
    public static final class g extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f29478d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29480f;

        public g(mc.d<? super g> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f29478d = obj;
            this.f29480f |= Integer.MIN_VALUE;
            h hVar = h.this;
            b bVar = h.f29446h;
            return hVar.g(0L, this);
        }
    }

    /* JADX INFO: renamed from: fa.h$h, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.ads.BannerViewCache$waitForBanner$2", f = "BannerViewCache.kt", l = {224}, m = "invokeSuspend")
    public static final class C0257h extends oc.h implements uc.p<g0, mc.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29481c;

        public C0257h(mc.d<? super C0257h> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return h.this.new C0257h(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
            return h.this.new C0257h(dVar).invokeSuspend(jc.w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f29481c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.l lVar = new id.l(h.this.f29454e);
                this.f29481c = 1;
                if (z.r(lVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return Boolean.TRUE;
        }
    }

    static {
        vc.t tVar = new vc.t(h.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f29447i = new cd.i[]{tVar};
        f29446h = new b(null);
        f29448j = kc.k.a(PHAdSize.SizeType.ADAPTIVE_ANCHORED);
    }

    public h(oa.b.a aVar, Application application, String str) {
        j0.i(aVar, "adsProvider");
        j0.i(application, "application");
        j0.i(str, "adUnitId");
        this.f29450a = aVar;
        this.f29451b = application;
        this.f29452c = str;
        this.f29453d = new ta.e(h.class.getSimpleName());
        this.f29454e = id.w.a(null);
        this.f29456g = true;
        if (((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.f34186n0)).booleanValue()) {
            e(new PHAdSize(PHAdSize.SizeType.ADAPTIVE_ANCHORED, f29449k, 0, 4, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(String str, PHAdSize pHAdSize, o oVar, mc.d<? super gb.x<? extends View>> dVar) {
        d dVar2;
        boolean z10;
        a value;
        h hVar;
        String message;
        PHAdSize pHAdSize2;
        a aVar;
        h hVar2;
        PHAdSize pHAdSize3 = pHAdSize;
        o oVar2 = oVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f29465h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f29465h = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objD = dVar2.f29463f;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = dVar2.f29465h;
        if (i11 != 0) {
            if (i11 == 1) {
                h9.d.t(objD);
                return (gb.x) objD;
            }
            if (i11 == 2) {
                o oVar3 = (o) dVar2.f29462e;
                PHAdSize pHAdSize4 = (PHAdSize) dVar2.f29461d;
                hVar = (h) dVar2.f29460c;
                h9.d.t(objD);
                oVar2 = oVar3;
                pHAdSize3 = pHAdSize4;
                value = (a) objD;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) dVar2.f29462e;
                pHAdSize2 = (PHAdSize) dVar2.f29461d;
                hVar2 = (h) dVar2.f29460c;
                h9.d.t(objD);
            }
            hVar2.e(pHAdSize2);
            hVar2.f29456g = false;
            return aVar.f29457a;
        }
        h9.d.t(objD);
        List<PHAdSize.SizeType> list = f29448j;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((PHAdSize.SizeType) it.next()) == pHAdSize.getSizeType()) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z10 || !((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.f34186n0)).booleanValue()) {
            c().k(3, null, "getBanner()-> SizeType is not ADAPTIVE_ANCHORED or caching is  disabled", new Object[0]);
            dVar2.f29465h = 1;
            objD = d(str, pHAdSize3, oVar2, dVar2);
            if (objD == aVar2) {
                return aVar2;
            }
            return (gb.x) objD;
        }
        f29449k = pHAdSize.getWidth();
        value = this.f29454e.getValue();
        if (value != null) {
            if (!f(pHAdSize3, value.f29458b)) {
                value = null;
            }
            if (value != null) {
                hVar = this;
            }
        }
        c().k(3, null, "Preloaded result not found. waiting", new Object[0]);
        dVar2.f29460c = this;
        dVar2.f29461d = pHAdSize3;
        dVar2.f29462e = oVar2;
        dVar2.f29465h = 2;
        objD = b(pHAdSize3, dVar2);
        if (objD == aVar2) {
            return aVar2;
        }
        hVar = this;
        value = (a) objD;
        if (c0.x(value.f29457a)) {
            Object objM = c0.m(value.f29457a);
            j0.f(objM);
            View view = (View) objM;
            int i12 = c.f29459a[hVar.f29450a.ordinal()];
            if (i12 == 1) {
                ((AdView) view).setAdListener(new i(oVar2));
            } else if (i12 == 2) {
                ((MaxAdView) view).setListener(new j(oVar2));
            }
            oVar2.d();
        } else {
            Exception excJ = c0.j(value.f29457a);
            if (excJ == null || (message = excJ.getMessage()) == null) {
                message = "";
            }
            oVar2.c(new t(1, message, "", null, 8, null));
        }
        id.n<a> nVar = hVar.f29454e;
        dVar2.f29460c = hVar;
        dVar2.f29461d = pHAdSize3;
        dVar2.f29462e = value;
        dVar2.f29465h = 3;
        if (nVar.emit(null, dVar2) == aVar2) {
            return aVar2;
        }
        pHAdSize2 = pHAdSize3;
        aVar = value;
        hVar2 = hVar;
        hVar2.e(pHAdSize2);
        hVar2.f29456g = false;
        return aVar.f29457a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.zipoapps.ads.config.PHAdSize] */
    /* JADX WARN: Type inference failed for: r10v2, types: [ta.d, xe.a$c] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [fa.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [fa.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [fa.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.zipoapps.ads.config.PHAdSize, java.lang.Object, java.lang.Throwable, vc.g] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.zipoapps.ads.config.PHAdSize, vc.g] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ta.d, xe.a$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x011e -> B:25:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x018a -> B:65:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(com.zipoapps.ads.config.PHAdSize r18, mc.d<? super fa.h.a> r19) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.h.b(com.zipoapps.ads.config.PHAdSize, mc.d):java.lang.Object");
    }

    public final ta.d c() {
        return this.f29453d.a(this, f29447i[0]);
    }

    public final Object d(String str, PHAdSize pHAdSize, o oVar, mc.d<? super gb.x<? extends View>> dVar) {
        MaxAdFormat maxAdFormat;
        ta.d dVarC = c();
        StringBuilder sbA = defpackage.a.a("loadBanner()-> Loading banner with width: ");
        sbA.append(pHAdSize.getWidth());
        dVarC.a(sbA.toString(), new Object[0]);
        int i10 = c.f29459a[this.f29450a.ordinal()];
        String str2 = "BANNER";
        if (i10 == 1) {
            ga.c cVar = new ga.c(str);
            Application application = this.f29451b;
            fd.k kVar = new fd.k(nc.b.c(dVar), 1);
            kVar.u();
            try {
                AdView adView = new AdView(application);
                AdSize adSizeAsAdSize = pHAdSize.asAdSize(application);
                if (adSizeAsAdSize == null) {
                    adSizeAsAdSize = AdSize.BANNER;
                    j0.h(adSizeAsAdSize, "BANNER");
                }
                adView.setAdSize(adSizeAsAdSize);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                adView.setLayoutParams(layoutParams);
                adView.setAdUnitId(cVar.f30125a);
                adView.setOnPaidEventListener(new ga.a(adView));
                adView.setAdListener(new ga.b(oVar, kVar, application, adView));
                adView.loadAd(new AdRequest.Builder().build());
            } catch (Exception e10) {
                if (kVar.a()) {
                    jc.i.a aVar = jc.i.f31813c;
                    kVar.resumeWith(new gb.x.b(e10));
                }
            }
            Object objR = kVar.r();
            if (objR == nc.a.COROUTINE_SUSPENDED) {
                j0.i(dVar, "frame");
            }
            return objR;
        }
        if (i10 != 2) {
            throw new jc.g();
        }
        new ha.a();
        Application application2 = this.f29451b;
        fd.k kVar2 = new fd.k(nc.b.c(dVar), 1);
        kVar2.u();
        try {
            PHAdSize.SizeType sizeType = pHAdSize.getSizeType();
            int i11 = sizeType == null ? -1 : ha.a.b.f31004a[sizeType.ordinal()];
            if (i11 == 1 || i11 == 2) {
                maxAdFormat = MaxAdFormat.MREC;
                str2 = "MREC";
            } else {
                maxAdFormat = MaxAdFormat.BANNER;
            }
            j0.h(maxAdFormat, str2);
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, application2);
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE, "true");
            maxAdView.setRevenueListener(ha.b.f31005c);
            PHAdSize.SizeType sizeType2 = pHAdSize.getSizeType();
            int i12 = sizeType2 == null ? -1 : ha.a.b.f31004a[sizeType2.ordinal()];
            maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, AppLovinSdkUtils.dpToPx(application2, (i12 == 1 || i12 == 2) ? BaseTransientBottomBar.ANIMATION_DURATION : 50)));
            maxAdView.setListener(new ha.c(kVar2, oVar, maxAdView, application2));
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            maxAdView.setId(e0.e.a());
            maxAdView.loadAd();
        } catch (Exception e11) {
            if (kVar2.a()) {
                jc.i.a aVar2 = jc.i.f31813c;
                kVar2.resumeWith(new gb.x.b(e11));
            }
        }
        Object objR2 = kVar2.r();
        if (objR2 == nc.a.COROUTINE_SUSPENDED) {
            j0.i(dVar, "frame");
        }
        return objR2;
    }

    public final void e(PHAdSize pHAdSize) {
        if (this.f29455f) {
            return;
        }
        this.f29455f = true;
        fd.c0 c0Var = s0.f29619a;
        c0.z(z.a(kd.q.f32064a), null, null, new f(pHAdSize, null), 3, null);
    }

    public final boolean f(PHAdSize pHAdSize, PHAdSize pHAdSize2) {
        return pHAdSize2 != null && Math.abs(pHAdSize.getWidth() - pHAdSize2.getWidth()) < 3 && Math.abs(pHAdSize.getHeight() - pHAdSize2.getHeight()) < 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(long j10, mc.d<? super Boolean> dVar) {
        g gVar;
        h hVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f29480f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f29480f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objC = gVar.f29478d;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = gVar.f29480f;
        PHAdSize pHAdSize = null;
        Object[] objArr = 0;
        if (i11 == 0) {
            h9.d.t(objC);
            C0257h c0257h = new C0257h(null);
            gVar.f29477c = this;
            gVar.f29480f = 1;
            objC = f2.c(j10, c0257h, gVar);
            if (objC == aVar) {
                return aVar;
            }
            hVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) gVar.f29477c;
            h9.d.t(objC);
        }
        Boolean bool = (Boolean) objC;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            hVar.c().k(6, null, "Can't load banner. Timeout reached", new Object[0]);
            hVar.f29454e.setValue(new a(new gb.x.b(new IOException("Can't load banner. Timeout reached")), pHAdSize, 2, objArr == true ? 1 : 0));
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
