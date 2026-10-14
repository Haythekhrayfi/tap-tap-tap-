package ue;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface f<F, T> {

    public static abstract class a {
        @Nullable
        public f<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
            return null;
        }

        @Nullable
        public f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
            return null;
        }
    }

    @Nullable
    T a(F f10) throws IOException;
}
