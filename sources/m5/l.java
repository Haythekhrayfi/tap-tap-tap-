package m5;

import f5.n0;
import java.util.Objects;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l implements i {
    @Override // m5.i
    public d a(n0 n0Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        d.b bVar = jSONObject.has("session") ? new d.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4) : new d.b(new JSONObject().optInt("max_custom_exception_events", 8), 4);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        d.a aVar = new d.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false));
        long j10 = iOptInt2;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            Objects.requireNonNull(n0Var);
            jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new d(jCurrentTimeMillis, bVar, aVar, iOptInt, iOptInt2, dOptDouble, dOptDouble2, iOptInt3);
    }
}
