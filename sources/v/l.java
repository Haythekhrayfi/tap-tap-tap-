package v;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean[] f36654a = new boolean[3];

    public static void a(g gVar, r.d dVar, f fVar) {
        fVar.f36605p = -1;
        fVar.f36607q = -1;
        f.b bVar = gVar.X[0];
        f.b bVar2 = f.b.WRAP_CONTENT;
        if (bVar != bVar2 && fVar.X[0] == f.b.MATCH_PARENT) {
            int i10 = fVar.M.f36571g;
            int iZ = gVar.z() - fVar.O.f36571g;
            d dVar2 = fVar.M;
            dVar2.f36573i = dVar.l(dVar2);
            d dVar3 = fVar.O;
            dVar3.f36573i = dVar.l(dVar3);
            dVar.e(fVar.M.f36573i, i10);
            dVar.e(fVar.O.f36573i, iZ);
            fVar.f36605p = 2;
            fVar.f36582d0 = i10;
            int i11 = iZ - i10;
            fVar.Z = i11;
            int i12 = fVar.f36596k0;
            if (i11 < i12) {
                fVar.Z = i12;
            }
        }
        if (gVar.X[1] == bVar2 || fVar.X[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i13 = fVar.N.f36571g;
        int iQ = gVar.q() - fVar.P.f36571g;
        d dVar4 = fVar.N;
        dVar4.f36573i = dVar.l(dVar4);
        d dVar5 = fVar.P;
        dVar5.f36573i = dVar.l(dVar5);
        dVar.e(fVar.N.f36573i, i13);
        dVar.e(fVar.P.f36573i, iQ);
        if (fVar.f36594j0 > 0 || fVar.f36608q0 == 8) {
            d dVar6 = fVar.Q;
            dVar6.f36573i = dVar.l(dVar6);
            dVar.e(fVar.Q.f36573i, fVar.f36594j0 + i13);
        }
        fVar.f36607q = 2;
        fVar.f36584e0 = i13;
        int i14 = iQ - i13;
        fVar.f36576a0 = i14;
        int i15 = fVar.f36598l0;
        if (i14 < i15) {
            fVar.f36576a0 = i15;
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
