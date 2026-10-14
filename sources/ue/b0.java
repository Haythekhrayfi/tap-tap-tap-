package ue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Method, c0<?>> f36378a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f36379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f36380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f.a> f36381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c.a> f36382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Executor f36383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36384g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f36385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Call.Factory f36386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public HttpUrl f36387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<f.a> f36388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<c.a> f36389e;

        public a() {
            u uVar = u.f36488c;
            this.f36388d = new ArrayList();
            this.f36389e = new ArrayList();
            this.f36385a = uVar;
        }
    }

    public b0(Call.Factory factory, HttpUrl httpUrl, List<f.a> list, List<c.a> list2, @Nullable Executor executor, boolean z10) {
        this.f36379b = factory;
        this.f36380c = httpUrl;
        this.f36381d = list;
        this.f36382e = list2;
        this.f36383f = executor;
        this.f36384g = z10;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f36382e.indexOf(null) + 1;
        int size = this.f36382e.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            c<?, ?> cVarA = this.f36382e.get(i10).a(type, annotationArr, this);
            if (cVarA != null) {
                return cVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f36382e.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f36382e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public c0<?> b(Method method) {
        c0<?> c0VarB;
        c0<?> c0Var = this.f36378a.get(method);
        if (c0Var != null) {
            return c0Var;
        }
        synchronized (this.f36378a) {
            c0VarB = this.f36378a.get(method);
            if (c0VarB == null) {
                c0VarB = c0.b(this, method);
                this.f36378a.put(method, c0VarB);
            }
        }
        return c0VarB;
    }

    public <T> f<T, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f36381d.indexOf(null) + 1;
        int size = this.f36381d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<T, RequestBody> fVar = (f<T, RequestBody>) this.f36381d.get(i10).a(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f36381d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f36381d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<ResponseBody, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f36381d.indexOf(null) + 1;
        int size = this.f36381d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<ResponseBody, T> fVar = (f<ResponseBody, T>) this.f36381d.get(i10).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f36381d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f36381d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, String> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f36381d.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(this.f36381d.get(i10));
        }
        return ue.a.d.f36371a;
    }
}
