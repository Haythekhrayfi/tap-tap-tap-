package ue;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ue.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36367a = true;

    /* JADX INFO: renamed from: ue.a$a, reason: collision with other inner class name */
    public static final class C0432a implements ue.f<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0432a f36368a = new C0432a();

        @Override // ue.f
        public ResponseBody a(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                return f0.a(responseBody2);
            } finally {
                responseBody2.close();
            }
        }
    }

    public static final class b implements ue.f<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36369a = new b();

        @Override // ue.f
        public RequestBody a(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    public static final class c implements ue.f<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f36370a = new c();

        @Override // ue.f
        public ResponseBody a(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    public static final class d implements ue.f<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f36371a = new d();

        @Override // ue.f
        public String a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class e implements ue.f<ResponseBody, jc.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f36372a = new e();

        @Override // ue.f
        public jc.w a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return jc.w.f31842a;
        }
    }

    public static final class f implements ue.f<ResponseBody, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f36373a = new f();

        @Override // ue.f
        public Void a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // ue.f.a
    @Nullable
    public ue.f<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        if (RequestBody.class.isAssignableFrom(f0.f(type))) {
            return b.f36369a;
        }
        return null;
    }

    @Override // ue.f.a
    @Nullable
    public ue.f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (type == ResponseBody.class) {
            return f0.i(annotationArr, we.w.class) ? c.f36370a : C0432a.f36368a;
        }
        if (type == Void.class) {
            return f.f36373a;
        }
        if (!this.f36367a || type != jc.w.class) {
            return null;
        }
        try {
            return e.f36372a;
        } catch (NoClassDefFoundError unused) {
            this.f36367a = false;
            return null;
        }
    }
}
