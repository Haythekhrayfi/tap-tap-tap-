package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC1642fm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f16146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Il f16148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1542bm f16149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1566cl f16150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f16151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1667gm f16152g;

    public RunnableC1642fm(C1667gm c1667gm, WeakReference weakReference, List list, Il il, C1542bm c1542bm, C1566cl c1566cl, boolean z10) {
        this.f16152g = c1667gm;
        this.f16146a = weakReference;
        this.f16147b = list;
        this.f16148c = il;
        this.f16149d = c1542bm;
        this.f16150e = c1566cl;
        this.f16151f = z10;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        boolean z10;
        Gl glA;
        Activity activity = (Activity) this.f16146a.get();
        if (activity == null) {
            return;
        }
        C1667gm.a aVar = this.f16152g.f16234f;
        List list = this.f16147b;
        List list2 = this.f16152g.f16235g;
        Il il = this.f16148c;
        Objects.requireNonNull(aVar);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = false;
                        break;
                    } else if (((InterfaceC1517am) it2.next()).a(il)) {
                    }
                }
            } else if (((InterfaceC1517am) it.next()).a(il)) {
            }
            z10 = true;
            break;
        }
        InterfaceC1715il c2069wl = z10 ? new C2069wl() : new Qk();
        long jA = this.f16152g.f16231c.a();
        C1667gm.a(this.f16152g, activity, jA);
        try {
            glA = this.f16152g.f16232d.a(activity, this.f16149d, this.f16150e.c(), c2069wl, this.f16151f);
        } catch (Throwable th) {
            C1667gm.a(this.f16152g, this.f16147b, th, this.f16149d);
            glA = null;
        }
        if (glA != null) {
            C1667gm.a(this.f16152g, this.f16147b, glA, c2069wl.a(), activity, this.f16148c, this.f16150e, jA);
        }
    }
}
