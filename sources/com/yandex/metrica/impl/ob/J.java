package com.yandex.metrica.impl.ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements S0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Collection<Integer> f14242n = new HashSet(Arrays.asList(14, 15));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final uo<C1511ag> f14243o = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1746k2 f14245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Im f14246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2095xm f14247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F7 f14248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A7 f14249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2000u7 f14250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1950s7 f14251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1821n2 f14252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1770l1 f14253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Hm f14254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final K0 f14255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1502a7 f14256m;

    public class a implements uo<C1511ag> {
        @Override // com.yandex.metrica.impl.ob.uo
        public so a(C1511ag c1511ag) {
            return U2.a((Object[]) c1511ag.f15749b) ? so.a(this, "attributes list is empty") : so.a(this);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final uo<Revenue> f14257a = new yo();

        public static uo<Revenue> a() {
            return f14257a;
        }
    }

    public J(Context context, C1821n2 c1821n2, C1746k2 c1746k2, K0 k10, Hm hm2, ea.a aVar, C2065wh c2065wh, F7 f10, A7 a10, C2000u7 c2000u7, C1950s7 c1950s7, C1502a7 c1502a7) {
        this.f14244a = context.getApplicationContext();
        this.f14252i = c1821n2;
        this.f14245b = c1746k2;
        this.f14255l = k10;
        this.f14248e = f10;
        this.f14249f = a10;
        this.f14250g = c2000u7;
        this.f14251h = c1950s7;
        this.f14256m = c1502a7;
        Im imB = AbstractC2145zm.b(c1746k2.b().c());
        this.f14246c = imB;
        c1746k2.a(new Ln(imB, "Crash Environment"));
        C2095xm c2095xmA = AbstractC2145zm.a(c1746k2.b().c());
        this.f14247d = c2095xmA;
        if (C1694i.a(c1746k2.b().f13444c.getAsBoolean("CFG_IS_LOG_ENABLED"))) {
            imB.e();
            c2095xmA.e();
        }
        this.f14254k = hm2;
    }

    private C1876p7 a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof S6) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return C1901q7.a(th2, new C1602e7(null, null, ((Dm) this.f14254k).b()), stackTrace != null ? Arrays.asList(stackTrace) : null, this.f14255l.a(), this.f14255l.b());
    }

    private void e(String str, String str2) {
        if (this.f14246c.c()) {
            this.f14246c.b("Event received: " + f(str) + ". With value: " + f(str2));
        }
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(int i10, String str, String str2, Map<String, String> map) {
        if (!f14242n.contains(Integer.valueOf(i10)) && i10 >= 1 && i10 <= 99) {
            return;
        }
        HashMap map2 = map == null ? null : new HashMap(map);
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new S(str2, str, EnumC1745k1.EVENT_TYPE_CUSTOM_EVENT.b(), i10, im).c(C2120ym.g(map2)), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1602e7 c1602e7) {
        C1627f7 c1627f7 = new C1627f7(c1602e7, this.f14255l.a(), this.f14255l.b());
        C1821n2 c1821n2 = this.f14252i;
        byte[] bArrA = AbstractC1594e.a(this.f14251h.b(c1627f7));
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S(bArrA, "", EnumC1745k1.EVENT_TYPE_ANR.b(), im), this.f14245b);
    }

    public void a(C1770l1 c1770l1) {
        this.f14253j = c1770l1;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1876p7 c1876p7) {
        this.f14252i.a(c1876p7, this.f14245b);
        b(c1876p7);
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(String str, String str2) {
        e(str, str2);
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new S(str2, str, EnumC1745k1.EVENT_TYPE_REGULAR.b(), 0, im).a(I0.JS), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        C1821n2 c1821n2 = this.f14252i;
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16511a = str;
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b();
        c1744k0.f16512b = jSONObject.toString();
        c1821n2.a(c1744k0, this.f14245b);
    }

    public void a(Map<String, String> map) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() throws JSONException {
        Integer numValueOf;
        C1821n2 c1821n2 = this.f14252i;
        Context context = this.f14244a;
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16511a = "";
        P0 p0I = P0.i();
        fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
        M mD = p0I.d();
        fd.j0.h(mD, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer numA = mD.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (U2.a(23)) {
            try {
                Object systemService = context.getSystemService("notification");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
                numValueOf = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
            } catch (Throwable unused) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        JSONObject jSONObjectPut = new JSONObject().put("dfid", new JSONObject().putOpt("battery", numA).put("boot_time_seconds", jElapsedRealtime).putOpt("notification_filter", numValueOf));
        fd.j0.h(jSONObjectPut, "JSONObject()\n           …tionFilter)\n            )");
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_IDENTITY_LIGHT.b();
        c1744k0.f16512b = jSONObjectPut.toString();
        c1821n2.a(c1744k0, this.f14245b);
    }

    public void b(C1876p7 c1876p7) {
        if (this.f14246c.c()) {
            this.f14246c.b("Unhandled exception received: " + c1876p7.toString());
        }
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void b(String str) {
        this.f14252i.a(C1744k0.a(str), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.S0, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void b(String str, String str2) {
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new S(str2, str, EnumC1745k1.EVENT_TYPE_STATBOX.b(), 0, im), this.f14245b);
        if (this.f14246c.c()) {
            StringBuilder sb2 = new StringBuilder("Statbox event received ");
            sb2.append(" with name: ");
            sb2.append(f(str));
            sb2.append(" with value: ");
            String strF = f(str2);
            if (strF.length() > 100) {
                sb2.append(strF.substring(0, 100));
                strF = "...";
            }
            sb2.append(strF);
            this.f14246c.b(sb2.toString());
        }
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void c(String str) {
        this.f14252i.a(str, this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.b("Error received: native");
        }
    }

    public void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f14245b.f16558c.a(str, str2);
        } else if (this.f14246c.c()) {
            this.f14246c.c("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    public void d(String str) {
        if (this.f14245b.f()) {
            return;
        }
        this.f14252i.d();
        this.f14253j.a();
        this.f14245b.g();
        C1821n2 c1821n2 = this.f14252i;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S("", str, EnumC1745k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.impl.ob.S0, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void d(String str, String str2) {
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new C1744k0(str2, str, EnumC1745k1.EVENT_TYPE_DIAGNOSTIC.b(), new Nm()), this.f14245b);
    }

    public void e(String str) {
        this.f14252i.e();
        this.f14253j.b();
        C1821n2 c1821n2 = this.f14252i;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S("", str, EnumC1745k1.EVENT_TYPE_START.b(), im), this.f14245b);
        this.f14245b.h();
    }

    public boolean e() {
        boolean z10 = !this.f14245b.f();
        if (z10) {
            Im im = this.f14246c;
            List<Integer> list = J0.f14266i;
            this.f14252i.a(new S("", "", EnumC1745k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, im), this.f14245b);
        }
        return z10;
    }

    public String f(String str) {
        if (str == null) {
            return "<null>";
        }
        return str.isEmpty() ? "<empty>" : str;
    }

    public void f() {
        this.f14252i.b(this.f14245b);
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        if (this.f14246c.c()) {
            this.f14246c.b("Pause session");
        }
        d(null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f14246c.c()) {
            Im im = this.f14246c;
            StringBuilder sbA = defpackage.a.a("E-commerce event received: ");
            sbA.append(eCommerceEvent.getPublicDescription());
            im.b(sbA.toString());
        }
        this.f14252i.a(eCommerceEvent, this.f14245b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C1502a7 c1502a7 = this.f14256m;
        Objects.requireNonNull(c1502a7);
        this.f14252i.a(J0.a(str, AbstractC1594e.a(this.f14249f.b(new C1726j7(str, pluginErrorDetails != null ? c1502a7.a(pluginErrorDetails) : null))), this.f14246c), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.a("Error from plugin received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C1502a7 c1502a7 = this.f14256m;
        Objects.requireNonNull(c1502a7);
        this.f14252i.a(J0.a(str2, AbstractC1594e.a(this.f14250g.b(new C1677h7(new C1726j7(str2, pluginErrorDetails != null ? c1502a7.a(pluginErrorDetails) : null), str))), this.f14246c), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.a("Error with identifier: %s from plugin received: %s", str, f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        this.f14252i.a(J0.a(str2, AbstractC1594e.a(this.f14250g.b(new C1677h7(new C1726j7(str2, a(th)), str))), this.f14246c), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.a("Error received: id: %s, message: %s", f(str), f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        C1726j7 c1726j7 = new C1726j7(str, a(th));
        C1821n2 c1821n2 = this.f14252i;
        byte[] bArrA = AbstractC1594e.a(this.f14249f.b(c1726j7));
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S(bArrA, str, EnumC1745k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b(), im), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.a("Error received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        if (this.f14246c.c() && this.f14246c.c()) {
            this.f14246c.b("Event received: " + f(str));
        }
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new S("", str, EnumC1745k1.EVENT_TYPE_REGULAR.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        if (this.f14246c.c()) {
            e(str, str2);
        }
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        this.f14252i.a(new S(str2, str, EnumC1745k1.EVENT_TYPE_REGULAR.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        HashMap map2 = U2.b(map) ? null : new HashMap(map);
        C1821n2 c1821n2 = this.f14252i;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S("", str, EnumC1745k1.EVENT_TYPE_REGULAR.b(), 0, im), this.f14245b, map2);
        if (this.f14246c.c()) {
            e(str, map2 != null ? map2.toString() : null);
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        Object obj;
        so soVarA = b.a().a(revenue);
        if (!soVarA.b()) {
            if (this.f14246c.c()) {
                Im im = this.f14246c;
                StringBuilder sbA = defpackage.a.a("Passed revenue is not valid. Reason: ");
                sbA.append(soVarA.a());
                im.c(sbA.toString());
                return;
            }
            return;
        }
        this.f14252i.a(new C1896q2(revenue, this.f14246c), this.f14245b);
        if (this.f14246c.c()) {
            StringBuilder sb2 = new StringBuilder("Revenue received ");
            sb2.append("for productID: ");
            sb2.append(f(revenue.productID));
            sb2.append(" of quantity: ");
            Integer num = revenue.quantity;
            if (num != null) {
                sb2.append(num);
            } else {
                sb2.append("<null>");
            }
            sb2.append(" with price");
            if (revenue.priceMicros != null) {
                sb2.append(" (in micros): ");
                obj = revenue.priceMicros;
            } else {
                sb2.append(": ");
                obj = revenue.price;
            }
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(revenue.currency);
            this.f14246c.b(sb2.toString());
        }
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String strB;
        C1876p7 c1876p7A = this.f14256m.a(pluginErrorDetails);
        C1821n2 c1821n2 = this.f14252i;
        C1826n7 c1826n7 = c1876p7A.f17056a;
        String str = "";
        if (c1826n7 != null && (strB = c1826n7.b()) != null) {
            str = strB;
        }
        byte[] bArrA = AbstractC1594e.a(this.f14248e.b(c1876p7A));
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S(bArrA, str, EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), im), this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.a("Crash from plugin received: %s", f(pluginErrorDetails.getMessage()));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        C1876p7 c1876p7A = C1901q7.a(th, new C1602e7(null, null, ((Dm) this.f14254k).b()), null, this.f14255l.a(), this.f14255l.b());
        this.f14252i.b(c1876p7A, this.f14245b);
        b(c1876p7A);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        Gf gf = new Gf();
        Iterator<UserProfileUpdate<? extends Hf>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            AbstractC2113yf abstractC2113yf = (AbstractC2113yf) it.next().getUserProfileUpdatePatcher();
            abstractC2113yf.a(this.f14246c);
            abstractC2113yf.a(gf);
        }
        C1511ag c1511agC = gf.c();
        so soVarA = f14243o.a(c1511agC);
        if (soVarA.b()) {
            this.f14252i.a(c1511agC, this.f14245b);
            if (this.f14246c.c()) {
                this.f14246c.b("User profile received");
                return;
            }
            return;
        }
        if (this.f14246c.c()) {
            Im im = this.f14246c;
            StringBuilder sbA = defpackage.a.a("UserInfo wasn't sent because ");
            sbA.append(soVarA.a());
            im.c(sbA.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        e(null);
        if (this.f14246c.c()) {
            this.f14246c.b("Resume session");
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        C1821n2 c1821n2 = this.f14252i;
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_PURGE_BUFFER;
        Im im = this.f14246c;
        List<Integer> list = J0.f14266i;
        c1821n2.a(new S("", "", enumC1745k1.b(), 0, im), this.f14245b);
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
        this.f14245b.b().k(z10);
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        this.f14252i.b(str, this.f14245b);
        if (this.f14246c.c()) {
            this.f14246c.b("Set user profile ID: " + f(str));
        }
    }
}
