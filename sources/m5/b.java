package m5;

import f5.n0;
import java.util.Objects;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static d b(n0 n0Var) {
        d.b bVar = new d.b(8, 4);
        d.a aVar = new d.a(true, false);
        Objects.requireNonNull(n0Var);
        return new d(System.currentTimeMillis() + ((long) DateTimeConstants.MILLIS_PER_HOUR), bVar, aVar, 0, DateTimeConstants.SECONDS_PER_HOUR, 10.0d, 1.2d, 60);
    }

    @Override // m5.i
    public d a(n0 n0Var, JSONObject jSONObject) {
        return b(n0Var);
    }
}
