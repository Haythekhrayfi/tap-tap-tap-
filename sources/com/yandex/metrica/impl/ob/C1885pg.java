package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1885pg implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1984tg f17079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bg f17080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f17082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2089xg f17083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.metrica.f f17084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.yandex.metrica.g f17085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1860og f17086h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17088b;

        public a(String str, String str2) {
            this.f17087a = str;
            this.f17088b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().b(this.f17087a, this.f17088b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17091b;

        public b(String str, String str2) {
            this.f17090a = str;
            this.f17091b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().d(this.f17090a, this.f17091b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$c */
    public class c implements Ym<W0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1984tg f17093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f17094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.yandex.metrica.f f17095c;

        public c(C1984tg c1984tg, Context context, com.yandex.metrica.f fVar) {
            this.f17093a = c1984tg;
            this.f17094b = context;
            this.f17095c = fVar;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        public W0 a() {
            C1984tg c1984tg = this.f17093a;
            Context context = this.f17094b;
            com.yandex.metrica.f fVar = this.f17095c;
            Objects.requireNonNull(c1984tg);
            return C1772l3.a(context).a(fVar);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17096a;

        public d(String str) {
            this.f17096a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportEvent(this.f17096a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17099b;

        public e(String str, String str2) {
            this.f17098a = str;
            this.f17099b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportEvent(this.f17098a, this.f17099b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f17102b;

        public f(String str, List list) {
            this.f17101a = str;
            this.f17102b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportEvent(this.f17101a, U2.a(this.f17102b));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f17105b;

        public g(String str, Throwable th) {
            this.f17104a = str;
            this.f17105b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportError(this.f17104a, this.f17105b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f17109c;

        public h(String str, String str2, Throwable th) {
            this.f17107a = str;
            this.f17108b = str2;
            this.f17109c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportError(this.f17107a, this.f17108b, this.f17109c);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f17111a;

        public i(Throwable th) {
            this.f17111a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportUnhandledException(this.f17111a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().resumeSession();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$k */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().pauseSession();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$l */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17115a;

        public l(String str) {
            this.f17115a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().setUserProfileID(this.f17115a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$m */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1876p7 f17117a;

        public m(C1876p7 c1876p7) {
            this.f17117a = c1876p7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().a(this.f17117a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$n */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserProfile f17119a;

        public n(UserProfile userProfile) {
            this.f17119a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportUserProfile(this.f17119a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$o */
    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Revenue f17121a;

        public o(Revenue revenue) {
            this.f17121a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportRevenue(this.f17121a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$p */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ECommerceEvent f17123a;

        public p(ECommerceEvent eCommerceEvent) {
            this.f17123a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().reportECommerce(this.f17123a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$q */
    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17125a;

        public q(boolean z10) {
            this.f17125a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().setStatisticsSending(this.f17125a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$r */
    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.yandex.metrica.f f17127a;

        public r(com.yandex.metrica.f fVar) {
            this.f17127a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.a(C1885pg.this, this.f17127a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$s */
    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.yandex.metrica.f f17129a;

        public s(com.yandex.metrica.f fVar) {
            this.f17129a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.a(C1885pg.this, this.f17129a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$t */
    public class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1602e7 f17131a;

        public t(C1602e7 c1602e7) {
            this.f17131a = c1602e7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().a(this.f17131a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$u */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().b();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$v */
    public class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f17135b;

        public v(String str, JSONObject jSONObject) {
            this.f17134a = str;
            this.f17135b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().a(this.f17134a, this.f17135b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pg$w */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1885pg.this.a().sendEventsBuffer();
        }
    }

    private C1885pg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Context context, Bg bg, C1984tg c1984tg, C2089xg c2089xg, com.yandex.metrica.g gVar, com.yandex.metrica.f fVar) {
        this(interfaceExecutorC1966sn, context, bg, c1984tg, c2089xg, gVar, fVar, new C1860og(bg.a(), gVar, interfaceExecutorC1966sn, new c(c1984tg, context, fVar)));
    }

    public C1885pg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Context context, Bg bg, C1984tg c1984tg, C2089xg c2089xg, com.yandex.metrica.g gVar, com.yandex.metrica.f fVar, C1860og c1860og) {
        this.f17081c = interfaceExecutorC1966sn;
        this.f17082d = context;
        this.f17080b = bg;
        this.f17079a = c1984tg;
        this.f17083e = c2089xg;
        this.f17085g = gVar;
        this.f17084f = fVar;
        this.f17086h = c1860og;
    }

    public C1885pg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Context context, String str) {
        this(interfaceExecutorC1966sn, context.getApplicationContext(), str, new C1984tg());
    }

    private C1885pg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Context context, String str, C1984tg c1984tg) {
        this(interfaceExecutorC1966sn, context, new Bg(), c1984tg, new C2089xg(), new com.yandex.metrica.g(c1984tg, new X2()), new com.yandex.metrica.f(new com.yandex.metrica.f.a(str)));
    }

    public static void a(C1885pg c1885pg, com.yandex.metrica.f fVar) {
        C1984tg c1984tg = c1885pg.f17079a;
        Context context = c1885pg.f17082d;
        Objects.requireNonNull(c1984tg);
        C1772l3.a(context).c(fVar);
    }

    public final W0 a() {
        C1984tg c1984tg = this.f17079a;
        Context context = this.f17082d;
        com.yandex.metrica.f fVar = this.f17084f;
        Objects.requireNonNull(c1984tg);
        return C1772l3.a(context).a(fVar);
    }

    public void a(com.yandex.metrica.f fVar) {
        com.yandex.metrica.f fVarA = this.f17083e.a(fVar);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new s(fVarA));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1602e7 c1602e7) {
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new t(c1602e7));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1876p7 c1876p7) {
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new m(c1876p7));
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new v(str, jSONObject));
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() {
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new u());
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void b(String str, String str2) {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new a(str, str2));
    }

    public void d(String str) {
        com.yandex.metrica.f fVar = new com.yandex.metrica.f(new com.yandex.metrica.f.a(str));
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new r(fVar));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void d(String str, String str2) {
        this.f17080b.d(str, str2);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new b(str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f17086h;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new k());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f17080b.reportECommerce(eCommerceEvent);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new p(eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.f17080b.reportError(str, str2, th);
        ((C1941rn) this.f17081c).execute(new h(str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        this.f17080b.reportError(str, th);
        Objects.requireNonNull(this.f17085g);
        if (th == null) {
            th = new S6();
            th.fillInStackTrace();
        }
        ((C1941rn) this.f17081c).execute(new g(str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        this.f17080b.reportEvent(str);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new d(str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        this.f17080b.reportEvent(str, str2);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new e(str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        this.f17080b.reportEvent(str, map);
        Objects.requireNonNull(this.f17085g);
        List listA = U2.a((Map) map);
        ((C1941rn) this.f17081c).execute(new f(str, listA));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        this.f17080b.reportRevenue(revenue);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new o(revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        this.f17080b.reportUnhandledException(th);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new i(th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        this.f17080b.reportUserProfile(userProfile);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new n(userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new j());
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new w());
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new q(z10));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        Objects.requireNonNull(this.f17080b);
        Objects.requireNonNull(this.f17085g);
        ((C1941rn) this.f17081c).execute(new l(str));
    }
}
