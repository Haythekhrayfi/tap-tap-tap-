package i6;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f31282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f31283f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<BiConsumer<String, com.google.firebase.remoteconfig.internal.b>> f31284a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f31285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f31286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f31287d;

    static {
        Charset.forName("UTF-8");
        f31282e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f31283f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public d(Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2) {
        this.f31285b = executor;
        this.f31286c = aVar;
        this.f31287d = aVar2;
    }

    public static com.google.firebase.remoteconfig.internal.b b(com.google.firebase.remoteconfig.internal.a aVar) {
        synchronized (aVar) {
            Task<com.google.firebase.remoteconfig.internal.b> task = aVar.f12684c;
            if (task != null && task.isSuccessful()) {
                return aVar.f12684c.getResult();
            }
            try {
                return (com.google.firebase.remoteconfig.internal.b) com.google.firebase.remoteconfig.internal.a.a(aVar.b(), 5L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public static Double c(com.google.firebase.remoteconfig.internal.a aVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarB = b(aVar);
        if (bVarB == null) {
            return null;
        }
        try {
            return Double.valueOf(bVarB.f12688b.getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Set<String> d(com.google.firebase.remoteconfig.internal.a aVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b bVarB = b(aVar);
        if (bVarB == null) {
            return hashSet;
        }
        Iterator<String> itKeys = bVarB.f12688b.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public static Long e(com.google.firebase.remoteconfig.internal.a aVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarB = b(aVar);
        if (bVarB == null) {
            return null;
        }
        try {
            return Long.valueOf(bVarB.f12688b.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String f(com.google.firebase.remoteconfig.internal.a aVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarB = b(aVar);
        if (bVarB == null) {
            return null;
        }
        try {
            return bVarB.f12688b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void h(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public final void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f31284a) {
            Iterator<BiConsumer<String, com.google.firebase.remoteconfig.internal.b>> it = this.f31284a.iterator();
            while (it.hasNext()) {
                this.f31285b.execute(new androidx.emoji2.text.f(it.next(), str, bVar));
            }
        }
    }

    public h6.g g(String str) {
        String strF = f(this.f31286c, str);
        if (strF != null) {
            a(str, b(this.f31286c));
            return new f(strF, 2);
        }
        String strF2 = f(this.f31287d, str);
        if (strF2 != null) {
            return new f(strF2, 1);
        }
        h(str, "FirebaseRemoteConfigValue");
        return new f("", 0);
    }
}
