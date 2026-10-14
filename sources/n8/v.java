package n8;

import androidx.viewpager.widget.ViewPager;
import fd.j0;
import i8.q0;
import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements ViewPager.j, t9.c.InterfaceC0418c<y9.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f33702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8.j f33703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.h f33704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f33705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t9.t f33706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f7 f33707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33708g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public v(i8.k kVar, l8.j jVar, p7.h hVar, q0 q0Var, t9.t tVar, f7 f7Var) {
        j0.i(kVar, "div2View");
        j0.i(jVar, "actionBinder");
        j0.i(hVar, "div2Logger");
        j0.i(q0Var, "visibilityActionTracker");
        j0.i(tVar, "tabLayout");
        j0.i(f7Var, "div");
        this.f33702a = kVar;
        this.f33703b = jVar;
        this.f33704c = hVar;
        this.f33705d = q0Var;
        this.f33706e = tVar;
        this.f33707f = f7Var;
        this.f33708g = -1;
    }

    @Override // t9.c.InterfaceC0418c
    public void a(y9.q qVar, int i10) {
        y9.q qVar2 = qVar;
        j0.i(qVar2, "action");
        if (qVar2.f42098c != null) {
            e9.c cVar = e9.c.f29122a;
        }
        this.f33704c.c(this.f33702a, i10, qVar2);
        this.f33703b.a(this.f33702a, qVar2, null);
    }

    public final ViewPager b() {
        return this.f33706e.getViewPager();
    }

    public final void c(int i10) {
        int i11 = this.f33708g;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1) {
            f7.e eVar = this.f33707f.f40008o.get(i11);
            q0 q0Var = this.f33705d;
            i8.k kVar = this.f33702a;
            y9.k kVar2 = eVar.f40026a;
            q0Var.d(kVar, null, kVar2, (8 & 8) != 0 ? l8.b.A(kVar2.a()) : null);
            this.f33702a.G(b());
        }
        f7.e eVar2 = this.f33707f.f40008o.get(i10);
        q0 q0Var2 = this.f33705d;
        i8.k kVar3 = this.f33702a;
        ViewPager viewPagerB = b();
        y9.k kVar4 = eVar2.f40026a;
        q0Var2.d(kVar3, viewPagerB, kVar4, (8 & 8) != 0 ? l8.b.A(kVar4.a()) : null);
        this.f33702a.p(b(), eVar2.f40026a);
        this.f33708g = i10;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i10, float f10, int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i10) {
        this.f33704c.p(this.f33702a, i10);
        c(i10);
    }
}
