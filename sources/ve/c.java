package ve;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import okhttp3.ResponseBody;
import ue.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements f<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f37015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f37016b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f37015a = gson;
        this.f37016b = typeAdapter;
    }

    @Override // ue.f
    public Object a(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        Gson gson = this.f37015a;
        Reader readerCharStream = responseBody2.charStream();
        Objects.requireNonNull(gson);
        o6.a aVar = new o6.a(readerCharStream);
        aVar.f33969d = gson.f12726k;
        try {
            T tB = this.f37016b.b(aVar);
            if (aVar.V() != o6.b.END_DOCUMENT) {
                throw new j("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return tB;
        } catch (Throwable th) {
            responseBody2.close();
            throw th;
        }
    }
}
