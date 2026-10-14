package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f1373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w0 f1374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f1375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f1376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f1377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0 f1378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w0 f1379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f1380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1381j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1382k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f1383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1384m;

    public class a extends g0.f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f1387c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1385a = i10;
            this.f1386b = i11;
            this.f1387c = weakReference;
        }

        @Override // g0.f.e
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public void lambda$callbackFailAsync$1(int i10) {
        }

        @Override // g0.f.e
        /* JADX INFO: renamed from: onFontRetrieved */
        public void lambda$callbackSuccessAsync$0(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1385a) != -1) {
                typeface = e.a(typeface, i10, (this.f1386b & 2) != 0);
            }
            w wVar = w.this;
            WeakReference weakReference = this.f1387c;
            if (wVar.f1384m) {
                wVar.f1383l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                    if (p0.e0.g.b(textView)) {
                        textView.post(new x(wVar, textView, typeface, wVar.f1381j));
                    } else {
                        textView.setTypeface(typeface, wVar.f1381j);
                    }
                }
            }
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public w(TextView textView) {
        this.f1372a = textView;
        this.f1380i = new y(textView);
    }

    public static w0 c(Context context, j jVar, int i10) {
        ColorStateList colorStateListD = jVar.d(context, i10);
        if (colorStateListD == null) {
            return null;
        }
        w0 w0Var = new w0();
        w0Var.f1392d = true;
        w0Var.f1389a = colorStateListD;
        return w0Var;
    }

    public final void a(Drawable drawable, w0 w0Var) {
        if (drawable == null || w0Var == null) {
            return;
        }
        j.f(drawable, w0Var, this.f1372a.getDrawableState());
    }

    public void b() {
        if (this.f1373b != null || this.f1374c != null || this.f1375d != null || this.f1376e != null) {
            Drawable[] compoundDrawables = this.f1372a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1373b);
            a(compoundDrawables[1], this.f1374c);
            a(compoundDrawables[2], this.f1375d);
            a(compoundDrawables[3], this.f1376e);
        }
        if (this.f1377f == null && this.f1378g == null) {
            return;
        }
        Drawable[] drawableArrA = b.a(this.f1372a);
        a(drawableArrA[0], this.f1377f);
        a(drawableArrA[2], this.f1378g);
    }

    public ColorStateList d() {
        w0 w0Var = this.f1379h;
        if (w0Var != null) {
            return w0Var.f1389a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        w0 w0Var = this.f1379h;
        if (w0Var != null) {
            return w0Var.f1390b;
        }
        return null;
    }

    public boolean f() {
        y yVar = this.f1380i;
        return yVar.i() && yVar.f1400a != 0;
    }

    @SuppressLint({"NewApi"})
    public void g(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strN;
        String strN2;
        int i11;
        Drawable drawableB;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        Context context = this.f1372a.getContext();
        j jVarA = j.a();
        int[] iArr = d.a.f28466h;
        y0 y0VarR = y0.r(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f1372a;
        p0.e0.p(textView, textView.getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        int iM = y0VarR.m(0, -1);
        if (y0VarR.p(3)) {
            this.f1373b = c(context, jVarA, y0VarR.m(3, 0));
        }
        if (y0VarR.p(1)) {
            this.f1374c = c(context, jVarA, y0VarR.m(1, 0));
        }
        if (y0VarR.p(4)) {
            this.f1375d = c(context, jVarA, y0VarR.m(4, 0));
        }
        if (y0VarR.p(2)) {
            this.f1376e = c(context, jVarA, y0VarR.m(2, 0));
        }
        int i14 = Build.VERSION.SDK_INT;
        if (y0VarR.p(5)) {
            this.f1377f = c(context, jVarA, y0VarR.m(5, 0));
        }
        if (y0VarR.p(6)) {
            this.f1378g = c(context, jVarA, y0VarR.m(6, 0));
        }
        y0VarR.f1412b.recycle();
        boolean z11 = this.f1372a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iM, d.a.f28482x);
            y0 y0Var = new y0(context, typedArrayObtainStyledAttributes);
            if (z11 || !y0Var.p(14)) {
                zA = false;
                z10 = false;
            } else {
                zA = y0Var.a(14, false);
                z10 = true;
            }
            o(context, y0Var);
            strN2 = y0Var.p(15) ? y0Var.n(15) : null;
            strN = (i14 < 26 || !y0Var.p(13)) ? null : y0Var.n(13);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            zA = false;
            z10 = false;
            strN = null;
            strN2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.a.f28482x, i10, 0);
        y0 y0Var2 = new y0(context, typedArrayObtainStyledAttributes2);
        if (!z11 && y0Var2.p(14)) {
            zA = y0Var2.a(14, false);
            z10 = true;
        }
        if (y0Var2.p(15)) {
            strN2 = y0Var2.n(15);
        }
        if (i14 >= 26 && y0Var2.p(13)) {
            strN = y0Var2.n(13);
        }
        if (i14 >= 28 && y0Var2.p(0) && y0Var2.f(0, -1) == 0) {
            this.f1372a.setTextSize(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        o(context, y0Var2);
        typedArrayObtainStyledAttributes2.recycle();
        if (!z11 && z10) {
            this.f1372a.setAllCaps(zA);
        }
        Typeface typeface = this.f1383l;
        if (typeface != null) {
            if (this.f1382k == -1) {
                this.f1372a.setTypeface(typeface, this.f1381j);
            } else {
                this.f1372a.setTypeface(typeface);
            }
        }
        if (strN != null) {
            d.d(this.f1372a, strN);
        }
        if (strN2 != null) {
            c.b(this.f1372a, c.a(strN2));
        }
        y yVar = this.f1380i;
        Context context2 = yVar.f1409j;
        int[] iArr2 = d.a.f28467i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        TextView textView2 = yVar.f1408i;
        p0.e0.p(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes3, i10, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            yVar.f1400a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr3[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                yVar.f1405f = yVar.b(iArr3);
                yVar.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!yVar.i()) {
            yVar.f1400a = 0;
        } else if (yVar.f1400a == 1) {
            if (!yVar.f1406g) {
                DisplayMetrics displayMetrics = yVar.f1409j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                yVar.j(dimension2, dimension3, dimension);
            }
            yVar.g();
        }
        if (g1.f1226b) {
            y yVar2 = this.f1380i;
            if (yVar2.f1400a != 0) {
                int[] iArr4 = yVar2.f1405f;
                if (iArr4.length > 0) {
                    if (d.a(this.f1372a) != -1.0f) {
                        d.b(this.f1372a, Math.round(this.f1380i.f1403d), Math.round(this.f1380i.f1404e), Math.round(this.f1380i.f1402c), 0);
                    } else {
                        d.c(this.f1372a, iArr4, 0);
                    }
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, d.a.f28467i);
        int resourceId3 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId3 != -1) {
            drawableB = jVarA.b(context, resourceId3);
            i11 = 13;
        } else {
            i11 = 13;
            drawableB = null;
        }
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(i11, -1);
        Drawable drawableB2 = resourceId4 != -1 ? jVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId5 != -1 ? jVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId6 != -1 ? jVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId7 != -1 ? jVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId8 != -1 ? jVarA.b(context, resourceId8) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = b.a(this.f1372a);
            TextView textView3 = this.f1372a;
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            b.b(textView3, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = b.a(this.f1372a);
            if (drawableArrA2[0] == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = this.f1372a.getCompoundDrawables();
                TextView textView4 = this.f1372a;
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                TextView textView5 = this.f1372a;
                Drawable drawable = drawableArrA2[0];
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                b.b(textView5, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = e.a.a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            TextView textView6 = this.f1372a;
            Objects.requireNonNull(textView6);
            androidx.core.widget.j.c.f(textView6, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i12 = -1;
            PorterDuff.Mode modeD = c0.d(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            TextView textView7 = this.f1372a;
            Objects.requireNonNull(textView7);
            androidx.core.widget.j.c.g(textView7, modeD);
        } else {
            i12 = -1;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i12);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i12);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i12);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i12) {
            androidx.core.widget.j.b(this.f1372a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i12) {
            androidx.core.widget.j.c(this.f1372a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i12) {
            androidx.core.widget.j.d(this.f1372a, dimensionPixelSize3);
        }
    }

    public void h(Context context, int i10) {
        String strN;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, d.a.f28482x);
        y0 y0Var = new y0(context, typedArrayObtainStyledAttributes);
        if (y0Var.p(14)) {
            this.f1372a.setAllCaps(y0Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (y0Var.p(0) && y0Var.f(0, -1) == 0) {
            this.f1372a.setTextSize(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        o(context, y0Var);
        if (i11 >= 26 && y0Var.p(13) && (strN = y0Var.n(13)) != null) {
            d.d(this.f1372a, strN);
        }
        typedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.f1383l;
        if (typeface != null) {
            this.f1372a.setTypeface(typeface, this.f1381j);
        }
    }

    public void i(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
        int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
        int length = text.length();
        if (i13 >= 0 && i14 <= length) {
            int i15 = editorInfo.inputType & 4095;
            if (!(i15 == 129 || i15 == 225 || i15 == 18)) {
                if (length <= 2048) {
                    s0.a.b(editorInfo, text, i13, i14);
                    return;
                }
                int i16 = i14 - i13;
                int i17 = i16 > 1024 ? 0 : i16;
                int i18 = 2048 - i17;
                int iMin = Math.min(text.length() - i14, i18 - Math.min(i13, (int) (((double) i18) * 0.8d)));
                int iMin2 = Math.min(i13, i18 - iMin);
                int i19 = i13 - iMin2;
                if (s0.a.a(text, i19, 0)) {
                    i19++;
                    iMin2--;
                }
                if (s0.a.a(text, (i14 + iMin) - 1, 1)) {
                    iMin--;
                }
                CharSequence charSequenceConcat = i17 != i16 ? TextUtils.concat(text.subSequence(i19, i19 + iMin2), text.subSequence(i14, iMin + i14)) : text.subSequence(i19, iMin2 + i17 + iMin + i19);
                int i20 = iMin2 + 0;
                s0.a.b(editorInfo, charSequenceConcat, i20, i17 + i20);
                return;
            }
        }
        s0.a.b(editorInfo, null, 0, 0);
    }

    public void j(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        y yVar = this.f1380i;
        if (yVar.i()) {
            DisplayMetrics displayMetrics = yVar.f1409j.getResources().getDisplayMetrics();
            yVar.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (yVar.g()) {
                yVar.a();
            }
        }
    }

    public void k(int[] iArr, int i10) throws IllegalArgumentException {
        y yVar = this.f1380i;
        if (yVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = yVar.f1409j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                yVar.f1405f = yVar.b(iArrCopyOf);
                if (!yVar.h()) {
                    StringBuilder sbA = defpackage.a.a("None of the preset sizes is valid: ");
                    sbA.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbA.toString());
                }
            } else {
                yVar.f1406g = false;
            }
            if (yVar.g()) {
                yVar.a();
            }
        }
    }

    public void l(int i10) {
        y yVar = this.f1380i;
        if (yVar.i()) {
            if (i10 == 0) {
                yVar.f1400a = 0;
                yVar.f1403d = -1.0f;
                yVar.f1404e = -1.0f;
                yVar.f1402c = -1.0f;
                yVar.f1405f = new int[0];
                yVar.f1401b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = yVar.f1409j.getResources().getDisplayMetrics();
            yVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (yVar.g()) {
                yVar.a();
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        if (this.f1379h == null) {
            this.f1379h = new w0();
        }
        w0 w0Var = this.f1379h;
        w0Var.f1389a = colorStateList;
        w0Var.f1392d = colorStateList != null;
        this.f1373b = w0Var;
        this.f1374c = w0Var;
        this.f1375d = w0Var;
        this.f1376e = w0Var;
        this.f1377f = w0Var;
        this.f1378g = w0Var;
    }

    public void n(PorterDuff.Mode mode) {
        if (this.f1379h == null) {
            this.f1379h = new w0();
        }
        w0 w0Var = this.f1379h;
        w0Var.f1390b = mode;
        w0Var.f1391c = mode != null;
        this.f1373b = w0Var;
        this.f1374c = w0Var;
        this.f1375d = w0Var;
        this.f1376e = w0Var;
        this.f1377f = w0Var;
        this.f1378g = w0Var;
    }

    public final void o(Context context, y0 y0Var) {
        String strN;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1381j = y0Var.j(2, this.f1381j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iJ = y0Var.j(11, -1);
            this.f1382k = iJ;
            if (iJ != -1) {
                this.f1381j = (this.f1381j & 2) | 0;
            }
        }
        if (!y0Var.p(10) && !y0Var.p(12)) {
            if (y0Var.p(1)) {
                this.f1384m = false;
                int iJ2 = y0Var.j(1, 1);
                if (iJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1383l = typeface;
                return;
            }
            return;
        }
        this.f1383l = null;
        int i11 = y0Var.p(12) ? 12 : 10;
        int i12 = this.f1382k;
        int i13 = this.f1381j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = y0Var.i(i11, this.f1381j, new a(i12, i13, new WeakReference(this.f1372a)));
                if (typefaceI != null) {
                    if (i10 >= 28 && this.f1382k != -1) {
                        typefaceI = e.a(Typeface.create(typefaceI, 0), this.f1382k, (this.f1381j & 2) != 0);
                    }
                    this.f1383l = typefaceI;
                }
                this.f1384m = this.f1383l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1383l != null || (strN = y0Var.n(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1382k == -1) {
            typefaceCreate = Typeface.create(strN, this.f1381j);
        } else {
            typefaceCreate = e.a(Typeface.create(strN, 0), this.f1382k, (this.f1381j & 2) != 0);
        }
        this.f1383l = typefaceCreate;
    }
}
