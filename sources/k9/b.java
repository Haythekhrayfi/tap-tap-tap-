package k9;

import fd.j0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f31936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONArray jSONArray) {
        super(null);
        j0.i(jSONArray, "value");
        this.f31936a = jSONArray;
    }

    @Override // k9.c
    public String a() {
        String string = this.f31936a.toString();
        j0.h(string, "value.toString()");
        return string;
    }
}
