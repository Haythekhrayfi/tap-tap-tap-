package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Zl implements Jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2144zl f15703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2014ul f15704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F9 f15705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1516al f15706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1840nl f15707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Activity f15708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Il f15709g;

    public class a implements Um<Activity> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Activity activity) {
            Zl.this.f15703a.a(activity);
        }
    }

    public Zl(Context context, F9 f10, InterfaceC1741jm interfaceC1741jm, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Il il) {
        this(context, f10, interfaceC1741jm, interfaceExecutorC1966sn, il, new C1516al(il));
    }

    private Zl(Context context, F9 f10, InterfaceC1741jm interfaceC1741jm, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Il il, C1516al c1516al) {
        this(f10, interfaceC1741jm, il, c1516al, new Lk(1, f10), new C1667gm(interfaceExecutorC1966sn, new Mk(f10), c1516al), new Ik(context));
    }

    public Zl(F9 f10, Il il, InterfaceC1741jm interfaceC1741jm, C1667gm c1667gm, C1516al c1516al, C2144zl c2144zl, C2014ul c2014ul, Nk nk) {
        this.f15705c = f10;
        this.f15709g = il;
        this.f15706d = c1516al;
        this.f15703a = c2144zl;
        this.f15704b = c2014ul;
        C1840nl c1840nl = new C1840nl(new a(), interfaceC1741jm);
        this.f15707e = c1840nl;
        c1667gm.a(nk, c1840nl);
    }

    private Zl(F9 f10, InterfaceC1741jm interfaceC1741jm, Il il, C1516al c1516al, Lk lk, C1667gm c1667gm, Ik ik) {
        this(f10, il, interfaceC1741jm, c1667gm, c1516al, new C2144zl(il, lk, f10, c1667gm, ik), new C2014ul(il, lk, f10, c1667gm, ik), new Nk());
    }

    public synchronized void a(Activity activity) {
        this.f15707e.a(activity);
        this.f15708f = null;
    }

    @Override // com.yandex.metrica.impl.ob.Jl
    public synchronized void a(Il il) {
        if (!il.equals(this.f15709g)) {
            this.f15706d.a(il);
            this.f15704b.a(il);
            this.f15703a.a(il);
            this.f15709g = il;
            Activity activity = this.f15708f;
            if (activity != null) {
                this.f15703a.b(activity);
            }
        }
    }

    public synchronized void a(Ol ol, boolean z10) {
        this.f15704b.a(this.f15708f, ol, z10);
        this.f15705c.c(true);
    }

    public synchronized void b(Activity activity) {
        this.f15708f = activity;
        this.f15703a.a(activity);
    }
}
