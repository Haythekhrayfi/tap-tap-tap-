package i8;

import android.content.Context;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import y9.o1;
import y9.o6;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f31323b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31324a;

        static {
            int[] iArr = new int[o6.d.values().length];
            iArr[o6.d.LEFT.ordinal()] = 1;
            iArr[o6.d.TOP.ordinal()] = 2;
            iArr[o6.d.RIGHT.ordinal()] = 3;
            iArr[o6.d.BOTTOM.ordinal()] = 4;
            f31324a = iArr;
        }
    }

    static {
        new a(null);
    }

    public c0(Context context, l0 l0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(l0Var, "viewIdProvider");
        this.f31322a = context;
        this.f31323b = l0Var;
    }

    public r1.p a(dd.g<? extends y9.k> gVar, dd.g<? extends y9.k> gVar2, v9.d dVar) {
        fd.j0.i(dVar, "resolver");
        r1.p pVar = new r1.p();
        pVar.g(0);
        if (gVar != null) {
            ArrayList arrayList = new ArrayList();
            dd.d.a aVar = new dd.d.a((dd.d) gVar);
            while (aVar.hasNext()) {
                y9.k kVar = (y9.k) aVar.next();
                String id2 = kVar.a().getId();
                y9.a0 a0VarS = kVar.a().s();
                if (id2 != null && a0VarS != null) {
                    r1.l lVarB = b(a0VarS, 2, dVar);
                    lVarB.addTarget(this.f31323b.a(id2));
                    arrayList.add(lVarB);
                }
            }
            u1.a.r(pVar, arrayList);
        }
        if (gVar != null && gVar2 != null) {
            ArrayList arrayList2 = new ArrayList();
            dd.d.a aVar2 = new dd.d.a((dd.d) gVar);
            while (aVar2.hasNext()) {
                y9.k kVar2 = (y9.k) aVar2.next();
                String id3 = kVar2.a().getId();
                y9.r0 r0VarT = kVar2.a().t();
                if (id3 != null && r0VarT != null) {
                    r1.l lVarC = c(r0VarT, dVar);
                    lVarC.addTarget(this.f31323b.a(id3));
                    arrayList2.add(lVarC);
                }
            }
            u1.a.r(pVar, arrayList2);
        }
        if (gVar2 != null) {
            ArrayList arrayList3 = new ArrayList();
            dd.d.a aVar3 = new dd.d.a((dd.d) gVar2);
            while (aVar3.hasNext()) {
                y9.k kVar3 = (y9.k) aVar3.next();
                String id4 = kVar3.a().getId();
                y9.a0 a0VarP = kVar3.a().p();
                if (id4 != null && a0VarP != null) {
                    r1.l lVarB2 = b(a0VarP, 1, dVar);
                    lVarB2.addTarget(this.f31323b.a(id4));
                    arrayList3.add(lVarB2);
                }
            }
            u1.a.r(pVar, arrayList3);
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [r1.l] */
    /* JADX WARN: Type inference failed for: r0v8, types: [r1.l] */
    /* JADX WARN: Type inference failed for: r0v9, types: [r1.l, r1.p] */
    public final r1.l b(y9.a0 a0Var, int i10, v9.d dVar) {
        int iX;
        v9.b<y9.w> bVar;
        ?? pVar;
        if (a0Var instanceof y9.a0.e) {
            pVar = new r1.p();
            Iterator it = ((y9.a0.e) a0Var).f38971c.f44194a.iterator();
            while (it.hasNext()) {
                r1.l lVarB = b((y9.a0) it.next(), i10, dVar);
                pVar.e(Math.max(pVar.getDuration(), lVarB.getDuration() + lVarB.getStartDelay()));
                pVar.b(lVarB);
            }
        } else {
            if (a0Var instanceof y9.a0.c) {
                y9.a0.c cVar = (y9.a0.c) a0Var;
                j8.d dVar2 = new j8.d((float) cVar.f38969c.f39139a.b(dVar).doubleValue());
                dVar2.setMode(i10);
                dVar2.setDuration(cVar.f38969c.f39140b.b(dVar).longValue());
                dVar2.setStartDelay(cVar.f38969c.f39142d.b(dVar).longValue());
                bVar = cVar.f38969c.f39141c;
                pVar = dVar2;
            } else if (a0Var instanceof y9.a0.d) {
                y9.a0.d dVar3 = (y9.a0.d) a0Var;
                j8.f fVar = new j8.f((float) dVar3.f38970c.f43564e.b(dVar).doubleValue(), (float) dVar3.f38970c.f43562c.b(dVar).doubleValue(), (float) dVar3.f38970c.f43563d.b(dVar).doubleValue());
                fVar.setMode(i10);
                fVar.setDuration(dVar3.f38970c.f43560a.b(dVar).longValue());
                fVar.setStartDelay(dVar3.f38970c.f43565f.b(dVar).longValue());
                bVar = dVar3.f38970c.f43561b;
                pVar = fVar;
            } else {
                if (!(a0Var instanceof y9.a0.f)) {
                    throw new jc.g();
                }
                y9.a0.f fVar2 = (y9.a0.f) a0Var;
                o1 o1Var = fVar2.f38972c.f41833a;
                if (o1Var == null) {
                    iX = -1;
                } else {
                    DisplayMetrics displayMetrics = this.f31322a.getResources().getDisplayMetrics();
                    fd.j0.h(displayMetrics, "context.resources.displayMetrics");
                    iX = l8.b.X(o1Var, displayMetrics, dVar);
                }
                int i11 = b.f31324a[fVar2.f38972c.f41835c.b(dVar).ordinal()];
                int i12 = 3;
                if (i11 != 1) {
                    if (i11 == 2) {
                        i12 = 48;
                    } else if (i11 == 3) {
                        i12 = 5;
                    } else {
                        if (i11 != 4) {
                            throw new jc.g();
                        }
                        i12 = 80;
                    }
                }
                j8.g gVar = new j8.g(iX, i12);
                gVar.setMode(i10);
                gVar.setDuration(fVar2.f38972c.f41834b.b(dVar).longValue());
                gVar.setStartDelay(fVar2.f38972c.f41837e.b(dVar).longValue());
                bVar = fVar2.f38972c.f41836d;
                pVar = gVar;
            }
            pVar.setInterpolator(f8.b.b(bVar.b(dVar)));
        }
        return pVar;
    }

    public final r1.l c(y9.r0 r0Var, v9.d dVar) {
        if (r0Var instanceof y9.r0.d) {
            r1.p pVar = new r1.p();
            Iterator<T> it = ((y9.r0.d) r0Var).f42232c.f41896a.iterator();
            while (it.hasNext()) {
                pVar.b(c((y9.r0) it.next(), dVar));
            }
            return pVar;
        }
        if (!(r0Var instanceof y9.r0.a)) {
            throw new jc.g();
        }
        r1.c cVar = new r1.c();
        y9.r0.a aVar = (y9.r0.a) r0Var;
        cVar.setDuration(aVar.f42230c.f41413a.b(dVar).longValue());
        cVar.setStartDelay(aVar.f42230c.f41415c.b(dVar).longValue());
        cVar.setInterpolator(f8.b.b(aVar.f42230c.f41414b.b(dVar)));
        return cVar;
    }
}
