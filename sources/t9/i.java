package t9;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class i extends a {
    public i(ViewGroup viewGroup, j.b bVar, j.a aVar) {
        super(viewGroup, bVar, aVar);
    }

    @Override // t9.u.a
    public boolean b(int i10, float f10) {
        return true;
    }

    @Override // t9.a, t9.u.a
    public int c(int i10, int i11) {
        this.f35723d.clear();
        return super.c(i10, i11);
    }

    @Override // t9.a
    public int e(o oVar, int i10, float f10) {
        if (f10 < 0.01f) {
            return oVar.c(i10);
        }
        int iC = oVar.c(i10);
        return Math.round(((oVar.c(i10 + 1) - iC) * f10) + iC);
    }
}
