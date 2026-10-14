package g5;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5.c f29984a;

    static {
        Charset.forName("UTF-8");
    }

    public d(k5.c cVar) {
        this.f29984a = cVar;
    }

    public static Map<String, String> a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            c5.d dVar = c5.d.f3604c;
            StringBuilder sbA = defpackage.a.a("Deleted corrupt file: ");
            sbA.append(file.getAbsolutePath());
            String string = sbA.toString();
            if (dVar.a(4)) {
                Log.i(dVar.f3605a, string, null);
            }
        }
    }

    public Map<String, String> b(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        File fileG = z10 ? this.f29984a.g(str, "internal-keys") : this.f29984a.g(str, "keys");
        if (!fileG.exists() || fileG.length() == 0) {
            d(fileG);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileG);
            try {
                try {
                    Map<String, String> mapA = a(f5.e.m(fileInputStream));
                    f5.e.a(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e11) {
                    e10 = e11;
                    c5.d dVar = c5.d.f3604c;
                    if (dVar.a(5)) {
                        Log.w(dVar.f3605a, "Error deserializing user metadata.", e10);
                    }
                    d(fileG);
                    f5.e.a(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                f5.e.a(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            f5.e.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String c(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileG = this.f29984a.g(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileG.exists() || fileG.length() == 0) {
            c5.d.f3604c.b("No userId set for session " + str);
            d(fileG);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileG);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(f5.e.m(fileInputStream));
                    String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    c5.d.f3604c.b("Loaded userId " + strOptString + " for session " + str);
                    f5.e.a(fileInputStream, "Failed to close user metadata file.");
                    return strOptString;
                } catch (Exception e10) {
                    e = e10;
                    c5.d dVar = c5.d.f3604c;
                    if (dVar.a(5)) {
                        Log.w(dVar.f3605a, "Error deserializing user metadata.", e);
                    }
                    d(fileG);
                    f5.e.a(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                f5.e.a(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            f5.e.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
