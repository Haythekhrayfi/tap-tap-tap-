package v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h extends n {
    public int S0 = -1;
    public int T0 = -1;
    public int U0 = -1;
    public int V0 = -1;
    public int W0 = -1;
    public int X0 = -1;
    public float Y0 = 0.5f;
    public float Z0 = 0.5f;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public float f36641a1 = 0.5f;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public float f36642b1 = 0.5f;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public float f36643c1 = 0.5f;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f36644d1 = 0.5f;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f36645e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f36646f1 = 0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f36647g1 = 2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f36648h1 = 2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f36649i1 = 0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f36650j1 = -1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f36651k1 = 0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public ArrayList<a> f36652l1 = new ArrayList<>();

    public class a {
        public a(h hVar, int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            Objects.requireNonNull(hVar);
        }
    }

    @Override // v.f
    public void g(r.d dVar, boolean z10) {
        super.g(dVar, z10);
        f fVar = this.Y;
        if (fVar != null) {
            boolean z11 = ((g) fVar).U0;
        }
        int i10 = this.f36649i1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f36652l1.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Objects.requireNonNull(this.f36652l1.get(i11));
                }
            } else if (i10 == 3) {
                int size2 = this.f36652l1.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Objects.requireNonNull(this.f36652l1.get(i12));
                }
            }
        } else if (this.f36652l1.size() > 0) {
            Objects.requireNonNull(this.f36652l1.get(0));
        }
        this.R0 = false;
    }

    @Override // v.k, v.f
    public void k(f fVar, HashMap<f, f> map) {
        super.k(fVar, map);
        h hVar = (h) fVar;
        this.S0 = hVar.S0;
        this.T0 = hVar.T0;
        this.U0 = hVar.U0;
        this.V0 = hVar.V0;
        this.W0 = hVar.W0;
        this.X0 = hVar.X0;
        this.Y0 = hVar.Y0;
        this.Z0 = hVar.Z0;
        this.f36641a1 = hVar.f36641a1;
        this.f36642b1 = hVar.f36642b1;
        this.f36643c1 = hVar.f36643c1;
        this.f36644d1 = hVar.f36644d1;
        this.f36645e1 = hVar.f36645e1;
        this.f36646f1 = hVar.f36646f1;
        this.f36647g1 = hVar.f36647g1;
        this.f36648h1 = hVar.f36648h1;
        this.f36649i1 = hVar.f36649i1;
        this.f36650j1 = hVar.f36650j1;
        this.f36651k1 = hVar.f36651k1;
    }
}
