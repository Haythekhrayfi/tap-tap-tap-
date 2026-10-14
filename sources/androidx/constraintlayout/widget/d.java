package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f1608c;

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public float f1609v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f1610w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public float f1611x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public float f1612y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public float f1613z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1609v0 = 1.0f;
            this.f1610w0 = false;
            this.f1611x0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1612y0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1613z0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.A0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.B0 = 1.0f;
            this.C0 = 1.0f;
            this.D0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.E0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.F0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.G0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.H0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1609v0 = 1.0f;
            this.f1610w0 = false;
            this.f1611x0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1612y0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1613z0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.A0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.B0 = 1.0f;
            this.C0 = 1.0f;
            this.D0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.E0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.F0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.G0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.H0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f44938e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1609v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1609v0);
                } else if (index == 28) {
                    this.f1611x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1611x0);
                    this.f1610w0 = true;
                } else if (index == 23) {
                    this.f1613z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1613z0);
                } else if (index == 24) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 22) {
                    this.f1612y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1612y0);
                } else if (index == 20) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 21) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 16) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == 17) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == 18) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == 19) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == 27) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super((ConstraintLayout.b) aVar);
            this.f1609v0 = 1.0f;
            this.f1610w0 = false;
            this.f1611x0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1612y0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f1613z0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.A0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.B0 = 1.0f;
            this.C0 = 1.0f;
            this.D0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.E0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.F0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.G0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.H0 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    public d(Context context) {
        super(context);
        setVisibility(8);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f1608c == null) {
            this.f1608c = new c();
        }
        c cVar = this.f1608c;
        Objects.requireNonNull(cVar);
        int childCount = getChildCount();
        cVar.f1509f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (cVar.f1508e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.f1509f.containsKey(Integer.valueOf(id2))) {
                cVar.f1509f.put(Integer.valueOf(id2), new c.a());
            }
            c.a aVar2 = cVar.f1509f.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof b) {
                    b bVar = (b) childAt;
                    aVar2.d(id2, aVar);
                    if (bVar instanceof Barrier) {
                        c.b bVar2 = aVar2.f1514e;
                        bVar2.f1548i0 = 1;
                        Barrier barrier = (Barrier) bVar;
                        bVar2.f1544g0 = barrier.getType();
                        aVar2.f1514e.f1550j0 = barrier.getReferencedIds();
                        aVar2.f1514e.f1546h0 = barrier.getMargin();
                    }
                }
                aVar2.d(id2, aVar);
            }
        }
        return this.f1608c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }
}
