package ue;

import javax.annotation.Nullable;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f36543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f36544b;

    public z(Response response, @Nullable T t10, @Nullable ResponseBody responseBody) {
        this.f36543a = response;
        this.f36544b = t10;
    }

    public static <T> z<T> c(@Nullable T t10, Response response) {
        if (response.isSuccessful()) {
            return new z<>(response, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public int a() {
        return this.f36543a.code();
    }

    public boolean b() {
        return this.f36543a.isSuccessful();
    }

    public String toString() {
        return this.f36543a.toString();
    }
}
