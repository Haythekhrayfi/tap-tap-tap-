package ue;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class q extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.a f36445a = new q();

    @IgnoreJRERequirement
    public static final class a<T> implements f<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f<ResponseBody, T> f36446a;

        public a(f<ResponseBody, T> fVar) {
            this.f36446a = fVar;
        }

        @Override // ue.f
        public Object a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f36446a.a(responseBody));
        }
    }

    @Override // ue.f.a
    @Nullable
    public f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.f(type) != Optional.class) {
            return null;
        }
        return new a(b0Var.d(f0.e(0, (ParameterizedType) type), annotationArr));
    }
}
