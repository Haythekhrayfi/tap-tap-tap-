package d5;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d implements b, e5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e5.a f28646c;

    public static String a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // d5.b
    public void b(String str, Bundle bundle) {
        e5.a aVar = this.f28646c;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + a(str, bundle));
            } catch (JSONException unused) {
                c5.d.f3604c.f("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // e5.b
    public void c(e5.a aVar) {
        this.f28646c = aVar;
        c5.d.f3604c.b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
