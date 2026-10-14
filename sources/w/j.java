package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static p a(v.f fVar, int i10, ArrayList<p> arrayList, p pVar) {
        v.d dVar;
        int i11;
        int i12 = i10 == 0 ? fVar.N0 : fVar.O0;
        if (i12 != -1 && (pVar == null || i12 != pVar.f37066b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                p pVar2 = arrayList.get(i13);
                if (pVar2.f37066b == i12) {
                    if (pVar != null) {
                        pVar.d(i10, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if (fVar instanceof v.k) {
                v.k kVar = (v.k) fVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= kVar.Q0) {
                        i11 = -1;
                        break;
                    }
                    v.f fVar2 = kVar.P0[i14];
                    if ((i10 == 0 && (i11 = fVar2.N0) != -1) || (i10 == 1 && (i11 = fVar2.O0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        p pVar3 = arrayList.get(i15);
                        if (pVar3.f37066b == i11) {
                            pVar = pVar3;
                            break;
                        }
                    }
                }
            }
            if (pVar == null) {
                pVar = new p(i10);
            }
            arrayList.add(pVar);
        }
        if (pVar.a(fVar)) {
            if (fVar instanceof v.i) {
                v.i iVar = (v.i) fVar;
                iVar.T0.c(iVar.U0 == 0 ? 1 : 0, arrayList, pVar);
            }
            if (i10 == 0) {
                fVar.N0 = pVar.f37066b;
                fVar.M.c(i10, arrayList, pVar);
                dVar = fVar.O;
            } else {
                fVar.O0 = pVar.f37066b;
                fVar.N.c(i10, arrayList, pVar);
                fVar.Q.c(i10, arrayList, pVar);
                dVar = fVar.P;
            }
            dVar.c(i10, arrayList, pVar);
            fVar.T.c(i10, arrayList, pVar);
        }
        return pVar;
    }

    public static p b(ArrayList<p> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = arrayList.get(i11);
            if (i10 == pVar.f37066b) {
                return pVar;
            }
        }
        return null;
    }

    public static boolean c(v.f.b bVar, v.f.b bVar2, v.f.b bVar3, v.f.b bVar4) {
        v.f.b bVar5;
        v.f.b bVar6;
        v.f.b bVar7 = v.f.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = v.f.b.WRAP_CONTENT) || (bVar3 == v.f.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = v.f.b.WRAP_CONTENT) || (bVar4 == v.f.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
