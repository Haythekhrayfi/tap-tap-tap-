package v7;

import androidx.activity.k;
import fd.j0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import p7.f1;
import p7.j;
import uc.l;
import v9.d;
import w7.h;
import x8.f;
import y9.d8;
import y9.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x8.a f36693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f36694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f36695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<d8.d> f36696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f36697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f36698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f36699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q8.d f36700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p7.h f36701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<w8.d, w> f36702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p7.d f36703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d8.d f36704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p7.d f36706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f1 f36707p;

    /* JADX INFO: renamed from: v7.a$a, reason: collision with other inner class name */
    public static final class C0436a extends vc.l implements l<w8.d, w> {
        public C0436a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(w8.d dVar) {
            j0.i(dVar, "$noName_0");
            a.this.b();
            return w.f31842a;
        }
    }

    public static final class b extends vc.l implements l<d8.d, w> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public w invoke(d8.d dVar) {
            d8.d dVar2 = dVar;
            j0.i(dVar2, "it");
            a.this.f36704m = dVar2;
            return w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, x8.a aVar, f fVar, List<? extends q> list, v9.b<d8.d> bVar, d dVar, j jVar, h hVar, q8.d dVar2, p7.h hVar2) {
        j0.i(str, "rawExpression");
        j0.i(aVar, "condition");
        j0.i(fVar, "evaluator");
        j0.i(list, "actions");
        j0.i(bVar, "mode");
        j0.i(dVar, "resolver");
        j0.i(jVar, "divActionHandler");
        j0.i(hVar, "variableController");
        j0.i(dVar2, "errorCollector");
        j0.i(hVar2, "logger");
        this.f36692a = str;
        this.f36693b = aVar;
        this.f36694c = fVar;
        this.f36695d = list;
        this.f36696e = bVar;
        this.f36697f = dVar;
        this.f36698g = jVar;
        this.f36699h = hVar;
        this.f36700i = dVar2;
        this.f36701j = hVar2;
        this.f36702k = new C0436a();
        this.f36703l = bVar.f(dVar, new b());
        this.f36704m = d8.d.ON_CONDITION;
        int i10 = p7.d.C1;
        this.f36706o = p7.c.f34476c;
    }

    public final void a(f1 f1Var) {
        this.f36707p = f1Var;
        if (f1Var == null) {
            this.f36703l.close();
            this.f36706o.close();
            return;
        }
        this.f36703l.close();
        h hVar = this.f36699h;
        List<String> listC = this.f36693b.c();
        l<w8.d, w> lVar = this.f36702k;
        Objects.requireNonNull(hVar);
        j0.i(listC, "names");
        j0.i(lVar, "observer");
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            hVar.d((String) it.next(), null, false, lVar);
        }
        this.f36706o = new u7.b(listC, hVar, lVar);
        this.f36703l = this.f36696e.f(this.f36697f, new v7.b(this));
        b();
    }

    public final void b() {
        e9.a.b();
        f1 f1Var = this.f36707p;
        if (f1Var == null) {
            return;
        }
        boolean z10 = false;
        try {
            boolean zBooleanValue = ((Boolean) this.f36694c.a(this.f36693b)).booleanValue();
            boolean z11 = this.f36705n;
            this.f36705n = zBooleanValue;
            if (zBooleanValue && (this.f36704m != d8.d.ON_CONDITION || !z11 || !zBooleanValue)) {
                z10 = true;
            }
        } catch (x8.b e10) {
            this.f36700i.a(new RuntimeException(k.a(defpackage.a.a("Condition evaluation failed: '"), this.f36692a, "'!"), e10));
        }
        if (z10) {
            for (q qVar : this.f36695d) {
                this.f36701j.g((i8.k) f1Var, qVar);
                this.f36698g.handleAction(qVar, f1Var);
            }
        }
    }
}
