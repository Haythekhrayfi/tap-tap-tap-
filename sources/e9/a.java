package e9;

import android.os.Looper;
import androidx.fragment.app.w;
import i.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29114a = 0;

    public static void a(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                c(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            new b(str, (String) obj, (String) obj2);
        }
    }

    public static void b() {
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        if (mainLooper == looperMyLooper) {
            return;
        }
        Objects.toString(mainLooper);
        Objects.toString(looperMyLooper);
    }

    public static String c(String str, Object obj, Object obj2) {
        String strA = "";
        if (str != null && !str.equals("")) {
            strA = f.a(str, " ");
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (!strValueOf.equals(strValueOf2)) {
            StringBuilder sbA = q2.a.a(strA, "expected:<", strValueOf, "> but was:<", strValueOf2);
            sbA.append(">");
            return sbA.toString();
        }
        StringBuilder sbA2 = android.support.v4.media.c.a(strA, "expected: ");
        sbA2.append(d(obj, strValueOf));
        sbA2.append(" but was: ");
        sbA2.append(d(obj2, strValueOf2));
        return sbA2.toString();
    }

    public static String d(Object obj, String str) {
        return w.a(obj == null ? "null" : obj.getClass().getName(), "<", str, ">");
    }
}
