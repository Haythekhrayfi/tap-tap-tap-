package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1822n3 implements InterfaceC1571d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f16924n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F9 f16926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ii f16927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dg f16928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U3 f16929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1771l2 f16930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1821n2 f16931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1993u0 f16932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1506ab f16933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C f16934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I2 f16935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile C1969t1 f16936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IIdentifierCallback f16937m;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n3$a */
    public class a implements IIdentifierCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppMetricaDeviceIDListener f16938a;

        public a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f16938a = appMetricaDeviceIDListener;
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
            C1822n3.a(C1822n3.this, (IIdentifierCallback) null);
            this.f16938a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
            C1822n3.a(C1822n3.this, (IIdentifierCallback) null);
            this.f16938a.onError((AppMetricaDeviceIDListener.Reason) C1822n3.f16924n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        f16924n = enumMap;
        enumMap.put(IIdentifierCallback.Reason.UNKNOWN, AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put(IIdentifierCallback.Reason.INVALID_RESPONSE, AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put(IIdentifierCallback.Reason.NETWORK, AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    public C1822n3(Context context, InterfaceC1546c1 interfaceC1546c1) {
        this(context.getApplicationContext(), interfaceC1546c1, new F9(Qa.a(context.getApplicationContext()).c()));
    }

    private C1822n3(Context context, InterfaceC1546c1 interfaceC1546c1, F9 f10) {
        this(context, interfaceC1546c1, f10, new X(context), new C1847o3(), Y.g(), new C1506ab());
    }

    public C1822n3(Context context, InterfaceC1546c1 interfaceC1546c1, F9 f10, X x10, C1847o3 c1847o3, Y y10, C1506ab c1506ab) {
        this.f16925a = context;
        this.f16926b = f10;
        Handler handlerC = interfaceC1546c1.c();
        U3 u3A = c1847o3.a(context, c1847o3.a(handlerC, this));
        this.f16929e = u3A;
        C1993u0 c1993u0F = y10.f();
        this.f16932h = c1993u0F;
        C1821n2 c1821n2A = c1847o3.a(u3A, context, interfaceC1546c1.b());
        this.f16931g = c1821n2A;
        c1993u0F.a(c1821n2A);
        x10.a(context);
        Ii iiA = c1847o3.a(context, c1821n2A, f10, handlerC);
        this.f16927c = iiA;
        this.f16934j = interfaceC1546c1.a();
        this.f16933i = c1506ab;
        c1821n2A.a(iiA);
        this.f16928d = c1847o3.a(c1821n2A, f10, handlerC);
        this.f16930f = c1847o3.a(context, u3A, c1821n2A, handlerC, iiA);
        this.f16935k = y10.k();
    }

    public static /* synthetic */ IIdentifierCallback a(C1822n3 c1822n3, IIdentifierCallback iIdentifierCallback) {
        c1822n3.f16937m = null;
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public W0 a(com.yandex.metrica.f fVar) {
        return this.f16930f.b(fVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public String a() {
        return this.f16927c.e();
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC1819n0.a
    public void a(int i10, Bundle bundle) {
        this.f16927c.a(bundle, (InterfaceC2116yi) null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(Location location) {
        this.f16936l.b().a(location);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.f16937m = aVar;
        this.f16927c.a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f16929e.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f16928d.a(deferredDeeplinkListener);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f16928d.a(deferredDeeplinkParametersListener);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f16927c.a(iIdentifierCallback, list, this.f16929e.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar) {
        this.f16933i.a(this.f16925a, this.f16927c).a(yandexMetricaConfig, this.f16927c.c());
        Im imB = AbstractC2145zm.b(jVar.apiKey);
        C2095xm c2095xmA = AbstractC2145zm.a(jVar.apiKey);
        Objects.requireNonNull(this.f16932h);
        if (this.f16936l != null) {
            if (imB.c()) {
                imB.c("Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.f16928d.a();
        this.f16927c.a(imB);
        this.f16927c.a(jVar.f18069d);
        this.f16927c.a(jVar.f18067b);
        this.f16927c.a(jVar.f18068c);
        if (U2.a((Object) jVar.f18068c)) {
            this.f16927c.b("api");
        }
        this.f16929e.b(jVar);
        this.f16931g.a(jVar.locationTracking, jVar.statisticsSending, (Boolean) null);
        C1944s1 c1944s1A = this.f16930f.a(jVar, false, this.f16926b);
        this.f16936l = new C1969t1(c1944s1A, new C1918r0(c1944s1A));
        this.f16934j.a(this.f16936l.a());
        this.f16935k.a(c1944s1A);
        this.f16927c.g();
        Log.i("AppMetrica", "Activate AppMetrica with APIKey " + U2.a(jVar.apiKey));
        if (Boolean.TRUE.equals(jVar.logs)) {
            imB.e();
            c2095xmA.e();
            Im.g().e();
            C2095xm.g().e();
            return;
        }
        imB.d();
        c2095xmA.d();
        Im.g().d();
        C2095xm.g().d();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(boolean z10) {
        this.f16936l.b().a(z10);
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return this.f16930f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void b(boolean z10) {
        this.f16936l.b().b(z10);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public String c() {
        return this.f16927c.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void c(com.yandex.metrica.f fVar) {
        this.f16930f.c(fVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void c(String str, String str2) {
        this.f16936l.b().c(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public C1969t1 d() {
        return this.f16936l;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setStatisticsSending(boolean z10) {
        this.f16936l.b().setStatisticsSending(z10);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setUserProfileID(String str) {
        this.f16936l.b().setUserProfileID(str);
    }
}
