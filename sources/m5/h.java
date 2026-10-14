package m5;

import f5.n0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f33215a;

    public h(n0 n0Var) {
        this.f33215a = n0Var;
    }

    public d a(JSONObject jSONObject) throws JSONException {
        i lVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            c5.d.f3604c.c("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            lVar = new b();
        } else {
            lVar = new l();
        }
        return lVar.a(this.f33215a, jSONObject);
    }
}
