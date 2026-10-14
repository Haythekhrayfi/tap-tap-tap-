package gd;

import android.os.Looper;
import fd.s1;
import java.util.List;
import kd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {
    @Override // kd.o
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.o
    public s1 b(List<? extends o> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new d(f.a(mainLooper, true), null, 2, 0 == true ? 1 : 0);
    }

    @Override // kd.o
    public int c() {
        return 1073741823;
    }
}
