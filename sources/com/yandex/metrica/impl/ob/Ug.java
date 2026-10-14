package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Vg> f15178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Fg f15179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H8 f15181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f15182e;

    public interface a {
        void a(Fg fg);
    }

    public Ug(Context context) {
        this(context, P0.i().y().a());
    }

    public Ug(Context context, H8 h10) {
        this.f15178a = new HashSet();
        this.f15182e = context;
        this.f15181d = h10;
        this.f15179b = h10.g();
        this.f15180c = h10.h();
    }

    public Fg a() {
        return this.f15179b;
    }

    public synchronized void a(Fg fg) {
        this.f15179b = fg;
        this.f15180c = true;
        this.f15181d.a(fg);
        this.f15181d.a(true);
        Fg fg2 = this.f15179b;
        synchronized (this) {
            Iterator<Vg> it = this.f15178a.iterator();
            while (it.hasNext()) {
                it.next().a(fg2);
            }
        }
    }

    public synchronized void a(Vg vg) {
        this.f15178a.add(vg);
        if (this.f15180c) {
            vg.a(this.f15179b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        if (this.f15180c) {
            return;
        }
        Context context = this.f15182e;
        P0 p0I = P0.i();
        fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
        C2146zn c2146znS = p0I.s();
        fd.j0.h(c2146znS, "GlobalServiceLocator.get…).serviceExecutorProvider");
        new Og(this, new Yg(context, c2146znS.b()), new Ig(context), new Zg(context, null, 0 == true ? 1 : 0, 6)).b();
    }
}
