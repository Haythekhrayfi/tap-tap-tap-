package f8;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.m;
import y9.g0;
import y9.k;
import y9.w;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29417a;

        static {
            int[] iArr = new int[w.values().length];
            iArr[w.LINEAR.ordinal()] = 1;
            iArr[w.EASE.ordinal()] = 2;
            iArr[w.EASE_IN.ordinal()] = 3;
            iArr[w.EASE_OUT.ordinal()] = 4;
            iArr[w.EASE_IN_OUT.ordinal()] = 5;
            iArr[w.SPRING.ordinal()] = 6;
            f29417a = iArr;
        }
    }

    public static final boolean a(k kVar) {
        ArrayList arrayList;
        j0.i(kVar, "<this>");
        g0 g0VarA = kVar.a();
        if (g0VarA.p() != null || g0VarA.t() != null || g0VarA.s() != null) {
            return true;
        }
        if (kVar instanceof k.c) {
            List<k> list = ((k.c) kVar).f40976c.f43638t;
            arrayList = new ArrayList(m.j(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(a((k) it.next())));
            }
        } else {
            if (!(kVar instanceof k.g)) {
                if ((kVar instanceof k.q) || (kVar instanceof k.h) || (kVar instanceof k.f) || (kVar instanceof k.m) || (kVar instanceof k.i) || (kVar instanceof k.o) || (kVar instanceof k.e) || (kVar instanceof k.C0475k) || (kVar instanceof k.p) || (kVar instanceof k.d) || (kVar instanceof k.l) || (kVar instanceof k.n) || (kVar instanceof k.r) || (kVar instanceof k.j)) {
                    return false;
                }
                throw new jc.g();
            }
            List<k> list2 = ((k.g) kVar).f40980c.f39044t;
            arrayList = new ArrayList(m.j(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boolean.valueOf(a((k) it2.next())));
            }
        }
        return arrayList.contains(Boolean.TRUE);
    }

    public static final Interpolator b(w wVar) {
        j0.i(wVar, "<this>");
        switch (a.f29417a[wVar.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new q7.c();
            case 3:
                return new q7.a();
            case 4:
                return new q7.d();
            case 5:
                return new q7.b();
            case 6:
                return new q7.g();
            default:
                throw new jc.g();
        }
    }

    public static final x6.f c(x6 x6Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        v9.b<String> bVar = x6Var.f44136h;
        x6.f fVar = null;
        Object obj = null;
        if (bVar != null) {
            for (Object obj2 : x6Var.f44147s) {
                if (j0.d(((x6.f) obj2).f44165d, bVar.b(dVar))) {
                    obj = obj2;
                    break;
                }
            }
            fVar = (x6.f) obj;
        }
        return fVar == null ? x6Var.f44147s.get(0) : fVar;
    }

    public static final String d(k kVar) {
        j0.i(kVar, "<this>");
        if (kVar instanceof k.q) {
            return "text";
        }
        if (kVar instanceof k.h) {
            return "image";
        }
        if (kVar instanceof k.f) {
            return "gif";
        }
        if (kVar instanceof k.m) {
            return "separator";
        }
        if (kVar instanceof k.i) {
            return "indicator";
        }
        if (kVar instanceof k.n) {
            return "slider";
        }
        if (kVar instanceof k.j) {
            return "input";
        }
        if (kVar instanceof k.r) {
            return "video";
        }
        if (kVar instanceof k.c) {
            return "container";
        }
        if (kVar instanceof k.g) {
            return "grid";
        }
        if (kVar instanceof k.o) {
            return "state";
        }
        if (kVar instanceof k.e) {
            return "gallery";
        }
        if (kVar instanceof k.C0475k) {
            return "pager";
        }
        if (kVar instanceof k.p) {
            return "tabs";
        }
        if (kVar instanceof k.d) {
            return "custom";
        }
        if (kVar instanceof k.l) {
            return "select";
        }
        throw new jc.g();
    }

    public static final boolean e(k kVar) {
        j0.i(kVar, "<this>");
        if ((kVar instanceof k.q) || (kVar instanceof k.h) || (kVar instanceof k.f) || (kVar instanceof k.m) || (kVar instanceof k.i) || (kVar instanceof k.n) || (kVar instanceof k.j) || (kVar instanceof k.d) || (kVar instanceof k.l) || (kVar instanceof k.r)) {
            return false;
        }
        if ((kVar instanceof k.c) || (kVar instanceof k.g) || (kVar instanceof k.e) || (kVar instanceof k.C0475k) || (kVar instanceof k.p) || (kVar instanceof k.o)) {
            return true;
        }
        throw new jc.g();
    }
}
