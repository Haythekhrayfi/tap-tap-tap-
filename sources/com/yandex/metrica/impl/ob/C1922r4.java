package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.InterfaceC1723j4;
import com.yandex.metrica.impl.ob.InterfaceC1798m4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.yandex.metrica.impl.ob.l4] */
/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1922r4<COMPONENT extends InterfaceC1798m4 & InterfaceC1723j4> implements Object, Li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1549c4 f17206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I4<COMPONENT> f17207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Si f17208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2052w4 f17209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private COMPONENT f17210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC1748k4 f17211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Li> f17212h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1574d4<E4> f17213i;

    public C1922r4(Context context, C1549c4 c1549c4, X3 x10, C2052w4 c2052w4, I4<COMPONENT> i10, C1574d4<E4> c1574d4, Fi fi) {
        this.f17205a = context;
        this.f17206b = c1549c4;
        this.f17209e = c2052w4;
        this.f17207c = i10;
        this.f17213i = c1574d4;
        this.f17208d = fi.a(context, c1549c4, x10.f15446a);
        fi.a(c1549c4, this);
    }

    private InterfaceC1748k4 a() {
        if (this.f17211g == null) {
            synchronized (this) {
                InterfaceC1748k4 interfaceC1748k4B = this.f17207c.b(this.f17205a, this.f17206b, this.f17209e.a(), this.f17208d);
                this.f17211g = interfaceC1748k4B;
                this.f17212h.add(interfaceC1748k4B);
            }
        }
        return this.f17211g;
    }

    public synchronized void a(E4 e10) {
        this.f17213i.a(e10);
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Hi hi, Qi qi) {
        Iterator<Li> it = this.f17212h.iterator();
        while (it.hasNext()) {
            it.next().a(hi, qi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        Iterator<Li> it = this.f17212h.iterator();
        while (it.hasNext()) {
            it.next().a(qi);
        }
    }

    public void a(X3 x10) {
        this.f17208d.a(x10.f15446a);
        X3.a aVar = x10.f15447b;
        synchronized (this) {
            this.f17209e.a(aVar);
            InterfaceC1748k4 interfaceC1748k4 = this.f17211g;
            if (interfaceC1748k4 != null) {
                ((T4) interfaceC1748k4).a(aVar);
            }
            COMPONENT component = this.f17210f;
            if (component != null) {
                component.a(aVar);
            }
        }
    }

    public void a(C1744k0 c1744k0, X3 x10) {
        InterfaceC1798m4 interfaceC1798m4A;
        ((T4) a()).b();
        if (J0.a(c1744k0.n())) {
            interfaceC1798m4A = a();
        } else {
            if (this.f17210f == null) {
                synchronized (this) {
                    COMPONENT component = (COMPONENT) this.f17207c.a(this.f17205a, this.f17206b, this.f17209e.a(), this.f17208d);
                    this.f17210f = component;
                    this.f17212h.add((Li) component);
                }
            }
            interfaceC1798m4A = this.f17210f;
        }
        if (!J0.b(c1744k0.n())) {
            X3.a aVar = x10.f15447b;
            synchronized (this) {
                this.f17209e.a(aVar);
                InterfaceC1748k4 interfaceC1748k4 = this.f17211g;
                if (interfaceC1748k4 != null) {
                    ((T4) interfaceC1748k4).a(aVar);
                }
                COMPONENT component2 = this.f17210f;
                if (component2 != null) {
                    component2.a(aVar);
                }
            }
        }
        interfaceC1798m4A.a(c1744k0);
    }

    public synchronized void b(E4 e10) {
        this.f17213i.b(e10);
    }
}
