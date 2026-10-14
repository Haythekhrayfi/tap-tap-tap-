package okhttp3;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import ed.c;
import fd.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import qd.b0;
import qd.e;
import qd.n;
import qd.p;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.create(mediaType, bArr, i10, i11);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, qd.g gVar, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(gVar, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.create(bArr, mediaType, i10, i11);
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            j0.i(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(e eVar) {
                    j0.i(eVar, "sink");
                    File file2 = file;
                    Logger logger = p.f34912a;
                    j0.i(file2, "<this>");
                    n nVar = new n(new FileInputStream(file2), b0.NONE);
                    try {
                        eVar.v(nVar);
                        c0.g(nVar, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            c0.g(nVar, th);
                            throw th2;
                        }
                    }
                }
            };
        }

        public final RequestBody create(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            j0.h(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            j0.i(file, Action.FILE_ATTRIBUTE);
            return create(file, mediaType);
        }

        public final RequestBody create(MediaType mediaType, String str) {
            j0.i(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, qd.g gVar) {
            j0.i(gVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(gVar, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            j0.i(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
            j0.i(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create$default(this, mediaType, bArr, i10, 0, 8, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i10, int i11) {
            j0.i(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(bArr, mediaType, i10, i11);
        }

        public final RequestBody create(final qd.g gVar, final MediaType mediaType) {
            j0.i(gVar, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return gVar.c();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(e eVar) throws IOException {
                    j0.i(eVar, "sink");
                    eVar.w(gVar);
                }
            };
        }

        public final RequestBody create(byte[] bArr) {
            j0.i(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            j0.i(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
            j0.i(bArr, "<this>");
            return create$default(this, bArr, mediaType, i10, 0, 4, (Object) null);
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            j0.i(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(e eVar) throws IOException {
                    j0.i(eVar, "sink");
                    eVar.write(bArr, i10, i11);
                }
            };
        }
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, qd.g gVar) {
        return Companion.create(mediaType, gVar);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
        return Companion.create(mediaType, bArr, i10);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10, int i11) {
        return Companion.create(mediaType, bArr, i10, i11);
    }

    public static final RequestBody create(qd.g gVar, MediaType mediaType) {
        return Companion.create(gVar, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
        return Companion.create(bArr, mediaType, i10);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10, int i11) {
        return Companion.create(bArr, mediaType, i10, i11);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(e eVar) throws IOException;
}
