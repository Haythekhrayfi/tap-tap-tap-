package k7;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f31920a;

    public f(Gson gson) {
        this.f31920a = gson;
    }

    public <T> T a(String str, Type type) throws com.google.gson.q {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) this.f31920a.c(str, type);
    }

    public String b(Object obj) {
        return this.f31920a.g(obj);
    }
}
