package c8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import kc.t;
import o8.r;
import p0.i0;
import y9.f7;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3624a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<e> a(List<e> list) {
        List listA;
        if (list.isEmpty()) {
            return list;
        }
        Objects.requireNonNull(e.f3631c);
        List<e> listC = t.C(list, com.applovin.exoplayer2.j.l.f7313h);
        Object objR = t.r(listC);
        int iJ = kc.m.j(listC, 9);
        if (iJ == 0) {
            listA = kc.k.a(objR);
        } else {
            ArrayList arrayList = new ArrayList(iJ + 1);
            arrayList.add(objR);
            Object obj = objR;
            for (e eVar : listC) {
                e eVar2 = (e) obj;
                Objects.requireNonNull(eVar2);
                j0.i(eVar, "other");
                boolean z10 = false;
                if (eVar2.f3632a == eVar.f3632a && eVar2.f3633b.size() < eVar.f3633b.size()) {
                    Iterator<T> it = eVar2.f3633b.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                            break;
                        }
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            kc.l.i();
                            throw null;
                        }
                        jc.h hVar = (jc.h) next;
                        jc.h<String, String> hVar2 = eVar.f3633b.get(i10);
                        if (!j0.d((String) hVar.f31811c, hVar2.f31811c) || !j0.d((String) hVar.f31812d, hVar2.f31812d)) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                if (!z10) {
                    eVar2 = eVar;
                }
                arrayList.add(eVar2);
                obj = eVar2;
            }
            listA = arrayList;
        }
        return t.H(t.K(listA));
    }

    public final y9.k b(y9.k kVar, String str) {
        Iterable<? extends y9.k> iterable;
        ArrayList arrayList;
        if (kVar instanceof y9.k.o) {
            y9.k.o oVar = (y9.k.o) kVar;
            if (j0.d(f(oVar.f40988c, null), str)) {
                return kVar;
            }
            List<x6.f> list = oVar.f40988c.f44147s;
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                y9.k kVar2 = ((x6.f) it.next()).f44164c;
                if (kVar2 != null) {
                    arrayList.add(kVar2);
                }
            }
        } else {
            if (!(kVar instanceof y9.k.p)) {
                if (kVar instanceof y9.k.c) {
                    iterable = ((y9.k.c) kVar).f40976c.f43638t;
                } else if (kVar instanceof y9.k.g) {
                    iterable = ((y9.k.g) kVar).f40980c.f39044t;
                } else if (kVar instanceof y9.k.e) {
                    iterable = ((y9.k.e) kVar).f40978c.f42724r;
                } else {
                    if (!(kVar instanceof y9.k.C0475k)) {
                        if ((kVar instanceof y9.k.d) || (kVar instanceof y9.k.q) || (kVar instanceof y9.k.h) || (kVar instanceof y9.k.n) || (kVar instanceof y9.k.j) || (kVar instanceof y9.k.f) || (kVar instanceof y9.k.i) || (kVar instanceof y9.k.m) || (kVar instanceof y9.k.l) || (kVar instanceof y9.k.r)) {
                            return null;
                        }
                        throw new jc.g();
                    }
                    iterable = ((y9.k.C0475k) kVar).f40984c.f42306o;
                }
                return d(iterable, str);
            }
            List<f7.e> list2 = ((y9.k.p) kVar).f40989c.f40008o;
            arrayList = new ArrayList(kc.m.j(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((f7.e) it2.next()).f40026a);
            }
        }
        return d(arrayList, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y9.k c(y9.k kVar, e eVar) {
        j0.i(kVar, "<this>");
        List<jc.h<String, String>> list = eVar.f3633b;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kVar = f3624a.b(kVar, (String) ((jc.h) it.next()).f31811c);
            if (kVar == null) {
                return null;
            }
        }
        return kVar;
    }

    public final y9.k d(Iterable<? extends y9.k> iterable, String str) {
        Iterator<? extends y9.k> it = iterable.iterator();
        while (it.hasNext()) {
            y9.k kVarB = f3624a.b(it.next(), str);
            if (kVarB != null) {
                return kVarB;
            }
        }
        return null;
    }

    public final r e(View view, e eVar) {
        j0.i(view, "<this>");
        j0.i(eVar, "path");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof r) {
            r rVar = (r) view;
            e path = rVar.getPath();
            if (j0.d(path == null ? null : path.b(), eVar.b())) {
                return rVar;
            }
        }
        Iterator<View> it = ((i0.a) i0.b((ViewGroup) view)).iterator();
        while (it.hasNext()) {
            r rVarE = e(it.next(), eVar);
            if (rVarE != null) {
                return rVarE;
            }
        }
        return null;
    }

    public final String f(x6 x6Var, uc.a<w> aVar) {
        j0.i(x6Var, "<this>");
        String str = x6Var.f44138j;
        if (str != null) {
            return str;
        }
        String str2 = x6Var.f44142n;
        if (str2 != null) {
            return str2;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return "";
    }
}
