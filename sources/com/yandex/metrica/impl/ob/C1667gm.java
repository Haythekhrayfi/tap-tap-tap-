package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1667gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f16229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Mk f16231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Hl f16232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1516al f16233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f16234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<InterfaceC1567cm> f16235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<C2094xl> f16236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1566cl.a f16237i;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gm$a */
    public static class a {
    }

    public C1667gm(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Mk mk, C1516al c1516al) {
        this(interfaceExecutorC1966sn, mk, c1516al, new Hl(), new a(), Collections.emptyList(), new C1566cl.a());
    }

    public C1667gm(InterfaceExecutorC1966sn interfaceExecutorC1966sn, Mk mk, C1516al c1516al, Hl hl, a aVar, List<C2094xl> list, C1566cl.a aVar2) {
        this.f16235g = new ArrayList();
        this.f16230b = interfaceExecutorC1966sn;
        this.f16231c = mk;
        this.f16233e = c1516al;
        this.f16232d = hl;
        this.f16234f = aVar;
        this.f16236h = list;
        this.f16237i = aVar2;
    }

    public static void a(C1667gm c1667gm, Activity activity, long j10) {
        Iterator<InterfaceC1567cm> it = c1667gm.f16235g.iterator();
        while (it.hasNext()) {
            it.next().a(activity, j10);
        }
    }

    public static void a(C1667gm c1667gm, List list, Gl gl, List list2, Activity activity, Il il, C1566cl c1566cl, long j10) {
        Objects.requireNonNull(c1667gm);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1517am) it.next()).a(j10, activity, gl, list2, il, c1566cl);
        }
        Iterator<InterfaceC1567cm> it2 = c1667gm.f16235g.iterator();
        while (it2.hasNext()) {
            it2.next().a(j10, activity, gl, list2, il, c1566cl);
        }
    }

    public static void a(C1667gm c1667gm, List list, Throwable th, C1542bm c1542bm) {
        Objects.requireNonNull(c1667gm);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1517am) it.next()).a(th, c1542bm);
        }
        Iterator<InterfaceC1567cm> it2 = c1667gm.f16235g.iterator();
        while (it2.hasNext()) {
            it2.next().a(th, c1542bm);
        }
    }

    public void a(Activity activity, long j10, Il il, C1542bm c1542bm, List<InterfaceC1517am> list) {
        boolean z10;
        Iterator<C2094xl> it = this.f16236h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (it.next().a(activity, c1542bm)) {
                z10 = true;
                break;
            }
        }
        boolean z11 = z10;
        WeakReference weakReference = new WeakReference(activity);
        C1566cl.a aVar = this.f16237i;
        C1516al c1516al = this.f16233e;
        Objects.requireNonNull(aVar);
        RunnableC1642fm runnableC1642fm = new RunnableC1642fm(this, weakReference, list, il, c1542bm, new C1566cl(c1516al, il), z11);
        Runnable runnable = this.f16229a;
        if (runnable != null) {
            ((C1941rn) this.f16230b).a(runnable);
        }
        this.f16229a = runnableC1642fm;
        Iterator<InterfaceC1567cm> it2 = this.f16235g.iterator();
        while (it2.hasNext()) {
            it2.next().a(activity, z11);
        }
        ((C1941rn) this.f16230b).a(runnableC1642fm, j10);
    }

    public void a(InterfaceC1567cm... interfaceC1567cmArr) {
        this.f16235g.addAll(Arrays.asList(interfaceC1567cmArr));
    }
}
