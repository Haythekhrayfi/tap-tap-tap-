package nd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import j1.e;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: nd.a$a, reason: collision with other inner class name */
    public static class C0371a {
        public static boolean a(Bundle bundle) {
            Integer num = (Integer) a.b(bundle, "net.dinglisch.android.tasker.extras.HOST_CAPABILITIES", Integer.class, "hostSupports");
            return num != null && (num.intValue() & 32) > 0;
        }

        public static void b(Intent intent, int i10) {
            if (i10 < 0) {
                Log.w("TaskerPlugin", "requestTimeoutMS: ignoring negative timeout (" + i10 + ")");
                return;
            }
            if (i10 > 3599000 && i10 != 3600000) {
                Log.w("TaskerPlugin", e.a("requestTimeoutMS: requested timeout ", i10, " exceeds maximum, setting to max (", 3599000, ")"));
                i10 = 3599000;
            }
            intent.putExtra("net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT", i10);
        }

        public static boolean c(Context context, Intent intent, int i10, Bundle bundle) {
            String str = (String) a.a(intent, "net.dinglisch.android.tasker.extras.COMPLETION_INTENT", String.class, "signalFinish");
            if (str != null) {
                Uri uri = null;
                try {
                    uri = Uri.parse(str);
                } catch (Exception unused) {
                    Log.w("TaskerPlugin", "signalFinish: couldn't parse " + str);
                }
                if (uri != null) {
                    try {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.putExtra("net.dinglisch.android.tasker.extras.RESULT_CODE", i10);
                        if (bundle != null) {
                            uri2.putExtra("net.dinglisch.android.tasker.extras.VARIABLES", bundle);
                        }
                        String str2 = (String) a.a(uri2, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE_PACKAGE", String.class, "signalFinish");
                        String str3 = (String) a.a(uri2, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE", String.class, "signalFinish");
                        Boolean bool = (Boolean) a.a(uri2, "net.dinglisch.android.tasker.EXTRA_CALL_SERVICE_FOREGROUND", Boolean.class, "signalFinish");
                        if (str2 == null || str3 == null || bool == null) {
                            context.sendBroadcast(uri2);
                            return true;
                        }
                        uri2.setComponent(new ComponentName(str2, str3));
                        if (!bool.booleanValue() || Build.VERSION.SDK_INT < 26) {
                            context.startService(uri2);
                            return true;
                        }
                        context.startForegroundService(uri2);
                        return true;
                    } catch (URISyntaxException unused2) {
                        Log.w("TaskerPlugin", "signalFinish: bad URI: " + uri);
                    }
                }
            }
            return false;
        }
    }

    public static Object a(Intent intent, String str, Class cls, String str2) {
        if (intent.hasExtra(str)) {
            return b(intent.getExtras(), str, cls, str2);
        }
        return null;
    }

    public static Object b(Bundle bundle, String str, Class<?> cls, String str2) {
        String str3;
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                str3 = str2 + ": " + str + ": null value";
            } else {
                if (obj.getClass() == cls) {
                    return obj;
                }
                str3 = str2 + ": " + str + ": expected " + cls.getClass().getName() + ", got " + obj.getClass().getName();
            }
            Log.w("TaskerPlugin", str3);
        }
        return null;
    }
}
