package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f1412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1413c;

    public y0(Context context, TypedArray typedArray) {
        this.f1411a = context;
        this.f1412b = typedArray;
    }

    public static y0 q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new y0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static y0 r(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new y0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1412b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1412b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1412b.hasValue(i10) || (resourceId = this.f1412b.getResourceId(i10, 0)) == 0 || (colorStateListA = e.a.a(this.f1411a, resourceId)) == null) ? this.f1412b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f1412b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1412b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1412b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1412b.hasValue(i10) || (resourceId = this.f1412b.getResourceId(i10, 0)) == 0) ? this.f1412b.getDrawable(i10) : e.a.b(this.f1411a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        Drawable drawableF;
        if (!this.f1412b.hasValue(i10) || (resourceId = this.f1412b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        j jVarA = j.a();
        Context context = this.f1411a;
        synchronized (jVarA) {
            drawableF = jVarA.f1270a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public Typeface i(int i10, int i11, g0.f.e eVar) {
        int resourceId = this.f1412b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1413c == null) {
            this.f1413c = new TypedValue();
        }
        Context context = this.f1411a;
        TypedValue typedValue = this.f1413c;
        ThreadLocal<TypedValue> threadLocal = g0.f.f29675a;
        if (context.isRestricted()) {
            return null;
        }
        return g0.f.b(context, resourceId, typedValue, i11, eVar, null, true, false);
    }

    public int j(int i10, int i11) {
        return this.f1412b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1412b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1412b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1412b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1412b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1412b.getText(i10);
    }

    public boolean p(int i10) {
        return this.f1412b.hasValue(i10);
    }
}
