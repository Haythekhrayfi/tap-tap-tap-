package a8;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f189a = new a();

    public static final class a implements d {
        @Override // a8.d
        public a8.a a(List list, e eVar) {
            return new b();
        }

        @Override // a8.d
        public f b(Context context) {
            return new c(context);
        }
    }

    a8.a a(List<j> list, e eVar);

    f b(Context context);
}
