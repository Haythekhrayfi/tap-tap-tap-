package w;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37052m;

    public h(q qVar) {
        super(qVar);
        this.f37044e = qVar instanceof m ? g.a.HORIZONTAL_DIMENSION : g.a.VERTICAL_DIMENSION;
    }

    @Override // w.g
    public void c(int i10) {
        if (this.f37049j) {
            return;
        }
        this.f37049j = true;
        this.f37046g = i10;
        for (d dVar : this.f37050k) {
            dVar.a(dVar);
        }
    }
}
