package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Nh implements W0, IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Jh> f14548a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile W0 f14549b;

    public class a implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14551b;

        public a(Nh nh, String str, String str2) {
            this.f14550a = str;
            this.f14551b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.d(this.f14550a, this.f14551b);
        }
    }

    public class b implements Jh {
        public b(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.sendEventsBuffer();
        }
    }

    public class c implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1876p7 f14552a;

        public c(Nh nh, C1876p7 c1876p7) {
            this.f14552a = c1876p7;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.a(this.f14552a);
        }
    }

    public class d implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14553a;

        public d(Nh nh, String str) {
            this.f14553a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportEvent(this.f14553a);
        }
    }

    public class e implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14555b;

        public e(Nh nh, String str, String str2) {
            this.f14554a = str;
            this.f14555b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportEvent(this.f14554a, this.f14555b);
        }
    }

    public class f implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f14557b;

        public f(Nh nh, String str, Map map) {
            this.f14556a = str;
            this.f14557b = map;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportEvent(this.f14556a, this.f14557b);
        }
    }

    public class g implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f14559b;

        public g(Nh nh, String str, Throwable th) {
            this.f14558a = str;
            this.f14559b = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportError(this.f14558a, this.f14559b);
        }
    }

    public class h implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f14562c;

        public h(Nh nh, String str, String str2, Throwable th) {
            this.f14560a = str;
            this.f14561b = str2;
            this.f14562c = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportError(this.f14560a, this.f14561b, this.f14562c);
        }
    }

    public class i implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f14563a;

        public i(Nh nh, Throwable th) {
            this.f14563a = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportUnhandledException(this.f14563a);
        }
    }

    public class j implements Jh {
        public j(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.resumeSession();
        }
    }

    public class k implements Jh {
        public k(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.pauseSession();
        }
    }

    public class l implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14564a;

        public l(Nh nh, String str) {
            this.f14564a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.setUserProfileID(this.f14564a);
        }
    }

    public class m implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserProfile f14565a;

        public m(Nh nh, UserProfile userProfile) {
            this.f14565a = userProfile;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportUserProfile(this.f14565a);
        }
    }

    public class n implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1602e7 f14566a;

        public n(Nh nh, C1602e7 c1602e7) {
            this.f14566a = c1602e7;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.a(this.f14566a);
        }
    }

    public class o implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Revenue f14567a;

        public o(Nh nh, Revenue revenue) {
            this.f14567a = revenue;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportRevenue(this.f14567a);
        }
    }

    public class p implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ECommerceEvent f14568a;

        public p(Nh nh, ECommerceEvent eCommerceEvent) {
            this.f14568a = eCommerceEvent;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.reportECommerce(this.f14568a);
        }
    }

    public class q implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14569a;

        public q(Nh nh, boolean z10) {
            this.f14569a = z10;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.setStatisticsSending(this.f14569a);
        }
    }

    public class r implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f14570a;

        public r(Nh nh, PluginErrorDetails pluginErrorDetails) {
            this.f14570a = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.getPluginExtension().reportUnhandledException(this.f14570a);
        }
    }

    public class s implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f14571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14572b;

        public s(Nh nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.f14571a = pluginErrorDetails;
            this.f14572b = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.getPluginExtension().reportError(this.f14571a, this.f14572b);
        }
    }

    public class t implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f14575c;

        public t(Nh nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f14573a = str;
            this.f14574b = str2;
            this.f14575c = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.getPluginExtension().reportError(this.f14573a, this.f14574b, this.f14575c);
        }
    }

    public class u implements Jh {
        public u(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.b();
        }
    }

    public class v implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f14577b;

        public v(Nh nh, String str, JSONObject jSONObject) {
            this.f14576a = str;
            this.f14577b = jSONObject;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.a(this.f14576a, this.f14577b);
        }
    }

    public class w implements Jh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f14579b;

        public w(Nh nh, String str, String str2) {
            this.f14578a = str;
            this.f14579b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w10) {
            w10.b(this.f14578a, this.f14579b);
        }
    }

    private synchronized void a(Jh jh) {
        if (this.f14549b == null) {
            this.f14548a.add(jh);
        } else {
            jh.a(this.f14549b);
        }
    }

    public synchronized void a(Context context) {
        this.f14549b = C1910qg.a().a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
        Iterator<Jh> it = this.f14548a.iterator();
        while (it.hasNext()) {
            it.next().a(this.f14549b);
        }
        this.f14548a.clear();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1602e7 c1602e7) {
        a(new n(this, c1602e7));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1876p7 c1876p7) {
        a(new c(this, c1876p7));
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        a(new v(this, str, jSONObject));
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() {
        a(new u(this));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void b(String str, String str2) {
        a(new w(this, str, str2));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void d(String str, String str2) {
        a(new a(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        a(new k(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        a(new p(this, eCommerceEvent));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        a(new s(this, pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        a(new h(this, str, str2, null));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        a(new t(this, str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        a(new h(this, str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        a(new g(this, str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        a(new d(this, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        a(new e(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        a(new f(this, str, map));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        a(new o(this, revenue));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        a(new r(this, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        a(new i(this, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        a(new m(this, userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        a(new j(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        a(new b(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
        a(new q(this, z10));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        a(new l(this, str));
    }
}
