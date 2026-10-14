package ec;

import fd.j0;
import java.util.Objects;
import jc.w;
import lb.i;
import lb.m;
import tb.g;
import ub.j;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l<Object, w> f29130a = c.f29135c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l<Throwable, w> f29131b = b.f29134c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uc.a<w> f29132c = C0252a.f29133c;

    /* JADX INFO: renamed from: ec.a$a, reason: collision with other inner class name */
    public static final class C0252a extends vc.l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0252a f29133c = new C0252a();

        public C0252a() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            return w.f31842a;
        }
    }

    public static final class b extends vc.l implements l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f29134c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            j0.j(th2, "it");
            dc.a.b(new ob.c(th2));
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements l<Object, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29135c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Object obj) {
            j0.j(obj, "it");
            return w.f31842a;
        }
    }

    public static final <T> nb.b a(lb.c<T> cVar, l<? super Throwable, w> lVar, uc.a<w> aVar, l<? super T, w> lVar2) {
        j0.j(cVar, "$receiver");
        j0.j(lVar, "onError");
        j0.j(aVar, "onComplete");
        j0.j(lVar2, "onNext");
        ec.c cVar2 = new ec.c(lVar2);
        ec.c cVar3 = new ec.c(lVar);
        ec.b bVar = new ec.b(aVar);
        j jVar = j.INSTANCE;
        Objects.requireNonNull(jVar, "onSubscribe is null");
        zb.c cVar4 = new zb.c(cVar2, cVar3, bVar, jVar);
        cVar.g(cVar4);
        return cVar4;
    }

    public static final <T> nb.b b(i<T> iVar, l<? super Throwable, w> lVar, uc.a<w> aVar, l<? super T, w> lVar2) {
        j0.j(iVar, "$receiver");
        j0.j(lVar, "onError");
        j0.j(aVar, "onComplete");
        j0.j(lVar2, "onNext");
        g gVar = new g(new ec.c(lVar2), new ec.c(lVar), new ec.b(aVar), rb.a.f35360c);
        iVar.c(gVar);
        return gVar;
    }

    public static final <T> nb.b c(m<T> mVar, l<? super Throwable, w> lVar, l<? super T, w> lVar2) {
        j0.j(mVar, "$receiver");
        j0.j(lVar, "onError");
        j0.j(lVar2, "onSuccess");
        return mVar.l(new ec.c(lVar2), new ec.c(lVar));
    }

    public static /* bridge */ /* synthetic */ nb.b d(lb.c cVar, l lVar, uc.a aVar, l lVar2, int i10) {
        if ((i10 & 1) != 0) {
            lVar = f29131b;
        }
        uc.a<w> aVar2 = (i10 & 2) != 0 ? f29132c : null;
        if ((i10 & 4) != 0) {
            lVar2 = f29130a;
        }
        return a(cVar, lVar, aVar2, lVar2);
    }

    public static /* bridge */ /* synthetic */ nb.b e(i iVar, l lVar, uc.a aVar, l lVar2, int i10) {
        if ((i10 & 1) != 0) {
            lVar = f29131b;
        }
        uc.a<w> aVar2 = (i10 & 2) != 0 ? f29132c : null;
        if ((i10 & 4) != 0) {
            lVar2 = f29130a;
        }
        return b(iVar, lVar, aVar2, lVar2);
    }

    public static /* bridge */ /* synthetic */ nb.b f(m mVar, l lVar, l lVar2, int i10) {
        l<Throwable, w> lVar3 = (i10 & 1) != 0 ? f29131b : null;
        if ((i10 & 2) != 0) {
            lVar2 = f29130a;
        }
        return c(mVar, lVar3, lVar2);
    }
}
