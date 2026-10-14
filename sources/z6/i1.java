package z6;

import android.os.SystemClock;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.base.BaseViewModel;
import com.inscode.autoclicker.base.ViewModelEvent;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends BaseViewModel implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f45060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f45061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6.e f45062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gc.a<ViewModelEvent> f45063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gc.a<r6.c> f45064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.a f45065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nb.a f45066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nb.a f45067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45069j;

    public static final class a extends vc.l implements uc.a<nb.b> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public nb.b invoke() {
            return ec.a.e(i1.this.f45060a.f34785e.u(fc.a.f29534b).p(mb.a.a()), g1.f45054c, null, new h1(i1.this), 2);
        }
    }

    public static final class b extends vc.l implements uc.l<Long, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f45071c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Integer invoke(Long l10) {
            fd.j0.i(l10, "it");
            return 1;
        }
    }

    public static final class c extends vc.l implements uc.l<Integer, Boolean> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Integer num) {
            fd.j0.i(num, "it");
            return Boolean.valueOf(i1.this.f45069j);
        }
    }

    public static final class d extends vc.l implements uc.l<Integer, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f45073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AtomicLong atomicLong) {
            super(1);
            this.f45073c = atomicLong;
        }

        @Override // uc.l
        public jc.w invoke(Integer num) {
            this.f45073c.addAndGet(-num.intValue());
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<List<Integer>, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f45075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AtomicLong atomicLong) {
            super(1);
            this.f45075d = atomicLong;
        }

        @Override // uc.l
        public jc.w invoke(List<Integer> list) {
            i1.this.f45063d.d(new t0(Math.max(0L, this.f45075d.get())));
            return jc.w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<v6.a, lb.j<? extends List<r6.d>>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ HashMap<Integer, Integer> f45077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f45078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ vc.z f45079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f45080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ t6.a f45081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ vc.y f45082i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HashMap<Integer, Integer> map, boolean z10, vc.z zVar, AtomicLong atomicLong, t6.a aVar, vc.y yVar) {
            super(1);
            this.f45077d = map;
            this.f45078e = z10;
            this.f45079f = zVar;
            this.f45080g = atomicLong;
            this.f45081h = aVar;
            this.f45082i = yVar;
        }

        @Override // uc.l
        public lb.j<? extends List<r6.d>> invoke(v6.a aVar) {
            v6.a aVar2 = aVar;
            fd.j0.i(aVar2, "recordSettings");
            return new vb.l(new d6.i(i1.this, aVar2)).g(new y0(new j1(this.f45077d, aVar2), 6)).g(new y0(new l1(aVar2, this.f45078e, this.f45079f, this.f45080g, this.f45081h, this.f45082i, this.f45077d, i1.this), 7)).o(new y0(new m1(i1.this), 8)).y().f(new y0(new n1(aVar2), 9)).d(aVar2.g(), TimeUnit.MILLISECONDS).p().s(aVar2.f() == 0 ? 999999999L : aVar2.f());
        }
    }

    public static final class g extends vc.l implements uc.l<Throwable, jc.w> {
        public g() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            fd.j0.i(th2, "it");
            i1 i1Var = i1.this;
            i1Var.f45068i = true;
            i1Var.f45069j = false;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[COMBINE] [ERROR] (startPlaying) Error in playing subscription. ");
            sb2.append(th2);
            sb2.append(' ');
            xe.a.f37601c.b(r2.a.a(th2, sb2), new Object[0]);
            th2.printStackTrace();
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.a<jc.w> {
        public h() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            i1.this.e();
            i1.this.f45060a.b();
            return jc.w.f31842a;
        }
    }

    public static final class i extends vc.l implements uc.l<List<r6.d>, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f45085c = new i();

        public i() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ jc.w invoke(List<r6.d> list) {
            return jc.w.f31842a;
        }
    }

    public i1(q6.b bVar, r rVar, r6.e eVar) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(rVar, "combineSettingsProvider");
        fd.j0.i(eVar, "appSettings");
        this.f45060a = bVar;
        this.f45061b = rVar;
        this.f45062c = eVar;
        this.f45063d = new gc.a<>();
        this.f45064e = new gc.a<>();
        new gc.a();
        this.f45065f = new nb.a();
        this.f45066g = new nb.a();
        this.f45067h = new nb.a();
        new nb.a();
    }

    @Override // z6.u0
    public void a() {
        this.f45068i = true;
        this.f45069j = false;
        this.f45063d.d(o0.f45123a);
    }

    @Override // z6.u0
    public void b() {
        this.f45068i = false;
        this.f45069j = true;
        this.f45063d.d(p0.f45125a);
    }

    @Override // z6.u0
    public void c(com.inscode.autoclicker.utils.b bVar) {
        this.f45064e.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), bVar.getType(), 0, 16, null));
    }

    @Override // z6.u0
    public void d() {
        gc.a<ViewModelEvent> aVar;
        ViewModelEvent viewModelEvent;
        if (m()) {
            aVar = this.f45063d;
            viewModelEvent = p.f45124a;
        } else {
            if (!n()) {
                this.f45069j = true;
                this.f45063d.d(q0.f45127a);
                this.f45060a.f();
                t6.a aVar2 = this.f45061b.f45130c;
                fd.j0.f(aVar2);
                AtomicLong atomicLong = new AtomicLong(aVar2.b());
                boolean zL = this.f45062c.l();
                if (zL) {
                    lb.i iVarJ = lb.i.m(1L, TimeUnit.MILLISECONDS).o(new y0(b.f45071c, 3)).j(new y0(new c(), 4));
                    x6.b bVar = new x6.b(new d(atomicLong), 18);
                    pb.b<? super Throwable> bVar2 = rb.a.f35360c;
                    pb.a aVar3 = rb.a.f35359b;
                    lb.i iVarF = iVarJ.i(bVar, bVar2, aVar3, aVar3).f(1000);
                    lb.l lVar = fc.a.f29534b;
                    nb.b bVarE = ec.a.e(iVarF.u(lVar).p(lVar), null, null, new e(atomicLong), 3);
                    p6.b.a(bVarE, "$receiver", this.f45067h, "compositeDisposable", bVarE);
                }
                vc.y yVar = new vc.y();
                HashMap map = new HashMap();
                vc.z zVar = new vc.z();
                zVar.f37007c = SystemClock.elapsedRealtime();
                vb.e eVar = new vb.e(new d6.i(yVar, aVar2));
                lb.l lVar2 = fc.a.f29534b;
                nb.b bVarB = ec.a.b(eVar.u(lVar2).q(lVar2, false, 1).g(new y0(new f(map, zL, zVar, atomicLong, aVar2, yVar), 5)).h(aVar2.f(), TimeUnit.MILLISECONDS).s(aVar2.e() == 0 ? 999999999L : aVar2.e()).u(lVar2).p(lVar2), new g(), new h(), i.f45085c);
                p6.b.a(bVarB, "$receiver", this.f45066g, "compositeDisposable", bVarB);
                return;
            }
            aVar = this.f45063d;
            viewModelEvent = q.f45126a;
        }
        aVar.d(viewModelEvent);
    }

    @Override // z6.u0
    public void e() {
        this.f45068i = false;
        this.f45069j = false;
        this.f45060a.g();
        this.f45066g.d();
        this.f45067h.d();
        this.f45063d.d(r0.f45132a);
        xe.a.f37601c.a("[COMBINE] Playing stopped.", new Object[0]);
    }

    @Override // z6.u0
    public void f() {
        getDisposables().d();
        this.f45066g.d();
        this.f45065f.d();
        this.f45067h.d();
    }

    @Override // z6.u0
    public gc.a<ViewModelEvent> g() {
        return this.f45063d;
    }

    @Override // z6.u0
    public t6.a i() {
        return this.f45061b.f45130c;
    }

    @Override // z6.u0
    public void l() {
        launch(new a());
    }

    @Override // z6.u0
    public boolean m() {
        List<v6.a> listD;
        t6.a aVar = this.f45061b.f45130c;
        if (aVar == null || (listD = aVar.d()) == null) {
            return true;
        }
        return listD.isEmpty();
    }

    @Override // z6.u0
    public boolean n() {
        return this.f45061b.f45130c == null;
    }
}
