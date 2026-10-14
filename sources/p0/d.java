package p0;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f34351a;

    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public static class b {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    public static class c {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public d(Rect rect, List<Rect> list) {
        this.f34351a = Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null;
    }

    public d(DisplayCutout displayCutout) {
        this.f34351a = displayCutout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return o0.b.a(this.f34351a, ((d) obj).f34351a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f34351a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DisplayCutoutCompat{");
        sbA.append(this.f34351a);
        sbA.append("}");
        return sbA.toString();
    }

    public d(h0.g gVar, Rect rect, Rect rect2, Rect rect3, Rect rect4, h0.g gVar2) {
        DisplayCutout displayCutoutA;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            displayCutoutA = c.a(gVar.d(), rect, rect2, rect3, rect4, gVar2.d());
        } else if (i10 >= 29) {
            displayCutoutA = b.a(gVar.d(), rect, rect2, rect3, rect4);
        } else if (i10 >= 28) {
            Rect rect5 = new Rect(gVar.f30459a, gVar.f30460b, gVar.f30461c, gVar.f30462d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            displayCutoutA = a.a(rect5, arrayList);
        } else {
            displayCutoutA = null;
        }
        this.f34351a = displayCutoutA;
    }
}
