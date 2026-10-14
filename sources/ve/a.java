package ve;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ue.b0;
import ue.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f37010a;

    public a(Gson gson) {
        this.f37010a = gson;
    }

    @Override // ue.f.a
    public f<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        return new b(this.f37010a, this.f37010a.d(new n6.a(type)));
    }

    @Override // ue.f.a
    public f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        return new c(this.f37010a, this.f37010a.d(new n6.a(type)));
    }
}
