package ve;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import qd.d;
import ue.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements f<T, RequestBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MediaType f37011c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f37012d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f37013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f37014b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f37013a = gson;
        this.f37014b = typeAdapter;
    }

    @Override // ue.f
    public RequestBody a(Object obj) throws IOException {
        qd.c cVar = new qd.c();
        o6.c cVarF = this.f37013a.f(new OutputStreamWriter(new d(cVar), f37012d));
        this.f37014b.c(cVarF, obj);
        cVarF.close();
        return RequestBody.create(f37011c, cVar.I());
    }
}
