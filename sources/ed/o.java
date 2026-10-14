package ed;

/* JADX INFO: loaded from: classes3.dex */
public class o extends n {
    public static final Double e(String str) {
        try {
            if (h.f29154a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
