package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1771l2 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U3 f16788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1821n2 f16789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f16790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Ii f16791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, W0> f16792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uo<String> f16793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<String> f16794h;

    public C1771l2(Context context, U3 u10, C1821n2 c1821n2, Handler handler, Ii ii) {
        HashMap map = new HashMap();
        this.f16792f = map;
        this.f16793g = new ro(new wo(map));
        this.f16794h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.f16787a = context;
        this.f16788b = u10;
        this.f16789c = c1821n2;
        this.f16790d = handler;
        this.f16791e = ii;
    }

    private void a(J j10) {
        j10.a(new C1770l1(this.f16790d, j10));
        j10.f14245b.a(this.f16791e);
    }

    @Override // com.yandex.metrica.impl.ob.X0
    public synchronized InterfaceC1521b1 a(com.yandex.metrica.j jVar) {
        W0 w10;
        W0 w11 = this.f16792f.get(jVar.apiKey);
        w10 = w11;
        if (w11 == null) {
            C1769l0 c1769l0 = new C1769l0(this.f16787a, this.f16788b, jVar, this.f16789c);
            a(c1769l0);
            c1769l0.a(jVar.errorEnvironment);
            c1769l0.f();
            w10 = c1769l0;
        }
        return w10;
    }

    public C1944s1 a(com.yandex.metrica.j jVar, boolean z10, F9 f10) {
        this.f16793g.a(jVar.apiKey);
        Context context = this.f16787a;
        U3 u10 = this.f16788b;
        C1944s1 c1944s1 = new C1944s1(context, u10, jVar, this.f16789c, new R7(context, u10), this.f16791e, new S2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new S2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), f10, new Cg(), Y.g(), new K0(context));
        a(c1944s1);
        if (z10) {
            c1944s1.f14252i.c(c1944s1.f14245b);
        }
        Map<String, String> map = jVar.f18073h;
        if (!U2.b(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    c1944s1.f14252i.a(key, value, c1944s1.f14245b);
                } else if (c1944s1.f14246c.c()) {
                    c1944s1.f14246c.c("Invalid App Environment (key,value) pair: (%s,%s).", key, value);
                }
            }
        }
        c1944s1.a(jVar.errorEnvironment);
        c1944s1.f();
        this.f16789c.a(c1944s1);
        this.f16792f.put(jVar.apiKey, c1944s1);
        return c1944s1;
    }

    @Override // com.yandex.metrica.impl.ob.X0
    public synchronized W0 b(com.yandex.metrica.f fVar) {
        W0 w10;
        W0 w11 = this.f16792f.get(fVar.apiKey);
        w10 = w11;
        if (w11 == null) {
            if (!this.f16794h.contains(fVar.apiKey)) {
                this.f16791e.g();
            }
            C1994u1 c1994u1 = new C1994u1(this.f16787a, this.f16788b, fVar, this.f16789c);
            a(c1994u1);
            c1994u1.f();
            this.f16792f.put(fVar.apiKey, c1994u1);
            w10 = c1994u1;
        }
        return w10;
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return this;
    }

    public synchronized void c(com.yandex.metrica.f fVar) {
        if (this.f16792f.containsKey(fVar.apiKey)) {
            Im imB = AbstractC2145zm.b(fVar.apiKey);
            if (imB.c()) {
                imB.c("Reporter with apiKey=%s already exists.", fVar.apiKey);
            }
        } else {
            b(fVar);
            Log.i("AppMetrica", "Activate reporter with APIKey " + U2.a(fVar.apiKey));
        }
    }
}
