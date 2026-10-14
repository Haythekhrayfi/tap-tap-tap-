package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static o f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f10978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f10979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f10980d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f10981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f10982f;
    private volatile VariableServiceImpl B;
    private volatile AppLovinSdk D;
    private volatile y E;
    private volatile com.applovin.impl.sdk.e.r G;
    private volatile com.applovin.impl.sdk.c.c I;
    private volatile com.applovin.impl.sdk.network.b K;
    private volatile com.applovin.impl.sdk.d.g M;
    private volatile r O;
    private volatile p Q;
    private volatile q S;
    private volatile Boolean U;
    private volatile com.applovin.impl.sdk.c.e V;
    private volatile n X;
    private volatile com.applovin.impl.sdk.utils.v Z;
    private volatile com.applovin.impl.a.a.a aB;
    private volatile com.applovin.impl.sdk.a.f aD;
    private volatile x aF;
    private volatile ArrayService aH;
    private volatile s aJ;
    private volatile PostbackServiceImpl aL;
    private volatile com.applovin.impl.sdk.network.k aN;
    private volatile f aP;
    private volatile com.applovin.impl.mediation.f aR;
    private volatile com.applovin.impl.mediation.e aT;
    private volatile MediationServiceImpl aV;
    private volatile com.applovin.mediation.hybridAds.d aX;
    private volatile com.applovin.impl.mediation.h aZ;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private volatile d f10984ab;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private volatile b f10986ad;
    private volatile u af;
    private volatile com.applovin.impl.sdk.d.c ah;
    private volatile SessionTracker aj;
    private volatile v al;
    private volatile ae an;
    private volatile com.applovin.impl.sdk.network.d ap;
    private volatile l ar;
    private volatile com.applovin.impl.sdk.utils.s at;
    private volatile j av;
    private volatile com.applovin.impl.b.a.b ax;
    private volatile com.applovin.impl.b.b.a az;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    private volatile com.applovin.impl.mediation.debugger.b f10989bb;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    private volatile z f10991bd;
    private volatile com.applovin.impl.mediation.d bf;
    private volatile com.applovin.impl.mediation.debugger.ui.testmode.c bh;
    private List<MaxAdFormat> bj;
    private AppLovinSdk.SdkInitializationListener bv;
    private AppLovinSdk.SdkInitializationListener bw;
    private AppLovinSdkConfiguration bx;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f10994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10997k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AppLovinSdkSettings f11000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AppLovinUserSegment f11001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AppLovinTargetingData f11002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f11003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile AppLovinAdServiceImpl f11004r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinNativeAdService f11006t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile EventServiceImpl f11008v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile UserServiceImpl f11010x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile AppLovinCFService f11012z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f10998l = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f11005s = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f11007u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f11009w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Object f11011y = new Object();
    private final Object A = new Object();
    private final Object C = new Object();
    private final Object F = new Object();
    private final Object H = new Object();
    private final Object J = new Object();
    private final Object L = new Object();
    private final Object N = new Object();
    private final Object P = new Object();
    private final Object R = new Object();
    private final Object T = new Object();
    private final Object W = new Object();
    private final Object Y = new Object();

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private final Object f10983aa = new Object();

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private final Object f10985ac = new Object();

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private final Object f10987ae = new Object();
    private final Object ag = new Object();
    private final Object ai = new Object();
    private final Object ak = new Object();
    private final Object am = new Object();
    private final Object ao = new Object();
    private final Object aq = new Object();
    private final Object as = new Object();
    private final Object au = new Object();
    private final Object aw = new Object();
    private final Object ay = new Object();
    private final Object aA = new Object();
    private final Object aC = new Object();
    private final Object aE = new Object();
    private final Object aG = new Object();
    private final Object aI = new Object();
    private final Object aK = new Object();
    private final Object aM = new Object();
    private final Object aO = new Object();
    private final Object aQ = new Object();
    private final Object aS = new Object();
    private final Object aU = new Object();
    private final Object aW = new Object();
    private final Object aY = new Object();

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    private final Object f10988ba = new Object();

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    private final Object f10990bc = new Object();

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private final Object f10992be = new Object();
    private final Object bg = new Object();
    private final Object bi = new Object();
    private final Object bk = new Object();
    private final AtomicBoolean bl = new AtomicBoolean(true);
    private final AtomicBoolean bm = new AtomicBoolean();
    private boolean bn = false;
    private boolean bo = false;
    private boolean bp = false;
    private boolean bq = false;
    private boolean br = false;
    private int bs = 0;
    private Map<String, String> bt = null;
    private String bu = "";

    static {
        boolean z10;
        try {
            AppLovinSdkUtils.runOnUiThread(a0.f10163d);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
            try {
                y.j("AppLovinSdk", "Running on older Java version.");
            } finally {
                f10981e = false;
            }
        }
    }

    public static a a(Context context) {
        if (f10982f == null) {
            f10982f = new a(context);
        }
        return f10982f;
    }

    public static String a(int i10) {
        return a(i10, (List<String>) null);
    }

    public static String a(int i10, List<String> list) {
        String string = au().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static String a(String str) {
        return a(str, (List<String>) null);
    }

    public static String a(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextAu = au();
        return a(contextAu.getResources().getIdentifier(str, "string", contextAu.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        this.f10997k = System.currentTimeMillis();
        com.applovin.impl.sdk.utils.i.e(jSONObject, this);
        com.applovin.impl.sdk.utils.i.d(jSONObject, this);
        com.applovin.impl.sdk.utils.i.f(jSONObject, this);
        com.applovin.impl.mediation.d.b.a(jSONObject, this);
        com.applovin.impl.mediation.d.b.b(jSONObject, this);
        com.applovin.impl.mediation.d.b.c(jSONObject, this);
        com.applovin.impl.mediation.d.b.a(jSONObject);
        com.applovin.impl.sdk.utils.i.g(jSONObject, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(StackTraceElement[] stackTraceElementArr) {
        if (f()) {
            this.bu = AppLovinMediationProvider.MAX;
            return;
        }
        try {
            Map<String, String> mapAI = aI();
            if (mapAI != null && !mapAI.isEmpty()) {
                Integer num = (Integer) a(com.applovin.impl.sdk.c.b.eN);
                for (int i10 = 2; i10 < Math.min(stackTraceElementArr.length, num.intValue()); i10++) {
                    String className = stackTraceElementArr[i10].getClassName();
                    if (!className.startsWith("com.applovin")) {
                        for (Map.Entry<String, String> entry : mapAI.entrySet()) {
                            if (className.startsWith(entry.getKey())) {
                                this.bu = entry.getValue();
                                this.bt = null;
                                return;
                            }
                        }
                    }
                }
                return;
            }
            this.bu = AppLovinMediationProvider.UNKNOWN;
        } catch (Throwable th) {
            y.j("AppLovinSdk", "Failed to detect mediation provider");
            ag().a("AppLovinSdk", "detectMediationProvider", th);
            this.bt = null;
        }
    }

    private void aE() {
        this.V = new com.applovin.impl.sdk.c.e(this);
        this.I = new com.applovin.impl.sdk.c.c(this);
        this.E = new y(this);
        this.af = new u(this);
        this.f10984ab = new d(this);
        this.f10986ad = new b(this);
        this.f11008v = new EventServiceImpl(this);
        this.f11010x = new UserServiceImpl(this);
        this.f11012z = new h(this) { // from class: com.applovin.impl.sdk.o.8
        };
        this.B = new VariableServiceImpl(this);
        this.ah = new com.applovin.impl.sdk.d.c(this);
        this.G = new com.applovin.impl.sdk.e.r(this);
        this.K = new com.applovin.impl.sdk.network.b(this);
        this.M = new com.applovin.impl.sdk.d.g(this);
        this.aD = new com.applovin.impl.sdk.a.f(this);
        this.at = new com.applovin.impl.sdk.utils.s(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            this.O = new r(this);
            this.S = new q(this);
        } else {
            this.Q = new p(this);
        }
        this.f11004r = new AppLovinAdServiceImpl(this);
        this.f11006t = new AppLovinNativeAdService(this);
        this.aj = new SessionTracker(this);
        this.al = new v(this);
        this.an = new ae(this);
        this.aL = new PostbackServiceImpl(this);
        this.aP = new f(this);
        this.aR = new com.applovin.impl.mediation.f(this);
        this.aT = new com.applovin.impl.mediation.e(this);
        this.aV = new MediationServiceImpl(this);
        this.aX = new com.applovin.mediation.hybridAds.d(this);
        this.f10991bd = new z(this);
        this.f10989bb = new com.applovin.impl.mediation.debugger.b(this);
        this.aZ = new com.applovin.impl.mediation.h();
        this.bf = new com.applovin.impl.mediation.d(this);
        this.X = new n(this);
        this.av = new j(this);
        this.bh = new com.applovin.impl.mediation.debugger.ui.testmode.c(this);
        this.ax = new com.applovin.impl.b.a.b(this);
        this.az = new com.applovin.impl.b.b.a(this);
        this.aB = new com.applovin.impl.a.a.a(this);
        this.aF = new x(this);
        this.aH = new ArrayService(this);
        this.aJ = new s(this);
        this.aN = (((Boolean) a(com.applovin.impl.sdk.c.b.dq)).booleanValue() || Boolean.parseBoolean(this.f11000n.getExtraParameters().get(AppLovinSdkExtraParameterKey.USE_NEW_POSTBACK_MANAGER))) ? new com.applovin.impl.sdk.network.g(this) : new com.applovin.impl.sdk.network.f(this);
        this.ar = new l(this);
        this.Z = new com.applovin.impl.sdk.utils.v(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
    public void aF() {
        String string;
        Context context = f10979c;
        final y yVarF = F();
        com.applovin.impl.sdk.c.e eVarN = N();
        com.applovin.impl.sdk.e.r rVarG = G();
        final com.applovin.impl.b.a.b bVarAa = aa();
        U();
        aj();
        af();
        al().a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (this.f11000n.isExceptionHandlerEnabled() && ((Boolean) a(com.applovin.impl.sdk.c.b.au)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dG)).booleanValue()) {
            this.ap = new com.applovin.impl.sdk.network.d(context);
        }
        if (TextUtils.isEmpty(this.f10993g)) {
            y.j("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            y.j("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.f10993g.length() != 86 && com.applovin.impl.sdk.utils.w.a(context, this)) {
            StringBuilder sbA = defpackage.a.a("Please double-check that you entered your SDK key correctly (");
            sbA.append(this.f10993g);
            sbA.append(") : ");
            sbA.append(Log.getStackTraceString(new Throwable("")));
            y.j("AppLovinSdk", sbA.toString());
        }
        if (com.applovin.impl.sdk.utils.w.h()) {
            y.j("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!com.applovin.impl.sdk.utils.w.b(this)) {
            y.j("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (com.applovin.impl.sdk.utils.w.a(context)) {
            this.f11000n.setVerboseLogging(true);
        }
        H().a(com.applovin.impl.sdk.c.b.ai, Boolean.valueOf(this.f11000n.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f10386d;
        if (TextUtils.isEmpty((String) eVarN.b(dVar, (Object) null, defaultSharedPreferences))) {
            this.bp = true;
            string = Boolean.toString(true);
        } else {
            string = Boolean.toString(false);
        }
        eVarN.a(dVar, string, defaultSharedPreferences);
        com.applovin.impl.sdk.c.d<Boolean> dVar2 = com.applovin.impl.sdk.c.d.f10387e;
        if (((Boolean) eVarN.b(dVar2, Boolean.FALSE)).booleanValue()) {
            if (y.a()) {
                yVarF.b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.bq = true;
        } else {
            if (y.a()) {
                yVarF.b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            eVarN.a(dVar2, Boolean.TRUE);
            eVarN.a(com.applovin.impl.sdk.c.d.f10399q, Boolean.valueOf(bVarAa.b()));
        }
        com.applovin.impl.sdk.c.d<String> dVar3 = com.applovin.impl.sdk.c.d.f10388f;
        String str = (String) eVarN.b(dVar3, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE > com.applovin.impl.sdk.utils.w.d(str)) {
                eVarN.a(dVar3, AppLovinSdk.VERSION);
            }
        } else {
            eVarN.a(dVar3, AppLovinSdk.VERSION);
        }
        final boolean zA = com.applovin.impl.sdk.utils.i.a(au());
        int i10 = StringUtils.parseInt(this.f11000n.getExtraParameters().get(AppLovinSdkExtraParameterKey.INITIALIZATION_DELAY_MILLIS), ((Integer) a(com.applovin.impl.sdk.c.b.eL)).intValue());
        com.applovin.impl.sdk.e.ac acVar = new com.applovin.impl.sdk.e.ac(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.o.9
            @Override // java.lang.Runnable
            public void run() {
                w.a(o.this);
            }
        });
        com.applovin.impl.sdk.e.r.b bVar = com.applovin.impl.sdk.e.r.b.MAIN;
        long j10 = i10;
        rVarG.a(acVar, bVar, j10);
        rVarG.a(new com.applovin.impl.sdk.e.ac(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.o.10
            @Override // java.lang.Runnable
            public void run() {
                synchronized (o.this.bk) {
                    if (!((Boolean) o.this.a(com.applovin.impl.sdk.c.b.dH)).booleanValue() || zA) {
                        o.this.b();
                    }
                    if (((Boolean) o.this.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && !zA) {
                        if (y.a()) {
                            yVarF.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                        }
                        o.this.aJ();
                    }
                    if (bVarAa.c() == com.applovin.impl.b.a.c.a.TERMS) {
                        if (o.this.f()) {
                            if (y.a()) {
                                yVarF.b("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                            }
                            bVarAa.a(false);
                            bVarAa.a(o.this.at(), new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.o.10.1
                                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                }
                            });
                        } else if (y.a()) {
                            yVarF.b("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + o.this.f11003q);
                        }
                    }
                }
            }
        }), bVar, j10);
    }

    private void aG() {
        com.applovin.impl.sdk.e.r rVarG = G();
        int i10 = this.bs + 1;
        this.bs = i10;
        rVarG.a(new com.applovin.impl.sdk.e.l(i10, this, new com.applovin.impl.sdk.e.l.a() { // from class: com.applovin.impl.sdk.o.12
            /* JADX WARN: Code duplicated, block: B:34:0x012b  */
            @Override // com.applovin.impl.sdk.e.l.a
            public void a(JSONObject jSONObject) {
                boolean z10 = jSONObject != null && jSONObject.length() > 0;
                o.this.a(jSONObject);
                g.a(o.this);
                com.applovin.impl.sdk.utils.w.e(o.this);
                com.applovin.impl.sdk.utils.i.a(jSONObject, z10, o.this);
                o.this.ap().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                o oVar = o.this;
                oVar.bj = oVar.c(jSONObject);
                if (z10) {
                    List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                    o oVar2 = o.this;
                    oVar2.bx = new SdkConfigurationImpl(listExplode, oVar2);
                }
                o.this.as().a(jSONObject);
                o.this.b(jSONObject);
                com.applovin.impl.sdk.utils.o.a(((Boolean) o.this.a(com.applovin.impl.sdk.c.b.gN)).booleanValue());
                com.applovin.impl.sdk.utils.o.b(((Boolean) o.this.a(com.applovin.impl.sdk.c.b.gO)).booleanValue());
                o oVar3 = o.this;
                com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f10401s;
                Boolean bool = (Boolean) oVar3.a(dVar);
                if (bool == null) {
                    boolean z11 = o.this.bx.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
                    o.this.br = z11;
                    o.this.a(dVar, Boolean.valueOf(z11));
                } else if (bool.booleanValue()) {
                    o.this.br = true;
                } else {
                    o.this.br = false;
                    if (o.this.bx.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                        o.this.a(dVar, Boolean.TRUE);
                    }
                }
                if (o.this.e() || !o.this.f()) {
                    o.this.e("Initializing SDK in non-MAX environment...");
                } else if (o.this.aa().c() == com.applovin.impl.b.a.c.a.UNIFIED) {
                    Activity activityAt = o.this.at();
                    if (o.this.bm.compareAndSet(false, true)) {
                        o.this.aa().a(false);
                        o.this.aa().a(activityAt, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.o.12.1
                            @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                            public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                                o.this.e("Initializing SDK in MAX environment...");
                            }
                        });
                    } else {
                        o.this.e("Initializing SDK in MAX environment...");
                    }
                } else {
                    o.this.e("Initializing SDK in MAX environment...");
                }
                if (!((Boolean) o.this.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() || z10 || !com.applovin.impl.sdk.utils.i.a(o.au())) {
                    o.this.aH();
                    return;
                }
                o.this.F();
                if (y.a()) {
                    o.this.F().c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                o.this.aJ();
            }
        }), com.applovin.impl.sdk.e.r.b.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aH() {
        long jLongValue = ((Long) a(com.applovin.impl.sdk.c.b.dQ)).longValue();
        if (jLongValue >= 0 && this.f10998l.compareAndSet(false, true)) {
            com.applovin.impl.sdk.utils.y.a(jLongValue, false, this, new Runnable() { // from class: com.applovin.impl.sdk.o.13
                @Override // java.lang.Runnable
                public void run() {
                    o.this.G().a(new com.applovin.impl.sdk.e.l(o.h(o.this), o.this, new com.applovin.impl.sdk.e.l.a() { // from class: com.applovin.impl.sdk.o.13.1
                        @Override // com.applovin.impl.sdk.e.l.a
                        public void a(JSONObject jSONObject) {
                            if (jSONObject != null && jSONObject.length() > 0) {
                                o.this.a(jSONObject);
                            }
                            o.this.f10998l.set(false);
                            o.this.aH();
                        }
                    }), com.applovin.impl.sdk.e.r.b.MAIN);
                }
            });
        }
    }

    private Map<String, String> aI() {
        Map<String, String> map = this.bt;
        if (map != null) {
            return map;
        }
        String str = (String) a(com.applovin.impl.sdk.c.b.eM);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, String> stringMap = JsonUtils.toStringMap(new JSONObject(str));
            this.bt = stringMap;
            return stringMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aJ() {
        final com.applovin.impl.sdk.network.d dVarB = b(f10979c);
        dVarB.a(new com.applovin.impl.sdk.network.d.a() { // from class: com.applovin.impl.sdk.o.3
            @Override // com.applovin.impl.sdk.network.d.a
            public void a() {
                o.this.F();
                if (y.a()) {
                    o.this.F().c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (o.this.bk) {
                    if (!o.this.bn) {
                        o.this.b();
                    }
                }
                dVarB.b(this);
            }

            @Override // com.applovin.impl.sdk.network.d.a
            public void b() {
            }
        });
    }

    private boolean aK() {
        if (this.U == null) {
            this.U = (Boolean) a(com.applovin.impl.sdk.c.b.dZ);
        }
        return Boolean.TRUE.equals(this.U);
    }

    public static Context au() {
        return f10979c;
    }

    public static long av() {
        return f10980d;
    }

    public static boolean aw() {
        return f10981e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            y.j("AppLovinSdk", (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MaxAdFormat> c(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        F();
        if (y.a()) {
            F().b("AppLovinSdk", str);
        }
        G().a((com.applovin.impl.sdk.e.d) new com.applovin.impl.sdk.e.q(this));
    }

    public static /* synthetic */ int h(o oVar) {
        int i10 = oVar.bs + 1;
        oVar.bs = i10;
        return i10;
    }

    public VariableServiceImpl A() {
        if (this.B == null) {
            synchronized (this.C) {
                if (this.B == null) {
                    this.B = new VariableServiceImpl(this);
                }
            }
        }
        return this.B;
    }

    public Activity B() {
        WeakReference<Activity> weakReference = this.f10994h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean C() {
        return this.bq;
    }

    public boolean D() {
        return this.br;
    }

    public a E() {
        return f10982f;
    }

    public y F() {
        if (this.E == null) {
            synchronized (this.F) {
                if (this.E == null) {
                    this.E = new y(this);
                }
            }
        }
        return this.E;
    }

    public com.applovin.impl.sdk.e.r G() {
        if (this.G == null) {
            synchronized (this.H) {
                if (this.G == null) {
                    this.G = new com.applovin.impl.sdk.e.r(this);
                }
            }
        }
        return this.G;
    }

    public com.applovin.impl.sdk.c.c H() {
        if (this.I == null) {
            synchronized (this.J) {
                if (this.I == null) {
                    this.I = new com.applovin.impl.sdk.c.c(this);
                }
            }
        }
        return this.I;
    }

    public com.applovin.impl.sdk.network.b I() {
        if (this.K == null) {
            synchronized (this.L) {
                if (this.K == null) {
                    this.K = new com.applovin.impl.sdk.network.b(this);
                }
            }
        }
        return this.K;
    }

    public com.applovin.impl.sdk.d.g J() {
        if (this.M == null) {
            synchronized (this.N) {
                if (this.M == null) {
                    this.M = new com.applovin.impl.sdk.d.g(this);
                }
            }
        }
        return this.M;
    }

    public p K() {
        if (this.Q == null) {
            synchronized (this.R) {
                if (this.Q == null) {
                    this.Q = new p(this);
                }
            }
        }
        return this.Q;
    }

    public r L() {
        if (aK() && this.O == null) {
            synchronized (this.P) {
                if (this.O == null) {
                    this.O = new r(this);
                }
            }
        }
        return this.O;
    }

    public q M() {
        if (aK() && this.S == null) {
            synchronized (this.T) {
                if (this.S == null) {
                    this.S = new q(this);
                }
            }
        }
        return this.S;
    }

    public com.applovin.impl.sdk.c.e N() {
        if (this.V == null) {
            synchronized (this.W) {
                if (this.V == null) {
                    this.V = new com.applovin.impl.sdk.c.e(this);
                }
            }
        }
        return this.V;
    }

    public n O() {
        if (this.X == null) {
            synchronized (this.Y) {
                if (this.X == null) {
                    this.X = new n(this);
                }
            }
        }
        return this.X;
    }

    public com.applovin.impl.sdk.utils.v P() {
        if (this.Z == null) {
            synchronized (this.f10983aa) {
                if (this.Z == null) {
                    this.Z = new com.applovin.impl.sdk.utils.v(this);
                }
            }
        }
        return this.Z;
    }

    public d Q() {
        if (this.f10984ab == null) {
            synchronized (this.f10985ac) {
                if (this.f10984ab == null) {
                    this.f10984ab = new d(this);
                }
            }
        }
        return this.f10984ab;
    }

    public b R() {
        if (this.f10986ad == null) {
            synchronized (this.f10987ae) {
                if (this.f10986ad == null) {
                    this.f10986ad = new b(this);
                }
            }
        }
        return this.f10986ad;
    }

    public u S() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new u(this);
                }
            }
        }
        return this.af;
    }

    public com.applovin.impl.sdk.d.c T() {
        if (this.ah == null) {
            synchronized (this.ai) {
                if (this.ah == null) {
                    this.ah = new com.applovin.impl.sdk.d.c(this);
                }
            }
        }
        return this.ah;
    }

    public SessionTracker U() {
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = new SessionTracker(this);
                }
            }
        }
        return this.aj;
    }

    public v V() {
        if (this.al == null) {
            synchronized (this.am) {
                if (this.al == null) {
                    this.al = new v(this);
                }
            }
        }
        return this.al;
    }

    public ae W() {
        if (this.an == null) {
            synchronized (this.ao) {
                if (this.an == null) {
                    this.an = new ae(this);
                }
            }
        }
        return this.an;
    }

    public l X() {
        if (this.ar == null) {
            synchronized (this.as) {
                if (this.ar == null) {
                    this.ar = new l(this);
                }
            }
        }
        return this.ar;
    }

    public com.applovin.impl.sdk.utils.s Y() {
        if (this.at == null) {
            synchronized (this.au) {
                if (this.at == null) {
                    this.at = new com.applovin.impl.sdk.utils.s(this);
                }
            }
        }
        return this.at;
    }

    public j Z() {
        if (this.av == null) {
            synchronized (this.aw) {
                if (this.av == null) {
                    this.av = new j(this);
                }
            }
        }
        return this.av;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return (T) H().a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return (T) b(dVar, (Object) null);
    }

    public <T> T a(String str, T t10, Class<?> cls, SharedPreferences sharedPreferences) {
        return (T) com.applovin.impl.sdk.c.e.a(str, t10, cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.bk) {
            if (!this.bn && !this.bo) {
                b();
            }
        }
    }

    public void a(long j10) {
        O().a(j10);
    }

    public void a(SharedPreferences sharedPreferences) {
        N().a(sharedPreferences);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (G().a()) {
            return;
        }
        List<String> listB = b(com.applovin.impl.sdk.c.a.f10314a);
        if (listB.size() <= 0 || !al().b().keySet().containsAll(listB)) {
            return;
        }
        F();
        if (y.a()) {
            F().b("AppLovinSdk", "All required adapters initialized");
        }
        G().e();
        l();
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        N().a(dVar, t10);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        N().a(dVar, t10, sharedPreferences);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.bv = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.o.1
                @Override // java.lang.Runnable
                public void run() {
                    sdkInitializationListener.onSdkInitialized(o.this.bx);
                }
            });
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.D = appLovinSdk;
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f10993g = str;
        this.f10995i = System.currentTimeMillis();
        this.bn = true;
        this.f11000n = appLovinSdkSettings;
        this.f11001o = new i();
        this.f11002p = new AppLovinTargetingDataImpl();
        this.bx = new SdkConfigurationImpl(null, this);
        f10979c = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f10994h = new WeakReference<>((Activity) context);
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(str)) {
            this.f10996j = true;
            f10978b = this;
        } else if (f10977a == null) {
            f10977a = this;
        } else {
            y.j("AppLovinSdk", "Multiple SDK instances detected");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.applovin.sdk.1", 0);
        StringBuilder sbA = defpackage.a.a("com.applovin.sdk.");
        sbA.append(com.applovin.impl.sdk.utils.w.a(str));
        sbA.append(".lisvib");
        boolean z10 = sharedPreferences.getBoolean(sbA.toString(), false);
        this.f10999m = z10;
        if (z10) {
            com.applovin.impl.sdk.utils.w.a(new Runnable() { // from class: com.applovin.impl.sdk.o.7
                @Override // java.lang.Runnable
                public void run() {
                    o.this.aF();
                }
            });
        } else {
            aE();
            aF();
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public <T> void a(String str, T t10, SharedPreferences.Editor editor) {
        N().a(str, t10, editor);
    }

    public void a(Map<String, List<?>> map) {
        ap().a(map);
    }

    public void a(boolean z10) {
        synchronized (this.bk) {
            this.bn = false;
            this.bo = z10;
        }
        if (z10) {
            List<String> listB = b(com.applovin.impl.sdk.c.a.f10314a);
            if (listB.isEmpty()) {
                G().e();
                l();
                return;
            }
            long jLongValue = ((Long) a(com.applovin.impl.sdk.c.a.f10317b)).longValue();
            com.applovin.impl.sdk.e.ac acVar = new com.applovin.impl.sdk.e.ac(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.o.11
                @Override // java.lang.Runnable
                public void run() {
                    if (o.this.G().a()) {
                        return;
                    }
                    o.this.F();
                    if (y.a()) {
                        o.this.F().b("AppLovinSdk", "Timing out adapters init...");
                    }
                    o.this.G().e();
                    o.this.l();
                }
            });
            F();
            if (y.a()) {
                F().b("AppLovinSdk", "Waiting for required adapters to init: " + listB + " - timing out in " + jLongValue + "ms...");
            }
            G().a(acVar, com.applovin.impl.sdk.e.r.b.MEDIATION_TIMEOUT, jLongValue, true);
        }
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.bj;
        return (list == null || list.size() <= 0 || this.bj.contains(maxAdFormat)) ? false : true;
    }

    public AppLovinSdk aA() {
        return this.D;
    }

    public boolean aB() {
        return this.bp;
    }

    public String aC() {
        return this.bu;
    }

    public AppLovinSdkConfiguration aD() {
        return this.bx;
    }

    public com.applovin.impl.b.a.b aa() {
        if (this.ax == null) {
            synchronized (this.ay) {
                if (this.ax == null) {
                    this.ax = new com.applovin.impl.b.a.b(this);
                }
            }
        }
        return this.ax;
    }

    public com.applovin.impl.b.b.a ab() {
        if (this.az == null) {
            synchronized (this.aA) {
                if (this.az == null) {
                    this.az = new com.applovin.impl.b.b.a(this);
                }
            }
        }
        return this.az;
    }

    public com.applovin.impl.a.a.a ac() {
        if (this.aB == null) {
            synchronized (this.aC) {
                if (this.aB == null) {
                    this.aB = new com.applovin.impl.a.a.a(this);
                }
            }
        }
        return this.aB;
    }

    public com.applovin.impl.sdk.a.f ad() {
        if (this.aD == null) {
            synchronized (this.aE) {
                if (this.aD == null) {
                    this.aD = new com.applovin.impl.sdk.a.f(this);
                }
            }
        }
        return this.aD;
    }

    public x ae() {
        if (this.aF == null) {
            synchronized (this.aG) {
                if (this.aF == null) {
                    this.aF = new x(this);
                }
            }
        }
        return this.aF;
    }

    public ArrayService af() {
        if (this.aH == null) {
            synchronized (this.aI) {
                if (this.aH == null) {
                    this.aH = new ArrayService(this);
                }
            }
        }
        return this.aH;
    }

    public s ag() {
        if (this.aJ == null) {
            synchronized (this.aK) {
                if (this.aJ == null) {
                    this.aJ = new s(this);
                }
            }
        }
        return this.aJ;
    }

    public PostbackServiceImpl ah() {
        if (this.aL == null) {
            synchronized (this.aM) {
                if (this.aL == null) {
                    this.aL = new PostbackServiceImpl(this);
                }
            }
        }
        return this.aL;
    }

    public com.applovin.impl.sdk.network.k ai() {
        if (this.aN == null) {
            synchronized (this.aO) {
                if (this.aN == null) {
                    this.aN = ((Boolean) a(com.applovin.impl.sdk.c.b.dq)).booleanValue() || Boolean.parseBoolean(this.f11000n.getExtraParameters().get(AppLovinSdkExtraParameterKey.USE_NEW_POSTBACK_MANAGER)) ? new com.applovin.impl.sdk.network.g(this) : new com.applovin.impl.sdk.network.f(this);
                }
            }
        }
        return this.aN;
    }

    public f aj() {
        if (this.aP == null) {
            synchronized (this.aQ) {
                if (this.aP == null) {
                    this.aP = new f(this);
                }
            }
        }
        return this.aP;
    }

    public com.applovin.impl.mediation.f ak() {
        if (this.aR == null) {
            synchronized (this.aS) {
                if (this.aR == null) {
                    this.aR = new com.applovin.impl.mediation.f(this);
                }
            }
        }
        return this.aR;
    }

    public com.applovin.impl.mediation.e al() {
        if (this.aT == null) {
            synchronized (this.aU) {
                if (this.aT == null) {
                    this.aT = new com.applovin.impl.mediation.e(this);
                }
            }
        }
        return this.aT;
    }

    public MediationServiceImpl am() {
        if (this.aV == null) {
            synchronized (this.aW) {
                if (this.aV == null) {
                    this.aV = new MediationServiceImpl(this);
                }
            }
        }
        return this.aV;
    }

    public com.applovin.mediation.hybridAds.d an() {
        if (this.aX == null) {
            synchronized (this.aY) {
                if (this.aX == null) {
                    this.aX = new com.applovin.mediation.hybridAds.d(this);
                }
            }
        }
        return this.aX;
    }

    public com.applovin.impl.mediation.h ao() {
        if (this.aZ == null) {
            synchronized (this.f10988ba) {
                if (this.aZ == null) {
                    this.aZ = new com.applovin.impl.mediation.h();
                }
            }
        }
        return this.aZ;
    }

    public com.applovin.impl.mediation.debugger.b ap() {
        if (this.f10989bb == null) {
            synchronized (this.f10990bc) {
                if (this.f10989bb == null) {
                    this.f10989bb = new com.applovin.impl.mediation.debugger.b(this);
                }
            }
        }
        return this.f10989bb;
    }

    public z aq() {
        if (this.f10991bd == null) {
            synchronized (this.f10992be) {
                if (this.f10991bd == null) {
                    this.f10991bd = new z(this);
                }
            }
        }
        return this.f10991bd;
    }

    public com.applovin.impl.mediation.d ar() {
        if (this.bf == null) {
            synchronized (this.bg) {
                if (this.bf == null) {
                    this.bf = new com.applovin.impl.mediation.d(this);
                }
            }
        }
        return this.bf;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.c as() {
        if (this.bh == null) {
            synchronized (this.bi) {
                if (this.bh == null) {
                    this.bh = new com.applovin.impl.mediation.debugger.ui.testmode.c(this);
                }
            }
        }
        return this.bh;
    }

    public Activity at() {
        Activity activityA = a(au()).a();
        return activityA != null ? activityA : B();
    }

    public String ax() {
        return this.f10993g;
    }

    public AppLovinSdkSettings ay() {
        return this.f11000n;
    }

    public AppLovinUserSegment az() {
        return this.f11001o;
    }

    public com.applovin.impl.sdk.network.d b(Context context) {
        if (this.ap == null) {
            synchronized (this.aq) {
                if (this.ap == null) {
                    this.ap = new com.applovin.impl.sdk.network.d(context);
                }
            }
        }
        return this.ap;
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10) {
        return (T) N().b(dVar, t10);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t10, SharedPreferences sharedPreferences) {
        return (T) N().b(dVar, t10, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return H().b(bVar);
    }

    public void b() {
        synchronized (this.bk) {
            this.bn = true;
            G().d();
            aG();
        }
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        N().a(dVar);
    }

    public void b(final String str) {
        y.f("AppLovinSdk", "Setting plugin version: " + str);
        if (com.applovin.impl.sdk.utils.w.b() && this.f10999m) {
            com.applovin.impl.sdk.utils.w.a(new Runnable() { // from class: com.applovin.impl.sdk.o.4
                @Override // java.lang.Runnable
                public void run() {
                    o.this.H().a(com.applovin.impl.sdk.c.b.eo, str);
                }
            });
        } else {
            H().a(com.applovin.impl.sdk.c.b.eo, str);
        }
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return H().c(bVar);
    }

    public void c(final String str) {
        F();
        if (y.a()) {
            com.applovin.impl.adview.a0.a("Setting user id: ", str, F(), "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > com.applovin.impl.sdk.utils.w.a(8)) {
            StringBuilder sbA = defpackage.a.a("Provided user id longer than supported (");
            sbA.append(str.length());
            sbA.append(" bytes, ");
            sbA.append(com.applovin.impl.sdk.utils.w.a(8));
            sbA.append(" maximum)");
            y.j("AppLovinSdk", sbA.toString());
        }
        if (com.applovin.impl.sdk.utils.w.b() && this.f10999m) {
            com.applovin.impl.sdk.utils.w.a(new Runnable() { // from class: com.applovin.impl.sdk.o.5
                @Override // java.lang.Runnable
                public void run() {
                    o.this.P().a(str);
                }
            });
        } else {
            P().a(str);
        }
    }

    public boolean c() {
        boolean z10;
        synchronized (this.bk) {
            z10 = this.bn;
        }
        return z10;
    }

    public void d(String str) {
        this.f11003q = str;
        if (com.applovin.impl.sdk.utils.w.b() && this.f10999m) {
            com.applovin.impl.sdk.utils.w.a(new Runnable() { // from class: com.applovin.impl.sdk.o.6
                @Override // java.lang.Runnable
                public void run() {
                    o.this.b(com.applovin.impl.sdk.c.d.O);
                }
            });
        } else {
            b(com.applovin.impl.sdk.c.d.O);
        }
    }

    public boolean d() {
        boolean z10;
        synchronized (this.bk) {
            z10 = this.bo;
        }
        return z10;
    }

    public boolean e() {
        return this.f10996j;
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(u(), AppLovinMediationProvider.MAX);
    }

    public boolean g() {
        return com.applovin.impl.sdk.utils.w.b("com.unity3d.player.UnityPlayerActivity");
    }

    public boolean h() {
        Map<String, String> extraParameters = ay().getExtraParameters();
        if (!extraParameters.containsKey("eifc")) {
            return false;
        }
        boolean zEquals = "iOf8gUDWef".equals(extraParameters.get("eifc"));
        if (!zEquals) {
            y.j("AppLovinSdk", "Invalid internal features code. Please contact your account manager to get the code.");
        }
        return zEquals;
    }

    public void i() {
        if (StringUtils.isValidString(this.bu)) {
            return;
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (com.applovin.impl.sdk.utils.w.b() && this.f10999m) {
            com.applovin.impl.sdk.utils.w.a(new Runnable() { // from class: com.applovin.impl.sdk.o.14
                @Override // java.lang.Runnable
                public void run() {
                    o.this.a(stackTrace);
                }
            });
        } else {
            a(stackTrace);
        }
    }

    public void j() {
        String str = (String) N().b(com.applovin.impl.sdk.c.d.f10388f, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < com.applovin.impl.sdk.utils.w.d(str)) {
                y.j("AppLovinSdk", w0.a.a(defpackage.a.a("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public void k() {
        X().a();
    }

    public void l() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((aa().h() && aa().c() == com.applovin.impl.b.a.c.a.UNIFIED) || (sdkInitializationListener = this.bv) == null) {
            return;
        }
        if (d()) {
            this.bv = null;
            this.bw = null;
            al().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.bw == sdkInitializationListener) {
                return;
            }
            al().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(com.applovin.impl.sdk.c.b.aq)).booleanValue()) {
                this.bv = null;
            } else {
                this.bw = sdkInitializationListener;
            }
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o.2
            @Override // java.lang.Runnable
            public void run() {
                o.this.F();
                if (y.a()) {
                    o.this.F().b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                }
                sdkInitializationListener.onSdkInitialized(o.this.bx);
            }
        }, Math.max(0L, ((Long) a(com.applovin.impl.sdk.c.b.ar)).longValue()));
    }

    public void m() {
        y.j("AppLovinSdk", "Resetting SDK state...");
        com.applovin.impl.sdk.d.g gVarJ = J();
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f10471i;
        long jB = gVarJ.b(fVar);
        H().c();
        H().a();
        J().a();
        J().b(fVar, jB + 1);
        if (this.bl.compareAndSet(true, false)) {
            b();
        } else {
            this.bl.set(true);
        }
    }

    public void n() {
        a((Map<String, List<?>>) null);
    }

    public void o() {
        ac().c();
    }

    public long p() {
        if (this.f10997k == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f10997k;
    }

    public String q() {
        return P().a();
    }

    public String r() {
        return P().b();
    }

    public String s() {
        return P().c();
    }

    public AppLovinTargetingDataImpl t() {
        return (AppLovinTargetingDataImpl) this.f11002p;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CoreSdk{sdkKey='");
        l1.c.a(sbA, this.f10993g, CoreConstants.SINGLE_QUOTE_CHAR, ", enabled=");
        sbA.append(this.bo);
        sbA.append(", isFirstSession=");
        return androidx.recyclerview.widget.s.a(sbA, this.bp, '}');
    }

    public String u() {
        String str = (String) a(com.applovin.impl.sdk.c.d.O);
        return StringUtils.isValidString(str) ? str : this.f11003q;
    }

    public AppLovinAdServiceImpl v() {
        if (this.f11004r == null) {
            synchronized (this.f11005s) {
                if (this.f11004r == null) {
                    this.f11004r = new AppLovinAdServiceImpl(this);
                }
            }
        }
        return this.f11004r;
    }

    public AppLovinNativeAdService w() {
        if (this.f11006t == null) {
            synchronized (this.f11007u) {
                if (this.f11006t == null) {
                    this.f11006t = new AppLovinNativeAdService(this);
                }
            }
        }
        return this.f11006t;
    }

    public EventServiceImpl x() {
        if (this.f11008v == null) {
            synchronized (this.f11009w) {
                if (this.f11008v == null) {
                    this.f11008v = new EventServiceImpl(this);
                }
            }
        }
        return this.f11008v;
    }

    public UserServiceImpl y() {
        if (this.f11010x == null) {
            synchronized (this.f11011y) {
                if (this.f11010x == null) {
                    this.f11010x = new UserServiceImpl(this);
                }
            }
        }
        return this.f11010x;
    }

    public AppLovinCFService z() {
        if (this.f11012z == null) {
            synchronized (this.A) {
                if (this.f11012z == null) {
                    this.f11012z = new h(this);
                }
            }
        }
        return this.f11012z;
    }
}
