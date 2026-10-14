package okhttp3.internal.platform.android;

import android.util.Log;
import ed.u;
import ed.w;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kc.f0;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = OkHttpClient.class.getPackage();
        String name = r10 == null ? null : r10.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = f0.k(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 == null ? w.b0(str, 23) : str2;
    }

    public final void androidLog$okhttp(String str, int i10, String str2, Throwable th) {
        int iMin;
        j0.i(str, "loggerName");
        j0.i(str2, "message");
        String strLoggerTag = loggerTag(str);
        if (Log.isLoggable(strLoggerTag, i10)) {
            if (th != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iD = u.D(str2, '\n', i11, false, 4);
                if (iD == -1) {
                    iD = length;
                }
                while (true) {
                    iMin = Math.min(iD, i11 + MAX_LOG_LENGTH);
                    String strSubstring = str2.substring(i11, iMin);
                    j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strLoggerTag, strSubstring);
                    if (iMin >= iD) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
