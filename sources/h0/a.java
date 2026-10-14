package h0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h0.a$a, reason: collision with other inner class name */
    public static class C0282a {
        public static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static ColorFilter a(int i10, b bVar) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = d.a(bVar);
            if (objA != null) {
                return C0282a.a(i10, objA);
            }
            return null;
        }
        if (bVar != null) {
            switch (c.f30456a[bVar.ordinal()]) {
                case 1:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 2:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case 3:
                    mode = PorterDuff.Mode.DST;
                    break;
                case 4:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 6:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 8:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 9:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 10:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 11:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 12:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 13:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 17:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 18:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                default:
                    mode = null;
                    break;
            }
        } else {
            mode = null;
        }
        if (mode != null) {
            return new PorterDuffColorFilter(i10, mode);
        }
        return null;
    }
}
