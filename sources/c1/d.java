package c1;

import android.view.animation.Interpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import w.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f3536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3537b;

    public d(float[] fArr) {
        this.f3536a = fArr;
        this.f3537b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float[] fArr = this.f3536a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f3537b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f3536a;
        return e.a(fArr2[iMin + 1], fArr2[iMin], f12, fArr2[iMin]);
    }
}
