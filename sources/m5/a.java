package m5;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f33191a;

    public a(k5.c cVar) {
        this.f33191a = cVar.b("com.crashlytics.settings.json");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public JSONObject a() throws Throwable {
        Exception e10;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        c5.d dVar = c5.d.f3604c;
        dVar.b("Checking for cached settings...");
        ?? r10 = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = this.f33191a;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(f5.e.m(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e10 = e11;
                        c5.d dVar2 = c5.d.f3604c;
                        if (dVar2.a(6)) {
                            Log.e(dVar2.f3605a, "Failed to fetch cached settings", e10);
                        }
                        f5.e.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    dVar.e("Settings file does not exist.");
                    jSONObject = null;
                }
                f5.e.a(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                r10 = dVar;
                th = th;
                f5.e.a(r10, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            f5.e.a(r10, "Error while closing settings cache file.");
            throw th;
        }
    }
}
