package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f37064f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37067c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<v.f> f37065a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<a> f37068d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37069e = -1;

    public class a {
        public a(p pVar, v.f fVar, r.d dVar, int i10) {
            new WeakReference(fVar);
            dVar.o(fVar.M);
            dVar.o(fVar.N);
            dVar.o(fVar.O);
            dVar.o(fVar.P);
            dVar.o(fVar.Q);
        }
    }

    public p(int i10) {
        this.f37066b = -1;
        this.f37067c = 0;
        int i11 = f37064f;
        f37064f = i11 + 1;
        this.f37066b = i11;
        this.f37067c = i10;
    }

    public boolean a(v.f fVar) {
        if (this.f37065a.contains(fVar)) {
            return false;
        }
        this.f37065a.add(fVar);
        return true;
    }

    public void b(ArrayList<p> arrayList) {
        int size = this.f37065a.size();
        if (this.f37069e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p pVar = arrayList.get(i10);
                if (this.f37069e == pVar.f37066b) {
                    d(this.f37067c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(r.d dVar, int i10) {
        int iO;
        v.d dVar2;
        if (this.f37065a.size() == 0) {
            return 0;
        }
        ArrayList<v.f> arrayList = this.f37065a;
        v.g gVar = (v.g) arrayList.get(0).Y;
        dVar.u();
        gVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && gVar.Z0 > 0) {
            v.b.a(gVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && gVar.f36629a1 > 0) {
            v.b.a(gVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f37068d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f37068d.add(new a(this, arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iO = dVar.o(gVar.M);
            dVar2 = gVar.O;
        } else {
            iO = dVar.o(gVar.N);
            dVar2 = gVar.P;
        }
        int iO2 = dVar.o(dVar2);
        dVar.u();
        return iO2 - iO;
    }

    public void d(int i10, p pVar) {
        for (v.f fVar : this.f37065a) {
            pVar.a(fVar);
            if (i10 == 0) {
                fVar.N0 = pVar.f37066b;
            } else {
                fVar.O0 = pVar.f37066b;
            }
        }
        this.f37069e = pVar.f37066b;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f37067c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strA = android.support.v4.media.b.a(sb2, this.f37066b, "] <");
        for (v.f fVar : this.f37065a) {
            StringBuilder sbA = android.support.v4.media.c.a(strA, " ");
            sbA.append(fVar.f36612s0);
            strA = sbA.toString();
        }
        return i.f.a(strA, " >");
    }
}
