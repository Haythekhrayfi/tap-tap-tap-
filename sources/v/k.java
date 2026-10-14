package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class k extends f implements j {
    public f[] P0 = new f[4];
    public int Q0 = 0;

    @Override // v.j
    public void a() {
        this.Q0 = 0;
        Arrays.fill(this.P0, (Object) null);
    }

    @Override // v.j
    public void b(f fVar) {
        if (fVar == this || fVar == null) {
            return;
        }
        int i10 = this.Q0 + 1;
        f[] fVarArr = this.P0;
        if (i10 > fVarArr.length) {
            this.P0 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        f[] fVarArr2 = this.P0;
        int i11 = this.Q0;
        fVarArr2[i11] = fVar;
        this.Q0 = i11 + 1;
    }

    @Override // v.j
    public void c(g gVar) {
    }

    public void c0(ArrayList<p> arrayList, int i10, p pVar) {
        for (int i11 = 0; i11 < this.Q0; i11++) {
            pVar.a(this.P0[i11]);
        }
        for (int i12 = 0; i12 < this.Q0; i12++) {
            w.j.a(this.P0[i12], i10, arrayList, pVar);
        }
    }

    @Override // v.f
    public void k(f fVar, HashMap<f, f> map) {
        super.k(fVar, map);
        k kVar = (k) fVar;
        this.Q0 = 0;
        int i10 = kVar.Q0;
        for (int i11 = 0; i11 < i10; i11++) {
            b(map.get(kVar.P0[i11]));
        }
    }
}
