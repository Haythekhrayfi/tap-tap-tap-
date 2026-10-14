package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import ed.q;
import fd.j0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc.x;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import qd.c;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpHeaders {
    private static final g QUOTED_STRING_DELIMITERS;
    private static final g TOKEN_DELIMITERS;

    static {
        g.a aVar = g.f34892f;
        QUOTED_STRING_DELIMITERS = aVar.d("\"\\");
        TOKEN_DELIMITERS = aVar.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        j0.i(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        j0.i(headers, "<this>");
        j0.i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (q.i(str, headers.name(i10), true)) {
                c cVar = new c();
                cVar.e0(headers.value(i10));
                try {
                    readChallengeHeader(cVar, arrayList);
                } catch (EOFException e10) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        j0.i(response, "<this>");
        if (j0.d(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !q.i("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0078 A[EDGE_INSN: B:59:0x0078->B:28:0x0078 BREAK  A[LOOP:2: B:22:0x0064->B:49:0x00b7], SYNTHETIC] */
    private static final void readChallengeHeader(c cVar, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(cVar);
                    token2 = readToken(cVar);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(cVar);
                String token3 = readToken(cVar);
                if (token3 == null) {
                    if (cVar.y()) {
                        list.add(new Challenge(token2, x.f32010c));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(cVar, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(cVar);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || cVar.y())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(cVar, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 == null) {
                            token3 = readToken(cVar);
                            if (skipCommasAndWhitespace(cVar)) {
                                break;
                            }
                            iSkipAll2 = Util.skipAll(cVar, (byte) 61);
                            if (iSkipAll2 == 0) {
                                break;
                            }
                            if (iSkipAll2 <= 1 || skipCommasAndWhitespace(cVar)) {
                                return;
                            }
                            if (startsWith(cVar, (byte) 34)) {
                                token = readQuotedString(cVar);
                            } else {
                                token = readToken(cVar);
                            }
                            if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(cVar) && !cVar.y()) {
                                return;
                            } else {
                                token3 = null;
                            }
                        } else {
                            if (iSkipAll2 == 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(cVar, (byte) 34)) {
                                token = readQuotedString(cVar);
                            } else {
                                token = readToken(cVar);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(cVar)) {
                            }
                            token3 = null;
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, j0.p(token3, q.n("=", iSkipAll)));
                    j0.h(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(c cVar) throws EOFException {
        if (!(cVar.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        c cVar2 = new c();
        while (true) {
            long jI = cVar.i(QUOTED_STRING_DELIMITERS);
            if (jI == -1) {
                return null;
            }
            if (cVar.g(jI) == 34) {
                cVar2.write(cVar, jI);
                cVar.readByte();
                return cVar2.n();
            }
            if (cVar.f34879d == jI + 1) {
                return null;
            }
            cVar2.write(cVar, jI);
            cVar.readByte();
            cVar2.write(cVar, 1L);
        }
    }

    private static final String readToken(c cVar) {
        long jI = cVar.i(TOKEN_DELIMITERS);
        if (jI == -1) {
            jI = cVar.f34879d;
        }
        if (jI != 0) {
            return cVar.p(jI);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        j0.i(cookieJar, "<this>");
        j0.i(httpUrl, ImagesContract.URL);
        j0.i(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.Companion.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(c cVar) throws EOFException {
        boolean z10 = false;
        while (!cVar.y()) {
            byte bG = cVar.g(0L);
            if (bG != 44) {
                if (!(bG == 32 || bG == 9)) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean startsWith(c cVar, byte b10) {
        return !cVar.y() && cVar.g(0L) == b10;
    }
}
