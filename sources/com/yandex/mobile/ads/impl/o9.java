package com.yandex.mobile.ads.impl;

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
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final RectF f23730j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f23731k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f23732l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23733a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23734b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23735c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f23736d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f23737e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f23738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f23739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f23740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f23741i;

    public static class a extends c {
        @Override // com.yandex.mobile.ads.impl.o9.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) o9.a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // com.yandex.mobile.ads.impl.o9.a, com.yandex.mobile.ads.impl.o9.c
        public final void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // com.yandex.mobile.ads.impl.o9.c
        public final boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean a(TextView textView) {
            return ((Boolean) o9.a(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public o9(TextView textView) {
        this.f23739g = textView;
        this.f23740h = textView.getContext();
        this.f23741i = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    private int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f23737e.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f23737e[i13];
            CharSequence text = this.f23739g.getText();
            TransformationMethod transformationMethod = this.f23739g.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f23739g)) != null) {
                text = transformation;
            }
            int maxLines = this.f23739g.getMaxLines();
            TextPaint textPaint = this.f23738f;
            if (textPaint == null) {
                this.f23738f = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f23738f.set(this.f23739g.getPaint());
            this.f23738f.setTextSize(i14);
            Layout.Alignment alignment = (Layout.Alignment) a(this.f23739g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f23738f, Math.round(rectF.right));
            builderObtain.setAlignment(alignment).setLineSpacing(this.f23739g.getLineSpacingExtra(), this.f23739g.getLineSpacingMultiplier()).setIncludePad(this.f23739g.getIncludeFontPadding()).setBreakStrategy(this.f23739g.getBreakStrategy()).setHyphenationFrequency(this.f23739g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f23741i.a(builderObtain, this.f23739g);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && ((float) staticLayoutBuild.getHeight()) <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f23737e[i12];
    }

    public static <T> T a(Object obj, String str, T t10) {
        Method declaredMethod;
        try {
            declaredMethod = f23731k.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f23731k.put(str, declaredMethod);
            }
        } catch (Exception e10) {
            try {
                Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
                declaredMethod = null;
            } catch (Exception e11) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e11);
                return t10;
            }
        }
        return (T) declaredMethod.invoke(obj, new Object[0]);
    }

    private static Field a(String str) {
        try {
            Field declaredField = f23732l.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f23732l.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    public final void a() {
        if (b()) {
            if (this.f23734b) {
                if (this.f23739g.getMeasuredHeight() <= 0 || this.f23739g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f23741i.a(this.f23739g) ? 1048576 : (this.f23739g.getMeasuredWidth() - this.f23739g.getTotalPaddingLeft()) - this.f23739g.getTotalPaddingRight();
                int height = (this.f23739g.getHeight() - this.f23739g.getCompoundPaddingBottom()) - this.f23739g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f23730j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fA = a(rectF);
                    if (fA != this.f23739g.getTextSize()) {
                        a(0, fA);
                    }
                }
            }
            this.f23734b = true;
        }
    }

    public final void a(int i10) {
        if (!(this.f23739g instanceof EditText)) {
            if (i10 == 0) {
                this.f23733a = 0;
                this.f23736d = -1.0f;
                this.f23735c = -1.0f;
                this.f23737e = new int[0];
                this.f23734b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(u60.a("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = this.f23740h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 <= fApplyDimension) {
                throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
            }
            this.f23733a = 1;
            this.f23736d = fApplyDimension;
            this.f23735c = 1.0f;
            if (!(this.f23739g instanceof EditText)) {
                int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr[i11] = Math.round((i11 * this.f23735c) + this.f23736d);
                }
                if (iFloor != 0) {
                    Arrays.sort(iArr);
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < iFloor; i12++) {
                        int i13 = iArr[i12];
                        if (i13 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i13)) < 0) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    if (iFloor != arrayList.size()) {
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i14 = 0; i14 < size; i14++) {
                            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
                        }
                    }
                }
                this.f23737e = iArr;
                this.f23734b = true;
            } else {
                this.f23734b = false;
            }
            if (this.f23734b) {
                a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:21:0x0068, B:19:0x0060, B:12:0x0041, B:14:0x004b, B:16:0x0055), top: B:30:0x0041, inners: #1 }] */
    public final void a(int i10, float f10) {
        Method declaredMethod;
        Context context = this.f23740h;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f23739g.getPaint().getTextSize()) {
            this.f23739g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f23739g.isInLayout();
            if (this.f23739g.getLayout() != null) {
                this.f23734b = false;
                try {
                    try {
                        declaredMethod = f23731k.get("nullLayouts");
                        if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0])) != null) {
                            declaredMethod.setAccessible(true);
                            f23731k.put("nullLayouts", declaredMethod);
                            if (declaredMethod != null) {
                                declaredMethod.invoke(this.f23739g, new Object[0]);
                            }
                        } else if (declaredMethod != null) {
                            declaredMethod.invoke(this.f23739g, new Object[0]);
                        }
                    } catch (Exception e10) {
                        Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#nullLayouts() method", e10);
                        declaredMethod = null;
                    }
                } catch (Exception e11) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e11);
                }
                if (zIsInLayout) {
                    this.f23739g.forceLayout();
                } else {
                    this.f23739g.requestLayout();
                }
                this.f23739g.invalidate();
            }
        }
    }

    public final boolean b() {
        return ((this.f23739g instanceof EditText) ^ true) && this.f23733a != 0;
    }
}
