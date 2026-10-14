package n;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33561c;

    public f(h hVar, String str, Bundle bundle) {
        this.f33561c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f33561c.f33564d);
    }
}
