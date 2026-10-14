package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1821n2 implements Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2074x1 f16910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1944s1 f16911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1520b0 f16912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Ki f16913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2080x7 f16914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1577d7 f16915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1846o2 f16916h = new C1846o2(this);

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2$a */
    public class a implements C1846o2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f16917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1746k2 f16918b;

        public a(Map map, C1746k2 c1746k2) {
            this.f16917a = map;
            this.f16918b = c1746k2;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.e
        public C1744k0 a(C1744k0 c1744k0) {
            C1821n2 c1821n2 = C1821n2.this;
            C1744k0 c1744k0F = c1744k0.f(C2120ym.g(this.f16917a));
            C1746k2 c1746k2 = this.f16918b;
            Objects.requireNonNull(c1821n2);
            if (J0.f(c1744k0F.f16515e)) {
                c1744k0F.c(c1746k2.f16558c.a());
            }
            return c1744k0F;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2$b */
    public class b implements C1846o2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1511ag f16920a;

        public b(C1821n2 c1821n2, C1511ag c1511ag) {
            this.f16920a = c1511ag;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.e
        public C1744k0 a(C1744k0 c1744k0) {
            return c1744k0.f(new String(Base64.encode(AbstractC1594e.a(this.f16920a), 0)));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2$c */
    public class c implements C1846o2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16921a;

        public c(C1821n2 c1821n2, String str) {
            this.f16921a = str;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.e
        public C1744k0 a(C1744k0 c1744k0) {
            return c1744k0.f(this.f16921a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2$d */
    public class d implements C1846o2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1896q2 f16922a;

        public d(C1821n2 c1821n2, C1896q2 c1896q2) {
            this.f16922a = c1896q2;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.e
        public C1744k0 a(C1744k0 c1744k0) {
            Pair<byte[], Integer> pairA = this.f16922a.a();
            C1744k0 c1744k0F = c1744k0.f(new String(Base64.encode((byte[]) pairA.first, 0)));
            c1744k0F.f16518h = ((Integer) pairA.second).intValue();
            return c1744k0F;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n2$e */
    public class e implements C1846o2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1979tb f16923a;

        public e(C1821n2 c1821n2, C1979tb c1979tb) {
            this.f16923a = c1979tb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.C1846o2.e
        public C1744k0 a(C1744k0 c1744k0) {
            C1744k0 c1744k0F = c1744k0.f(V0.a(AbstractC1594e.a((AbstractC1594e) this.f16923a.f17444a)));
            c1744k0F.f16518h = this.f16923a.f17445b.a();
            return c1744k0F;
        }
    }

    public C1821n2(U3 u10, Context context, C2074x1 c2074x1, C2080x7 c2080x7, C1577d7 c1577d7) {
        this.f16910b = c2074x1;
        this.f16909a = context;
        this.f16912d = new C1520b0(u10);
        this.f16914f = c2080x7;
        this.f16915g = c1577d7;
    }

    private Im a(C1746k2 c1746k2) {
        return AbstractC2145zm.b(c1746k2.b().c());
    }

    private Future<Void> a(C1846o2.f fVar) {
        fVar.a().a(this.f16913e);
        return this.f16916h.queueReport(fVar);
    }

    public Context a() {
        return this.f16909a;
    }

    public Future<Void> a(U3 u10) {
        return this.f16916h.queuePauseUserSession(u10);
    }

    public Future<Void> a(C1744k0 c1744k0, C1746k2 c1746k2, Map<String, Object> map) {
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        this.f16910b.f();
        C1846o2.f fVar = new C1846o2.f(c1744k0, c1746k2);
        if (!U2.b(map)) {
            fVar.a(new a(map, c1746k2));
        }
        return a(fVar);
    }

    public void a(IMetricaService iMetricaService, C1744k0 c1744k0, C1746k2 c1746k2) throws RemoteException {
        iMetricaService.reportData(c1744k0.b(c1746k2.c()));
        C1944s1 c1944s1 = this.f16911c;
        if (c1944s1 == null || c1944s1.f14245b.f()) {
            this.f16910b.g();
        }
    }

    public void a(Fb fb2, C1746k2 c1746k2) {
        for (C1979tb<Rf, Fn> c1979tb : fb2.toProto()) {
            S s10 = new S(a(c1746k2));
            s10.f16515e = EnumC1745k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.b();
            a(new C1846o2.f(s10, c1746k2).a(new e(this, c1979tb)));
        }
    }

    public void a(Gg gg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", gg);
        int i10 = AbstractC2145zm.f18052e;
        Im imG = Im.g();
        List<Integer> list = J0.f14266i;
        a(new S("", "", EnumC1745k1.EVENT_TYPE_REQUEST_REFERRER.b(), 0, imG).c(bundle), this.f16912d);
    }

    public void a(Ki ki) {
        this.f16913e = ki;
        this.f16912d.a(ki);
    }

    public void a(C1511ag c1511ag, C1746k2 c1746k2) {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_SEND_USER_PROFILE.b();
        a(new C1846o2.f(c1744k0, c1746k2).a(new b(this, c1511ag)));
    }

    public void a(C1744k0 c1744k0, C1746k2 c1746k2) {
        if (J0.f(c1744k0.f16515e)) {
            c1744k0.c(c1746k2.f16558c.a());
        }
        a(c1744k0, c1746k2, (Map<String, Object>) null);
    }

    public void a(C1876p7 c1876p7, C1746k2 c1746k2) {
        this.f16910b.f();
        C1846o2.f fVarA = this.f16915g.a(c1876p7, c1746k2);
        fVarA.a().a(this.f16913e);
        this.f16916h.sendCrash(fVarA);
    }

    public void a(C1896q2 c1896q2, C1746k2 c1746k2) {
        S s10 = new S(a(c1746k2));
        s10.f16515e = EnumC1745k1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        a(new C1846o2.f(s10, c1746k2).a(new d(this, c1896q2)));
    }

    public void a(C1944s1 c1944s1) {
        this.f16911c = c1944s1;
    }

    public void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (U2.a(bool)) {
            this.f16912d.b().i(bool.booleanValue());
        }
        if (U2.a(bool2)) {
            this.f16912d.b().k(bool2.booleanValue());
        }
        if (U2.a(bool3)) {
            CounterConfiguration counterConfigurationB = this.f16912d.b();
            boolean zBooleanValue = bool3.booleanValue();
            synchronized (counterConfigurationB) {
                counterConfigurationB.f13444c.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(zBooleanValue));
            }
        }
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.b();
        a(c1744k0, this.f16912d);
    }

    public void a(String str) {
        this.f16912d.a().a(str);
    }

    public void a(String str, C1746k2 c1746k2) {
        try {
            a(J0.c(V0.a(AbstractC1594e.a(this.f16914f.b(new L7(str == null ? new byte[0] : str.getBytes("UTF-8"), new K7(O7.USER, null))))), a(c1746k2)), c1746k2);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public void a(String str, String str2, C1746k2 c1746k2) {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.b();
        a(new C1846o2.f(c1744k0.a(str, str2), c1746k2));
    }

    public void a(List<String> list) {
        this.f16912d.a().a(list);
    }

    public void a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C1621f1(list, map, resultReceiver));
        EnumC1745k1 enumC1745k1 = EnumC1745k1.EVENT_TYPE_STARTUP;
        int i10 = AbstractC2145zm.f18052e;
        Im imG = Im.g();
        List<Integer> list2 = J0.f14266i;
        a(new S("", "", enumC1745k1.b(), 0, imG).c(bundle), this.f16912d);
    }

    public void a(Map<String, String> map) {
        this.f16912d.a().a(map);
    }

    public ea.f b() {
        return this.f16916h;
    }

    public Future<Void> b(U3 u10) {
        return this.f16916h.queueResumeUserSession(u10);
    }

    public void b(C1746k2 c1746k2) {
        Pe pe2 = c1746k2.f16559d;
        String strE = c1746k2.e();
        Im imA = a(c1746k2);
        List<Integer> list = J0.f14266i;
        JSONObject jSONObject = new JSONObject();
        if (pe2 != null) {
            pe2.a(jSONObject);
        }
        a(new S(jSONObject.toString(), "", EnumC1745k1.EVENT_TYPE_ACTIVATION.b(), 0, imA).d(strE), c1746k2);
    }

    public void b(C1876p7 c1876p7, C1746k2 c1746k2) {
        this.f16910b.f();
        a(this.f16915g.a(c1876p7, c1746k2));
    }

    public void b(String str) {
        this.f16912d.a().b(str);
    }

    public void b(String str, C1746k2 c1746k2) {
        a(new C1846o2.f(S.a(str, a(c1746k2)), c1746k2).a(new c(this, str)));
    }

    public C2074x1 c() {
        return this.f16910b;
    }

    public void c(C1746k2 c1746k2) {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.b();
        a(new C1846o2.f(c1744k0, c1746k2));
    }

    public void d() {
        this.f16910b.g();
    }

    public void e() {
        this.f16910b.f();
    }

    public void f() {
        this.f16910b.a();
    }

    public void g() {
        this.f16910b.c();
    }
}
