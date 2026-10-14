package i8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y9.f7;
import y9.l7;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.d f31485a;

    public final class a extends f9.a<jc.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7.y0.c f31486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.d f31487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f31488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList<z7.e> f31489d;

        public a(x xVar, p7.y0.c cVar, v9.d dVar, boolean z10) {
            fd.j0.i(xVar, "this$0");
            fd.j0.i(cVar, "callback");
            fd.j0.i(dVar, "resolver");
            x.this = xVar;
            this.f31486a = cVar;
            this.f31487b = dVar;
            this.f31488c = z10;
            this.f31489d = new ArrayList<>();
        }

        public /* synthetic */ a(p7.y0.c cVar, v9.d dVar, boolean z10, int i10, vc.g gVar) {
            this(x.this, cVar, dVar, (i10 & 4) != 0 ? true : z10);
        }

        @Override // f9.a
        public /* bridge */ /* synthetic */ jc.w a(y9.k kVar, v9.d dVar) {
            n(kVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w b(y9.k.c cVar, v9.d dVar) {
            n(cVar, dVar);
            if (this.f31488c) {
                Iterator<T> it = cVar.f40976c.f43638t.iterator();
                while (it.hasNext()) {
                    m((y9.k) it.next(), dVar);
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w d(y9.k.e eVar, v9.d dVar) {
            n(eVar, dVar);
            if (this.f31488c) {
                Iterator<T> it = eVar.f40978c.f42724r.iterator();
                while (it.hasNext()) {
                    m((y9.k) it.next(), dVar);
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w e(y9.k.f fVar, v9.d dVar) {
            n(fVar, dVar);
            if (fVar.f40979c.f43717y.b(dVar).booleanValue()) {
                x xVar = x.this;
                String string = fVar.f40979c.f43710r.b(dVar).toString();
                fd.j0.h(string, "data.value.gifUrl.evaluate(resolver).toString()");
                p7.y0.c cVar = this.f31486a;
                this.f31489d.add(xVar.f31485a.loadImageBytes(string, cVar, -1));
                cVar.f34610b.incrementAndGet();
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w f(y9.k.g gVar, v9.d dVar) {
            n(gVar, dVar);
            if (this.f31488c) {
                Iterator<T> it = gVar.f40980c.f39044t.iterator();
                while (it.hasNext()) {
                    m((y9.k) it.next(), dVar);
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w g(y9.k.h hVar, v9.d dVar) {
            n(hVar, dVar);
            if (hVar.f40981c.B.b(dVar).booleanValue()) {
                x xVar = x.this;
                String string = hVar.f40981c.f39612w.b(dVar).toString();
                fd.j0.h(string, "data.value.imageUrl.evaluate(resolver).toString()");
                x.a(xVar, string, this.f31486a, this.f31489d);
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w h(y9.k.C0475k c0475k, v9.d dVar) {
            n(c0475k, dVar);
            if (this.f31488c) {
                Iterator<T> it = c0475k.f40984c.f42306o.iterator();
                while (it.hasNext()) {
                    m((y9.k) it.next(), dVar);
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w j(y9.k.o oVar, v9.d dVar) {
            n(oVar, dVar);
            if (this.f31488c) {
                Iterator<T> it = oVar.f40988c.f44147s.iterator();
                while (it.hasNext()) {
                    y9.k kVar = ((x6.f) it.next()).f44164c;
                    if (kVar != null) {
                        m(kVar, dVar);
                    }
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w k(y9.k.p pVar, v9.d dVar) {
            n(pVar, dVar);
            if (this.f31488c) {
                Iterator<T> it = pVar.f40989c.f40008o.iterator();
                while (it.hasNext()) {
                    m(((f7.e) it.next()).f40026a, dVar);
                }
            }
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w l(y9.k.q qVar, v9.d dVar) {
            n(qVar, dVar);
            List<l7.m> list = qVar.f40990c.f41292x;
            if (list != null) {
                x xVar = x.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String string = ((l7.m) it.next()).f41327e.b(dVar).toString();
                    fd.j0.h(string, "it.url.evaluate(resolver).toString()");
                    x.a(xVar, string, this.f31486a, this.f31489d);
                }
            }
            return jc.w.f31842a;
        }

        public void n(y9.k kVar, v9.d dVar) {
            fd.j0.i(kVar, "data");
            fd.j0.i(dVar, "resolver");
            List<y9.e0> listB = kVar.a().b();
            if (listB == null) {
                return;
            }
            x xVar = x.this;
            for (y9.e0 e0Var : listB) {
                if (e0Var instanceof y9.e0.c) {
                    y9.e0.c cVar = (y9.e0.c) e0Var;
                    if (cVar.f39729c.f39759f.b(dVar).booleanValue()) {
                        String string = cVar.f39729c.f39758e.b(dVar).toString();
                        fd.j0.h(string, "background.value.imageUr…uate(resolver).toString()");
                        x.a(xVar, string, this.f31486a, this.f31489d);
                    }
                }
            }
        }
    }

    public x(z7.d dVar) {
        fd.j0.i(dVar, "imageLoader");
        this.f31485a = dVar;
    }

    public static final void a(x xVar, String str, p7.y0.c cVar, ArrayList arrayList) {
        arrayList.add(xVar.f31485a.loadImage(str, cVar, -1));
        cVar.f34610b.incrementAndGet();
    }
}
