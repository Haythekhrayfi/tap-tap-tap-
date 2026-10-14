package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public static int a(RecyclerView.z zVar, y yVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.getChildCount() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
        }
        return Math.min(yVar.l(), yVar.b(view2) - yVar.e(view));
    }

    public static int b(RecyclerView.z zVar, y yVar, View view, View view2, RecyclerView.o oVar, boolean z10, boolean z11) {
        if (oVar.getChildCount() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (zVar.b() - Math.max(oVar.getPosition(view), oVar.getPosition(view2))) - 1) : Math.max(0, Math.min(oVar.getPosition(view), oVar.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(yVar.b(view2) - yVar.e(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) + (yVar.k() - yVar.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, y yVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.getChildCount() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return zVar.b();
        }
        return (int) (((yVar.b(view2) - yVar.e(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)) * zVar.b());
    }
}
