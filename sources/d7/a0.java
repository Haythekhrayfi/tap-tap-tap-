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
import java.util.concurrent.atomic.AtomicLong;
import p0.m0;
import z6.a1;
import z6.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends BaseViewModel implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f28754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.g f28755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6.e f28756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gc.a<ViewModelEvent> f28757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gc.a<r6.c> f28758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nb.a f28759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nb.a f28760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nb.a f28761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public nb.a f28762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28764k;

    public static final class a extends vc.l implements uc.l<Throwable, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f28765c = new a();

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
            a0.this.f28757d.d(d7.m.f28814a);
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.a<nb.b> {
        public c() {
            super(0);
        }

        @Override // uc.a
        public nb.b invoke() {
            return ec.a.e(a0.this.f28754a.f34784d.u(fc.a.f29534b).p(mb.a.a()), b0.f28786c, null, new c0(a0.this), 2);
        }
    }

    public static final class d extends vc.l implements uc.l<Throwable, jc.w> {
        public d() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, y6.k.a(th2, "it", "[RECORD] Error in playing subscription. ", th2, ' ')), new Object[0]);
            th2.printStackTrace();
            a0 a0Var = a0.this;
            a0Var.f28763j = true;
            a0Var.f28764k = false;
            return jc.w.f31842a;
        }
    }

    public static final class e extends vc.l implements uc.a<jc.w> {
        public e() {
            super(0);
        }

        @Override // uc.a
        public jc.w invoke() {
            a0.this.e();
            a0.this.f28754a.b();
            return jc.w.f31842a;
        }
    }

    public static final class f extends vc.l implements uc.l<List<r6.d>, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f28770c = new f();

        public f() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ jc.w invoke(List<r6.d> list) {
            return jc.w.f31842a;
        }
    }

    public static final class g extends vc.l implements uc.l<Long, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f28771c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public Integer invoke(Long l10) {
            fd.j0.i(l10, "it");
            return 1;
        }
    }

    public static final class h extends vc.l implements uc.l<Integer, Boolean> {
        public h() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Integer num) {
            fd.j0.i(num, "it");
            return Boolean.valueOf(a0.this.f28764k);
        }
    }

    public static final class i extends vc.l implements uc.l<Integer, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f28773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AtomicLong atomicLong) {
            super(1);
            this.f28773c = atomicLong;
        }

        @Override // uc.l
        public jc.w invoke(Integer num) {
            this.f28773c.addAndGet(-num.intValue());
            return jc.w.f31842a;
        }
    }

    public static final class j extends vc.l implements uc.l<List<Integer>, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f28775d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AtomicLong atomicLong) {
            super(1);
            this.f28775d = atomicLong;
        }

        @Override // uc.l
        public jc.w invoke(List<Integer> list) {
            a0.this.f28757d.d(new d7.n(Math.max(0L, this.f28775d.get())));
            return jc.w.f31842a;
        }
    }

    public static final class k extends vc.l implements uc.l<List<r6.d>, lb.j<? extends r6.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.y f28776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(vc.y yVar) {
            super(1);
            this.f28776c = yVar;
        }

        @Override // uc.l
        public lb.j<? extends r6.d> invoke(List<r6.d> list) {
            List<r6.d> list2 = list;
            fd.j0.i(list2, "it");
            this.f28776c.f37006c++;
            return new vb.m(list2);
        }
    }

    public static final class l extends vc.l implements uc.l<r6.d, lb.j<? extends r6.d>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f28778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ vc.z f28779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f28780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ v6.a f28781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ vc.y f28782h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z10, vc.z zVar, AtomicLong atomicLong, v6.a aVar, vc.y yVar) {
            super(1);
            this.f28778d = z10;
            this.f28779e = zVar;
            this.f28780f = atomicLong;
            this.f28781g = aVar;
            this.f28782h = yVar;
        }

        @Override // uc.l
        public lb.j<? extends r6.d> invoke(r6.d dVar) {
            r6.d dVar2 = dVar;
            fd.j0.i(dVar2, "actionSet");
            vb.l lVar = new vb.l(new a1(dVar2, 3));
            z zVar = new z(new d0(this.f28778d, this.f28779e, this.f28780f, this.f28781g, dVar2, this.f28782h, a0.this), 1);
            pb.b<? super Throwable> bVar = rb.a.f35360c;
            pb.a aVar = rb.a.f35359b;
            return lVar.i(zVar, bVar, aVar, aVar).h(Math.max(0L, (long) ((dVar2.b() + dVar2.c()) / a0.this.f28755b.f28802c.e())), TimeUnit.MILLISECONDS);
        }
    }

    public static final class m extends vc.l implements uc.l<r6.d, r6.d> {
        public m() {
            super(1);
        }

        @Override // uc.l
        public r6.d invoke(r6.d dVar) {
            r6.d dVar2 = dVar;
            fd.j0.i(dVar2, "set");
            while (a0.this.f28763j) {
                try {
                    Thread.sleep(300L);
                } catch (Exception unused) {
                }
            }
            return dVar2;
        }
    }

    public static final class n extends vc.l implements uc.l<List<r6.d>, lb.o<? extends List<r6.d>>> {
        public n() {
            super(1);
        }

        @Override // uc.l
        public lb.o<? extends List<r6.d>> invoke(List<r6.d> list) {
            List<r6.d> list2 = list;
            fd.j0.i(list2, "it");
            return new wb.g(list2).d((long) ((((r6.d) kc.t.x(list2)).b() + ((r6.d) kc.t.x(list2)).c()) / a0.this.f28755b.f28802c.e()), TimeUnit.MILLISECONDS);
        }
    }

    public a0(q6.b bVar, d7.g gVar, r6.e eVar) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(gVar, "recordSettingsProvider");
        fd.j0.i(eVar, "appSettings");
        this.f28754a = bVar;
        this.f28755b = gVar;
        this.f28756c = eVar;
        this.f28757d = new gc.a<>();
        this.f28758e = new gc.a<>();
        new gc.a();
        this.f28759f = new nb.a();
        this.f28760g = new nb.a();
        this.f28761h = new nb.a();
        this.f28762i = new nb.a();
    }

    @Override // d7.o
    public void a() {
        this.f28763j = true;
        this.f28764k = false;
        this.f28757d.d(d7.b.f28785a);
    }

    @Override // d7.o
    public void b() {
        this.f28763j = false;
        this.f28764k = true;
        this.f28757d.d(d7.c.f28787a);
    }

    @Override // d7.o
    public void c(com.inscode.autoclicker.utils.b bVar) {
        this.f28758e.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), bVar.getType(), 0, 16, null));
    }

    @Override // d7.o
    public void d() {
        if (this.f28755b.f28802c.b().isEmpty()) {
            this.f28757d.d(d7.h.f28805a);
            return;
        }
        this.f28764k = true;
        vc.y yVar = new vc.y();
        this.f28757d.d(d7.d.f28789a);
        v6.a aVar = this.f28755b.f28802c;
        this.f28754a.f();
        AtomicLong atomicLong = new AtomicLong(aVar.c());
        vc.z zVar = new vc.z();
        zVar.f37007c = SystemClock.elapsedRealtime();
        boolean zL = this.f28756c.l();
        if (zL) {
            lb.i iVarJ = lb.i.m(1L, TimeUnit.MILLISECONDS).o(new y0(g.f28771c, 18)).j(new y0(new h(), 19));
            x6.b bVar = new x6.b(new i(atomicLong), 28);
            pb.b<? super Throwable> bVar2 = rb.a.f35360c;
            pb.a aVar2 = rb.a.f35359b;
            lb.i iVarF = iVarJ.i(bVar, bVar2, aVar2, aVar2).f(1000);
            lb.l lVar = fc.a.f29534b;
            nb.b bVarE = ec.a.e(iVarF.u(lVar).p(lVar), null, null, new j(atomicLong), 3);
            p6.b.a(bVarE, "$receiver", this.f28762i, "compositeDisposable", bVarE);
        }
        vb.l lVar2 = new vb.l(new h6.i(aVar));
        lb.l lVar3 = fc.a.f29534b;
        lb.c cVarK = lVar2.u(lVar3).q(lVar3, false, 1).g(new y0(new k(yVar), 20)).g(new y0(new l(zL, zVar, atomicLong, aVar, yVar), 21)).o(new y0(new m(), 22)).y().f(new y0(new n(), 23)).d(aVar.g(), TimeUnit.MILLISECONDS).k(aVar.f() == 0 ? 999999999L : aVar.f());
        fd.j0.h(cVarK, "override fun startPlayin…ayingSubscription)\n\n    }");
        nb.b bVarA = ec.a.a(cVarK, new d(), new e(), f.f28770c);
        p6.b.a(bVarA, "$receiver", this.f28760g, "compositeDisposable", bVarA);
    }

    @Override // d7.o
    public void e() {
        this.f28763j = false;
        this.f28764k = false;
        this.f28754a.g();
        this.f28760g.d();
        this.f28762i.d();
        this.f28757d.d(d7.e.f28797a);
        xe.a.f37601c.a("[RECORD] Playing stopped.", new Object[0]);
    }

    @Override // d7.o
    public void f() {
        getDisposables().d();
        this.f28761h.d();
        this.f28760g.d();
        this.f28759f.d();
        this.f28755b.c(new v6.a(null, null, 0L, 0L, 0, 0L, 0.0d, 127, null));
        this.f28762i.d();
    }

    @Override // d7.o
    public gc.a<ViewModelEvent> g() {
        return this.f28757d;
    }

    @Override // d7.o
    public void h() {
        launch(new c());
    }

    @Override // d7.o
    public boolean j() {
        return this.f28755b.f28802c.b().isEmpty();
    }

    @Override // d7.o
    public void k() {
        this.f28755b.f28802c.b().add(new r6.d(kc.k.a(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), com.inscode.autoclicker.utils.b.NONE.getType(), 0)), 0L, 0L, 0L, 0.0d, 28, null));
        this.f28759f.d();
        this.f28761h.d();
        this.f28762i.d();
        this.f28757d.d(d7.k.f28811a);
        xe.a.f37601c.a("[RECORD] Recording stopped.", new Object[0]);
    }

    @Override // d7.o
    public void o() {
        this.f28755b.f28802c.b().clear();
        this.f28759f.d();
        lb.c cVarD = this.f28758e.x(lb.a.BUFFER).b(new kb.a(null, new y0(e0.f28798c, 24), kb.a.c.AFTER, new rb.a.CallableC0404a(16))).d(new x6.b(new f0(this), 29)).c(50L, TimeUnit.MILLISECONDS).d(new z(new g0(this), 0));
        lb.l lVar = fc.a.f29534b;
        lb.c cVarI = cVarD.i(lVar);
        int i10 = lb.c.f33052c;
        rb.b.a(i10, "bufferSize");
        nb.b bVarD = ec.a.d(new ub.k(cVarI, lVar, false, i10), h0.f28806c, null, i0.f28808c, 2);
        p6.b.a(bVarD, "$receiver", this.f28759f, "compositeDisposable", bVarD);
        if (!ma.h.f33410y.a().i()) {
            nb.b bVarE = ec.a.e(lb.i.w(30L, TimeUnit.SECONDS).u(lVar).p(mb.a.a()), j0.f28810c, null, new k0(this), 2);
            p6.b.a(bVarE, "$receiver", this.f28761h, "compositeDisposable", bVarE);
        }
        this.f28757d.d(d7.j.f28809a);
        xe.a.f37601c.a("[RECORD] Recording started.", new Object[0]);
        this.f28758e.d(new r6.c(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, SystemClock.elapsedRealtime(), com.inscode.autoclicker.utils.b.NONE.getType(), 0));
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
            this.f28758e.d(new r6.c(((float) (Math.cos(Math.toRadians(rotation)) * length)) + iArr[0], ((float) (Math.sin(Math.toRadians(rotation)) * length)) + iArr[1], SystemClock.elapsedRealtime(), motionEvent.getAction() & 255, i10));
        }
    }

    @Override // d7.o
    public void q() {
        nb.b bVarE = ec.a.e(this.f28754a.f34786f.u(fc.a.f29534b), a.f28765c, null, new b(), 2);
        nb.a disposables = getDisposables();
        fd.j0.j(disposables, "compositeDisposable");
        disposables.a(bVarE);
    }
}
