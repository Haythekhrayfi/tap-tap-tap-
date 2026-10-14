package t9;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public class k extends a {
    public k(ViewGroup viewGroup, j.b bVar, j.a aVar) {
        super(viewGroup, bVar, aVar);
    }

    @Override // t9.u.a
    public boolean b(int i10, float f10) {
        if (!(this.f35723d.size() == 0)) {
            if (i10 != 0 && (i10 != 1 || f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                return false;
            }
            this.f35723d.size();
            int i11 = e9.a.f29114a;
            SparseArray<o> sparseArray = this.f35723d;
            o oVarValueAt = sparseArray.valueAt(sparseArray.size() - 1);
            if (!(oVarValueAt.a() != oVarValueAt.b())) {
                return false;
            }
        }
        return true;
    }

    @Override // t9.a
    public int e(o oVar, int i10, float f10) {
        if (i10 > 0) {
            return oVar.b();
        }
        if (f10 < 0.01f) {
            return oVar.a();
        }
        int iA = oVar.a();
        return Math.round(((oVar.b() - iA) * f10) + iA);
    }
}
