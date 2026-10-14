package w9;

import androidx.activity.j;
import org.json.JSONObject;
import u9.b;
import u9.f;
import u9.g;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public interface e<T extends u9.b<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37196a = 0;

    default T a(String str, JSONObject jSONObject) throws f {
        T t10 = (T) get(str);
        if (t10 != null) {
            return t10;
        }
        throw new f(g.MISSING_TEMPLATE, j.a("Template '", str, "' is missing!"), null, new k9.d(jSONObject), c0.P(jSONObject, 0, 1), 4, null);
    }

    T get(String str);
}
