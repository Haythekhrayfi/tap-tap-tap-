package v;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o extends f {
    public ArrayList<f> P0;

    public o() {
        this.P0 = new ArrayList<>();
    }

    public o(int i10, int i11) {
        super(i10, i11);
        this.P0 = new ArrayList<>();
    }

    public o(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.P0 = new ArrayList<>();
    }

    @Override // v.f
    public void L() {
        this.P0.clear();
        super.L();
    }

    @Override // v.f
    public void O(r.c cVar) {
        super.O(cVar);
        int size = this.P0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P0.get(i10).O(cVar);
        }
    }

    public void c0() {
        ArrayList<f> arrayList = this.P0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.P0.get(i10);
            if (fVar instanceof o) {
                ((o) fVar).c0();
            }
        }
    }
}
