package f5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.developer.filepicker.model.DialogConfigs;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f29278g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29279h = Pattern.quote(DialogConfigs.DIRECTORY_SEPERATOR);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6.c f29280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y5.b f29283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f29284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29285f;

    public i0(Context context, String str, y5.b bVar, d0 d0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f29281b = context;
        this.f29282c = str;
        this.f29283d = bVar;
        this.f29284e = d0Var;
        this.f29280a = new g6.c(6);
    }

    public static String b() {
        StringBuilder sbA = defpackage.a.a("SYN_");
        sbA.append(UUID.randomUUID().toString());
        return sbA.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f29278g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        c5.d.f3604c.e("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public synchronized String c() {
        String strB;
        String str;
        String strA;
        String str2 = this.f29285f;
        if (str2 != null) {
            return str2;
        }
        c5.d dVar = c5.d.f3604c;
        dVar.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesG = e.g(this.f29281b);
        String string = sharedPreferencesG.getString("firebase.installation.id", null);
        dVar.e("Cached Firebase Installation ID: " + string);
        if (this.f29284e.a()) {
            try {
                strB = (String) q0.a(this.f29283d.getId());
            } catch (Exception e10) {
                c5.d dVar2 = c5.d.f3604c;
                if (dVar2.a(5)) {
                    Log.w(dVar2.f3605a, "Failed to retrieve Firebase Installations ID.", e10);
                }
                strB = null;
            }
            c5.d.f3604c.e("Fetched Firebase Installation ID: " + strB);
            if (strB == null) {
                strB = string == null ? b() : string;
            }
            if (strB.equals(string)) {
                str = "crashlytics.installation.id";
                strA = sharedPreferencesG.getString(str, null);
            } else {
                strA = a(strB, sharedPreferencesG);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                str = "crashlytics.installation.id";
                strA = sharedPreferencesG.getString(str, null);
            } else {
                strB = b();
                strA = a(strB, sharedPreferencesG);
            }
        }
        this.f29285f = strA;
        if (strA == null) {
            c5.d.f3604c.f("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f29285f = a(b(), sharedPreferencesG);
        }
        c5.d.f3604c.e("Crashlytics installation ID: " + this.f29285f);
        return this.f29285f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set<g6.d>] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public String d() {
        String str;
        ?? r10;
        g6.c cVar = this.f29280a;
        Context context = this.f29281b;
        synchronized (cVar) {
            if (((String) cVar.f30015b) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    r10 = installerPackageName;
                    r10 = "";
                }
                r10 = installerPackageName;
                cVar.f30015b = r10;
            }
            str = "".equals((String) cVar.f30015b) ? null : (String) cVar.f30015b;
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f29279h, "");
    }
}
