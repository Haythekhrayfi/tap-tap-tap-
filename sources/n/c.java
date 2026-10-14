package n;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33558c;

    public c(h hVar, int i10, Bundle bundle) {
        this.f33558c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f33558c.f33564d);
    }
}
