package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class yu {
    private final Boolean A;
    private final String B;
    private final Integer C;
    private final String D;
    private final String E;
    private final String F;
    private final String G;
    private final String H;
    private final HashMap I;
    private final Long J;
    private final String K;
    private final String L;
    private final String M;
    private final String N;
    private final String O;
    private final String P;
    private final String Q;
    private final String R;
    private final String S;
    private final String T;
    private final String U;
    private final String V;
    private final String W;
    private final String X;
    private final String Y;
    private final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y4 f27007a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Integer f27008a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bs f27009b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final String f27010b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27011c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final String f27012c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f27013d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Boolean f27014d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27015e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Boolean f27016e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27017f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final boolean f27018f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27019g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final String f27020g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f27021h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final String f27022h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Integer f27023i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final boolean f27024i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27025j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final String f27026j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f27027k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final String f27028k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Integer f27029l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final String f27030l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f27031m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final String f27032m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Float f27033n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final String f27034n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Location f27035o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final String f27036o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f27037p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final String f27038p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Integer f27039q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final String f27040q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f27041r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final boolean f27042r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f27043s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final String f27044s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AdRequest f27045t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private StringBuilder f27046t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Integer f27047u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Integer f27048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f27049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Boolean f27050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Boolean f27051y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f27052z;

    public static final class a<T> {
        private Float A;
        private Integer B;
        private Integer C;
        private String D;
        private String E;
        private AdRequest F;
        private Integer G;
        private Integer H;
        private String I;
        private Boolean J;
        private Boolean K;
        private String L;
        private Boolean M;
        private String N;
        private Integer O;
        private String P;
        private String Q;
        private String R;
        private String S;
        private String T;
        private Long U;
        private String V;
        private String W;
        private String X;
        private String Y;
        private String Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ep f27053a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private String f27054a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ea f27055b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private String f27056b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k01 f27057c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private String f27058c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e8 f27059d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private String f27060d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f27061e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private String f27062e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27063f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private String f27064f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final HashMap f27065g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private String f27066g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f27067h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private String f27068h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f27069i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private String f27070i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f27071j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        private String f27072j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f27073k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private String f27074k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f27075l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        private int f27076l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f27077m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        private String f27078m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f27079n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private String f27080n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f27081o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private String f27082o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f27083p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private String f27084p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f27085q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private String f27086q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f27087r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private String f27088r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f27089s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private String f27090s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f27091t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private String f27092t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f27093u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private boolean f27094u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f27095v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private String f27096v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f27097w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Location f27098x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f27099y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f27100z;

        private a(boolean z10) {
            this.f27065g = new HashMap();
            this.f27061e = z10;
            this.f27053a = new ep();
            this.f27055b = new ea();
            this.f27057c = new k01();
            this.f27059d = new e8();
        }

        public /* synthetic */ a(boolean z10, int i10) {
            this(z10);
        }

        public final a<T> a(int i10) {
            this.f27097w = 1 == i10 ? "portrait" : "landscape";
            return this;
        }

        public final a<T> a(long j10) {
            this.U = Long.valueOf(j10);
            return this;
        }

        public final a<T> a(Context context) {
            String strValueOf;
            this.f27068h0 = context.getPackageName();
            String str = null;
            try {
                strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
                strValueOf = null;
            }
            this.f27070i0 = strValueOf;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e11) {
                x60.a(e11, e11.getMessage(), new Object[0]);
            }
            this.f27072j0 = str;
            return this;
        }

        public final a<T> a(Context context, SizeInfo sizeInfo) {
            if (sizeInfo != null) {
                this.f27095v = a21.b(sizeInfo.d());
                this.f27091t = Integer.valueOf(sizeInfo.c(context));
                this.f27093u = Integer.valueOf(sizeInfo.a(context));
            }
            return this;
        }

        public final a<T> a(Context context, k2 k2Var) {
            String strA;
            String strC = k2Var.c();
            int iL = k2Var.l();
            if (strC != null && (strA = new zg1(context).a(new bh1(iL, strC))) != null) {
                this.f27092t0 = strA;
            }
            return this;
        }

        public final a<T> a(Context context, String str) {
            this.f27056b0 = this.f27053a.a(context);
            Objects.requireNonNull(this.f27053a);
            this.f27058c0 = "android";
            Objects.requireNonNull(this.f27053a);
            this.f27060d0 = Build.VERSION.RELEASE;
            Objects.requireNonNull(this.f27053a);
            this.f27062e0 = ep.a();
            Objects.requireNonNull(this.f27053a);
            this.f27064f0 = Build.MODEL;
            this.f27066g0 = this.f27053a.b(context);
            if (this.f27061e) {
                str = null;
            }
            this.f27074k0 = str;
            return this;
        }

        public final a<T> a(AdRequest adRequest) {
            String strDecode;
            if (adRequest != null) {
                String strDecode2 = null;
                this.F = this.f27061e ? null : adRequest;
                String contextQuery = adRequest.getContextQuery();
                if (TextUtils.isEmpty(contextQuery)) {
                    strDecode = null;
                } else {
                    String strEncode = Uri.encode(contextQuery);
                    if (strEncode != null && strEncode.length() > 1024) {
                        bu0.f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                        String strEncode2 = Uri.encode(" ");
                        String strSubstring = strEncode.substring(0, 1024);
                        strEncode = strEncode.startsWith(strEncode2, 1024) ? strSubstring : strSubstring.substring(0, strSubstring.lastIndexOf(strEncode2));
                    }
                    strDecode = Uri.decode(strEncode);
                }
                this.P = strDecode;
                List<String> contextTags = adRequest.getContextTags();
                StringBuilder sb2 = new StringBuilder();
                if (contextTags != null) {
                    String str = "";
                    for (String str2 : contextTags) {
                        if (!TextUtils.isEmpty(str2)) {
                            v.e.a(sb2, str, str2, "\n");
                            str = "3";
                        }
                    }
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strEncode3 = Uri.encode(string);
                    if (strEncode3 != null && strEncode3.length() > 2048) {
                        bu0.f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                        String strEncode4 = Uri.encode("\n");
                        strEncode3 = strEncode3.substring(0, 2048);
                        if (!strEncode3.endsWith(strEncode4)) {
                            strEncode3 = strEncode3.substring(0, strEncode3.lastIndexOf(strEncode4));
                        }
                    }
                    strDecode2 = Uri.decode(strEncode3);
                }
                this.Q = strDecode2;
                this.f27078m0 = a5.a(adRequest.getAge());
                this.f27080n0 = a5.a(adRequest.getGender());
                this.Y = adRequest.getBiddingData();
                AdTheme preferredTheme = adRequest.getPreferredTheme();
                if (preferredTheme != null) {
                    this.f27088r0 = a5.a(preferredTheme.a());
                }
                a(a5.a(adRequest.getParameters()));
            }
            return this;
        }

        public final a<T> a(f8 f8Var) {
            if (f8Var != null) {
                this.M = Boolean.valueOf(f8Var.b());
                String strA = f8Var.a();
                Objects.requireNonNull(this.f27059d);
                boolean z10 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f27061e && !this.M.booleanValue() && z10) {
                    this.N = strA;
                }
            }
            return this;
        }

        public final a<T> a(f8 f8Var, boolean z10) {
            if (f8Var != null) {
                this.J = Boolean.valueOf(f8Var.b());
                this.K = Boolean.valueOf(z10);
                String strA = f8Var.a();
                Objects.requireNonNull(this.f27059d);
                boolean z11 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f27061e && !this.J.booleanValue() && z11) {
                    this.L = strA;
                }
            }
            return this;
        }

        public final a<T> a(l6 l6Var) {
            if (l6Var != null) {
                this.f27089s = l6Var.a();
            }
            return this;
        }

        public final a<T> a(wk0 wk0Var) {
            if (wk0Var != null) {
                this.S = wk0Var.a();
            }
            return this;
        }

        public final a<T> a(yk0 yk0Var) {
            if (yk0Var != null && yk0.f26868c == yk0Var) {
                this.T = yk0Var.a();
            }
            return this;
        }

        public final a<T> a(Integer num) {
            this.f27073k = num;
            return this;
        }

        public final a<T> a(String str) {
            this.f27087r = str;
            return this;
        }

        public final a<T> a(Map<String, String> map) {
            if (map != null) {
                this.f27065g.putAll(map);
            }
            return this;
        }

        public final a<T> a(boolean z10) {
            this.f27063f = z10;
            return this;
        }

        public final a<T> a(String[] strArr) {
            String string;
            if (strArr == null || strArr.length <= 0) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2)) {
                        sb2.append(str);
                        sb2.append(str2);
                        str = ",";
                    }
                }
                string = sb2.toString();
            }
            this.R = string;
            return this;
        }

        public final String a() {
            return new yu(this, 0).toString();
        }

        public final a<T> b() {
            this.f27069i = i01.b().d();
            return this;
        }

        public final a<T> b(Context context) {
            Objects.requireNonNull(gj.f21079a);
            this.f27075l = ((ij) gj.a.a(context)).a();
            return this;
        }

        public final a<T> b(Integer num) {
            this.O = num;
            return this;
        }

        public final a<T> b(String str) {
            this.Z = str;
            return this;
        }

        public final a<T> c() {
            Objects.requireNonNull(this.f27055b);
            this.f27086q0 = ea.a();
            return this;
        }

        public final a<T> c(Context context) {
            this.f27090s0 = (new hm(context).a() ? AdTheme.DARK : AdTheme.LIGHT).a();
            return this;
        }

        public final a<T> c(String str) {
            this.f27054a0 = str;
            return this;
        }

        public final a d() {
            this.V = "UTF-8";
            return this;
        }

        public final a<T> d(Context context) {
            Objects.requireNonNull(gj.f21079a);
            this.f27077m = ((ij) gj.a.a(context)).c();
            return this;
        }

        public final a<T> d(String str) {
            this.f27071j = str;
            return this;
        }

        public final a e() {
            this.W = null;
            return this;
        }

        public final a<T> e(Context context) {
            Objects.requireNonNull(gj.f21079a);
            this.f27079n = ((ij) gj.a.a(context)).b();
            return this;
        }

        public final a<T> e(String str) {
            this.f27085q = str;
            return this;
        }

        public final a<T> f() {
            this.f27082o0 = this.f27057c.a();
            this.f27084p0 = this.f27057c.b();
            return this;
        }

        public final a<T> f(Context context) {
            int cid;
            Integer numValueOf = null;
            try {
                cid = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getCid();
            } catch (Exception unused) {
            }
            this.G = -1 != cid ? Integer.valueOf(cid & Settings.DEFAULT_INITIAL_WINDOW_SIZE) : null;
            try {
                int lac = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getLac();
                if (-1 != lac) {
                    numValueOf = Integer.valueOf(lac & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            } catch (Exception unused2) {
            }
            this.H = numValueOf;
            this.I = lq0.c(context);
            return this;
        }

        public final a<T> g() {
            this.f27067h = i01.b().g();
            return this;
        }

        public final a<T> g(Context context) {
            this.f27098x = this.f27061e ? null : i90.a(context).a();
            return this;
        }

        public final a h() {
            this.X = null;
            return this;
        }

        public final a<T> h(Context context) {
            Integer numValueOf;
            String strSubstring;
            String str = null;
            try {
                strSubstring = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3);
            } catch (Exception unused) {
            }
            this.B = !TextUtils.isEmpty(strSubstring) ? Integer.valueOf(Integer.parseInt(strSubstring)) : null;
            try {
                String strSubstring2 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3);
                numValueOf = !TextUtils.isEmpty(strSubstring2) ? Integer.valueOf(Integer.parseInt(strSubstring2)) : null;
            } catch (Exception unused2) {
            }
            this.C = numValueOf;
            this.D = lq0.a(context);
            try {
                String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    str = networkOperatorName;
                }
            } catch (Exception unused3) {
            }
            this.E = str;
            return this;
        }

        public final a<T> i(Context context) {
            Objects.requireNonNull(gj.f21079a);
            this.f27081o = ((ij) gj.a.a(context)).d();
            return this;
        }

        public final a<T> j(Context context) {
            this.f27099y = Integer.valueOf(eh1.c(context));
            this.f27100z = Integer.valueOf(eh1.b(context));
            this.A = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f27076l0 = eh1.a(context);
            return this;
        }

        public final a<T> k(Context context) {
            nz0 nz0VarA = i01.b().a(context);
            if (nz0VarA != null) {
                this.f27096v0 = nz0VarA.s();
            }
            return this;
        }

        public final a<T> l(Context context) {
            Objects.requireNonNull(gj.f21079a);
            this.f27083p = ((ij) gj.a.a(context)).e();
            return this;
        }

        public final a<T> m(Context context) {
            this.f27094u0 = t6.a(context);
            return this;
        }
    }

    private yu(a<?> aVar) {
        this.f27013d = ((a) aVar).f27073k;
        this.f27017f = ((a) aVar).f27087r;
        this.f27015e = ((a) aVar).f27085q;
        this.f27011c = ((a) aVar).f27071j;
        this.f27019g = ((a) aVar).f27089s;
        this.f27021h = ((a) aVar).f27091t;
        this.f27023i = ((a) aVar).f27093u;
        this.f27025j = ((a) aVar).f27095v;
        this.f27027k = ((a) aVar).f27097w;
        this.f27029l = ((a) aVar).f27099y;
        this.f27031m = ((a) aVar).f27100z;
        this.f27033n = ((a) aVar).A;
        this.f27035o = ((a) aVar).f27098x;
        this.f27037p = ((a) aVar).B;
        this.f27039q = ((a) aVar).C;
        this.f27041r = ((a) aVar).D;
        this.f27043s = ((a) aVar).E;
        this.f27045t = ((a) aVar).F;
        this.f27047u = ((a) aVar).G;
        this.f27048v = ((a) aVar).H;
        this.f27049w = ((a) aVar).I;
        this.f27050x = ((a) aVar).J;
        this.f27051y = ((a) aVar).K;
        this.f27052z = ((a) aVar).L;
        this.A = ((a) aVar).M;
        this.B = ((a) aVar).N;
        this.C = ((a) aVar).O;
        this.D = ((a) aVar).P;
        this.E = ((a) aVar).Q;
        this.F = ((a) aVar).R;
        this.G = ((a) aVar).S;
        this.H = ((a) aVar).T;
        this.I = ((a) aVar).f27065g;
        this.J = ((a) aVar).U;
        this.K = ((a) aVar).V;
        this.L = ((a) aVar).W;
        this.M = ((a) aVar).X;
        this.O = ((a) aVar).Z;
        this.N = ((a) aVar).Y;
        this.P = ((a) aVar).f27054a0;
        this.Q = ((a) aVar).f27056b0;
        this.R = ((a) aVar).f27058c0;
        this.S = ((a) aVar).f27060d0;
        this.T = ((a) aVar).f27062e0;
        this.U = ((a) aVar).f27064f0;
        this.V = ((a) aVar).f27066g0;
        this.W = ((a) aVar).f27068h0;
        this.X = ((a) aVar).f27070i0;
        this.Y = ((a) aVar).f27072j0;
        this.Z = ((a) aVar).f27074k0;
        this.f27008a0 = Integer.valueOf(((a) aVar).f27076l0);
        this.f27010b0 = ((a) aVar).f27078m0;
        this.f27012c0 = ((a) aVar).f27080n0;
        this.f27014d0 = ((a) aVar).f27067h;
        this.f27016e0 = ((a) aVar).f27069i;
        this.f27018f0 = ((a) aVar).f27063f;
        this.f27026j0 = ((a) aVar).f27077m;
        this.f27028k0 = ((a) aVar).f27079n;
        this.f27024i0 = ((a) aVar).f27075l;
        this.f27030l0 = ((a) aVar).f27081o;
        this.f27032m0 = ((a) aVar).f27083p;
        this.f27034n0 = ((a) aVar).f27086q0;
        this.f27020g0 = ((a) aVar).f27082o0;
        this.f27022h0 = ((a) aVar).f27084p0;
        this.f27036o0 = ((a) aVar).f27088r0;
        this.f27038p0 = ((a) aVar).f27090s0;
        this.f27040q0 = ((a) aVar).f27092t0;
        this.f27042r0 = ((a) aVar).f27094u0;
        this.f27044s0 = ((a) aVar).f27096v0;
        this.f27007a = new y4();
        this.f27009b = new bs();
    }

    public /* synthetic */ yu(a aVar, int i10) {
        this(aVar);
    }

    public static a a(Context context, k2 k2Var, w01 w01Var) {
        return a(context, w01Var, k2Var.h()).a(k2Var.a()).a(k2Var.b()).a(k2Var.d()).a(k2Var.c()).a(k2Var.m()).a(context, k2Var.n()).a(k2Var.o()).h().b(k2Var.f()).c(k2Var.g()).a(k2Var.l()).g().b().d(context).e(context).b(context).i(context).l(context).c(context).a(context, k2Var).m(context).k(context);
    }

    public static a a(Context context, w01 w01Var, qj qjVar) {
        wr wrVarB = qjVar.b();
        d8 d8VarA = qjVar.a();
        Objects.requireNonNull(w01Var);
        a<?> aVarA = a(w01.c(context)).a(context).c().a(d8VarA.a(), d8VarA.c()).a(d8VarA.b());
        Integer numValueOf = null;
        try {
            Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    numValueOf = Integer.valueOf(Math.round((intExtra / intExtra2) * 100.0f));
                }
            }
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
        }
        a aVarA2 = aVarA.b(numValueOf).d().f(context).g(context).h(context).j(context).f().a(w01.a(context)).a(t6.f25285a);
        Objects.requireNonNull(wrVarB);
        return aVarA2.e().a(context, wrVarB.b()).e(wrVarB.f()).d(wrVarB.d()).a(qjVar.c());
    }

    public static a<?> a(boolean z10) {
        return new a<>(z10, 0);
    }

    public static String a(k2 k2Var) {
        String strA = k2Var.j().a();
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return Uri.parse(strA).buildUpon().path(BuildConfigFieldProvider.getAdUrlPath()).build().toString();
    }

    private void a(Object obj, String str) {
        StringBuilder sb2;
        String strEncode;
        if (obj != null) {
            StringBuilder sb3 = this.f27046t0;
            sb3.append(TextUtils.isEmpty(sb3) ? "" : "&");
            StringBuilder sb4 = this.f27046t0;
            sb4.append(Uri.encode(str));
            sb4.append("=");
            if (this.f27009b.a(str)) {
                sb2 = this.f27046t0;
                strEncode = Uri.encode(obj.toString());
            } else {
                sb2 = this.f27046t0;
                strEncode = Uri.encode(obj.toString(), ":");
            }
            sb2.append(strEncode);
        }
    }

    private void a(String str, Boolean bool) {
        if (bool != null) {
            a(Integer.valueOf(bool.booleanValue() ? 1 : 0), str);
        }
    }

    public final String toString() {
        Location location;
        if (TextUtils.isEmpty(this.f27046t0)) {
            this.f27046t0 = new StringBuilder();
            a(this.f27017f, "ad_unit_id");
            a(this.f27021h, "width");
            a(this.f27023i, "height");
            a(this.f27025j, "ad_size_type");
            a(this.f27027k, "orientation");
            a(this.f27013d, "ads_count");
            a(this.f27029l, "screen_width");
            a(this.f27031m, "screen_height");
            a(this.f27033n, "scalefactor");
            a(this.f27019g, "ad_type");
            a(this.f27041r, "network_type");
            a(this.f27043s, "carrier");
            a("dnt", this.f27050x);
            a("gaid_reset", this.f27051y);
            a("huawei_dnt", this.A);
            a(this.C, "battery_charge");
            a(this.F, "image_sizes");
            a(this.G, "response_ad_format");
            a(this.H, FullscreenAdService.DATA_KEY_AD_SOURCE);
            a(this.L, "debug_yandexuid");
            a(this.M, "user_id");
            a(this.N, "open_bidding_data");
            a(this.J, "session_random");
            a(this.K, "charset");
            a(this.Q, this.f27007a.b());
            a(this.R, this.f27007a.e());
            a(this.S, this.f27007a.f());
            a(this.T, this.f27007a.c());
            a(this.U, this.f27007a.d());
            a(this.V, "locale");
            a(this.W, "app_id");
            a(this.X, "app_version_code");
            a(this.Y, "app_version_name");
            a(this.f27034n0, "appmetrica_version");
            a(this.f27008a0, "screen_dpi");
            a("user_consent", this.f27014d0);
            a(this.f27026j0, "gdpr");
            a(this.f27028k0, "gdpr_consent");
            a("cmp_present", Boolean.valueOf(this.f27024i0));
            a(this.f27030l0, "parsed_purpose_consents");
            a(this.f27032m0, "parsed_vendor_consents");
            a(this.P, "bidding_data");
            a(this.f27020g0, "sdk_version");
            a(this.f27022h0, "sdk_version_name");
            a(this.f27036o0, "preferred_theme");
            a(this.f27038p0, "device_theme");
            a("age_restricted_user", this.f27016e0);
            a(this.f27040q0, "view_size_info");
            a("web_view_available", Boolean.valueOf(this.f27042r0));
            a(this.f27044s0, "startup_version");
            HashMap map = this.I;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    a(entry.getValue(), (String) entry.getKey());
                }
            }
            if (!this.f27018f0) {
                a(this.f27010b0, "age");
                a(this.f27012c0, "gender");
                a(this.D, "context_query");
                a(this.E, "context_taglist");
                a(this.f27052z, "google_aid");
                a(this.B, "huawei_oaid");
                a(this.f27015e, "uuid");
                a(this.f27011c, "mauid");
                a(this.O, "autograb");
                a(this.Z, this.f27007a.a());
                a(this.f27037p, "mcc");
                a(this.f27039q, "mnc");
                a(this.f27047u, "cellid");
                a(this.f27048v, "lac");
                a(this.f27049w, "wifi");
                AdRequest adRequest = this.f27045t;
                if (adRequest == null || adRequest.getLocation() == null ? !((location = this.f27035o) == null || !i01.b().f()) : !((location = this.f27045t.getLocation()) == null || !i01.b().f())) {
                    a(String.valueOf(location.getLatitude()), "lat");
                    a(String.valueOf(location.getLongitude()), "lon");
                    a(String.valueOf(location.getTime()), "location_timestamp");
                    a(String.valueOf((int) location.getAccuracy()), "precision");
                }
            }
        }
        return this.f27046t0.toString();
    }
}
