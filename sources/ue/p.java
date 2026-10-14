package ue;

import androidx.appcompat.widget.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T> implements ue.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f36429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f36430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Call.Factory f36431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f<ResponseBody, T> f36432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f36433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Call f36434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f36435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f36436j;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f36437a;

        public a(d dVar) {
            this.f36437a = dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            try {
                this.f36437a.b(p.this, iOException);
            } catch (Throwable th) {
                f0.o(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f36437a.a(p.this, p.this.d(response));
                } catch (Throwable th) {
                    f0.o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                f0.o(th2);
                try {
                    this.f36437a.b(p.this, th2);
                } catch (Throwable th3) {
                    f0.o(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class b extends ResponseBody {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResponseBody f36439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qd.f f36440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public IOException f36441e;

        public class a extends qd.j {
            public a(qd.a0 a0Var) {
                super(a0Var);
            }

            @Override // qd.j, qd.a0
            public long read(qd.c cVar, long j10) throws IOException {
                try {
                    return super.read(cVar, j10);
                } catch (IOException e10) {
                    b.this.f36441e = e10;
                    throw e10;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.f36439c = responseBody;
            this.f36440d = qd.o.c(new a(responseBody.source()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f36439c.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f36439c.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f36439c.contentType();
        }

        @Override // okhttp3.ResponseBody
        public qd.f source() {
            return this.f36440d;
        }
    }

    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final MediaType f36443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36444d;

        public c(@Nullable MediaType mediaType, long j10) {
            this.f36443c = mediaType;
            this.f36444d = j10;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f36444d;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f36443c;
        }

        @Override // okhttp3.ResponseBody
        public qd.f source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public p(y yVar, Object[] objArr, Call.Factory factory, f<ResponseBody, T> fVar) {
        this.f36429c = yVar;
        this.f36430d = objArr;
        this.f36431e = factory;
        this.f36432f = fVar;
    }

    @Override // ue.b
    public void a(d<T> dVar) {
        Call call;
        Throwable th;
        synchronized (this) {
            if (this.f36436j) {
                throw new IllegalStateException("Already executed.");
            }
            this.f36436j = true;
            call = this.f36434h;
            th = this.f36435i;
            if (call == null && th == null) {
                try {
                    Call callB = b();
                    this.f36434h = callB;
                    call = callB;
                } catch (Throwable th2) {
                    th = th2;
                    f0.o(th);
                    this.f36435i = th;
                }
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f36433g) {
            call.cancel();
        }
        call.enqueue(new a(dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Call b() throws IOException {
        HttpUrl httpUrlResolve;
        Call.Factory factory = this.f36431e;
        y yVar = this.f36429c;
        Object[] objArr = this.f36430d;
        ParameterHandler<?>[] parameterHandlerArr = yVar.f36516j;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException(android.support.v4.media.b.a(r0.a("Argument count (", length, ") doesn't match expected count ("), parameterHandlerArr.length, ")"));
        }
        v vVar = new v(yVar.f36509c, yVar.f36508b, yVar.f36510d, yVar.f36511e, yVar.f36512f, yVar.f36513g, yVar.f36514h, yVar.f36515i);
        if (yVar.f36517k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            parameterHandlerArr[i10].a(vVar, objArr[i10]);
        }
        HttpUrl.Builder builder = vVar.f36497d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = vVar.f36495b.resolve(vVar.f36496c);
            if (httpUrlResolve == null) {
                StringBuilder sbA = defpackage.a.a("Malformed URL. Base: ");
                sbA.append(vVar.f36495b);
                sbA.append(", Relative: ");
                sbA.append(vVar.f36496c);
                throw new IllegalArgumentException(sbA.toString());
            }
        }
        RequestBody aVar = vVar.f36504k;
        if (aVar == null) {
            FormBody.Builder builder2 = vVar.f36503j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = vVar.f36502i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (vVar.f36501h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = vVar.f36500g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new v.a(aVar, mediaType);
            } else {
                vVar.f36499f.add("Content-Type", mediaType.toString());
            }
        }
        Call callNewCall = factory.newCall(vVar.f36498e.url(httpUrlResolve).headers(vVar.f36499f.build()).method(vVar.f36494a, aVar).tag(j.class, new j(yVar.f36507a, arrayList)).build());
        Objects.requireNonNull(callNewCall, "Call.Factory returned null.");
        return callNewCall;
    }

    @GuardedBy("this")
    public final Call c() throws IOException {
        Call call = this.f36434h;
        if (call != null) {
            return call;
        }
        Throwable th = this.f36435i;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callB = b();
            this.f36434h = callB;
            return callB;
        } catch (IOException | Error | RuntimeException e10) {
            f0.o(e10);
            this.f36435i = e10;
            throw e10;
        }
    }

    @Override // ue.b
    public void cancel() {
        Call call;
        this.f36433g = true;
        synchronized (this) {
            call = this.f36434h;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new p(this.f36429c, this.f36430d, this.f36431e, this.f36432f);
    }

    public z<T> d(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.contentType(), responseBodyBody.contentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                ResponseBody responseBodyA = f0.a(responseBodyBody);
                Objects.requireNonNull(responseBodyA, "body == null");
                if (responseBuild.isSuccessful()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                z<T> zVar = new z<>(responseBuild, null, responseBodyA);
                responseBodyBody.close();
                return zVar;
            } catch (Throwable th) {
                responseBodyBody.close();
                throw th;
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return z.c(null, responseBuild);
        }
        b bVar = new b(responseBodyBody);
        try {
            return z.c(this.f36432f.a(bVar), responseBuild);
        } catch (RuntimeException e10) {
            IOException iOException = bVar.f36441e;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // ue.b
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f36433g) {
            return true;
        }
        synchronized (this) {
            Call call = this.f36434h;
            if (call == null || !call.isCanceled()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // ue.b
    public synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().request();
    }

    @Override // ue.b
    /* JADX INFO: renamed from: clone */
    public ue.b mo144clone() {
        return new p(this.f36429c, this.f36430d, this.f36431e, this.f36432f);
    }
}
