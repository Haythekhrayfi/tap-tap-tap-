package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.l0;
import g0.d;
import g0.f;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class a {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        f.c cVar;
        Object obj = e0.a.f28964a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f29677c) {
            SparseArray<f.c> sparseArray = f.f29676b.get(dVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i10)) == null) {
                colorStateList = null;
            } else if (!cVar.f29679b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f29680c == 0) && (theme == null || cVar.f29680c != theme.hashCode()))) {
                sparseArray.remove(i10);
                colorStateList = null;
            } else {
                colorStateList = cVar.f29678a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = f.f29675a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (!(i11 >= 28 && i11 <= 31)) {
            try {
                colorStateListA = d.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return f.b.b(resources, i10, theme);
        }
        synchronized (f.f29677c) {
            WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f29676b;
            SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i10, new f.c(colorStateListA, dVar.f29681a.getConfiguration(), theme));
        }
        return colorStateListA;
    }

    public static Drawable b(Context context, int i10) {
        return l0.c().e(context, i10);
    }
}
