package q7;

import android.view.animation.Interpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f34795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34796b;

    public e(float[] fArr) {
        j0.i(fArr, "values");
        this.f34795a = fArr;
        this.f34796b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        float[] fArr = this.f34795a;
        j0.i(fArr, "<this>");
        int length = (int) ((fArr.length - 1) * f10);
        float[] fArr2 = this.f34795a;
        int length2 = fArr2.length - 2;
        if (length > length2) {
            length = length2;
        }
        float f11 = this.f34796b;
        return w.e.a(fArr2[length + 1], fArr2[length], (f10 - (length * f11)) / f11, fArr2[length]);
    }
}
