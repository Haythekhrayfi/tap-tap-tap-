package d7;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.base.BaseViewModel;
import com.inscode.autoclicker.base.ViewModelEvent;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p0.m0;
import z6.a1;
import z6.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends BaseViewModel implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f28816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.g f28817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc.a<ViewModelEvent> f28818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gc.a<r6.c> f28819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nb.a f28820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.a f28821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nb.a f28822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28824i;

    public static final class a extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28825c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[RECORD] [ERROR] (listenToFinishDrawing). ", th2, ' ')), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<Boolean, jc.w> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Boolean bool) {
            xe.a.f37601c.a("[RECORD] Drawing finished.", new Object[0]);
            p.this.f28818c.d(m.f28814a);
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.a<nb.b> {
        public c() {
            super(0);
        }

        @Override // uc.a
        public nb.b invoke() {
            return ec.a.e(p.this.f28816a.f34784d.u(fc.a.f29534b).p(mb.a.a()), q.f28836c, null, new r(p.this), 2);
        }
    }

    public static final class d extends vc.l implements uc.l<List<r6.d>, lb.j<? extends r6.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f28828c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public lb.j<? extends r6.d> invoke(List<r6.d> list) {
            List<r6.d> list2 = list;
            fd.j0.i(list2, "it");
            return new vb.m(list2);
        }
    }

    public static final class e extends vc.l implements uc.l<r6.d, lb.j<? extends r6.d>> {
        public e() {
            super(1);
        }

        @Override // uc.l
        public lb.j<? extends r6.d> invoke(r6.d dVar) {
            r6.d dVar2 = dVar;
            fd.j0.i(dVar2, "actionSet");
            return new vb.l(new a1(dVar2, 2)).h(Math.max(0L, (long) ((dVar2.b() - dVar2.c()) / p.this.f28817b.f28802c.e())), TimeUnit.MILLISECONDS);
        }
    }

    public static final class f extends vc.l implements uc.l<r6.d, r6.d> {
        public f() {
            super(1);
        }

        @Override // uc.l
        public r6.d invoke(r6.d dVar) {
            r6.d dVar2 = dVar;
            fd.j0.i(dVar2, "set");
            try {
                xe.a.f37601c.a("[ClickService] is stopped: " + p.this.f28823h, new Object[0]);
                while (p.this.f28823h) {
                    Thread.sleep(300L);
                }
            } catch (Exception unused) {
            }
            return dVar2;
        }
    }

    public static final class g extends vc.l implements uc.l<r6.d, jc.w> {
        public g() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(r6.d dVar) {
            r6.d dVar2 = dVar;
            p pVar = p.this;
            if (pVar.f28824i) {
                q6.b bVar = pVar.f28816a;
                dVar2.i(pVar.f28817b.f28802c.e());
                bVar.c(dVar2);
            }
            return jc.w.f31842a;
        }
    }

    public static final class h extends vc.l implements uc.l<List<r6.d>, lb.o<? extends List<r6.d>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f28832c = new h();

        public h() {
            super(1);
        }

        @Override // uc.l
        public lb.o<? extends List<r6.d>> invoke(List<r6.d> list) {
            List<r6.d> list2 = list;
            fd.j0.i(list2, "it");
            return new wb.g(list2).d(((r6.d) kc.t.x(list2)).c(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class i extends vc.l implements uc.l<Throwable, jc.w> {
        public i() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[RECORD] Error in playing subscription. ", th2, ' ')), new Object[0]);
            th2.printStackTrace();
            p pVar = p.this;
            pVar.f28823h = true;
            pVar.f28824i = false;
            return jc.w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.a<jc.w> {
        public j() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            p.this.e();
            p.this.f28816a.b();
            return jc.w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<List<r6.d>, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f28835c = new k();

        public k() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(List<r6.d> list) {
            StringBuilder sbA = defpackage.a.a("[ClickService] [RECORD] onNext: ");
            sbA.append(list.size());
            xe.a.f37601c.a(sbA.toString(), new Object[0]);
            return jc.w.f31842a;
        }
    }

    public p(q6.b bVar, d7.g gVar) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(gVar, "recordSettingsProvider");
        this.f28816a = bVar;
        this.f28817b = gVar;
        this.f28818c = new gc.a<>();
        this.f28819d = new gc.a<>();
        new gc.a();
        this.f28820e = new nb.a();
        this.f28821f = new nb.a();
        this.f28822g = new nb.a();
    }

    @Override // d7.o
    public void a() {
        this.f28823h = true;
        this.f28824i = false;
        this.f28818c.d(d7.b.f28785a);
    }

    @Override // d7.o
    public void b() {
        this.f28823h = false;
        this.f28824i = true;
        this.f28818c.d(d7.c.f28787a);
    }

    @Override // d7.o
    public void c(com.inscode.autoclicker.utils.b bVar) {
        this.f28819d.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), bVar.getType(), 0, 16, null));
    }

    @Override // d7.o
    public void d() {
        this.f28824i = true;
        if (this.f28817b.f28802c.b().isEmpty()) {
            this.f28818c.d(d7.h.f28805a);
            return;
        }
        this.f28818c.d(d7.d.f28789a);
        v6.a aVar = this.f28817b.f28802c;
        xe.a.f37601c.a("[BackgroundService] Calling start background service from vm.", new Object[0]);
        this.f28816a.f();
        vb.l lVar = new vb.l(new d6.i(aVar, this));
        lb.l lVar2 = fc.a.f29534b;
        lb.i iVarO = lVar.q(lVar2, false, 1).g(new y0(d.f28828c, 13)).g(new y0(new e(), 14)).u(lVar2).o(new y0(new f(), 15));
        x6.b bVar = new x6.b(new g(), 25);
        pb.b<? super Throwable> bVar2 = rb.a.f35360c;
        pb.a aVar2 = rb.a.f35359b;
        lb.c cVarK = iVarO.i(bVar, bVar2, aVar2, aVar2).y().f(new y0(h.f28832c, 16)).d(aVar.g(), TimeUnit.MILLISECONDS).k(aVar.f() == 0 ? 999999999L : aVar.f());
        fd.j0.h(cVarK, "override fun startPlayin…ayingSubscription)\n\n    }");
        nb.b bVarA = ec.a.a(cVarK, new i(), new j(), k.f28835c);
        p6.b.a(bVarA, "$receiver", this.f28821f, "compositeDisposable", bVarA);
    }

    @Override // d7.o
    public void e() {
        this.f28823h = false;
        this.f28824i = false;
        this.f28816a.g();
        this.f28821f.d();
        this.f28818c.d(d7.e.f28797a);
        xe.a.f37601c.a("[RECORD] Playing stopped.", new Object[0]);
    }

    @Override // d7.o
    public void f() {
        getDisposables().d();
        this.f28822g.d();
        this.f28821f.d();
        this.f28820e.d();
        this.f28817b.c(new v6.a(null, null, 0L, 0L, 0, 0L, 0.0d, 127, null));
    }

    @Override // d7.o
    public gc.a<ViewModelEvent> g() {
        return this.f28818c;
    }

    @Override // d7.o
    public void h() {
        launch(new c());
    }

    @Override // d7.o
    public boolean j() {
        return this.f28817b.f28802c.b().isEmpty();
    }

    @Override // d7.o
    public void k() {
        this.f28819d.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), com.inscode.autoclicker.utils.b.NONE.getType(), 0));
        this.f28820e.d();
        this.f28822g.d();
        this.f28818c.d(d7.k.f28811a);
        xe.a.f37601c.a("[RECORD] Recording stopped.", new Object[0]);
    }

    @Override // d7.o
    public void o() {
        this.f28817b.f28802c.b().clear();
        this.f28820e.d();
        lb.c cVarD = this.f28819d.x(lb.a.BUFFER).b(new kb.a(null, new y0(s.f28838c, 17), kb.a.c.AFTER, new rb.a.CallableC0404a(16))).d(new x6.b(new t(this), 26)).c(50L, TimeUnit.MILLISECONDS).d(new x6.b(new u(this), 27));
        lb.l lVar = fc.a.f29534b;
        lb.c cVarI = cVarD.i(lVar);
        int i10 = lb.c.f33052c;
        rb.b.a(i10, "bufferSize");
        nb.b bVarD = ec.a.d(new ub.k(cVarI, lVar, false, i10), v.f28841c, null, w.f28842c, 2);
        p6.b.a(bVarD, "$receiver", this.f28820e, "compositeDisposable", bVarD);
        if (!ma.h.f33410y.a().i()) {
            nb.b bVarE = ec.a.e(lb.i.w(30L, TimeUnit.SECONDS).u(lVar).p(mb.a.a()), x.f28843c, null, new y(this), 2);
            p6.b.a(bVarE, "$receiver", this.f28822g, "compositeDisposable", bVarE);
        }
        this.f28818c.d(d7.j.f28809a);
        xe.a.f37601c.a("[RECORD] Recording started.", new Object[0]);
        this.f28819d.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), com.inscode.autoclicker.utils.b.NONE.getType(), 0));
    }

    @Override // d7.o
    public void p(View view, MotionEvent motionEvent) {
        for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
            motionEvent.getActionIndex();
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX(i10);
            float y10 = motionEvent.getY(i10);
            double degrees = Math.toDegrees(Math.atan2(y10, x10));
            WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
            double rotation = degrees + ((double) view.getRotation());
            double length = PointF.length(x10, y10);
            this.f28819d.d(new r6.c(((float) (Math.cos(Math.toRadians(rotation)) * length)) + iArr[0], ((float) (Math.sin(Math.toRadians(rotation)) * length)) + iArr[1], SystemClock.elapsedRealtime(), motionEvent.getAction() & 255, i10));
        }
    }

    @Override // d7.o
    public void q() {
        nb.b bVarE = ec.a.e(this.f28816a.f34786f.u(fc.a.f29534b), a.f28825c, null, new b(), 2);
        nb.a disposables = getDisposables();
        fd.j0.j(disposables, "compositeDisposable");
        disposables.a(bVarE);
    }
}
