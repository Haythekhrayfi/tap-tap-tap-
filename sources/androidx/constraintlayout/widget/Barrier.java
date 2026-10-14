package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import v.f;
import v.g;
import v.k;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v.a f1425m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1425m.S0;
    }

    public int getMargin() {
        return this.f1425m.T0;
    }

    public int getType() {
        return this.f1423k;
    }

    @Override // androidx.constraintlayout.widget.b
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.f1425m = new v.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44935b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1425m.S0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1425m.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1496f = this.f1425m;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(c.a aVar, k kVar, ConstraintLayout.b bVar, SparseArray<f> sparseArray) {
        super.m(aVar, kVar, bVar, sparseArray);
        if (kVar instanceof v.a) {
            v.a aVar2 = (v.a) kVar;
            p(aVar2, aVar.f1514e.f1544g0, ((g) kVar.Y).U0);
            c.b bVar2 = aVar.f1514e;
            aVar2.S0 = bVar2.f1560o0;
            aVar2.T0 = bVar2.f1546h0;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(f fVar, boolean z10) {
        p(fVar, this.f1423k, z10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void p(f fVar, int i10, boolean z10) {
        this.f1424l = i10;
        if (z10) {
            int i11 = this.f1423k;
            if (i11 == 5) {
                this.f1424l = 1;
            } else if (i11 == 6) {
                this.f1424l = 0;
            }
        } else {
            int i12 = this.f1423k;
            if (i12 == 5) {
                this.f1424l = 0;
            } else if (i12 == 6) {
                this.f1424l = 1;
            }
        }
        if (fVar instanceof v.a) {
            ((v.a) fVar).R0 = this.f1424l;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1425m.S0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f1425m.T0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1425m.T0 = i10;
    }

    public void setType(int i10) {
        this.f1423k = i10;
    }
}
