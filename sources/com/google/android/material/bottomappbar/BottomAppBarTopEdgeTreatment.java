package com.google.android.material.bottomappbar;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import w.e;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f10, float f11, float f12) {
        this.fabMargin = f10;
        this.roundedCornerRadius = f11;
        setCradleVerticalOffset(f12);
        this.horizontalOffset = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, ShapePath shapePath) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21 = this.fabDiameter;
        if (f21 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            shapePath.lineTo(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            return;
        }
        float f22 = ((this.fabMargin * 2.0f) + f21) / 2.0f;
        float f23 = f12 * this.roundedCornerRadius;
        float f24 = f11 + this.horizontalOffset;
        float fA = e.a(1.0f, f12, f22, this.cradleVerticalOffset * f12);
        if (fA / f22 >= 1.0f) {
            shapePath.lineTo(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            return;
        }
        float f25 = this.fabCornerSize;
        float f26 = f25 * f12;
        boolean z10 = f25 == -1.0f || Math.abs((f25 * 2.0f) - f21) < 0.1f;
        if (z10) {
            f13 = fA;
            f14 = 0.0f;
        } else {
            f14 = ROUNDED_CORNER_FAB_OFFSET;
            f13 = 0.0f;
        }
        float f27 = f22 + f23;
        float f28 = f13 + f23;
        float fSqrt = (float) Math.sqrt((f27 * f27) - (f28 * f28));
        float f29 = f24 - fSqrt;
        float f30 = f24 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f28));
        float f31 = (90.0f - degrees) + f14;
        shapePath.lineTo(f29, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        float f32 = f23 * 2.0f;
        shapePath.addArc(f29 - f23, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f29 + f23, f32, 270.0f, degrees);
        if (z10) {
            f16 = f24 - f22;
            f17 = (-f22) - f13;
            f15 = f24 + f22;
            float f33 = 180.0f - f31;
            f18 = (f31 * 2.0f) - 180.0f;
            f20 = f33;
            f19 = f22 - f13;
        } else {
            float f34 = this.fabMargin;
            float f35 = f26 * 2.0f;
            float f36 = f24 - f22;
            shapePath.addArc(f36, -(f26 + f34), f36 + f34 + f35, f34 + f26, 180.0f - f31, ((f31 * 2.0f) - 180.0f) / 2.0f);
            f15 = f24 + f22;
            float f37 = this.fabMargin;
            shapePath.lineTo(f15 - ((f37 / 2.0f) + f26), f37 + f26);
            float f38 = this.fabMargin;
            f16 = f15 - (f35 + f38);
            f17 = -(f26 + f38);
            f18 = f31 - 90.0f;
            f19 = f38 + f26;
            f20 = 90.0f;
        }
        shapePath.addArc(f16, f17, f15, f19, f20, f18);
        shapePath.addArc(f30 - f23, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f30 + f23, f32, 270.0f - degrees, degrees);
        shapePath.lineTo(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f10;
    }

    public void setFabCornerSize(float f10) {
        this.fabCornerSize = f10;
    }

    public void setFabCradleMargin(float f10) {
        this.fabMargin = f10;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        this.roundedCornerRadius = f10;
    }

    public void setFabDiameter(float f10) {
        this.fabDiameter = f10;
    }

    public void setHorizontalOffset(float f10) {
        this.horizontalOffset = f10;
    }
}
