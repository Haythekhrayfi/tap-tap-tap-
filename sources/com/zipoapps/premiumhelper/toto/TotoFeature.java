package com.zipoapps.premiumhelper.toto;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.activity.i;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import defpackage.a;
import fd.j0;
import gb.x;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import jc.e;
import jc.w;
import ma.f;
import mc.d;
import oa.b;
import oc.c;
import oc.h;
import okhttp3.Headers;
import uc.l;
import ue.z;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature {
    private final b configuration;
    private final Context context;
    private ResponseStats getConfigResponseStats;
    private final f preferences;
    private final e service$delegate;
    private final e serviceConfig$delegate;
    private final e userAgent$delegate;

    public static final class ResponseStats {
        private final String code;
        private final long latency;

        public ResponseStats(String str, long j10) {
            j0.i(str, "code");
            this.code = str;
            this.latency = j10;
        }

        public static /* synthetic */ ResponseStats copy$default(ResponseStats responseStats, String str, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = responseStats.code;
            }
            if ((i10 & 2) != 0) {
                j10 = responseStats.latency;
            }
            return responseStats.copy(str, j10);
        }

        public final String component1() {
            return this.code;
        }

        public final long component2() {
            return this.latency;
        }

        public final ResponseStats copy(String str, long j10) {
            j0.i(str, "code");
            return new ResponseStats(str, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseStats)) {
                return false;
            }
            ResponseStats responseStats = (ResponseStats) obj;
            return j0.d(this.code, responseStats.code) && this.latency == responseStats.latency;
        }

        public final String getCode() {
            return this.code;
        }

        public final long getLatency() {
            return this.latency;
        }

        public int hashCode() {
            return Long.hashCode(this.latency) + (this.code.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = a.a("ResponseStats(code=");
            sbA.append(this.code);
            sbA.append(", latency=");
            return o2.a.a(sbA, this.latency, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class TotoResponse<T> {
        private final ResponseStats responseStats;
        private final x<z<T>> result;

        public TotoResponse(x<z<T>> xVar, ResponseStats responseStats) {
            j0.i(xVar, "result");
            j0.i(responseStats, "responseStats");
            this.result = xVar;
            this.responseStats = responseStats;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TotoResponse copy$default(TotoResponse totoResponse, x xVar, ResponseStats responseStats, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = totoResponse.result;
            }
            if ((i10 & 2) != 0) {
                responseStats = totoResponse.responseStats;
            }
            return totoResponse.copy(xVar, responseStats);
        }

        public final x<z<T>> component1() {
            return this.result;
        }

        public final ResponseStats component2() {
            return this.responseStats;
        }

        public final TotoResponse<T> copy(x<z<T>> xVar, ResponseStats responseStats) {
            j0.i(xVar, "result");
            j0.i(responseStats, "responseStats");
            return new TotoResponse<>(xVar, responseStats);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotoResponse)) {
                return false;
            }
            TotoResponse totoResponse = (TotoResponse) obj;
            return j0.d(this.result, totoResponse.result) && j0.d(this.responseStats, totoResponse.responseStats);
        }

        public final ResponseStats getResponseStats() {
            return this.responseStats;
        }

        public final x<z<T>> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.responseStats.hashCode() + (this.result.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = a.a("TotoResponse(result=");
            sbA.append(this.result);
            sbA.append(", responseStats=");
            sbA.append(this.responseStats);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$callApi$1, reason: invalid class name */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {47}, m = "callApi")
    public static final class AnonymousClass1<T> extends c {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoFeature.this.callApi(null, this);
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1, reason: invalid class name and case insensitive filesystem */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {72, 79}, m = "callApiWithRetry")
    public static final class C21471<T> extends c {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C21471(d<? super C21471> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoFeature.this.callApiWithRetry(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$getConfig$1, reason: invalid class name and case insensitive filesystem */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {84}, m = "getConfig")
    public static final class C21481 extends c {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C21481(d<? super C21481> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoFeature.this.getConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$getConfig$2, reason: invalid class name */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature$getConfig$2", f = "TotoFeature.kt", l = {84}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends h implements l<d<? super z<Map<String, ? extends Map<String, ? extends Integer>>>>, Object> {
        public int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(1, dVar);
        }

        @Override // oc.a
        public final d<w> create(d<?> dVar) {
            return TotoFeature.this.new AnonymousClass2(dVar);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ Object invoke(d<? super z<Map<String, ? extends Map<String, ? extends Integer>>>> dVar) {
            return invoke2((d<? super z<Map<String, Map<String, Integer>>>>) dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(d<? super z<Map<String, Map<String, Integer>>>> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                h9.d.t(obj);
                TotoService.TotoServiceApi service = TotoFeature.this.getService();
                String packageName = TotoFeature.this.context.getPackageName();
                j0.h(packageName, "context.packageName");
                String userAgent = TotoFeature.this.getUserAgent();
                this.label = 1;
                obj = service.getConfig(packageName, userAgent, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$postConfig$1, reason: invalid class name and case insensitive filesystem */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {130, 138}, m = "postConfig")
    public static final class C21491 extends c {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C21491(d<? super C21491> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoFeature.this.postConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoFeature$registerFcmToken$1, reason: invalid class name and case insensitive filesystem */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoFeature", f = "TotoFeature.kt", l = {159, 165}, m = "registerFcmToken")
    public static final class C21501 extends c {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C21501(d<? super C21501> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoFeature.this.registerFcmToken(null, this);
        }
    }

    public TotoFeature(Context context, b bVar, f fVar) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bVar, "configuration");
        j0.i(fVar, "preferences");
        this.context = context;
        this.configuration = bVar;
        this.preferences = fVar;
        this.userAgent$delegate = jc.f.b(new TotoFeature$userAgent$2(this));
        this.serviceConfig$delegate = jc.f.b(new TotoFeature$serviceConfig$2(this));
        this.service$delegate = jc.f.b(new TotoFeature$service$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x006f, B:26:0x007a), top: B:43:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x006f, B:26:0x007a), top: B:43:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object callApi(l<? super d<? super z<T>>, ? extends Object> lVar, d<? super TotoResponse<T>> dVar) {
        AnonymousClass1 anonymousClass1;
        long jCurrentTimeMillis;
        Exception e10;
        TotoFeature totoFeature;
        NetworkInfo activeNetworkInfo;
        boolean zIsConnected;
        ResponseStats responseStats;
        String message;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objInvoke = anonymousClass1.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = anonymousClass1.J$0;
            totoFeature = (TotoFeature) anonymousClass1.L$0;
            try {
                h9.d.t(objInvoke);
                z zVar = (z) objInvoke;
                ResponseStats responseStats2 = new ResponseStats(String.valueOf(zVar.a()), zVar.f36543a.receivedResponseAtMillis() - zVar.f36543a.sentRequestAtMillis());
                return zVar.b() ? new TotoResponse(new x.c(zVar), responseStats2) : new TotoResponse(new x.b(new ue.h(zVar)), responseStats2);
            } catch (Exception e11) {
                e10 = e11;
                jCurrentTimeMillis = j10;
                Context context = totoFeature.context;
                j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                Object systemService = context.getSystemService("connectivity");
                j0.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    zIsConnected = activeNetworkInfo.isConnected();
                } else {
                    zIsConnected = false;
                }
                if (zIsConnected) {
                    message = e10.getMessage();
                    if (message == null) {
                        message = "Unknown exception";
                    }
                    responseStats = new ResponseStats(message, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    responseStats = new ResponseStats("No connection", System.currentTimeMillis() - jCurrentTimeMillis);
                }
                return new TotoResponse(new x.b(e10), responseStats);
            }
        }
        h9.d.t(objInvoke);
        jCurrentTimeMillis = System.currentTimeMillis();
        try {
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = jCurrentTimeMillis;
            anonymousClass1.label = 1;
            objInvoke = lVar.invoke(anonymousClass1);
            if (objInvoke == aVar) {
                return aVar;
            }
            z zVar2 = (z) objInvoke;
            ResponseStats responseStats3 = new ResponseStats(String.valueOf(zVar2.a()), zVar2.f36543a.receivedResponseAtMillis() - zVar2.f36543a.sentRequestAtMillis());
            if (zVar2.b()) {
            }
        } catch (Exception e12) {
            e10 = e12;
            totoFeature = this;
            Context context2 = totoFeature.context;
            j0.i(context2, CoreConstants.CONTEXT_SCOPE_VALUE);
            Object systemService2 = context2.getSystemService("connectivity");
            j0.g(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                zIsConnected = activeNetworkInfo.isConnected();
            } else {
                zIsConnected = false;
            }
            if (zIsConnected) {
                message = e10.getMessage();
                if (message == null) {
                    message = "Unknown exception";
                }
                responseStats = new ResponseStats(message, System.currentTimeMillis() - jCurrentTimeMillis);
            } else {
                responseStats = new ResponseStats("No connection", System.currentTimeMillis() - jCurrentTimeMillis);
            }
            return new TotoResponse(new x.b(e10), responseStats);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final <T> java.lang.Object callApiWithRetry(int r9, uc.l<? super mc.d<? super ue.z<T>>, ? extends java.lang.Object> r10, mc.d<? super com.zipoapps.premiumhelper.toto.TotoFeature.TotoResponse<T>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zipoapps.premiumhelper.toto.TotoFeature.C21471
            if (r0 == 0) goto L13
            r0 = r11
            com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1 r0 = (com.zipoapps.premiumhelper.toto.TotoFeature.C21471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1 r0 = new com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            nc.a r1 = nc.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            h9.d.t(r11)
            goto L7f
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            uc.l r2 = (uc.l) r2
            java.lang.Object r5 = r0.L$0
            com.zipoapps.premiumhelper.toto.TotoFeature r5 = (com.zipoapps.premiumhelper.toto.TotoFeature) r5
            h9.d.t(r11)
            goto L61
        L42:
            h9.d.t(r11)
            r11 = 0
            r5 = r8
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4b:
            if (r9 >= r10) goto L71
            r0.L$0 = r5
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.label = r4
            java.lang.Object r2 = r5.callApi(r11, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r7 = r2
            r2 = r11
            r11 = r7
        L61:
            com.zipoapps.premiumhelper.toto.TotoFeature$TotoResponse r11 = (com.zipoapps.premiumhelper.toto.TotoFeature.TotoResponse) r11
            gb.x r6 = r11.getResult()
            boolean r6 = y8.c0.x(r6)
            if (r6 == 0) goto L6e
            return r11
        L6e:
            int r9 = r9 + r4
            r11 = r2
            goto L4b
        L71:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r11 = r5.callApi(r11, r0)
            if (r11 != r1) goto L7f
            return r1
        L7f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.callApiWithRetry(int, uc.l, mc.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TotoService.TotoServiceApi getService() {
        return (TotoService.TotoServiceApi) this.service$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TotoService.ServiceConfig getServiceConfig() {
        return (TotoService.ServiceConfig) this.serviceConfig$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserAgent() {
        return (String) this.userAgent$delegate.getValue();
    }

    public static /* synthetic */ void scheduleRegister$default(TotoFeature totoFeature, boolean z10, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        totoFeature.scheduleRegister(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getConfig(d<? super x<? extends Object>> dVar) {
        C21481 c21481;
        TotoFeature totoFeature;
        String str;
        Headers headers;
        if (dVar instanceof C21481) {
            c21481 = (C21481) dVar;
            int i10 = c21481.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21481.label = i10 - Integer.MIN_VALUE;
            } else {
                c21481 = new C21481(dVar);
            }
        } else {
            c21481 = new C21481(dVar);
        }
        Object objCallApiWithRetry = c21481.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c21481.label;
        if (i11 == 0) {
            h9.d.t(objCallApiWithRetry);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            c21481.L$0 = this;
            c21481.label = 1;
            objCallApiWithRetry = callApiWithRetry(1, anonymousClass2, c21481);
            if (objCallApiWithRetry == aVar) {
                return aVar;
            }
            totoFeature = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            totoFeature = (TotoFeature) c21481.L$0;
            h9.d.t(objCallApiWithRetry);
        }
        TotoResponse totoResponse = (TotoResponse) objCallApiWithRetry;
        ResponseStats responseStats = totoResponse.getResponseStats();
        totoFeature.getConfigResponseStats = responseStats;
        if (responseStats != null) {
            StartupPerformanceTracker.f28309b.a().c(responseStats.getCode());
        }
        x result = totoResponse.getResult();
        c0.D(result, new TotoFeature$getConfig$3$2(totoFeature));
        c0.C(result, new TotoFeature$getConfig$3$3(totoFeature));
        com.zipoapps.premiumhelper.a aVar2 = ma.h.f33410y.a().f33419h;
        ResponseStats responseStats2 = totoResponse.getResponseStats();
        z zVar = (z) c0.m(totoResponse.getResult());
        if (zVar == null || (headers = zVar.f36543a.headers()) == null || (str = headers.get("x-cache")) == null) {
            str = "";
        }
        Objects.requireNonNull(aVar2);
        j0.i(responseStats2, "responseStats");
        aVar2.t("TotoGetConfig", i.a(new jc.h("splash_timeout", String.valueOf(aVar2.f28257e)), new jc.h("toto_response_code", responseStats2.getCode()), new jc.h("toto_latency", Long.valueOf(responseStats2.getLatency())), new jc.h("x_cache", str)));
        return totoResponse.getResult();
    }

    public final ResponseStats getGetConfigResponseStats() {
        return this.getConfigResponseStats;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object postConfig(d<? super x<? extends Object>> dVar) {
        C21491 c21491;
        String strA;
        long jI;
        String strL;
        TotoFeature totoFeature;
        Map map;
        TotoFeature totoFeature2;
        TotoResponse totoResponse;
        if (dVar instanceof C21491) {
            c21491 = (C21491) dVar;
            int i10 = c21491.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21491.label = i10 - Integer.MIN_VALUE;
            } else {
                c21491 = new C21491(dVar);
            }
        } else {
            c21491 = new C21491(dVar);
        }
        Object objA = c21491.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c21491.label;
        if (i11 != 0) {
            if (i11 == 1) {
                jI = c21491.J$0;
                strL = (String) c21491.L$3;
                Map map2 = (Map) c21491.L$2;
                strA = (String) c21491.L$1;
                totoFeature = (TotoFeature) c21491.L$0;
                h9.d.t(objA);
                map = map2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                totoFeature2 = (TotoFeature) c21491.L$0;
                h9.d.t(objA);
            }
            totoResponse = (TotoResponse) objA;
            com.zipoapps.premiumhelper.a aVar2 = ma.h.f33410y.a().f33419h;
            ResponseStats responseStats = totoResponse.getResponseStats();
            Objects.requireNonNull(aVar2);
            j0.i(responseStats, "responseStats");
            aVar2.t("TotoPostConfig", i.a(new jc.h("toto_response_code", responseStats.getCode()), new jc.h("toto_latency", Long.valueOf(responseStats.getLatency()))));
            if (c0.x(totoResponse.getResult())) {
                f fVar = totoFeature2.preferences;
                Objects.requireNonNull(fVar);
                SharedPreferences.Editor editorEdit = fVar.f33405a.edit();
                editorEdit.putBoolean("post_config_sent", true);
                editorEdit.apply();
            }
            return totoResponse.getResult();
        }
        h9.d.t(objA);
        ma.h.a aVar3 = ma.h.f33410y;
        sa.a aVar4 = aVar3.a().f33418g.f34209f;
        Objects.requireNonNull(aVar4);
        strA = oa.a.C0376a.a(aVar4, "x-country", "");
        b bVar = aVar3.a().f33418g;
        Objects.requireNonNull(bVar);
        HashMap map3 = new HashMap();
        Objects.requireNonNull(bVar.f34211h);
        map3.putAll(b.f34177j);
        map3.putAll(bVar.f34210g.c());
        map3.putAll(bVar.f34204a.c());
        map3.putAll(bVar.f34209f.c());
        jI = com.zipoapps.premiumhelper.util.c.i(this.context);
        strL = com.zipoapps.premiumhelper.util.c.l(this.context);
        gb.e eVar = aVar3.a().f33416e;
        c21491.L$0 = this;
        c21491.L$1 = strA;
        c21491.L$2 = map3;
        c21491.L$3 = strL;
        c21491.J$0 = jI;
        c21491.label = 1;
        objA = eVar.a(c21491);
        if (objA == aVar) {
            return aVar;
        }
        totoFeature = this;
        map = map3;
        String str = (String) objA;
        String str2 = Build.MANUFACTURER + ' ' + Build.MODEL;
        StringBuilder sbA = a.a("Android ");
        sbA.append(Build.VERSION.SDK_INT);
        String string = sbA.toString();
        String str3 = Build.VERSION.RELEASE;
        j0.h(str3, "RELEASE");
        String language = Locale.getDefault().getLanguage();
        j0.h(language, "getDefault().language");
        TotoFeature$postConfig$response$1 totoFeature$postConfig$response$1 = new TotoFeature$postConfig$response$1(totoFeature, new TotoService.PostConfigParameters(jI, strL, str, strA, str2, string, str3, language), map, null);
        c21491.L$0 = totoFeature;
        c21491.L$1 = null;
        c21491.L$2 = null;
        c21491.L$3 = null;
        c21491.label = 2;
        objA = totoFeature.callApi(totoFeature$postConfig$response$1, c21491);
        if (objA == aVar) {
            return aVar;
        }
        totoFeature2 = totoFeature;
        totoResponse = (TotoResponse) objA;
        com.zipoapps.premiumhelper.a aVar5 = ma.h.f33410y.a().f33419h;
        ResponseStats responseStats2 = totoResponse.getResponseStats();
        Objects.requireNonNull(aVar5);
        j0.i(responseStats2, "responseStats");
        aVar5.t("TotoPostConfig", i.a(new jc.h("toto_response_code", responseStats2.getCode()), new jc.h("toto_latency", Long.valueOf(responseStats2.getLatency()))));
        if (c0.x(totoResponse.getResult())) {
            f fVar2 = totoFeature2.preferences;
            Objects.requireNonNull(fVar2);
            SharedPreferences.Editor editorEdit2 = fVar2.f33405a.edit();
            editorEdit2.putBoolean("post_config_sent", true);
            editorEdit2.apply();
        }
        return totoResponse.getResult();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0124  */
    /* JADX WARN: Code duplicated, block: B:29:0x012e  */
    /* JADX WARN: Code duplicated, block: B:30:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object registerFcmToken(String str, d<? super Boolean> dVar) {
        C21501 c21501;
        ActivePurchaseInfo activePurchaseInfoG;
        String str2;
        long j10;
        String str3;
        String str4;
        TotoFeature totoFeature;
        TotoResponse totoResponse;
        Exception excJ;
        if (dVar instanceof C21501) {
            c21501 = (C21501) dVar;
            int i10 = c21501.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21501.label = i10 - Integer.MIN_VALUE;
            } else {
                c21501 = new C21501(dVar);
            }
        } else {
            c21501 = new C21501(dVar);
        }
        Object objA = c21501.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c21501.label;
        if (i11 == 0) {
            h9.d.t(objA);
            activePurchaseInfoG = this.preferences.g();
            if (activePurchaseInfoG != null) {
                Context context = this.context;
                j0.g(context, "null cannot be cast to non-null type android.app.Application");
                long jI = com.zipoapps.premiumhelper.util.c.i((Application) context) / ((long) 1000);
                String packageName = ((Application) this.context).getPackageName();
                j0.h(packageName, "context.packageName");
                String strL = com.zipoapps.premiumhelper.util.c.l(this.context);
                gb.e eVar = ma.h.f33410y.a().f33416e;
                c21501.L$0 = this;
                c21501.L$1 = str;
                c21501.L$2 = activePurchaseInfoG;
                c21501.L$3 = packageName;
                c21501.L$4 = strL;
                c21501.J$0 = jI;
                c21501.label = 1;
                objA = eVar.a(c21501);
                if (objA == aVar) {
                    return aVar;
                }
                str2 = strL;
                j10 = jI;
                str3 = packageName;
                str4 = str;
                totoFeature = this;
            } else {
                xe.a.f37601c.b("Register called with no purchase data", new Object[0]);
            }
            return Boolean.TRUE;
        }
        if (i11 == 1) {
            long j11 = c21501.J$0;
            String str5 = (String) c21501.L$4;
            String str6 = (String) c21501.L$3;
            activePurchaseInfoG = (ActivePurchaseInfo) c21501.L$2;
            String str7 = (String) c21501.L$1;
            TotoFeature totoFeature2 = (TotoFeature) c21501.L$0;
            h9.d.t(objA);
            str2 = str5;
            j10 = j11;
            str4 = str7;
            totoFeature = totoFeature2;
            str3 = str6;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objA);
        }
        totoResponse = (TotoResponse) objA;
        com.zipoapps.premiumhelper.a aVar2 = ma.h.f33410y.a().f33419h;
        ResponseStats responseStats = totoResponse.getResponseStats();
        Objects.requireNonNull(aVar2);
        j0.i(responseStats, "responseStats");
        aVar2.t("TotoRegister", i.a(new jc.h("toto_response_code", responseStats.getCode()), new jc.h("toto_latency", Long.valueOf(responseStats.getLatency()))));
        if (!c0.x(totoResponse.getResult())) {
            excJ = c0.j(totoResponse.getResult());
            if (excJ != null) {
                throw excJ;
            }
            throw new IllegalStateException("Empty error".toString());
        }
        return Boolean.TRUE;
        TotoFeature$registerFcmToken$response$1 totoFeature$registerFcmToken$response$1 = new TotoFeature$registerFcmToken$response$1(totoFeature, new TotoService.RegisterRequest(str3, str2, j10, (String) objA, activePurchaseInfoG.getSku(), activePurchaseInfoG.getPurchaseToken(), str4), null);
        c21501.L$0 = null;
        c21501.L$1 = null;
        c21501.L$2 = null;
        c21501.L$3 = null;
        c21501.L$4 = null;
        c21501.label = 2;
        objA = totoFeature.callApi(totoFeature$registerFcmToken$response$1, c21501);
        if (objA == aVar) {
            return aVar;
        }
        totoResponse = (TotoResponse) objA;
        com.zipoapps.premiumhelper.a aVar3 = ma.h.f33410y.a().f33419h;
        ResponseStats responseStats2 = totoResponse.getResponseStats();
        Objects.requireNonNull(aVar3);
        j0.i(responseStats2, "responseStats");
        aVar3.t("TotoRegister", i.a(new jc.h("toto_response_code", responseStats2.getCode()), new jc.h("toto_latency", Long.valueOf(responseStats2.getLatency()))));
        if (!c0.x(totoResponse.getResult())) {
            excJ = c0.j(totoResponse.getResult());
            if (excJ != null) {
                throw excJ;
            }
            throw new IllegalStateException("Empty error".toString());
        }
        return Boolean.TRUE;
    }

    public final void scheduleRegister(boolean z10) throws Throwable {
        if (z10 || !this.preferences.f33405a.getBoolean("is_fcm_registered", false)) {
            TotoRegisterWorker.Companion.schedule$default(TotoRegisterWorker.Companion, this.context, null, 2, null);
        }
    }

    public final void setGetConfigResponseStats(ResponseStats responseStats) {
        this.getConfigResponseStats = responseStats;
    }
}
