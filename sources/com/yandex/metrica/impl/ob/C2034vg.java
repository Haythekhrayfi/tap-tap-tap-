package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.yandex.metrica.IReporter, com.yandex.metrica.ReporterConfig>] */
/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2034vg extends C1835ng {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1934rg f17634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C2114yg f17635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2089xg f17636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final I2 f17637l;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$A */
    public class A implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2097y.c f17638a;

        public A(C2097y.c cVar) {
            this.f17638a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).a(this.f17638a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$B */
    public class B implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17640a;

        public B(String str) {
            this.f17640a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportEvent(this.f17640a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$C */
    public class C implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17643b;

        public C(String str, String str2) {
            this.f17642a = str;
            this.f17643b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportEvent(this.f17642a, this.f17643b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$D */
    public class D implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f17646b;

        public D(String str, List list) {
            this.f17645a = str;
            this.f17646b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportEvent(this.f17645a, U2.a(this.f17646b));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$E */
    public class E implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f17649b;

        public E(String str, Throwable th) {
            this.f17648a = str;
            this.f17649b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportError(this.f17648a, this.f17649b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$a, reason: case insensitive filesystem */
    public class RunnableC2035a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f17653c;

        public RunnableC2035a(String str, String str2, Throwable th) {
            this.f17651a = str;
            this.f17652b = str2;
            this.f17653c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportError(this.f17651a, this.f17652b, this.f17653c);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$b, reason: case insensitive filesystem */
    public class RunnableC2036b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f17655a;

        public RunnableC2036b(Throwable th) {
            this.f17655a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportUnhandledException(this.f17655a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$c, reason: case insensitive filesystem */
    public class RunnableC2037c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17657a;

        public RunnableC2037c(String str) {
            this.f17657a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).c(this.f17657a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$d, reason: case insensitive filesystem */
    public class RunnableC2038d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17659a;

        public RunnableC2038d(Intent intent) {
            this.f17659a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.c(C2034vg.this).a().a(this.f17659a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$e, reason: case insensitive filesystem */
    public class RunnableC2039e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17661a;

        public RunnableC2039e(String str) {
            this.f17661a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.c(C2034vg.this).a().a(this.f17661a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17663a;

        public f(Intent intent) {
            this.f17663a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.c(C2034vg.this).a().a(this.f17663a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17665a;

        public g(String str) {
            this.f17665a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).a(this.f17665a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Location f17667a;

        public h(Location location) {
            this.f17667a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            Location location = this.f17667a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(location);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17669a;

        public i(boolean z10) {
            this.f17669a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            boolean z10 = this.f17669a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(z10);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17671a;

        public j(boolean z10) {
            this.f17671a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            boolean z10 = this.f17671a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(z10);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$k */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YandexMetricaConfig f17674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.yandex.metrica.j f17675c;

        public k(Context context, YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar) {
            this.f17673a = context;
            this.f17674b = yandexMetricaConfig;
            this.f17675c = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            Context context = this.f17673a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(context).b(this.f17674b, C2034vg.this.c().a(this.f17675c));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17677a;

        public l(boolean z10) {
            this.f17677a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            boolean z10 = this.f17677a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.c(z10);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$m */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17679a;

        public m(String str) {
            this.f17679a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            String str = this.f17679a;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(str);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$n */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserProfile f17681a;

        public n(UserProfile userProfile) {
            this.f17681a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportUserProfile(this.f17681a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$o */
    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Revenue f17683a;

        public o(Revenue revenue) {
            this.f17683a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportRevenue(this.f17683a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$p */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ECommerceEvent f17685a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f17685a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).reportECommerce(this.f17685a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$q */
    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeferredDeeplinkParametersListener f17687a;

        public q(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f17687a = deferredDeeplinkParametersListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C2034vg.this.e());
            C1772l3.k().a(this.f17687a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$r */
    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeferredDeeplinkListener f17689a;

        public r(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f17689a = deferredDeeplinkListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C2034vg.this.e());
            C1772l3.k().a(this.f17689a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$s */
    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppMetricaDeviceIDListener f17691a;

        public s(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f17691a = appMetricaDeviceIDListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(C2034vg.this.e());
            C1772l3.k().b(this.f17691a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$t */
    public class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17694b;

        public t(String str, String str2) {
            this.f17693a = str;
            this.f17694b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1984tg c1984tgE = C2034vg.this.e();
            String str = this.f17693a;
            String str2 = this.f17694b;
            Objects.requireNonNull(c1984tgE);
            C1772l3.a(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).a(C2034vg.this.h());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$v */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).sendEventsBuffer();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$w */
    public class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17699b;

        public w(String str, String str2) {
            this.f17698a = str;
            this.f17699b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).a(this.f17698a, this.f17699b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$x */
    public class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17701a;

        public x(String str) {
            this.f17701a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.a(C2034vg.this).b(this.f17701a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$y */
    public class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f17703a;

        public y(Activity activity) {
            this.f17703a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.this.f17637l.b(this.f17703a, C2034vg.a(C2034vg.this));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vg$z */
    public class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f17705a;

        public z(Activity activity) {
            this.f17705a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2034vg.this.f17637l.a(this.f17705a, C2034vg.a(C2034vg.this));
        }
    }

    public C2034vg(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(new C1984tg(), interfaceExecutorC1966sn, new C2114yg(), new C2089xg(), new X2());
    }

    private C2034vg(C1984tg c1984tg, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2114yg c2114yg, C2089xg c2089xg, X2 x10) {
        this(c1984tg, interfaceExecutorC1966sn, c2114yg, c2089xg, new C1810mg(c1984tg), new C1934rg(c1984tg), x10, new com.yandex.metrica.g(c1984tg, x10), C1910qg.a(), Y.g().f(), Y.g().k(), Y.g().e());
    }

    public C2034vg(C1984tg c1984tg, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2114yg c2114yg, C2089xg c2089xg, C1810mg c1810mg, C1934rg c1934rg, X2 x10, com.yandex.metrica.g gVar, C1910qg c1910qg, C1993u0 c1993u0, I2 i10, C1695i0 c1695i0) {
        super(c1984tg, interfaceExecutorC1966sn, c1810mg, x10, gVar, c1910qg, c1993u0, c1695i0);
        this.f17636k = c2089xg;
        this.f17635j = c2114yg;
        this.f17634i = c1934rg;
        this.f17637l = i10;
    }

    public static U0 a(C2034vg c2034vg) {
        Objects.requireNonNull(c2034vg.e());
        return C1772l3.k().d().b();
    }

    public static C1969t1 c(C2034vg c2034vg) {
        Objects.requireNonNull(c2034vg.e());
        return C1772l3.k().d();
    }

    public IReporter a(Context context, String str) {
        this.f17635j.a(context, str);
        b().a(context);
        return f().a(context, str);
    }

    public void a(Activity activity) {
        a().a(null);
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new z(activity));
    }

    public void a(Application application) {
        a().a(null);
        this.f17635j.a(application);
        com.yandex.metrica.g gVarG = g();
        gVarG.f13568c.a(application);
        C2097y.c cVarA = gVarG.f13569d.a(false);
        ((C1941rn) d()).execute(new A(cVarA));
    }

    public void a(Intent intent) {
        a().a(null);
        this.f17635j.a(intent);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new f(intent));
    }

    public void a(Location location) {
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new h(location));
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a().a(null);
        this.f17635j.a(appMetricaDeviceIDListener);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new s(appMetricaDeviceIDListener));
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        a().a(null);
        this.f17635j.a(deferredDeeplinkListener);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new r(deferredDeeplinkListener));
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        a().a(null);
        this.f17635j.a(deferredDeeplinkParametersListener);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new q(deferredDeeplinkParametersListener));
    }

    public void a(Revenue revenue) {
        a().a(null);
        this.f17635j.reportRevenue(revenue);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new o(revenue));
    }

    public void a(ECommerceEvent eCommerceEvent) {
        a().a(null);
        this.f17635j.reportECommerce(eCommerceEvent);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new p(eCommerceEvent));
    }

    public void a(UserProfile userProfile) {
        a().a(null);
        this.f17635j.reportUserProfile(userProfile);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new n(userProfile));
    }

    public void a(String str) {
        a().a(null);
        this.f17635j.e(str);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new RunnableC2039e(str));
    }

    public void a(String str, String str2) {
        this.f17635j.d(str);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new t(str, str2));
    }

    public void a(String str, String str2, Throwable th) {
        a().a(null);
        this.f17635j.reportError(str, str2, th);
        ((C1941rn) d()).execute(new RunnableC2035a(str, str2, th));
    }

    public void a(String str, Throwable th) {
        a().a(null);
        this.f17635j.reportError(str, th);
        Objects.requireNonNull(g());
        if (th == null) {
            th = new S6();
            th.fillInStackTrace();
        }
        ((C1941rn) d()).execute(new E(str, th));
    }

    public void a(String str, Map<String, Object> map) {
        a().a(null);
        this.f17635j.reportEvent(str, map);
        Objects.requireNonNull(g());
        List listA = U2.a((Map) map);
        ((C1941rn) d()).execute(new D(str, listA));
    }

    public void a(Throwable th) {
        a().a(null);
        this.f17635j.reportUnhandledException(th);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new RunnableC2036b(th));
    }

    public void a(boolean z10) {
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new i(z10));
    }

    public void b(Activity activity) {
        Intent intent = null;
        a().a(null);
        this.f17635j.c(activity);
        Objects.requireNonNull(g());
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        ((C1941rn) d()).execute(new RunnableC2038d(intent));
    }

    public void b(Context context, boolean z10) {
        this.f17635j.b(context);
        g().f13570e.a(context);
        ((C1941rn) d()).execute(new l(z10));
    }

    public void b(String str) {
        a().a(null);
        this.f17635j.reportEvent(str);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new B(str));
    }

    public void b(String str, String str2) {
        a().a(null);
        this.f17635j.reportEvent(str, str2);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new C(str, str2));
    }

    public void c(Activity activity) {
        a().a(null);
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new y(activity));
    }

    public void c(String str) {
        if (this.f17634i.a().b() && this.f17635j.g(str)) {
            Objects.requireNonNull(g());
            ((C1941rn) d()).execute(new x(str));
        }
    }

    public void c(String str, String str2) {
        a().a(null);
        if (!this.f17635j.f(str)) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
            return;
        }
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new w(str, str2));
    }

    public void d(String str) {
        a().a(null);
        this.f17635j.c(str);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new RunnableC2037c(str));
    }

    public void e(String str) {
        a().a(null);
        this.f17635j.a(str);
        ((C1941rn) d()).execute(new g(str));
    }

    public void f(String str) {
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new m(str));
    }

    public void i() {
        a().a(null);
        Objects.requireNonNull(this.f17635j);
        Objects.requireNonNull(g());
        ((C1941rn) d()).execute(new v());
    }

    public void a(Context context, ReporterConfig reporterConfig) {
        this.f17635j.a(context, reporterConfig);
        com.yandex.metrica.f fVar = new com.yandex.metrica.f(reporterConfig);
        g().f13570e.a(context);
        f().a(context, fVar);
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        this.f17635j.a(context, yandexMetricaConfig);
        com.yandex.metrica.j jVarA = this.f17636k.a(yandexMetricaConfig instanceof com.yandex.metrica.j ? (com.yandex.metrica.j) yandexMetricaConfig : new com.yandex.metrica.j(yandexMetricaConfig));
        com.yandex.metrica.g gVarG = g();
        Objects.requireNonNull(gVarG);
        gVarG.f13570e.a(context);
        Boolean bool = jVarA.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            gVarG.f13569d.a(true);
        }
        Objects.requireNonNull(gVarG.f13566a);
        C1772l3.a(context).b(jVarA);
        ((C1941rn) d()).execute(new k(context, yandexMetricaConfig, jVarA));
        Objects.requireNonNull(e());
        C1772l3.j();
    }

    public void a(Context context, boolean z10) {
        this.f17635j.a(context);
        g().f13570e.a(context);
        ((C1941rn) d()).execute(new j(z10));
    }

    public void a(WebView webView) {
        a().a(null);
        this.f17635j.a(webView);
        g().f13567b.a(webView, this);
        ((C1941rn) d()).execute(new u());
    }
}
