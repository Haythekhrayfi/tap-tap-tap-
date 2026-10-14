package okhttp3;

import com.applovin.sdk.AppLovinEventTypes;
import ed.c;
import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import jc.w;
import okhttp3.internal.Util;
import qd.f;
import qd.g;
import uc.l;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final f source;

        public BomAwareReader(f fVar, Charset charset) {
            j0.i(fVar, "source");
            j0.i(charset, "charset");
            this.source = fVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            w wVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                wVar = null;
            } else {
                reader.close();
                wVar = w.f31842a;
            }
            if (wVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            j0.i(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.a0(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i10, i11);
        }
    }

    private final Charset charset() {
        MediaType mediaTypeContentType = contentType();
        Charset charset = mediaTypeContentType == null ? null : mediaTypeContentType.charset(c.f29139b);
        return charset == null ? c.f29139b : charset;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(l<? super f, ? extends T> lVar, l<? super T, Integer> lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(j0.p("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        f fVarSource = source();
        try {
            T tInvoke = lVar.invoke(fVarSource);
            c0.g(fVarSource, null);
            int iIntValue = lVar2.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j10, f fVar) {
        return Companion.create(mediaType, j10, fVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, g gVar) {
        return Companion.create(mediaType, gVar);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(f fVar, MediaType mediaType, long j10) {
        return Companion.create(fVar, mediaType, j10);
    }

    public static final ResponseBody create(g gVar, MediaType mediaType) {
        return Companion.create(gVar, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().a0();
    }

    public final g byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(j0.p("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        f fVarSource = source();
        try {
            g gVarI = fVarSource.I();
            c0.g(fVarSource, null);
            int iC = gVarI.c();
            if (jContentLength == -1 || jContentLength == iC) {
                return gVarI;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iC + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(j0.p("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        f fVarSource = source();
        try {
            byte[] bArrX = fVarSource.x();
            c0.g(fVarSource, null);
            int length = bArrX.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrX;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract f source();

    public final String string() throws IOException {
        f fVarSource = source();
        try {
            String strF = fVarSource.F(Util.readBomAsCharset(fVarSource, charset()));
            c0.g(fVarSource, null);
            return strF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.g(fVarSource, th);
                throw th2;
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, f fVar, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(fVar, mediaType, j10);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, g gVar, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(gVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            j0.i(str, "<this>");
            Charset charset = c.f29139b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            qd.c cVar = new qd.c();
            j0.i(str, "string");
            j0.i(charset, "charset");
            qd.c cVarD0 = cVar.d0(str, 0, str.length(), charset);
            return create(cVarD0, mediaType, cVarD0.f34879d);
        }

        public final ResponseBody create(MediaType mediaType, long j10, f fVar) {
            j0.i(fVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(fVar, mediaType, j10);
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            j0.i(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, g gVar) {
            j0.i(gVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(gVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            j0.i(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(bArr, mediaType);
        }

        public final ResponseBody create(final f fVar, final MediaType mediaType, final long j10) {
            j0.i(fVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public f source() {
                    return fVar;
                }
            };
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            j0.i(bArr, "<this>");
            qd.c cVar = new qd.c();
            cVar.O(bArr);
            return create(cVar, mediaType, bArr.length);
        }

        public final ResponseBody create(g gVar, MediaType mediaType) {
            j0.i(gVar, "<this>");
            qd.c cVar = new qd.c();
            cVar.K(gVar);
            return create(cVar, mediaType, gVar.c());
        }
    }
}
