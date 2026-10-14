package n;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33562c;

    public g(h hVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f33562c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f33562c.f33564d);
    }
}
