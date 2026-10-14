package v7;

import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p7.j;
import v9.d;
import vc.g;
import w7.h;
import x8.f;
import y9.d8;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f36711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f36712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f36713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f36714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8.d f36715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7.h f36716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f36717g;

    public c(List<? extends d8> list, h hVar, d dVar, j jVar, f fVar, q8.d dVar2, p7.h hVar2) {
        j0.i(hVar, "variableController");
        j0.i(dVar, "expressionResolver");
        j0.i(jVar, "divActionHandler");
        j0.i(fVar, "evaluator");
        j0.i(dVar2, "errorCollector");
        j0.i(hVar2, "logger");
        this.f36711a = hVar;
        this.f36712b = dVar;
        this.f36713c = jVar;
        this.f36714d = fVar;
        this.f36715e = dVar2;
        this.f36716f = hVar2;
        this.f36717g = new ArrayList();
        if (list == null) {
            return;
        }
        for (d8 d8Var : list) {
            String string = d8Var.f39717b.c().toString();
            try {
                Objects.requireNonNull(x8.a.f37519c);
                j0.i(string, "expr");
                x8.a.d dVar3 = new x8.a.d(string);
                if ((dVar3.c().isEmpty() ? new RuntimeException("No variables defined!") : null) == null) {
                    this.f36717g.add(new a(string, dVar3, this.f36714d, d8Var.f39716a, d8Var.f39718c, this.f36712b, this.f36713c, this.f36711a, this.f36715e, this.f36716f));
                } else {
                    Objects.toString(d8Var.f39717b);
                    int i10 = e9.a.f29114a;
                }
            } catch (x8.b unused) {
            }
        }
    }

    public /* synthetic */ c(List list, h hVar, d dVar, j jVar, f fVar, q8.d dVar2, p7.h hVar2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : list, hVar, dVar, jVar, fVar, dVar2, hVar2);
    }
}
