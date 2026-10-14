package m5;

import android.text.TextUtils;
import androidx.appcompat.widget.r0;
import f5.i0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5.b f33193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c5.d f33194c;

    public c(String str, j5.b bVar) {
        c5.d dVar = c5.d.f3604c;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f33194c = dVar;
        this.f33193b = bVar;
        this.f33192a = str;
    }

    public final j5.a a(j5.a aVar, k kVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f33216a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.1");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f33217b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f33218c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f33219d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((i0) kVar.f33220e).c());
        return aVar;
    }

    public final void b(j5.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f31710c.put(str, str2);
        }
    }

    public final Map<String, String> c(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f33223h);
        map.put("display_version", kVar.f33222g);
        map.put("source", Integer.toString(kVar.f33224i));
        String str = kVar.f33221f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject d(j5.c cVar) {
        int i10 = cVar.f31711a;
        this.f33194c.e("Settings response code was: " + i10);
        if (!(i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203)) {
            c5.d dVar = this.f33194c;
            StringBuilder sbA = r0.a("Settings request failed; (status: ", i10, ") from ");
            sbA.append(this.f33192a);
            dVar.c(sbA.toString());
            return null;
        }
        String str = cVar.f31712b;
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            c5.d dVar2 = this.f33194c;
            StringBuilder sbA2 = defpackage.a.a("Failed to parse settings JSON from ");
            sbA2.append(this.f33192a);
            dVar2.g(sbA2.toString(), e10);
            this.f33194c.f("Settings response " + str);
            return null;
        }
    }
}
