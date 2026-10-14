package d6;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f28736a;

    public s(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f28736a = new Bundle(bundle);
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String strJ = j(str);
        return "1".equals(strJ) || Boolean.parseBoolean(strJ);
    }

    public Integer b(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = defpackage.a.a("Couldn't parse value of ");
            sbA.append(n(str));
            sbA.append("(");
            sbA.append(strJ);
            sbA.append(") into an int");
            Log.w("NotificationParams", sbA.toString());
            return null;
        }
    }

    public JSONArray c(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return new JSONArray(strJ);
        } catch (JSONException unused) {
            StringBuilder sbA = defpackage.a.a("Malformed JSON for key ");
            sbA.append(n(str));
            sbA.append(": ");
            sbA.append(strJ);
            sbA.append(", falling back to default");
            Log.w("NotificationParams", sbA.toString());
            return null;
        }
    }

    public int[] d() {
        String str;
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayC.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            str = "LightSettings is invalid: " + jSONArrayC + ". " + e10.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + jSONArrayC + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public Uri e() {
        String strJ = j("gcm.n.link_android");
        if (TextUtils.isEmpty(strJ)) {
            strJ = j("gcm.n.link");
        }
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        return Uri.parse(strJ);
    }

    public Object[] f(String str) {
        JSONArray jSONArrayC = c(str + "_loc_args");
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayC.optString(i10);
        }
        return strArr;
    }

    public String g(String str) {
        return j(str + "_loc_key");
    }

    public Long h(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strJ));
        } catch (NumberFormatException unused) {
            StringBuilder sbA = defpackage.a.a("Couldn't parse value of ");
            sbA.append(n(str));
            sbA.append("(");
            sbA.append(strJ);
            sbA.append(") into a long");
            Log.w("NotificationParams", sbA.toString());
            return null;
        }
    }

    public String i(Resources resources, String str, String str2) {
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strG = g(str2);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        int identifier = resources.getIdentifier(strG, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrF = f(str2);
        if (objArrF == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrF);
        } catch (MissingFormatArgumentException e10) {
            StringBuilder sbA = defpackage.a.a("Missing format argument for ");
            sbA.append(n(str2));
            sbA.append(": ");
            sbA.append(Arrays.toString(objArrF));
            sbA.append(" Default value will be used.");
            Log.w("NotificationParams", sbA.toString(), e10);
            return null;
        }
    }

    public String j(String str) {
        Bundle bundle = this.f28736a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f28736a.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] k() {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayC.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle(this.f28736a);
        for (String str : this.f28736a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
