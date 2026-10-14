package okhttp3;

import fd.j0;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import qd.c;
import qd.e;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : charset);
        }

        public final Builder add(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            j0.i(str, "name");
            j0.i(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        j0.i(list, "encodedNames");
        j0.i(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(e eVar, boolean z10) throws EOFException {
        c cVarR;
        if (z10) {
            cVarR = new c();
        } else {
            j0.f(eVar);
            cVarR = eVar.r();
        }
        int i10 = 0;
        int size = this.encodedNames.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                cVarR.R(38);
            }
            cVarR.e0(this.encodedNames.get(i10));
            cVarR.R(61);
            cVarR.e0(this.encodedValues.get(i10));
            i10 = i11;
        }
        if (!z10) {
            return 0L;
        }
        long j10 = cVarR.f34879d;
        cVarR.skip(j10);
        return j10;
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m44deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i10) {
        return this.encodedNames.get(i10);
    }

    public final String encodedValue(int i10) {
        return this.encodedValues.get(i10);
    }

    public final String name(int i10) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i10), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i10) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i10), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(e eVar) throws IOException {
        j0.i(eVar, "sink");
        writeOrCountBytes(eVar, false);
    }
}
