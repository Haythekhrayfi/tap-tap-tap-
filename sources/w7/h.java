package w7;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jc.w;
import p7.i1;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l<? super w8.d, w> f37157d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, w8.d> f37154a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i> f37155b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, i1<l<w8.d, w>>> f37156c = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<w8.d, w> f37158e = new a();

    public static final class a extends vc.l implements l<w8.d, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(w8.d dVar) {
            w8.d dVar2 = dVar;
            j0.i(dVar2, "v");
            h.this.c(dVar2);
            return w.f31842a;
        }
    }

    public void a(w8.d dVar) throws w8.e {
        w8.d dVarPut = this.f37154a.put(dVar.a(), dVar);
        if (dVarPut == null) {
            l<w8.d, w> lVar = this.f37158e;
            j0.i(lVar, "observer");
            dVar.f37170a.b(lVar);
            c(dVar);
            return;
        }
        this.f37154a.put(dVar.a(), dVarPut);
        StringBuilder sbA = defpackage.a.a("Variable '");
        sbA.append(dVar.a());
        sbA.append("' already declared!");
        throw new w8.e(sbA.toString(), null, 2, null);
    }

    public w8.d b(String str) {
        j0.i(str, "name");
        w8.d dVar = this.f37154a.get(str);
        if (dVar != null) {
            return dVar;
        }
        for (i iVar : this.f37155b) {
            Objects.requireNonNull(iVar);
            j0.i(str, "name");
            iVar.f37161b.invoke(str);
            w8.d dVar2 = iVar.f37160a.get(str);
            if (dVar2 != null) {
                return dVar2;
            }
        }
        return null;
    }

    public final void c(w8.d dVar) {
        e9.a.b();
        l<? super w8.d, w> lVar = this.f37157d;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
        i1<l<w8.d, w>> i1Var = this.f37156c.get(dVar.a());
        if (i1Var == null) {
            return;
        }
        Iterator<l<w8.d, w>> it = i1Var.iterator();
        while (it.hasNext()) {
            it.next().invoke(dVar);
        }
    }

    public final void d(String str, q8.d dVar, boolean z10, l<? super w8.d, w> lVar) {
        Map<String, i1<l<w8.d, w>>> map;
        i1<l<w8.d, w>> i1Var;
        w8.d dVarB = b(str);
        if (dVarB == null) {
            if (dVar != null) {
                dVar.a(new u9.f(u9.g.MISSING_VARIABLE, j0.p("No variable could be resolved for '", str), null, null, null, 24, null));
            }
            map = this.f37156c;
            i1Var = map.get(str);
            if (i1Var == null) {
                i1Var = new i1<>();
                map.put(str, i1Var);
            }
        } else {
            if (z10) {
                e9.a.b();
                lVar.invoke(dVarB);
            }
            map = this.f37156c;
            i1Var = map.get(str);
            if (i1Var == null) {
                i1Var = new i1<>();
                map.put(str, i1Var);
            }
        }
        i1Var.b(lVar);
    }
}
