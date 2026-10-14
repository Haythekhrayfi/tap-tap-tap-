package okhttp3.internal.ws;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import ed.p;
import ed.q;
import ed.u;
import fd.j0;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.internal.Util;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00da A[PHI: r7 r9
  0x00da: PHI (r7v7 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v9 java.lang.Integer) binds: [B:51:0x0102, B:34:0x00d8] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r9v10 java.lang.Integer) = (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:51:0x0102, B:34:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v25 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v17 */
        /* JADX WARN: Type inference failed for: r14v18 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        public final WebSocketExtensions parse(Headers headers) throws IOException {
            String strTrimSubstring;
            boolean z10;
            j0.i(headers, "responseHeaders");
            int size = headers.size();
            int i10 = 0;
            ?? r10 = 0;
            Integer numF = null;
            boolean z11 = false;
            Integer numF2 = null;
            boolean z12 = false;
            ?? r11 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                ?? r14 = 1;
                if (q.i(headers.name(i10), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = headers.value(i10);
                    int i12 = 0;
                    while (i12 < strValue.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, CoreConstants.COMMA_CHAR, i12, 0, 4, (Object) null);
                        char c10 = ';';
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i12, iDelimiterOffset$default);
                        String strTrimSubstring2 = Util.trimSubstring(strValue, i12, iDelimiterOffset);
                        int i13 = iDelimiterOffset + r14;
                        if (q.i(strTrimSubstring2, "permessage-deflate", r14)) {
                            if (r10 != 0) {
                                r11 = r14;
                            }
                            i12 = i13;
                            r11 = r11;
                            r14 = r14;
                            while (i12 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, c10, i12, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i12, iDelimiterOffset2);
                                String strTrimSubstring3 = Util.trimSubstring(strValue, i12, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    strTrimSubstring = Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    j0.i(strTrimSubstring, "<this>");
                                    j0.i("\"", "delimiter");
                                    j0.i(strTrimSubstring, "<this>");
                                    j0.i("\"", "prefix");
                                    j0.i("\"", "suffix");
                                    if (strTrimSubstring.length() >= "\"".length() + "\"".length() && u.S(strTrimSubstring, "\"", false, 2) && u.y(strTrimSubstring, "\"", false, 2)) {
                                        strTrimSubstring = strTrimSubstring.substring("\"".length(), strTrimSubstring.length() - "\"".length());
                                        j0.h(strTrimSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                } else {
                                    strTrimSubstring = null;
                                }
                                i12 = iDelimiterOffset2 + 1;
                                ?? r12 = r11;
                                if (q.i(strTrimSubstring3, "client_max_window_bits", true)) {
                                    if (numF != null) {
                                        r12 = 1;
                                    }
                                    numF = strTrimSubstring == null ? null : p.f(strTrimSubstring);
                                    if (numF == null) {
                                        r12 = 1;
                                    }
                                    z10 = true;
                                } else {
                                    z10 = true;
                                    if (q.i(strTrimSubstring3, "client_no_context_takeover", true)) {
                                        if (z11) {
                                            r12 = 1;
                                        }
                                        if (strTrimSubstring != null) {
                                            r12 = 1;
                                        }
                                        z11 = true;
                                    } else if (q.i(strTrimSubstring3, "server_max_window_bits", true)) {
                                        if (numF2 != null) {
                                            r12 = 1;
                                        }
                                        numF2 = strTrimSubstring == null ? null : p.f(strTrimSubstring);
                                        if (numF2 == null) {
                                            r12 = 1;
                                        }
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                        z10 = true;
                                        if (q.i(strTrimSubstring3, "server_no_context_takeover", true)) {
                                            if (z12) {
                                                r12 = 1;
                                            }
                                            if (strTrimSubstring != null) {
                                                r12 = 1;
                                            }
                                            z12 = true;
                                        } else {
                                            r12 = r11;
                                            r12 = r11;
                                            r12 = r11;
                                            r12 = 1;
                                        }
                                    }
                                }
                                c10 = ';';
                                r11 = r12;
                                r14 = z10;
                            }
                            r10 = r14;
                        } else {
                            i12 = i13;
                            r11 = r14;
                        }
                    }
                }
                i10 = i11;
                r10 = r10;
                r11 = r11;
            }
            return new WebSocketExtensions(r10, numF, z11, numF2, z12, r11);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            z11 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z14 = z11;
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i10 & 16) != 0) {
            z12 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z15 = z12;
        if ((i10 & 32) != 0) {
            z13 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z10, num3, z14, num4, z15, z13);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        return new WebSocketExtensions(z10, num, z11, num2, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && j0.d(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && j0.d(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z10 = this.perMessageDeflate;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.clientNoContextTakeover;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.serverNoContextTakeover;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (iHashCode2 + r12) * 31;
        boolean z13 = this.unknownValues;
        return i12 + (z13 ? 1 : z13);
    }

    public final boolean noContextTakeover(boolean z10) {
        return z10 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder sbA = a.a("WebSocketExtensions(perMessageDeflate=");
        sbA.append(this.perMessageDeflate);
        sbA.append(", clientMaxWindowBits=");
        sbA.append(this.clientMaxWindowBits);
        sbA.append(", clientNoContextTakeover=");
        sbA.append(this.clientNoContextTakeover);
        sbA.append(", serverMaxWindowBits=");
        sbA.append(this.serverMaxWindowBits);
        sbA.append(", serverNoContextTakeover=");
        sbA.append(this.serverNoContextTakeover);
        sbA.append(", unknownValues=");
        return s.a(sbA, this.unknownValues, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
