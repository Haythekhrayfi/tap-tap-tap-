package ia;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.s;
import cd.i;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.inscode.autoclicker.R;
import fd.c1;
import fd.j0;
import fd.k;
import gb.x;
import java.util.Objects;
import kotlin.reflect.KProperty;
import ma.h;
import vc.b0;
import vc.t;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31508e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.zipoapps.ads.a f31509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f31510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta.e f31511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f31512d;

    /* JADX INFO: renamed from: ia.a$a, reason: collision with other inner class name */
    public static final class C0313a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31514b;

        public C0313a(View view, boolean z10) {
            this.f31513a = view;
            this.f31514b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0313a)) {
                return false;
            }
            C0313a c0313a = (C0313a) obj;
            return j0.d(this.f31513a, c0313a.f31513a) && this.f31514b == c0313a.f31514b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            View view = this.f31513a;
            int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
            boolean z10 = this.f31514b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ExitViewContainer(exitView=");
            sbA.append(this.f31513a);
            sbA.append(", isNative=");
            return s.a(sbA, this.f31514b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @oc.e(c = "com.zipoapps.ads.exitads.ExitAds", f = "ExitAds.kt", l = {287, 291, 293}, m = "getNativeAdView")
    public static final class b extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f31517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f31518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f31519g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31521i;

        public b(mc.d<? super b> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31519g = obj;
            this.f31521i |= Integer.MIN_VALUE;
            a aVar = a.this;
            KProperty<Object>[] kPropertyArr = a.f31508e;
            return aVar.b(null, null, false, this);
        }
    }

    static {
        t tVar = new t(a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f31508e = new i[]{tVar};
    }

    public a(com.zipoapps.ads.a aVar, Application application) {
        j0.i(aVar, "adManager");
        j0.i(application, "application");
        this.f31509a = aVar;
        this.f31510b = application;
        this.f31511c = new ta.e("PremiumHelper");
    }

    public final ta.d a() {
        return this.f31511c.a(this, f31508e[0]);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[Catch: Exception -> 0x0062, TryCatch #1 {Exception -> 0x0062, blocks: (B:14:0x0039, B:44:0x00b9, B:46:0x00bf, B:47:0x00e1, B:19:0x004b, B:39:0x009e, B:22:0x005e, B:31:0x007e, B:34:0x0087, B:36:0x008f, B:40:0x00a7), top: B:55:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #1 {Exception -> 0x0062, blocks: (B:14:0x0039, B:44:0x00b9, B:46:0x00bf, B:47:0x00e1, B:19:0x004b, B:39:0x009e, B:22:0x005e, B:31:0x007e, B:34:0x0087, B:36:0x008f, B:40:0x00a7), top: B:55:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00e1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final Object b(Context context, ViewGroup viewGroup, boolean z10, mc.d<? super C0313a> dVar) {
        b bVar;
        a aVar;
        Context context2;
        ViewGroup viewGroup2;
        x xVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f31521i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31521i = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objF = bVar.f31519g;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = bVar.f31521i;
        try {
            if (i11 == 0) {
                h9.d.t(objF);
                try {
                    com.zipoapps.ads.a aVar3 = this.f31509a;
                    com.zipoapps.ads.a.EnumC0215a enumC0215a = com.zipoapps.ads.a.EnumC0215a.NATIVE;
                    bVar.f31515c = this;
                    bVar.f31516d = context;
                    bVar.f31517e = viewGroup;
                    bVar.f31518f = z10;
                    bVar.f31521i = 1;
                    objF = aVar3.f(enumC0215a, true, bVar);
                    if (objF == aVar2) {
                        return aVar2;
                    }
                    aVar = this;
                } catch (Exception e10) {
                    e = e10;
                    z10 = this;
                    z10.a().b(d0.b.a(e, defpackage.a.a("Failed to get native ad for ExitAd view. Error: ")), new Object[0]);
                    return null;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        h9.d.t(objF);
                        return new C0313a((View) objF, true);
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    viewGroup2 = (ViewGroup) bVar.f31517e;
                    context2 = (Context) bVar.f31516d;
                    aVar = (a) bVar.f31515c;
                    h9.d.t(objF);
                    xVar = (x) objF;
                    if (xVar instanceof x.c) {
                        View viewInflate = LayoutInflater.from(context2).inflate(R.layout.ph_exit_native_ad_layout, viewGroup2, false);
                        j0.g(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
                        NativeAdView nativeAdView = (NativeAdView) viewInflate;
                        ja.a.a((NativeAd) ((x.c) xVar).f30417b, nativeAdView);
                        return new C0313a(nativeAdView, true);
                    }
                    aVar.a().b("Failed to get native ad for ExitAd view. Error: " + c0.j(xVar), new Object[0]);
                    return null;
                }
                boolean z11 = bVar.f31518f;
                viewGroup = (ViewGroup) bVar.f31517e;
                context = (Context) bVar.f31516d;
                aVar = (a) bVar.f31515c;
                h9.d.t(objF);
            }
            if (!((Boolean) objF).booleanValue()) {
                return null;
            }
            com.zipoapps.ads.a aVar4 = aVar.f31509a;
            if (aVar4.f28028e == oa.b.a.APPLOVIN) {
                bVar.f31515c = aVar;
                bVar.f31516d = null;
                bVar.f31517e = null;
                bVar.f31521i = 2;
                objF = aVar.d(context, bVar);
                if (objF == aVar2) {
                    return aVar2;
                }
                return new C0313a((View) objF, true);
            }
            bVar.f31515c = aVar;
            bVar.f31516d = context;
            bVar.f31517e = viewGroup;
            bVar.f31521i = 3;
            objF = aVar4.h(true, null, bVar);
            if (objF == aVar2) {
                return aVar2;
            }
            ViewGroup viewGroup3 = viewGroup;
            context2 = context;
            viewGroup2 = viewGroup3;
            xVar = (x) objF;
            if (xVar instanceof x.c) {
                View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.ph_exit_native_ad_layout, viewGroup2, false);
                j0.g(viewInflate2, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
                NativeAdView nativeAdView2 = (NativeAdView) viewInflate2;
                ja.a.a((NativeAd) ((x.c) xVar).f30417b, nativeAdView2);
                return new C0313a(nativeAdView2, true);
            }
            aVar.a().b("Failed to get native ad for ExitAd view. Error: " + c0.j(xVar), new Object[0]);
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean c() {
        h hVarA = h.f33410y.a();
        return !hVarA.i() && ((Boolean) hVarA.f33418g.h(oa.b.C)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Context context, mc.d dVar) {
        d dVar2;
        Exception e10;
        a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f31532g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f31532g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object objR = dVar2.f31530e;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = dVar2.f31532g;
        if (i11 == 0) {
            h9.d.t(objR);
            try {
                dVar2.f31528c = this;
                dVar2.f31529d = context;
                dVar2.f31532g = 1;
                k kVar = new k(nc.b.c(dVar2), 1);
                kVar.u();
                c0.z(c1.f29556c, null, null, new e(this, kVar, context, null), 3, null);
                objR = kVar.r();
                if (objR == aVar2) {
                    return aVar2;
                }
                aVar = this;
            } catch (Exception e11) {
                e10 = e11;
                aVar = this;
                aVar.a().k(6, e10, null, new Object[0]);
                return null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar2.f31528c;
            try {
                h9.d.t(objR);
            } catch (Exception e12) {
                e10 = e12;
                aVar.a().k(6, e10, null, new Object[0]);
                return null;
            }
        }
        return (View) objR;
    }
}
