package g5;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f29978a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29980c;

    public b(int i10, int i11) {
        this.f29979b = i10;
        this.f29980c = i11;
    }

    public synchronized void a(Map<String, String> map) {
        String strTrim;
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            int i11 = this.f29980c;
            String strTrim2 = key.trim();
            if (strTrim2.length() > i11) {
                strTrim2 = strTrim2.substring(0, i11);
            }
            if (this.f29978a.size() < this.f29979b || this.f29978a.containsKey(strTrim2)) {
                String value = entry.getValue();
                Map<String, String> map2 = this.f29978a;
                if (value == null) {
                    strTrim = "";
                } else {
                    int i12 = this.f29980c;
                    strTrim = value.trim();
                    if (strTrim.length() > i12) {
                        strTrim = strTrim.substring(0, i12);
                    }
                }
                map2.put(strTrim2, strTrim);
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            c5.d.f3604c.f("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f29979b);
        }
    }
}
