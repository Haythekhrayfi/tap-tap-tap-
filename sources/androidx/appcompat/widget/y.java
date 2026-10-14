package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f1397l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f1398m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f1399n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1400a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1401b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1402c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1403d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1404e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1405f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1406g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f1407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f1408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f1409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f1410k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class d extends f {
        @Override // androidx.appcompat.widget.y.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) y.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class e extends d {
        @Override // androidx.appcompat.widget.y.d, androidx.appcompat.widget.y.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.y.f
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) y.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public y(TextView textView) {
        this.f1408i = textView;
        this.f1409j = textView.getContext();
        this.f1410k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    public static Method d(String str) {
        try {
            Method declaredMethod = f1398m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1398m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    public void a() {
        if (i() && this.f1400a != 0) {
            if (this.f1401b) {
                if (this.f1408i.getMeasuredHeight() <= 0 || this.f1408i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1410k.b(this.f1408i) ? 1048576 : (this.f1408i.getMeasuredWidth() - this.f1408i.getTotalPaddingLeft()) - this.f1408i.getTotalPaddingRight();
                int height = (this.f1408i.getHeight() - this.f1408i.getCompoundPaddingBottom()) - this.f1408i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1397l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fC = c(rectF);
                    if (fC != this.f1408i.getTextSize()) {
                        f(0, fC);
                    }
                }
            }
            this.f1401b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1405f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f1405f[i13];
            CharSequence text = this.f1408i.getText();
            TransformationMethod transformationMethod = this.f1408i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1408i)) != null) {
                text = transformation;
            }
            int iB = a.b(this.f1408i);
            TextPaint textPaint = this.f1407h;
            if (textPaint == null) {
                this.f1407h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1407h.set(this.f1408i.getPaint());
            this.f1407h.setTextSize(i14);
            StaticLayout staticLayoutA = c.a(text, (Layout.Alignment) e(this.f1408i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, this.f1408i, this.f1407h, this.f1410k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && ((float) staticLayoutA.getHeight()) <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f1405f[i12];
    }

    public void f(int i10, float f10) {
        Context context = this.f1409j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f1408i.getPaint().getTextSize()) {
            this.f1408i.getPaint().setTextSize(fApplyDimension);
            boolean zA = b.a(this.f1408i);
            if (this.f1408i.getLayout() != null) {
                this.f1401b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(this.f1408i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zA) {
                    this.f1408i.forceLayout();
                } else {
                    this.f1408i.requestLayout();
                }
                this.f1408i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f1400a == 1) {
            if (!this.f1406g || this.f1405f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1404e - this.f1403d) / this.f1402c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1402c) + this.f1403d);
                }
                this.f1405f = b(iArr);
            }
            this.f1401b = true;
        } else {
            this.f1401b = false;
        }
        return this.f1401b;
    }

    public final boolean h() {
        int[] iArr = this.f1405f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1406g = z10;
        if (z10) {
            this.f1400a = 1;
            this.f1403d = iArr[0];
            this.f1404e = iArr[length - 1];
            this.f1402c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f1408i instanceof k);
    }

    public final void j(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1400a = 1;
        this.f1403d = f10;
        this.f1404e = f11;
        this.f1402c = f12;
        this.f1406g = false;
    }
}
