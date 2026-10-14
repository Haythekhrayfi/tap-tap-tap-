package n;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f33559c;

    public d(h hVar, String str, Bundle bundle) {
        this.f33559c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f33559c.f33564d);
    }
}
