package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.constraintlayout.widget.b implements r.k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f37755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View[] f37756n;

    public o(Context context) {
        super(context);
        this.f37753k = false;
        this.f37754l = false;
    }

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37753k = false;
        this.f37754l = false;
        l(attributeSet);
    }

    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37753k = false;
        this.f37754l = false;
        l(attributeSet);
    }

    @Override // y.r.k
    public void a(r rVar, int i10, int i11, float f10) {
    }

    @Override // y.r.k
    public void b(r rVar, int i10, boolean z10, float f10) {
    }

    @Override // y.r.k
    public void c(r rVar, int i10) {
    }

    @Override // y.r.k
    public void d(r rVar, int i10, int i11) {
    }

    public float getProgress() {
        return this.f37755m;
    }

    @Override // androidx.constraintlayout.widget.b
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z.d.f44947n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f37753k = typedArrayObtainStyledAttributes.getBoolean(index, this.f37753k);
                } else if (index == 0) {
                    this.f37754l = typedArrayObtainStyledAttributes.getBoolean(index, this.f37754l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f37755m = f10;
        int i10 = 0;
        if (this.f1494d <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                boolean z10 = viewGroup.getChildAt(i10) instanceof o;
                i10++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f1499i;
        if (viewArr == null || viewArr.length != this.f1494d) {
            this.f1499i = new View[this.f1494d];
        }
        for (int i11 = 0; i11 < this.f1494d; i11++) {
            this.f1499i[i11] = constraintLayout.getViewById(this.f1493c[i11]);
        }
        this.f37756n = this.f1499i;
        while (i10 < this.f1494d) {
            View view = this.f37756n[i10];
            i10++;
        }
    }
}
