package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13771a;

    public Cc(Context context) {
        this.f13771a = context;
    }

    public Tc a(long j10, String str) {
        String strA;
        try {
            strA = C2120ym.a(this.f13771a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA == null || TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            Tc tc2 = new Tc();
            try {
                tc2.a(Long.valueOf(j10));
                JSONObject jSONObject = new JSONObject(strA);
                tc2.b(jSONObject.optLong("timestamp", 0L));
                tc2.a(jSONObject.optLong("elapsed_realtime_seconds", 0L));
                tc2.a(jSONObject.optJSONArray("cell_info"));
                tc2.b(jSONObject.optJSONArray("wifi_info"));
                tc2.a(M.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))));
                tc2.a(Wc.a.a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return tc2;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public String a(Tc tc2) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", tc2.d());
            jSONObject.put("elapsed_realtime_seconds", tc2.c());
            jSONObject.putOpt("wifi_info", tc2.g());
            jSONObject.putOpt("cell_info", tc2.a());
            if (tc2.b() != null) {
                jSONObject.put("charge_type", tc2.b().a());
            }
            if (tc2.e() != null) {
                jSONObject.put("collection_mode", tc2.e().a());
            }
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C2120ym.b(this.f13771a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    public String a(C1882pd c1882pd) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", c1882pd.f17071a.a());
            jSONObject.put("lat", c1882pd.c().getLatitude());
            jSONObject.put("lon", c1882pd.c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(c1882pd.c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(c1882pd.e()));
            jSONObject.put("receive_elapsed_realtime_seconds", c1882pd.d());
            jSONObject.putOpt("precision", c1882pd.c().hasAccuracy() ? Float.valueOf(c1882pd.c().getAccuracy()) : null);
            jSONObject.putOpt("direction", c1882pd.c().hasBearing() ? Float.valueOf(c1882pd.c().getBearing()) : null);
            jSONObject.putOpt("speed", c1882pd.c().hasSpeed() ? Float.valueOf(c1882pd.c().getSpeed()) : null);
            jSONObject.putOpt("altitude", c1882pd.c().hasAltitude() ? Double.valueOf(c1882pd.c().getAltitude()) : null);
            jSONObject.putOpt("provider", O2.a(c1882pd.c().getProvider(), null));
            jSONObject.put("charge_type", c1882pd.a().a());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C2120ym.b(this.f13771a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    public C1882pd b(long j10, String str) {
        String strA;
        try {
            strA = C2120ym.a(this.f13771a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA != null && !TextUtils.isEmpty(strA)) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                long jOptLong = jSONObject.optLong("receive_timestamp", 0L);
                long jOptLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
                Wc.a aVarA = Wc.a.a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", null));
                location.setLongitude(jSONObject.optDouble("lon", 0.0d));
                location.setLatitude(jSONObject.optDouble("lat", 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0L));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new C1882pd(aVarA, jOptLong, jOptLong2, location, M.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }
}
