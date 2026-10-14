package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yf0 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sf0 f26819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kp0 f26820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ng0 f26821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hg0 f26822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ch1 f26823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mt f26824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ot f26825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f26826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gh1 f26827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t91 f26828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ig0 f26829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private hf0 f26830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private gf0 f26831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private wo0 f26832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private af1 f26833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private lt f26834p;

    public class a implements hg0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f26835a;

        public a(String str) {
            this.f26835a = str;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26837a;

        static {
            int[] iArr = new int[a6.b(8).length];
            f26837a = iArr;
            try {
                iArr[a6.a(4)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26837a[a6.a(7)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26837a[a6.a(5)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26837a[a6.a(1)] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26837a[a6.a(2)] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26837a[a6.a(3)] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26837a[a6.a(6)] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class c implements zz {
        private c() {
        }

        public /* synthetic */ c(yf0 yf0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.zz
        public final void a() {
            yf0.this.f26820b.a();
        }

        @Override // com.yandex.mobile.ads.impl.zz
        public final void a(int i10) {
            yf0.this.f26820b.a(i10);
        }

        @Override // com.yandex.mobile.ads.impl.zz
        public final void a(Context context, String str) {
            yf0.this.f26820b.a(context, str);
        }
    }

    public yf0(kp0 kp0Var) {
        this.f26820b = kp0Var;
        ng0 ng0Var = new ng0(new c(this, 0));
        this.f26821c = ng0Var;
        kp0Var.setWebViewClient(ng0Var);
        this.f26819a = new sf0(kp0Var);
        this.f26822d = new hg0();
        this.f26827i = new gh1();
        this.f26828j = new t91();
        this.f26823e = ch1.f19507c;
        mt mtVar = new mt();
        this.f26824f = mtVar;
        this.f26825g = new ot(kp0Var, mtVar, this);
        this.f26826h = t6.a(this);
    }

    private void a(int i10, HashMap map) throws wf0 {
        if (this.f26829k == null) {
            throw new wf0("Invalid state to execute this command");
        }
        int[] iArr = b.f26837a;
        if (i10 == 0) {
            throw null;
        }
        switch (iArr[i10 - 1]) {
            case 1:
                if (ch1.f19506b == this.f26823e) {
                    ch1 ch1Var = ch1.f19508d;
                    this.f26823e = ch1Var;
                    this.f26819a.a(ch1Var);
                    wo0 wo0Var = this.f26832n;
                    if (wo0Var != null) {
                        wo0Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (this.f26832n != null) {
                    this.f26832n.a(Boolean.parseBoolean((String) map.get("shouldUseCustomClose")));
                    return;
                }
                return;
            case 3:
                String str = (String) map.get(ImagesContract.URL);
                if (TextUtils.isEmpty(str)) {
                    throw new wf0(String.format("Mraid open command sent an invalid URL: %s", str));
                }
                this.f26829k.a(str);
                x60.e("Mraid open command with url %s", str);
                return;
            case 4:
                af1 af1Var = this.f26833o;
                if (af1Var != null) {
                    af1Var.a();
                    return;
                }
                return;
            case 5:
                gf0 gf0Var = this.f26831m;
                if (gf0Var != null) {
                    gf0Var.d();
                    return;
                }
                return;
            case 6:
                gf0 gf0Var2 = this.f26831m;
                if (gf0Var2 != null) {
                    gf0Var2.b();
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = this.f26830l;
                if (hf0Var != null) {
                    hf0Var.a();
                    return;
                }
                return;
            default:
                throw new wf0("Unspecified MRAID Javascript command");
        }
    }

    public final void a() {
        this.f26825g.b();
        hg0 hg0Var = this.f26822d;
        Context context = this.f26820b.getContext();
        String str = this.f26826h;
        Objects.requireNonNull(hg0Var);
        Objects.requireNonNull(vw0.a());
        vw0.a(context, str);
        this.f26829k = null;
        this.f26830l = null;
        this.f26831m = null;
        this.f26832n = null;
        this.f26833o = null;
    }

    public final void a(af1 af1Var) {
        this.f26833o = af1Var;
    }

    public final void a(gf0 gf0Var) {
        this.f26831m = gf0Var;
    }

    public final void a(hf0 hf0Var) {
        this.f26830l = hf0Var;
    }

    public final void a(ig0 ig0Var) {
        this.f26829k = ig0Var;
    }

    public final void a(kp0 kp0Var, Map map) {
        o51 o51Var = new o51(this.f26820b);
        gh1 gh1Var = this.f26827i;
        kp0 kp0Var2 = this.f26820b;
        Objects.requireNonNull(gh1Var);
        kh1 kh1Var = new kh1(gh1.a(kp0Var2));
        lt ltVarA = this.f26824f.a(this.f26820b);
        nt ntVar = new nt(ltVarA.a(), ltVarA.b());
        ch1 ch1Var = ch1.f19506b;
        this.f26823e = ch1Var;
        this.f26819a.a(ch1Var, kh1Var, ntVar, o51Var);
        this.f26819a.a();
        ig0 ig0Var = this.f26829k;
        if (ig0Var != null) {
            ig0Var.a(kp0Var, map);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xo0
    public final void a(lt ltVar) {
        if (ltVar.equals(this.f26834p)) {
            return;
        }
        this.f26834p = ltVar;
        this.f26819a.a(new nt(ltVar.a(), ltVar.b()));
    }

    public final void a(wo0 wo0Var) {
        this.f26832n = wo0Var;
    }

    public final void a(String str) {
        Context context = this.f26820b.getContext();
        hg0 hg0Var = this.f26822d;
        String str2 = this.f26826h;
        a aVar = new a(str);
        Objects.requireNonNull(hg0Var);
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA == null || TextUtils.isEmpty(nz0VarA.n())) {
            this.f26821c.a(hg0.f21393a);
            this.f26819a.b(str);
            x60.f("SdkConfiguration is empty. Use default mraid js controller.", new Object[0]);
            return;
        }
        y41 y41Var = new y41(nz0VarA.n(), new fg0(aVar), new gg0(aVar));
        y41Var.b((Object) str2);
        synchronized (vw0.a()) {
            gn0.a(context).a(y41Var);
        }
    }

    public final void a(boolean z10) {
        this.f26819a.a(new kh1(z10));
        if (z10) {
            this.f26825g.a();
            return;
        }
        this.f26825g.b();
        lt ltVarA = this.f26824f.a(this.f26820b);
        if (ltVarA.equals(this.f26834p)) {
            return;
        }
        this.f26834p = ltVarA;
        this.f26819a.a(new nt(ltVarA.a(), ltVarA.b()));
    }

    public final void b() {
        if (ch1.f19506b == this.f26823e) {
            ch1 ch1Var = ch1.f19508d;
            this.f26823e = ch1Var;
            this.f26819a.a(ch1Var);
        }
    }

    public final void b(String str) {
        Objects.requireNonNull(this.f26828j);
        if (!t91.c(str)) {
            x60.f(fn1.a("Invalid MRAID URL: ", str), new Object[0]);
            this.f26819a.a(8, "Mraid command sent an invalid URL");
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mraid".equals(scheme) || "mobileads".equals(scheme)) {
            HashMap map = new HashMap();
            for (String str2 : uri.getQueryParameterNames()) {
                map.put(str2, uri.getQueryParameter(str2));
            }
            int iA = eg0.a(host);
            try {
                a(iA, map);
            } catch (Exception e10) {
                this.f26819a.a(iA, e10.getMessage());
            }
            this.f26819a.a(iA);
        }
    }
}
