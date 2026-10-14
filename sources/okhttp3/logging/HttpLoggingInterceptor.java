package okhttp3.logging;

import android.support.v4.media.c;
import android.support.v4.media.session.e;
import androidx.activity.j;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import ed.q;
import fd.j0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kc.y;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import qd.f;
import qd.l;
import vc.e0;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    j0.i(str, "message");
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HttpLoggingInterceptor(Logger logger) {
        j0.i(logger, "logger");
        this.logger = logger;
        this.headersToRedact = y.f32011c;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i10, g gVar) {
        this((i10 & 1) != 0 ? Logger.DEFAULT : logger);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || q.i(str, "identity", true) || q.i(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i10) {
        String strValue = this.headersToRedact.contains(headers.name(i10)) ? "██" : headers.value(i10);
        this.logger.log(headers.name(i10) + ": " + strValue);
    }

    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name */
    public final Level m140deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        char c10;
        String string;
        Logger logger;
        String strA;
        Long lValueOf;
        Charset charset;
        Logger logger2;
        String strP;
        Logger logger3;
        StringBuilder sbA;
        String str;
        j0.i(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z10 = level == Level.BODY;
        boolean z11 = z10 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sbA2 = a.a("--> ");
        sbA2.append(request.method());
        sbA2.append(' ');
        sbA2.append(request.url());
        sbA2.append(connection != null ? j0.p(" ", connection.protocol()) : "");
        String string2 = sbA2.toString();
        if (!z11 && requestBodyBody != null) {
            StringBuilder sbA3 = c.a(string2, " (");
            sbA3.append(requestBodyBody.contentLength());
            sbA3.append("-byte body)");
            string2 = sbA3.toString();
        }
        this.logger.log(string2);
        if (z11) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null && headers.get("Content-Type") == null) {
                    this.logger.log(j0.p("Content-Type: ", mediaTypeContentType));
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(j0.p("Content-Length: ", Long.valueOf(requestBodyBody.contentLength())));
                }
            }
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                logHeader(headers, i10);
            }
            if (!z10 || requestBodyBody == null) {
                logger2 = this.logger;
                strP = j0.p("--> END ", request.method());
            } else {
                if (bodyHasUnknownEncoding(request.headers())) {
                    logger2 = this.logger;
                    sbA = a.a("--> END ");
                    sbA.append(request.method());
                    str = " (encoded body omitted)";
                } else if (requestBodyBody.isDuplex()) {
                    logger2 = this.logger;
                    sbA = a.a("--> END ");
                    sbA.append(request.method());
                    str = " (duplex request body omitted)";
                } else {
                    if (requestBodyBody.isOneShot()) {
                        logger2 = this.logger;
                        sbA = a.a("--> END ");
                        sbA.append(request.method());
                        str = " (one-shot body omitted)";
                    } else {
                        qd.c cVar = new qd.c();
                        requestBodyBody.writeTo(cVar);
                        MediaType mediaTypeContentType2 = requestBodyBody.contentType();
                        Charset charset2 = mediaTypeContentType2 == null ? null : mediaTypeContentType2.charset(StandardCharsets.UTF_8);
                        if (charset2 == null) {
                            charset2 = StandardCharsets.UTF_8;
                            j0.h(charset2, "UTF_8");
                        }
                        this.logger.log("");
                        if (Utf8Kt.isProbablyUtf8(cVar)) {
                            this.logger.log(cVar.F(charset2));
                            logger3 = this.logger;
                            sbA = a.a("--> END ");
                            sbA.append(request.method());
                            sbA.append(" (");
                            sbA.append(requestBodyBody.contentLength());
                            sbA.append("-byte body)");
                        } else {
                            logger3 = this.logger;
                            sbA = a.a("--> END ");
                            sbA.append(request.method());
                            sbA.append(" (binary ");
                            sbA.append(requestBodyBody.contentLength());
                            sbA.append("-byte body omitted)");
                        }
                        logger2 = logger3;
                    }
                    strP = sbA.toString();
                }
                sbA.append(str);
                strP = sbA.toString();
            }
            logger2.log(strP);
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            j0.f(responseBodyBody);
            long jContentLength = responseBodyBody.contentLength();
            String str2 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            Logger logger4 = this.logger;
            StringBuilder sbA4 = a.a("<-- ");
            sbA4.append(responseProceed.code());
            if (responseProceed.message().length() == 0) {
                c10 = ' ';
                string = "";
            } else {
                String strMessage = responseProceed.message();
                StringBuilder sb2 = new StringBuilder();
                c10 = ' ';
                sb2.append(' ');
                sb2.append(strMessage);
                string = sb2.toString();
            }
            sbA4.append(string);
            sbA4.append(c10);
            sbA4.append(responseProceed.request().url());
            sbA4.append(" (");
            sbA4.append(millis);
            sbA4.append("ms");
            sbA4.append(!z11 ? j.a(", ", str2, " body") : "");
            sbA4.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            logger4.log(sbA4.toString());
            if (z11) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    logHeader(headers2, i11);
                }
                if (!z10 || !HttpHeaders.promisesBody(responseProceed)) {
                    logger = this.logger;
                    strA = "<-- END HTTP";
                } else if (bodyHasUnknownEncoding(responseProceed.headers())) {
                    logger = this.logger;
                    strA = "<-- END HTTP (encoded body omitted)";
                } else {
                    f fVarSource = responseBodyBody.source();
                    fVarSource.request(RecyclerView.FOREVER_NS);
                    qd.c cVarR = fVarSource.r();
                    if (q.i("gzip", headers2.get("Content-Encoding"), true)) {
                        lValueOf = Long.valueOf(cVarR.f34879d);
                        l lVar = new l(cVarR.clone());
                        try {
                            cVarR = new qd.c();
                            cVarR.v(lVar);
                            charset = null;
                            c0.g(lVar, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                c0.g(lVar, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                        charset = null;
                    }
                    MediaType mediaTypeContentType3 = responseBodyBody.contentType();
                    if (mediaTypeContentType3 != null) {
                        charset = mediaTypeContentType3.charset(StandardCharsets.UTF_8);
                    }
                    if (charset == null) {
                        charset = StandardCharsets.UTF_8;
                        j0.h(charset, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(cVarR)) {
                        this.logger.log("");
                        Logger logger5 = this.logger;
                        StringBuilder sbA5 = a.a("<-- END HTTP (binary ");
                        sbA5.append(cVarR.f34879d);
                        sbA5.append("-byte body omitted)");
                        logger5.log(sbA5.toString());
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.logger.log("");
                        this.logger.log(cVarR.clone().F(charset));
                    }
                    if (lValueOf != null) {
                        Logger logger6 = this.logger;
                        StringBuilder sbA6 = a.a("<-- END HTTP (");
                        sbA6.append(cVarR.f34879d);
                        sbA6.append("-byte, ");
                        sbA6.append(lValueOf);
                        sbA6.append("-gzipped-byte body)");
                        logger6.log(sbA6.toString());
                    } else {
                        logger = this.logger;
                        strA = e.a(a.a("<-- END HTTP ("), cVarR.f34879d, "-byte body)");
                    }
                }
                logger.log(strA);
            }
            return responseProceed;
        } catch (Exception e10) {
            this.logger.log(j0.p("<-- HTTP FAILED: ", e10));
            throw e10;
        }
    }

    public final void level(Level level) {
        j0.i(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String str) {
        j0.i(str, "name");
        q.j(e0.f37000a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        kc.q.l(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        j0.i(level, "level");
        level(level);
        return this;
    }
}
