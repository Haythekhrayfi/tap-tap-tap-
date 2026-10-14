package ue;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t<T> {

    public static final class a<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ue.f<T, RequestBody> f36451c;

        public a(Method method, int i10, ue.f<T, RequestBody> fVar) {
            this.f36449a = method;
            this.f36450b = i10;
            this.f36451c = fVar;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) {
            if (t10 == null) {
                throw f0.l(this.f36449a, this.f36450b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.f36504k = this.f36451c.a(t10);
            } catch (IOException e10) {
                throw f0.m(this.f36449a, e10, this.f36450b, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class b<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ue.f<T, String> f36453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36454c;

        public b(String str, ue.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f36452a = str;
            this.f36453b = fVar;
            this.f36454c = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) throws IOException {
            String strA;
            if (t10 == null || (strA = this.f36453b.a(t10)) == null) {
                return;
            }
            String str = this.f36452a;
            boolean z10 = this.f36454c;
            FormBody.Builder builder = vVar.f36503j;
            if (z10) {
                builder.addEncoded(str, strA);
            } else {
                builder.add(str, strA);
            }
        }
    }

    public static final class c<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36457c;

        public c(Method method, int i10, ue.f<T, String> fVar, boolean z10) {
            this.f36455a = method;
            this.f36456b = i10;
            this.f36457c = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw f0.l(this.f36455a, this.f36456b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.l(this.f36455a, this.f36456b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.l(this.f36455a, this.f36456b, androidx.activity.j.a("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw f0.l(this.f36455a, this.f36456b, "Field map value '" + value + "' converted to null by " + ue.a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                if (this.f36457c) {
                    vVar.f36503j.addEncoded(str, string);
                } else {
                    vVar.f36503j.add(str, string);
                }
            }
        }
    }

    public static final class d<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ue.f<T, String> f36459b;

        public d(String str, ue.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f36458a = str;
            this.f36459b = fVar;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) throws IOException {
            String strA;
            if (t10 == null || (strA = this.f36459b.a(t10)) == null) {
                return;
            }
            vVar.a(this.f36458a, strA);
        }
    }

    public static final class e<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36461b;

        public e(Method method, int i10, ue.f<T, String> fVar) {
            this.f36460a = method;
            this.f36461b = i10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw f0.l(this.f36460a, this.f36461b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.l(this.f36460a, this.f36461b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.l(this.f36460a, this.f36461b, androidx.activity.j.a("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                vVar.a(str, value.toString());
            }
        }
    }

    public static final class f extends t<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36463b;

        public f(Method method, int i10) {
            this.f36462a = method;
            this.f36463b = i10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Headers headers) throws IOException {
            Headers headers2 = headers;
            if (headers2 == null) {
                throw f0.l(this.f36462a, this.f36463b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.f36499f.addAll(headers2);
        }
    }

    public static final class g<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Headers f36466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.f<T, RequestBody> f36467d;

        public g(Method method, int i10, Headers headers, ue.f<T, RequestBody> fVar) {
            this.f36464a = method;
            this.f36465b = i10;
            this.f36466c = headers;
            this.f36467d = fVar;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) {
            if (t10 == null) {
                return;
            }
            try {
                vVar.f36502i.addPart(this.f36466c, this.f36467d.a(t10));
            } catch (IOException e10) {
                throw f0.l(this.f36464a, this.f36465b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    public static final class h<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ue.f<T, RequestBody> f36470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f36471d;

        public h(Method method, int i10, ue.f<T, RequestBody> fVar, String str) {
            this.f36468a = method;
            this.f36469b = i10;
            this.f36470c = fVar;
            this.f36471d = str;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw f0.l(this.f36468a, this.f36469b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.l(this.f36468a, this.f36469b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.l(this.f36468a, this.f36469b, androidx.activity.j.a("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                vVar.f36502i.addPart(Headers.of("Content-Disposition", androidx.activity.j.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f36471d), this.f36470c.a((T) value));
            }
        }
    }

    public static final class i<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.f<T, String> f36475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36476e;

        public i(Method method, int i10, String str, ue.f<T, String> fVar, boolean z10) {
            this.f36472a = method;
            this.f36473b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f36474c = str;
            this.f36475d = fVar;
            this.f36476e = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) throws IOException {
            String strN;
            if (t10 == null) {
                throw f0.l(this.f36472a, this.f36473b, androidx.activity.k.a(defpackage.a.a("Path parameter \""), this.f36474c, "\" value must not be null."), new Object[0]);
            }
            String str = this.f36474c;
            String strA = this.f36475d.a(t10);
            boolean z10 = this.f36476e;
            if (vVar.f36496c == null) {
                throw new AssertionError();
            }
            int length = strA.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strN = strA;
                    break;
                }
                int iCodePointAt = strA.codePointAt(iCharCount);
                int i10 = 47;
                int i11 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    qd.c cVar = new qd.c();
                    cVar.f0(strA, 0, iCharCount);
                    qd.c cVar2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strA.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i11 || (!z10 && (iCodePointAt2 == i10 || iCodePointAt2 == 37))) {
                                if (cVar2 == null) {
                                    cVar2 = new qd.c();
                                }
                                cVar2.g0(iCodePointAt2);
                                while (!cVar2.y()) {
                                    int i12 = cVar2.readByte() & 255;
                                    cVar.R(37);
                                    char[] cArr = v.f36492l;
                                    cVar.R(cArr[(i12 >> 4) & 15]);
                                    cVar.R(cArr[i12 & 15]);
                                }
                            } else {
                                cVar.g0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    strN = cVar.n();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = vVar.f36496c.replace("{" + str + "}", strN);
            if (v.f36493m.matcher(strReplace).matches()) {
                throw new IllegalArgumentException(i.f.a("@Path parameters shouldn't perform path traversal ('.' or '..'): ", strA));
            }
            vVar.f36496c = strReplace;
        }
    }

    public static final class j<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ue.f<T, String> f36478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36479c;

        public j(String str, ue.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f36477a = str;
            this.f36478b = fVar;
            this.f36479c = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) throws IOException {
            String strA;
            if (t10 == null || (strA = this.f36478b.a(t10)) == null) {
                return;
            }
            vVar.b(this.f36477a, strA, this.f36479c);
        }
    }

    public static final class k<T> extends t<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36482c;

        public k(Method method, int i10, ue.f<T, String> fVar, boolean z10) {
            this.f36480a = method;
            this.f36481b = i10;
            this.f36482c = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                throw f0.l(this.f36480a, this.f36481b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.l(this.f36480a, this.f36481b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.l(this.f36480a, this.f36481b, androidx.activity.j.a("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw f0.l(this.f36480a, this.f36481b, "Query map value '" + value + "' converted to null by " + ue.a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                vVar.b(str, string, this.f36482c);
            }
        }
    }

    public static final class l<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f36483a;

        public l(ue.f<T, String> fVar, boolean z10) {
            this.f36483a = z10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            vVar.b(t10.toString(), null, this.f36483a);
        }
    }

    public static final class m extends t<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f36484a = new m();

        @Override // ue.t
        public void a(v vVar, @Nullable MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                vVar.f36502i.addPart(part2);
            }
        }
    }

    public static final class n extends t<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f36485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36486b;

        public n(Method method, int i10) {
            this.f36485a = method;
            this.f36486b = i10;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable Object obj) {
            if (obj == null) {
                throw f0.l(this.f36485a, this.f36486b, "@Url parameter is null.", new Object[0]);
            }
            Objects.requireNonNull(vVar);
            vVar.f36496c = obj.toString();
        }
    }

    public static final class o<T> extends t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f36487a;

        public o(Class<T> cls) {
            this.f36487a = cls;
        }

        @Override // ue.t
        public void a(v vVar, @Nullable T t10) {
            vVar.f36498e.tag(this.f36487a, t10);
        }
    }

    public abstract void a(v vVar, @Nullable T t10) throws IOException;
}
