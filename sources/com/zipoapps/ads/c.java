package com.zipoapps.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.zipoapps.ads.c.g;
import fd.c0;
import fd.d2;
import fd.f2;
import fd.g0;
import fd.j0;
import fd.m0;
import fd.s0;
import fd.z;
import gb.x;
import java.util.List;
import jc.w;
import l8.o1;
import uc.p;
import vc.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28151h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConsentInformation f28153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConsentForm f28154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final id.n<Boolean> f28155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final id.n<e> f28158g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormError f28160b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public b(String str, FormError formError) {
            this.f28159a = str;
            this.f28160b = formError;
        }

        public /* synthetic */ b(String str, FormError formError, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : formError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j0.d(this.f28159a, bVar.f28159a) && j0.d(this.f28160b, bVar.f28160b);
        }

        public int hashCode() {
            String str = this.f28159a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            FormError formError = this.f28160b;
            return iHashCode + (formError != null ? formError.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ConsentError[ message:{");
            sbA.append(this.f28159a);
            sbA.append("} ErrorCode: ");
            FormError formError = this.f28160b;
            sbA.append(formError != null ? Integer.valueOf(formError.getErrorCode()) : null);
            sbA.append(']');
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.ads.c$c, reason: collision with other inner class name */
    public static final class C0231c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f28161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28162b;

        public C0231c(d dVar, String str) {
            j0.i(dVar, "code");
            this.f28161a = dVar;
            this.f28162b = str;
        }

        public /* synthetic */ C0231c(d dVar, String str, int i10, vc.g gVar) {
            this(dVar, (i10 & 2) != 0 ? null : str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0231c)) {
                return false;
            }
            C0231c c0231c = (C0231c) obj;
            return this.f28161a == c0231c.f28161a && j0.d(this.f28162b, c0231c.f28162b);
        }

        public int hashCode() {
            int iHashCode = this.f28161a.hashCode() * 31;
            String str = this.f28162b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ConsentResult(code=");
            sbA.append(this.f28161a);
            sbA.append(", errorMessage=");
            return s.a.a(sbA, this.f28162b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public enum d {
        RESULT_OK,
        ERROR
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f28163a;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public e(b bVar) {
            this.f28163a = bVar;
        }

        public /* synthetic */ e(b bVar, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && j0.d(this.f28163a, ((e) obj).f28163a);
        }

        public int hashCode() {
            b bVar = this.f28163a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ConsentStatus(error=");
            sbA.append(this.f28163a);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {234}, m = "askForConsentIfRequired")
    public static final class f extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f28166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f28168g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28170i;

        public f(mc.d<? super f> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28168g = obj;
            this.f28170i |= Integer.MIN_VALUE;
            return c.this.a(null, false, null, this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$askForConsentIfRequired$2$1$2", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
    public static final class g extends oc.h implements p<g0, mc.d<? super w>, Object> {
        public g(mc.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return c.this.new g(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            g gVar = c.this.new g(dVar);
            w wVar = w.f31842a;
            gVar.invokeSuspend(wVar);
            return wVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            c cVar = c.this;
            cVar.f28152a.edit().putBoolean("consent_form_was_shown", true).apply();
            cVar.f28156e = true;
            return w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f28172c = new h();

        public h() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$onInitializationFinished$1", f = "PhConsentManager.kt", l = {155}, m = "invokeSuspend")
    public static final class i extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28173c;

        public i(mc.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return c.this.new i(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return c.this.new i(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28173c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.n<Boolean> nVar = c.this.f28155d;
                Boolean bool = Boolean.TRUE;
                this.f28173c = 1;
                if (nVar.emit(bool, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$prepareConsentInfo$1", f = "PhConsentManager.kt", l = {91}, m = "invokeSuspend")
    public static final class j extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28175c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f28177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f28178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f28179g;

        @oc.e(c = "com.zipoapps.ads.PhConsentManager$prepareConsentInfo$1$2$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
        public static final class a extends oc.h implements p<g0, mc.d<? super w>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f28180c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AppCompatActivity f28181d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f28182e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ uc.a<w> f28183f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a0<uc.a<w>> f28184g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, AppCompatActivity appCompatActivity, e eVar, uc.a<w> aVar, a0<uc.a<w>> a0Var, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f28180c = cVar;
                this.f28181d = appCompatActivity;
                this.f28182e = eVar;
                this.f28183f = aVar;
                this.f28184g = a0Var;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f28180c, this.f28181d, this.f28182e, this.f28183f, this.f28184g, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
                a aVar = new a(this.f28180c, this.f28181d, this.f28182e, this.f28183f, this.f28184g, dVar);
                w wVar = w.f31842a;
                aVar.invokeSuspend(wVar);
                return wVar;
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                w wVar;
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                h9.d.t(obj);
                c cVar = this.f28180c;
                AppCompatActivity appCompatActivity = this.f28181d;
                e eVar = this.f28182e;
                uc.a<w> aVar2 = this.f28183f;
                uc.a<w> aVar3 = this.f28184g.f36988c;
                ConsentInformation consentInformation = cVar.f28153b;
                if (consentInformation != null) {
                    UserMessagingPlatform.loadConsentForm(appCompatActivity, new o1(consentInformation, cVar, eVar, aVar2, aVar3), new com.applovin.exoplayer2.a.e(eVar, cVar));
                    wVar = w.f31842a;
                } else {
                    wVar = null;
                }
                if (wVar == null) {
                    cVar.f28157f = false;
                    xe.a.b(c.f28151h).b("loadForm()-> Consent info is missing. Should never happen", new Object[0]);
                }
                return w.f31842a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AppCompatActivity appCompatActivity, uc.a<w> aVar, uc.a<w> aVar2, mc.d<? super j> dVar) {
            super(2, dVar);
            this.f28177e = appCompatActivity;
            this.f28178f = aVar;
            this.f28179g = aVar2;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return c.this.new j(this.f28177e, this.f28178f, this.f28179g, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return c.this.new j(this.f28177e, this.f28178f, this.f28179g, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            String string;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28175c;
            if (i10 == 0) {
                h9.d.t(obj);
                c cVar = c.this;
                cVar.f28157f = true;
                id.n<e> nVar = cVar.f28158g;
                this.f28175c = 1;
                if (nVar.emit(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            ConsentRequestParameters.Builder tagForUnderAgeOfConsent = new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false);
            ma.h.a aVar2 = ma.h.f33410y;
            if (aVar2.a().k()) {
                ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(this.f28177e);
                builder.setDebugGeography(1);
                Bundle debugData = aVar2.a().f33418g.f34205b.getDebugData();
                if (debugData != null && (string = debugData.getString("consent_device_id")) != null) {
                    builder.addTestDeviceHashedId(string);
                    xe.a.f37601c.a("Adding test device hash id: " + string, new Object[0]);
                }
                tagForUnderAgeOfConsent.setConsentDebugSettings(builder.build());
            }
            final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.f28177e);
            final AppCompatActivity appCompatActivity = this.f28177e;
            final c cVar2 = c.this;
            final uc.a<w> aVar3 = this.f28178f;
            final uc.a<w> aVar4 = this.f28179g;
            final e eVar = new e(null);
            consentInformation.requestConsentInfoUpdate(appCompatActivity, tagForUnderAgeOfConsent.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: fa.q
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [T, uc.a] */
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    com.zipoapps.ads.c cVar3 = cVar2;
                    ConsentInformation consentInformation2 = consentInformation;
                    ?? r10 = aVar3;
                    com.zipoapps.ads.c.e eVar2 = eVar;
                    AppCompatActivity appCompatActivity2 = appCompatActivity;
                    uc.a aVar5 = aVar4;
                    cVar3.f28153b = consentInformation2;
                    FormError formError = null;
                    Object[] objArr = 0;
                    if (!consentInformation2.isConsentFormAvailable()) {
                        xe.a.b(com.zipoapps.ads.c.f28151h).a("No consent form available", new Object[0]);
                        eVar2.f28163a = new com.zipoapps.ads.c.b("No consent form available", formError, 2, objArr == true ? 1 : 0);
                        cVar3.f(eVar2);
                        cVar3.f28157f = false;
                        cVar3.d();
                        if (r10 != 0) {
                            r10.invoke();
                            return;
                        }
                        return;
                    }
                    a0 a0Var = new a0();
                    a0Var.f36988c = r10;
                    if (consentInformation2.getConsentStatus() == 3 || consentInformation2.getConsentStatus() == 1) {
                        xe.a.c cVarB = xe.a.b(com.zipoapps.ads.c.f28151h);
                        StringBuilder sbA = defpackage.a.a("Current status doesn't require consent: ");
                        sbA.append(consentInformation2.getConsentStatus());
                        cVarB.a(sbA.toString(), new Object[0]);
                        if (r10 != 0) {
                            r10.invoke();
                        }
                        cVar3.d();
                        a0Var.f36988c = null;
                    } else {
                        xe.a.b(com.zipoapps.ads.c.f28151h).a("Consent is required", new Object[0]);
                    }
                    c0 c0Var = s0.f29619a;
                    y8.c0.z(z.a(kd.q.f32064a), null, null, new com.zipoapps.ads.c.j.a(cVar3, appCompatActivity2, eVar2, aVar5, a0Var, null), 3, null);
                }
            }, new com.applovin.exoplayer2.a.f(eVar, cVar2, aVar3));
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$submitStatus$1", f = "PhConsentManager.kt", l = {149}, m = "invokeSuspend")
    public static final class k extends oc.h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28185c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f28187e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e eVar, mc.d<? super k> dVar) {
            super(2, dVar);
            this.f28187e = eVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return c.this.new k(this.f28187e, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return c.this.new k(this.f28187e, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28185c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.n<e> nVar = c.this.f28158g;
                e eVar = this.f28187e;
                this.f28185c = 1;
                if (nVar.emit(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {161}, m = "waitForConsentForm")
    public static final class l extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28188c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28190e;

        public l(mc.d<? super l> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28188c = obj;
            this.f28190e |= Integer.MIN_VALUE;
            c cVar = c.this;
            String str = c.f28151h;
            return cVar.g(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2", f = "PhConsentManager.kt", l = {168}, m = "invokeSuspend")
    public static final class m extends oc.h implements p<g0, mc.d<? super x.c<w>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28192d;

        @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$1", f = "PhConsentManager.kt", l = {168}, m = "invokeSuspend")
        public static final class a extends oc.h implements p<g0, mc.d<? super List<? extends Boolean>>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28194c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m0<Boolean> f28195d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m0<Boolean> m0Var, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f28195d = m0Var;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f28195d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super List<? extends Boolean>> dVar) {
                return new a(this.f28195d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28194c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    m0[] m0VarArr = {this.f28195d};
                    this.f28194c = 1;
                    obj = h9.d.d(m0VarArr, this);
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

        @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$loadFormAction$1", f = "PhConsentManager.kt", l = {164}, m = "invokeSuspend")
        public static final class b extends oc.h implements p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28196c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f28197d;

            @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$loadFormAction$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
            public static final class a extends oc.h implements p<e, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f28198c;

                public a(mc.d<? super a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    a aVar = new a(dVar);
                    aVar.f28198c = obj;
                    return aVar;
                }

                @Override // uc.p
                public Object invoke(e eVar, mc.d<? super Boolean> dVar) {
                    a aVar = new a(dVar);
                    aVar.f28198c = eVar;
                    return aVar.invokeSuspend(w.f31842a);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(((e) this.f28198c) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, mc.d<? super b> dVar) {
                super(2, dVar);
                this.f28197d = cVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new b(this.f28197d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new b(this.f28197d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28196c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (this.f28197d.f28158g.getValue() == null) {
                        id.n<e> nVar = this.f28197d.f28158g;
                        a aVar2 = new a(null);
                        this.f28196c = 1;
                        if (z.s(nVar, aVar2, this) == aVar) {
                            return aVar;
                        }
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

        public m(mc.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            m mVar = c.this.new m(dVar);
            mVar.f28192d = obj;
            return mVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<w>> dVar) {
            m mVar = c.this.new m(dVar);
            mVar.f28192d = g0Var;
            return mVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28191c;
            if (i10 == 0) {
                h9.d.t(obj);
                a aVar2 = new a(y8.c0.e((g0) this.f28192d, null, null, new b(c.this, null), 3, null), null);
                this.f28191c = 1;
                if (f2.b(5000L, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return new x.c(w.f31842a);
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {291}, m = "waitForInitComplete")
    public static final class n extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28199c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28201e;

        public n(mc.d<? super n> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28199c = obj;
            this.f28201e |= Integer.MIN_VALUE;
            return c.this.h(this);
        }
    }

    @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2", f = "PhConsentManager.kt", l = {298}, m = "invokeSuspend")
    public static final class o extends oc.h implements p<g0, mc.d<? super x.c<w>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28203d;

        @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2$initProcess$1", f = "PhConsentManager.kt", l = {294}, m = "invokeSuspend")
        public static final class a extends oc.h implements p<g0, mc.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f28205c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f28206d;

            /* JADX INFO: renamed from: com.zipoapps.ads.c$o$a$a, reason: collision with other inner class name */
            @oc.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2$initProcess$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
            public static final class C0232a extends oc.h implements p<Boolean, mc.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ boolean f28207c;

                public C0232a(mc.d<? super C0232a> dVar) {
                    super(2, dVar);
                }

                @Override // oc.a
                public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                    C0232a c0232a = new C0232a(dVar);
                    c0232a.f28207c = ((Boolean) obj).booleanValue();
                    return c0232a;
                }

                @Override // uc.p
                public Object invoke(Boolean bool, mc.d<? super Boolean> dVar) {
                    Boolean boolValueOf = Boolean.valueOf(bool.booleanValue());
                    C0232a c0232a = new C0232a(dVar);
                    c0232a.f28207c = boolValueOf.booleanValue();
                    w wVar = w.f31842a;
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(wVar);
                    return Boolean.valueOf(c0232a.f28207c);
                }

                @Override // oc.a
                public final Object invokeSuspend(Object obj) {
                    nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                    h9.d.t(obj);
                    return Boolean.valueOf(this.f28207c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, mc.d<? super a> dVar) {
                super(2, dVar);
                this.f28206d = cVar;
            }

            @Override // oc.a
            public final mc.d<w> create(Object obj, mc.d<?> dVar) {
                return new a(this.f28206d, dVar);
            }

            @Override // uc.p
            public Object invoke(g0 g0Var, mc.d<? super Boolean> dVar) {
                return new a(this.f28206d, dVar).invokeSuspend(w.f31842a);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                int i10 = this.f28205c;
                if (i10 == 0) {
                    h9.d.t(obj);
                    if (!this.f28206d.f28155d.getValue().booleanValue()) {
                        id.n<Boolean> nVar = this.f28206d.f28155d;
                        C0232a c0232a = new C0232a(null);
                        this.f28205c = 1;
                        if (z.s(nVar, c0232a, this) == aVar) {
                            return aVar;
                        }
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

        public o(mc.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            o oVar = c.this.new o(dVar);
            oVar.f28203d = obj;
            return oVar;
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super x.c<w>> dVar) {
            o oVar = c.this.new o(dVar);
            oVar.f28203d = g0Var;
            return oVar.invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28202c;
            if (i10 == 0) {
                h9.d.t(obj);
                m0[] m0VarArr = {y8.c0.e((g0) this.f28203d, null, null, new a(c.this, null), 3, null)};
                this.f28202c = 1;
                if (h9.d.d(m0VarArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return new x.c(w.f31842a);
        }
    }

    static {
        new a(null);
        f28151h = c.class.getSimpleName();
    }

    public c(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f28152a = context.getSharedPreferences("premium_helper_data", 0);
        this.f28155d = id.w.a(Boolean.FALSE);
        this.f28158g = id.w.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(final AppCompatActivity appCompatActivity, boolean z10, final uc.l<? super C0231c, w> lVar, mc.d<? super w> dVar) {
        f fVar;
        final c cVar;
        C0231c c0231c;
        String str;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f28170i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f28170i = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f28168g;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = fVar.f28170i;
        int i12 = 2;
        w wVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (i11 == 0) {
            h9.d.t(obj);
            if (!c() || z10) {
                fVar.f28164c = this;
                fVar.f28165d = appCompatActivity;
                fVar.f28166e = lVar;
                fVar.f28167f = z10;
                fVar.f28170i = 1;
                if (g(fVar) == aVar) {
                    return aVar;
                }
                cVar = this;
            } else {
                xe.a.b(f28151h).a("askForConsentIfRequired()-> Consent form can be skipped", new Object[0]);
                c0231c = new C0231c(d.RESULT_OK, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
            }
            lVar.invoke(c0231c);
            return w.f31842a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z10 = fVar.f28167f;
        lVar = (uc.l) fVar.f28166e;
        appCompatActivity = (AppCompatActivity) fVar.f28165d;
        cVar = (c) fVar.f28164c;
        h9.d.t(obj);
        e value = cVar.f28158g.getValue();
        if (value != null) {
            if (cVar.c() && !z10) {
                xe.a.b(f28151h).a("Consent is not required", new Object[0]);
                cVar.d();
                c0231c = new C0231c(d.RESULT_OK, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
            } else if (cVar.f28154c == null || cVar.f28153b == null || value.f28163a != null) {
                xe.a.c cVarB = xe.a.b(f28151h);
                StringBuilder sbA = defpackage.a.a("Can't show consent dialog. Error: ");
                sbA.append(value.f28163a);
                cVarB.b(sbA.toString(), new Object[0]);
                cVar.d();
                d dVar2 = d.ERROR;
                b bVar = value.f28163a;
                if (bVar == null || (str = bVar.f28159a) == null) {
                    str = "Unknown error";
                }
                c0231c = new C0231c(dVar2, str);
            } else if (appCompatActivity.isFinishing()) {
                c0231c = new C0231c(d.ERROR, "The activity is no longer active");
            } else {
                try {
                    String str2 = f28151h;
                    xe.a.b(str2).a("Showing consent form", new Object[0]);
                    ConsentForm consentForm = cVar.f28154c;
                    if (consentForm != null) {
                        consentForm.show(appCompatActivity, new ConsentForm.OnConsentFormDismissedListener() { // from class: fa.p
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                            public final void onConsentFormDismissed(FormError formError) {
                                com.zipoapps.ads.c.C0231c c0231c2;
                                com.zipoapps.ads.c cVar2 = this.f29493a;
                                uc.l lVar2 = lVar;
                                AppCompatActivity appCompatActivity2 = appCompatActivity;
                                j0.i(cVar2, "this$0");
                                j0.i(lVar2, "$onDone");
                                j0.i(appCompatActivity2, "$activity");
                                if (formError != null) {
                                    xe.a.b(com.zipoapps.ads.c.f28151h).b(formError.getErrorCode() + " - " + formError.getMessage(), new Object[0]);
                                }
                                String str3 = null;
                                Object[] objArr5 = 0;
                                y8.c0.z(z.a(s0.f29620b), null, null, cVar2.new g(null), 3, null);
                                ConsentInformation consentInformation = cVar2.f28153b;
                                if (consentInformation != null && consentInformation.getConsentStatus() == 3) {
                                    c0231c2 = new com.zipoapps.ads.c.C0231c(com.zipoapps.ads.c.d.RESULT_OK, str3, 2, objArr5 == true ? 1 : 0);
                                } else {
                                    xe.a.b(com.zipoapps.ads.c.f28151h).b("Consent form cancelled", new Object[0]);
                                    com.zipoapps.ads.c.d dVar3 = com.zipoapps.ads.c.d.ERROR;
                                    StringBuilder sbA2 = defpackage.a.a("Consent status: ");
                                    ConsentInformation consentInformation2 = cVar2.f28153b;
                                    sbA2.append(consentInformation2 != null ? Integer.valueOf(consentInformation2.getConsentStatus()) : null);
                                    c0231c2 = new com.zipoapps.ads.c.C0231c(dVar3, sbA2.toString());
                                }
                                lVar2.invoke(c0231c2);
                                cVar2.f28154c = null;
                                cVar2.d();
                                cVar2.f(null);
                                cVar2.e(appCompatActivity2, null, com.zipoapps.ads.c.h.f28172c);
                            }
                        });
                        wVar = w.f31842a;
                    }
                    if (wVar == null) {
                        xe.a.b(str2).b("Should never happen. Consent form is missing", new Object[0]);
                        lVar.invoke(new C0231c(d.ERROR, "Should never happen. Consent form is missing"));
                    }
                } catch (Exception e10) {
                    xe.a.b(f28151h).c(e10);
                    cVar.d();
                    lVar.invoke(new C0231c(d.ERROR, d0.b.a(e10, defpackage.a.a("Exception thrown when asking for consent: "))));
                }
            }
            lVar.invoke(c0231c);
            return w.f31842a;
        }
        return w.f31842a;
    }

    public final boolean b() {
        return ((Boolean) ma.h.f33410y.a().f33418g.h(oa.b.f34184m0)).booleanValue();
    }

    public final boolean c() {
        if (ma.h.f33410y.a().i()) {
            return true;
        }
        ConsentInformation consentInformation = this.f28153b;
        return (consentInformation != null && consentInformation.getConsentStatus() == 3) || !b();
    }

    public final void d() {
        y8.c0.z(z.a(s0.f29619a), null, null, new i(null), 3, null);
    }

    public final synchronized void e(AppCompatActivity appCompatActivity, uc.a<w> aVar, uc.a<w> aVar2) {
        j0.i(appCompatActivity, "activity");
        if (this.f28157f) {
            return;
        }
        if (b()) {
            y8.c0.z(z.a(s0.f29619a), null, null, new j(appCompatActivity, aVar2, aVar, null), 3, null);
            return;
        }
        d();
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final void f(e eVar) {
        y8.c0.z(z.a(s0.f29619a), null, null, new k(eVar, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(mc.d<? super x<w>> dVar) {
        l lVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f28190e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f28190e = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object objL = lVar.f28188c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = lVar.f28190e;
        try {
            if (i11 == 0) {
                h9.d.t(objL);
                m mVar = new m(null);
                lVar.f28190e = 1;
                objL = z.l(mVar, lVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objL);
            }
            return (x) objL;
        } catch (d2 e10) {
            xe.a.b(f28151h).b("Timeout while waiting for consent form!", new Object[0]);
            return new x.b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(mc.d<? super x<w>> dVar) {
        n nVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f28201e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f28201e = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object objL = nVar.f28199c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = nVar.f28201e;
        try {
            if (i11 == 0) {
                h9.d.t(objL);
                o oVar = new o(null);
                nVar.f28201e = 1;
                objL = z.l(oVar, nVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objL);
            }
            return (x) objL;
        } catch (Exception e10) {
            xe.a.b("PremiumHelper").b("Exception while initializing ConsentManager", new Object[0]);
            return new x.b(e10);
        }
    }
}
