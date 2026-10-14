package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2086xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f17837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f17838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f17839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f17840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uc f17841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2136zd f17842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ad f17843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2110yc f17844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1633fd f17845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Fc f17846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, C1658gd> f17847k;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xd$a */
    public static class a {
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xd$b */
    public static class b {
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xd$c */
    public static class c {
    }

    public C2086xd(Context context, Uc uc2, Ad ad2, C2110yc c2110yc, C1887pi c1887pi) {
        this(context, uc2, new c(), new C1633fd(c1887pi), new a(), new b(), ad2, c2110yc);
    }

    public C2086xd(Context context, Uc uc2, c cVar, C1633fd c1633fd, a aVar, b bVar, Ad ad2, C2110yc c2110yc) {
        this.f17847k = new HashMap();
        this.f17840d = context;
        this.f17841e = uc2;
        this.f17837a = cVar;
        this.f17845i = c1633fd;
        this.f17838b = aVar;
        this.f17839c = bVar;
        this.f17843g = ad2;
        this.f17844h = c2110yc;
    }

    public Location a() {
        return this.f17845i.a();
    }

    public void a(Location location) {
        String provider = location.getProvider();
        C1658gd c1658gd = this.f17847k.get(provider);
        if (c1658gd == null) {
            if (this.f17842f == null) {
                c cVar = this.f17837a;
                Context context = this.f17840d;
                Objects.requireNonNull(cVar);
                this.f17842f = new C2136zd(null, Qa.a(context).f(), new Cc(context), new Nm(), P0.i().d(), P0.i().c());
            }
            if (this.f17846j == null) {
                a aVar = this.f17838b;
                C2136zd c2136zd = this.f17842f;
                C1633fd c1633fd = this.f17845i;
                Objects.requireNonNull(aVar);
                this.f17846j = new Fc(c2136zd, c1633fd);
            }
            b bVar = this.f17839c;
            Uc uc2 = this.f17841e;
            Fc fc2 = this.f17846j;
            Ad ad2 = this.f17843g;
            C2110yc c2110yc = this.f17844h;
            Objects.requireNonNull(bVar);
            c1658gd = new C1658gd(uc2, fc2, null, 0L, new R2(), ad2, c2110yc);
            this.f17847k.put(provider, c1658gd);
        } else {
            c1658gd.a(this.f17841e);
        }
        c1658gd.a(location);
    }

    public void a(Qi qi) {
        if (qi.d() != null) {
            this.f17845i.c(qi.d());
        }
    }

    public void a(Uc uc2) {
        this.f17841e = uc2;
    }

    public C1633fd b() {
        return this.f17845i;
    }
}
