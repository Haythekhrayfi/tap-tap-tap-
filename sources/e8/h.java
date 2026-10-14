package e8;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.Iterator;
import java.util.List;
import p0.i0;
import y9.f5;
import y9.o1;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29101a;

        static {
            int[] iArr = new int[x7.d.values().length];
            iArr[x7.d.LEFT.ordinal()] = 1;
            iArr[x7.d.TOP_LEFT.ordinal()] = 2;
            iArr[x7.d.BOTTOM_LEFT.ordinal()] = 3;
            iArr[x7.d.TOP_RIGHT.ordinal()] = 4;
            iArr[x7.d.RIGHT.ordinal()] = 5;
            iArr[x7.d.BOTTOM_RIGHT.ordinal()] = 6;
            iArr[x7.d.TOP.ordinal()] = 7;
            iArr[x7.d.BOTTOM.ordinal()] = 8;
            f29101a = iArr;
        }
    }

    public static final boolean a(i8.k kVar, View view, Point point) {
        Rect rect = new Rect();
        kVar.getWindowVisibleDisplayFrame(rect);
        int i10 = rect.left;
        int i11 = point.x;
        if (i10 <= i11 && rect.top <= point.y && rect.right >= view.getWidth() + i11) {
            if (rect.bottom >= view.getHeight() + point.y) {
                return true;
            }
        }
        return false;
    }

    public static final Point b(View view, View view2, x7 x7Var, v9.d dVar) {
        int width;
        int height;
        o1 o1Var;
        int iX;
        o1 o1Var2;
        j0.i(view, "popupView");
        j0.i(view2, "anchor");
        j0.i(x7Var, "divTooltip");
        j0.i(dVar, "resolver");
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int iX2 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        x7.d dVarB = x7Var.f44180g.b(dVar);
        int i10 = point.x;
        int[] iArr2 = a.f29101a;
        switch (iArr2[dVarB.ordinal()]) {
            case 1:
            case 2:
            case 3:
                width = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                width = view2.getWidth();
                break;
            case 7:
            case 8:
                width = (view2.getWidth() / 2) - (view.getWidth() / 2);
                break;
            default:
                throw new jc.g();
        }
        point.x = i10 + width;
        int i11 = point.y;
        switch (iArr2[dVarB.ordinal()]) {
            case 1:
            case 5:
                height = (view2.getHeight() / 2) - (view.getHeight() / 2);
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                throw new jc.g();
        }
        point.y = i11 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i12 = point.x;
        f5 f5Var = x7Var.f44179f;
        if (f5Var == null || (o1Var = f5Var.f39960a) == null) {
            iX = 0;
        } else {
            j0.h(displayMetrics, "displayMetrics");
            iX = l8.b.X(o1Var, displayMetrics, dVar);
        }
        point.x = i12 + iX;
        int i13 = point.y;
        f5 f5Var2 = x7Var.f44179f;
        if (f5Var2 != null && (o1Var2 = f5Var2.f39961b) != null) {
            j0.h(displayMetrics, "displayMetrics");
            iX2 = l8.b.X(o1Var2, displayMetrics, dVar);
        }
        point.y = i13 + iX2;
        return point;
    }

    public static final jc.h<x7, View> c(String str, View view) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<x7> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (x7 x7Var : list) {
                if (j0.d(x7Var.f44178e, str)) {
                    return new jc.h<>(x7Var, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                jc.h<x7, View> hVarC = c(str, it.next());
                if (hVarC != null) {
                    return hVarC;
                }
            }
        }
        return null;
    }
}
