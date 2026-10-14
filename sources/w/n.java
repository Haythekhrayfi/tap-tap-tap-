package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f37058c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f37059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<q> f37060b = new ArrayList<>();

    public n(q qVar, int i10) {
        this.f37059a = null;
        f37058c++;
        this.f37059a = qVar;
    }

    public final long a(g gVar, long j10) {
        q qVar = gVar.f37043d;
        if (qVar instanceof l) {
            return j10;
        }
        int size = gVar.f37050k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = gVar.f37050k.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f37043d != qVar) {
                    jMin = Math.min(jMin, a(gVar2, ((long) gVar2.f37045f) + j10));
                }
            }
        }
        if (gVar != qVar.f37078i) {
            return jMin;
        }
        long j11 = j10 - qVar.j();
        return Math.min(Math.min(jMin, a(qVar.f37077h, j11)), j11 - ((long) qVar.f37077h.f37045f));
    }

    public final long b(g gVar, long j10) {
        q qVar = gVar.f37043d;
        if (qVar instanceof l) {
            return j10;
        }
        int size = gVar.f37050k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = gVar.f37050k.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f37043d != qVar) {
                    jMax = Math.max(jMax, b(gVar2, ((long) gVar2.f37045f) + j10));
                }
            }
        }
        if (gVar != qVar.f37077h) {
            return jMax;
        }
        long j11 = j10 + qVar.j();
        return Math.max(Math.max(jMax, b(qVar.f37078i, j11)), j11 - ((long) qVar.f37078i.f37045f));
    }
}
