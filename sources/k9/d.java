package k9;

import fd.j0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f31937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JSONObject jSONObject) {
        super(null);
        j0.i(jSONObject, "value");
        this.f31937a = jSONObject;
    }

    @Override // k9.c
    public String a() {
        String string = this.f31937a.toString();
        j0.h(string, "value.toString()");
        return string;
    }
}
