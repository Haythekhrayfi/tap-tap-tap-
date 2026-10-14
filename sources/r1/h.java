package r1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f35094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f35095b;

    public h() {
        Path path = new Path();
        this.f35094a = path;
        this.f35095b = new Matrix();
        path.lineTo(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    @SuppressLint({"RestrictedApi"})
    public h(Context context, AttributeSet attributeSet) {
        this.f35094a = new Path();
        this.f35095b = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35106g);
        try {
            String strE = g0.j.e(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strE == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            a(h0.i.c(strE));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public h(Path path) {
        this.f35094a = new Path();
        this.f35095b = new Matrix();
        a(path);
    }

    public void a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f35095b.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fSqrt = 1.0f / ((float) Math.sqrt((f15 * f15) + (f14 * f14)));
        this.f35095b.postScale(fSqrt, fSqrt);
        this.f35095b.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f35095b, this.f35094a);
    }

    @Override // r1.g
    public Path getPath(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        double dAtan2 = Math.atan2(f15, f14);
        this.f35095b.setScale(fSqrt, fSqrt);
        this.f35095b.postRotate((float) Math.toDegrees(dAtan2));
        this.f35095b.postTranslate(f10, f11);
        Path path = new Path();
        this.f35094a.transform(this.f35095b, path);
        return path;
    }
}
