package a7;

import com.inscode.autoclicker.base.BaseViewModel;
import com.inscode.autoclicker.base.ViewModelEvent;
import fd.j0;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jc.w;
import vc.l;
import y6.k;
import z6.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7.a f172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc.a<ViewModelEvent> f173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nb.a f174d;

    public static final class a extends l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f175c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, k.a(th2, "it", "[MANUAL] [ERROR] (one finger) ", th2, ' ')), new Object[0]);
            return w.f31842a;
        }
    }

    public static final class b extends l implements uc.l<List<w>, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f176c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ w invoke(List<w> list) {
            return w.f31842a;
        }
    }

    public static final class c extends l implements uc.l<nb.b, w> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public w invoke(nb.b bVar) {
            i.this.f173c.d(a7.c.f165a);
            return w.f31842a;
        }
    }

    public static final class d extends l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f178c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            xe.a.f37601c.b(r2.a.a(th2, k.a(th2, "it", "[MANUAL] [ERROR] (multi finger) ", th2, ' ')), new Object[0]);
            return w.f31842a;
        }
    }

    public static final class e extends l implements uc.l<Long, w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u6.a f180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u6.a aVar) {
            super(1);
            this.f180d = aVar;
        }

        @Override // uc.l
        public w invoke(Long l10) {
            i.this.f171a.c(this.f180d);
            return w.f31842a;
        }
    }

    public static final class f extends l implements uc.l<nb.b, w> {
        public f() {
            super(1);
        }

        @Override // uc.l
        public w invoke(nb.b bVar) {
            i.this.f173c.d(a7.c.f165a);
            return w.f31842a;
        }
    }

    public static final class g extends l implements uc.l<Long, lb.j<? extends r6.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u6.a f182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(u6.a aVar) {
            super(1);
            this.f182c = aVar;
        }

        @Override // uc.l
        public lb.j<? extends r6.d> invoke(Long l10) {
            j0.i(l10, "it");
            return lb.i.l(this.f182c.a());
        }
    }

    public static final class h extends l implements uc.l<r6.d, lb.j<? extends w>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u6.a f184d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(u6.a aVar) {
            super(1);
            this.f184d = aVar;
        }

        @Override // uc.l
        public lb.j<? extends w> invoke(r6.d dVar) {
            final r6.d dVar2 = dVar;
            j0.i(dVar2, "actionSet");
            final i iVar = i.this;
            final u6.a aVar = this.f184d;
            return new vb.l(new Callable() { // from class: a7.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    i iVar2 = iVar;
                    r6.d dVar3 = dVar2;
                    u6.a aVar2 = aVar;
                    j0.i(iVar2, "this$0");
                    j0.i(dVar3, "$actionSet");
                    j0.i(aVar2, "$settings");
                    iVar2.f171a.c(new r6.j(dVar3, aVar2.d()));
                    return w.f31842a;
                }
            }).h(Math.max(0L, dVar2.c()), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: a7.i$i, reason: collision with other inner class name */
    public static final class C0005i extends l implements uc.l<List<w>, w> {
        public C0005i() {
            super(1);
        }

        @Override // uc.l
        public w invoke(List<w> list) {
            i.this.t();
            i.this.f171a.b();
            return w.f31842a;
        }
    }

    public i(q6.b bVar, a7.a aVar) {
        j0.i(bVar, "rxEvents");
        j0.i(aVar, "manualSettingsProvider");
        this.f171a = bVar;
        this.f172b = aVar;
        this.f173c = new gc.a<>();
        this.f174d = new nb.a();
    }

    public final void r(List<r6.d> list) {
        this.f172b.f161c.j(list);
    }

    public final void s() {
        nb.b bVarC;
        u6.a aVar = this.f172b.f162d;
        for (r6.d dVar : aVar.a()) {
            dVar.h(dVar.f() ? aVar.h() : aVar.g());
        }
        this.f171a.f();
        boolean zB = aVar.b();
        long jF = (long) (aVar.f() * 1.1d);
        if (zB) {
            wb.d dVar2 = new wb.d(new vb.h(lb.i.m(jF, TimeUnit.MILLISECONDS).v(aVar.e() != 0 ? aVar.e() : 999999999L), new x6.b(new f(), 22), rb.a.f35359b).k(new y0(new g(aVar), 10)).g(new y0(new h(aVar), 11)).y(), new x6.b(new C0005i(), 23));
            lb.l lVar = fc.a.f29534b;
            bVarC = ec.a.c(dVar2.i(lVar).n(lVar), a.f175c, b.f176c);
        } else {
            lb.i<Long> iVarV = lb.i.m(jF, TimeUnit.MILLISECONDS).v(aVar.e() != 0 ? aVar.e() : 999999999L);
            x6.b bVar = new x6.b(new c(), 21);
            pb.a aVar2 = rb.a.f35359b;
            vb.h hVar = new vb.h(iVarV, bVar, aVar2);
            pb.a aVar3 = new pb.a() { // from class: a7.e
                @Override // pb.a
                public final void run() {
                    i iVar = this.f167a;
                    j0.i(iVar, "this$0");
                    iVar.t();
                    iVar.f171a.b();
                }
            };
            pb.b<? super Throwable> bVar2 = rb.a.f35360c;
            lb.i<T> iVarI = hVar.i(bVar2, bVar2, aVar3, aVar2);
            lb.l lVar2 = fc.a.f29534b;
            bVarC = ec.a.e(iVarI.p(lVar2).u(lVar2), d.f178c, null, new e(aVar), 2);
        }
        nb.a aVar4 = this.f174d;
        j0.j(aVar4, "compositeDisposable");
        aVar4.a(bVarC);
    }

    public final void t() {
        this.f171a.g();
        xe.a.f37601c.a("[MANUAL] Stopping in view model.", new Object[0]);
        this.f174d.d();
        this.f173c.d(a7.d.f166a);
    }
}
