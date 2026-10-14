package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;
import qd.c;
import qd.e;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final g boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    public static final class Builder {
        private final g boundary;
        private final List<Part> parts;
        private MediaType type;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String str) {
            j0.i(str, "boundary");
            this.boundary = g.f34892f.d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i10, vc.g gVar) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                j0.h(str, "randomUUID().toString()");
            }
            this(str);
        }

        public final Builder addFormDataPart(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            j0.i(str, "name");
            j0.i(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            j0.i(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            j0.i(part, "part");
            this.parts.add(part);
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            j0.i(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            j0.i(mediaType, "type");
            if (!j0.d(mediaType.type(), "multipart")) {
                throw new IllegalArgumentException(j0.p("multipart != ", mediaType).toString());
            }
            this.type = mediaType;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb2, String str) {
            String str2;
            j0.i(sb2, "<this>");
            j0.i(str, Action.KEY_ATTRIBUTE);
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\n') {
                    str2 = "%0A";
                } else if (cCharAt == '\r') {
                    str2 = "%0D";
                } else {
                    if (cCharAt == '\"') {
                        str2 = "%22";
                    } else {
                        sb2.append(cCharAt);
                    }
                    i10 = i11;
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(vc.g gVar) {
                this();
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                j0.i(requestBody, "body");
                vc.g gVar = null;
                if (!((headers == null ? null : headers.get("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers == null ? null : headers.get("Content-Length")) == null) {
                    return new Part(headers, requestBody, gVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public final Part create(RequestBody requestBody) {
                j0.i(requestBody, "body");
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                j0.i(str, "name");
                j0.i(str2, "value");
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                j0.i(str, "name");
                j0.i(requestBody, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    companion.appendQuotedString$okhttp(sb2, str2);
                }
                String string = sb2.toString();
                j0.h(string, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), requestBody);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, vc.g gVar) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m86deprecated_body() {
            return this.body;
        }

        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m87deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(g gVar, MediaType mediaType, List<Part> list) {
        j0.i(gVar, "boundaryByteString");
        j0.i(mediaType, "type");
        j0.i(list, "parts");
        this.boundaryByteString = gVar;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(e eVar, boolean z10) throws IOException {
        c cVar;
        if (z10) {
            eVar = new c();
            cVar = eVar;
        } else {
            cVar = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Part part = this.parts.get(i10);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            j0.f(eVar);
            eVar.Q(DASHDASH);
            eVar.w(this.boundaryByteString);
            eVar.Q(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    eVar.E(headers.name(i12)).Q(COLONSPACE).E(headers.value(i12)).Q(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                eVar.E("Content-Type: ").E(mediaTypeContentType.toString()).Q(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                eVar.E("Content-Length: ").X(jContentLength).Q(CRLF);
            } else if (z10) {
                j0.f(cVar);
                cVar.skip(cVar.f34879d);
                return -1L;
            }
            byte[] bArr = CRLF;
            eVar.Q(bArr);
            if (z10) {
                j10 += jContentLength;
            } else {
                requestBodyBody.writeTo(eVar);
            }
            eVar.Q(bArr);
            i10 = i11;
        }
        j0.f(eVar);
        byte[] bArr2 = DASHDASH;
        eVar.Q(bArr2);
        eVar.w(this.boundaryByteString);
        eVar.Q(bArr2);
        eVar.Q(CRLF);
        if (!z10) {
            return j10;
        }
        j0.f(cVar);
        long j11 = cVar.f34879d;
        long j12 = j10 + j11;
        cVar.skip(j11);
        return j12;
    }

    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m82deprecated_boundary() {
        return boundary();
    }

    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m83deprecated_parts() {
        return this.parts;
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m84deprecated_size() {
        return size();
    }

    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m85deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.l();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i10) {
        return this.parts.get(i10);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(e eVar) throws IOException {
        j0.i(eVar, "sink");
        writeOrCountBytes(eVar, false);
    }
}
