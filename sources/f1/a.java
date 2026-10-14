package f1;

import android.os.Bundle;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: f1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0253a<D> {
        g1.b<D> onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(g1.b<D> bVar, D d10);

        void onLoaderReset(g1.b<D> bVar);
    }

    public static <T extends p & o0> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> g1.b<D> c(int i10, Bundle bundle, InterfaceC0253a<D> interfaceC0253a);
}
