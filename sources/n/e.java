package n;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33560c;

    public e(h hVar, Bundle bundle) {
        this.f33560c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f33560c.f33564d);
    }
}
