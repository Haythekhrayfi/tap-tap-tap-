package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2115yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Q9<Eh> f17931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Eh f17932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Nm f17933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Gh f17934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f17935e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yh$a */
    public interface a {
    }

    public C2115yh(Q9<Eh> q10, a aVar) {
        this(q10, aVar, new Nm(), new Gh(q10));
    }

    public C2115yh(Q9<Eh> q10, a aVar, Nm nm, Gh gh) {
        this.f17931a = q10;
        this.f17932b = (Eh) q10.b();
        this.f17933c = nm;
        this.f17934d = gh;
        this.f17935e = aVar;
    }

    public void a() {
        Eh eh = this.f17932b;
        List<Hh> list = eh.f13908a;
        String str = eh.f13909b;
        Objects.requireNonNull(this.f17933c);
        Eh eh2 = new Eh(list, str, System.currentTimeMillis(), true, true);
        this.f17931a.a(eh2);
        this.f17932b = eh2;
        Bh bh = (Bh) this.f17935e;
        bh.f13726a.b();
        bh.f13726a.f13830h = false;
    }

    public void a(Eh eh) {
        this.f17931a.a(eh);
        this.f17932b = eh;
        this.f17934d.a();
        Bh bh = (Bh) this.f17935e;
        bh.f13726a.b();
        bh.f13726a.f13830h = false;
    }
}
