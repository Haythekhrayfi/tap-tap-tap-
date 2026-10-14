package r1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f35030d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35033c;

    public a() {
        this.f35031a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35032b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35033c = f35030d;
    }

    @SuppressLint({"RestrictedApi"})
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35031a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35032b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        this.f35033c = f35030d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35105f);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f35032b = a(g0.j.c(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD));
        this.f35031a = a(g0.j.i(xmlPullParser, "minimumHorizontalAngle") ? typedArrayObtainStyledAttributes.getFloat(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) : f10);
        this.f35033c = a(g0.j.i(xmlPullParser, "maximumAngle") ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10) {
        if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // r1.g
    public Path getPath(float f10, float f11, float f12, float f13) {
        float fA;
        float fA2;
        float f14;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = (f10 + f12) / 2.0f;
        float f19 = (f11 + f13) / 2.0f;
        float f20 = 0.25f * f17;
        boolean z10 = f11 > f13;
        if (Math.abs(f15) < Math.abs(f16)) {
            float fAbs = Math.abs(f17 / (f16 * 2.0f));
            if (z10) {
                fA2 = fAbs + f13;
                fA = f12;
            } else {
                fA2 = fAbs + f11;
                fA = f10;
            }
            f14 = this.f35032b;
        } else {
            float f21 = f17 / (f15 * 2.0f);
            if (z10) {
                fA2 = f11;
                fA = f21 + f10;
            } else {
                fA = f12 - f21;
                fA2 = f13;
            }
            f14 = this.f35031a;
        }
        float f22 = f20 * f14 * f14;
        float f23 = f18 - fA;
        float f24 = f19 - fA2;
        float f25 = (f24 * f24) + (f23 * f23);
        float f26 = this.f35033c;
        float f27 = f20 * f26 * f26;
        if (f25 >= f22) {
            f22 = f25 > f27 ? f27 : 0.0f;
        }
        if (f22 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            float fSqrt = (float) Math.sqrt(f22 / f25);
            fA = w.e.a(fA, f18, fSqrt, f18);
            fA2 = w.e.a(fA2, f19, fSqrt, f19);
        }
        path.cubicTo((f10 + fA) / 2.0f, (f11 + fA2) / 2.0f, (fA + f12) / 2.0f, (fA2 + f13) / 2.0f, f12, f13);
        return path;
    }
}
