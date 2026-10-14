package z6;

import android.os.SystemClock;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.base.BaseViewModel;
import com.inscode.autoclicker.base.ViewModelEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends BaseViewModel implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f45142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f45143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc.a<ViewModelEvent> f45144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gc.a<r6.c> f45145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nb.a f45146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.a f45147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45148g;

    public static final class a extends vc.l implements uc.a<nb.b> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public nb.b invoke() {
            return ec.a.e(x0.this.f45142a.f34785e.u(fc.a.f29534b).p(mb.a.a()), v0.f45140c, null, new w0(x0.this), 2);
        }
    }

    public static final class b extends vc.l implements uc.l<v6.a, lb.j<? extends List<r6.d>>> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public lb.j<? extends List<r6.d>> invoke(v6.a aVar) {
            v6.a aVar2 = aVar;
            fd.j0.i(aVar2, "recordSettings");
            xe.a.f37601c.a("Currently playing: " + aVar2.getName(), new Object[0]);
            lb.i iVarO = new vb.l(new d6.i(x0.this, aVar2)).g(new p6.a(z0.f45157c, 29)).g(new y0(new b1(aVar2), 0)).u(fc.a.f29534b).o(new y0(new c1(x0.this), 1));
            x6.b bVar = new x6.b(new d1(x0.this, aVar2), 16);
            pb.b<? super Throwable> bVar2 = rb.a.f35360c;
            pb.a aVar3 = rb.a.f35359b;
            return iVarO.i(bVar, bVar2, aVar3, aVar3).y().f(new y0(new e1(aVar2), 2)).d(aVar2.g(), TimeUnit.MILLISECONDS).p().i(new x6.b(new f1(aVar2), 17), bVar2, aVar3, aVar3).s(aVar2.f() == 0 ? 999999999L : aVar2.f());
        }
    }

    public static final class c extends vc.l implements uc.l<Throwable, jc.w> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            fd.j0.i(th2, "it");
            x0.this.f45148g = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[COMBINE] [ERROR] (startPlaying) Error in playing subscription. ");
            sb2.append(th2);
            sb2.append(' ');
            xe.a.f37601c.b(r2.a.a(th2, sb2), new Object[0]);
            th2.printStackTrace();
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.a<jc.w> {
        public d() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            x0.this.e();
            x0.this.f45142a.b();
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.l<List<r6.d>, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f45153c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ jc.w invoke(List<r6.d> list) {
            return jc.w.f31842a;
        }
    }

    public x0(q6.b bVar, r rVar) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(rVar, "combineSettingsProvider");
        this.f45142a = bVar;
        this.f45143b = rVar;
        this.f45144c = new gc.a<>();
        this.f45145d = new gc.a<>();
        new gc.a();
        this.f45146e = new nb.a();
        this.f45147f = new nb.a();
        new nb.a();
    }

    @Override // z6.u0
    public void a() {
        this.f45148g = true;
        this.f45144c.d(o0.f45123a);
    }

    @Override // z6.u0
    public void b() {
        this.f45148g = false;
        this.f45144c.d(p0.f45125a);
    }

    @Override // z6.u0
    public void c(com.inscode.autoclicker.utils.b bVar) {
        this.f45145d.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), bVar.getType(), 0, 16, null));
    }

    @Override // z6.u0
    public void d() {
        gc.a<ViewModelEvent> aVar;
        ViewModelEvent viewModelEvent;
        if (m()) {
            aVar = this.f45144c;
            viewModelEvent = p.f45124a;
        } else {
            if (!n()) {
                this.f45144c.d(q0.f45127a);
                this.f45142a.f();
                t6.a aVar2 = this.f45143b.f45130c;
                fd.j0.f(aVar2);
                lb.i iVarL = lb.i.l(aVar2.d());
                lb.l lVar = fc.a.f29534b;
                nb.b bVarB = ec.a.b(iVarL.q(lVar, false, 1).g(new p6.a(new b(), 28)).h(aVar2.f(), TimeUnit.MILLISECONDS).s(aVar2.e() == 0 ? 999999999L : aVar2.e()).u(lVar).p(lVar), new c(), new d(), e.f45153c);
                p6.b.a(bVarB, "$receiver", this.f45147f, "compositeDisposable", bVarB);
                return;
            }
            aVar = this.f45144c;
            viewModelEvent = q.f45126a;
        }
        aVar.d(viewModelEvent);
    }

    @Override // z6.u0
    public void e() {
        this.f45148g = false;
        this.f45142a.g();
        this.f45147f.d();
        this.f45144c.d(r0.f45132a);
        xe.a.f37601c.a("[COMBINE] Playing stopped.", new Object[0]);
    }

    @Override // z6.u0
    public void f() {
        getDisposables().d();
        this.f45147f.d();
        this.f45146e.d();
    }

    @Override // z6.u0
    public gc.a<ViewModelEvent> g() {
        return this.f45144c;
    }

    @Override // z6.u0
    public t6.a i() {
        return this.f45143b.f45130c;
    }

    @Override // z6.u0
    public void l() {
        launch(new a());
    }

    @Override // z6.u0
    public boolean m() {
        List<v6.a> listD;
        t6.a aVar = this.f45143b.f45130c;
        if (aVar == null || (listD = aVar.d()) == null) {
            return true;
        }
        return listD.isEmpty();
    }

    @Override // z6.u0
    public boolean n() {
        return this.f45143b.f45130c == null;
    }
}
