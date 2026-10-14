package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ek implements eg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f20264a = new ArrayList();

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(float f10) {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(f10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j10) {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(View view, List<qc1> list) {
        fd.j0.i(view, "view");
        fd.j0.i(list, "friendlyOverlays");
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(view, list);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(eg1.a aVar) {
        fd.j0.i(aVar, "quartile");
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(aVar);
        }
    }

    public final void a(fg1 fg1Var) {
        fd.j0.i(fg1Var, "tracker");
        this.f20264a.add(fg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(pd1 pd1Var) {
        fd.j0.i(pd1Var, "error");
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(pd1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(String str) {
        fd.j0.i(str, "assetName");
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).a(str);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void b() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void c() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void d() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void e() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void f() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void g() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void h() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).h();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void i() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).i();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void j() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void k() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).k();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void l() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).l();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void m() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).m();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void n() {
        Iterator it = this.f20264a.iterator();
        while (it.hasNext()) {
            ((eg1) it.next()).n();
        }
    }
}
