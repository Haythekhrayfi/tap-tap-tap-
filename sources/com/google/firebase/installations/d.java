package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import y5.f;

/* JADX INFO: loaded from: classes2.dex */
public class d implements y5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<e> f12586b;

    public d(f fVar, TaskCompletionSource<e> taskCompletionSource) {
        this.f12585a = fVar;
        this.f12586b = taskCompletionSource;
    }

    @Override // y5.e
    public boolean a(a6.d dVar) {
        if (!dVar.j() || this.f12585a.d(dVar)) {
            return false;
        }
        TaskCompletionSource<e> taskCompletionSource = this.f12586b;
        a.b bVar = new a.b();
        String strA = dVar.a();
        Objects.requireNonNull(strA, "Null token");
        bVar.f12565a = strA;
        bVar.f12566b = Long.valueOf(dVar.b());
        bVar.f12567c = Long.valueOf(dVar.g());
        String strA2 = bVar.f12565a == null ? " token" : "";
        if (bVar.f12566b == null) {
            strA2 = i.f.a(strA2, " tokenExpirationTimestamp");
        }
        if (bVar.f12567c == null) {
            strA2 = i.f.a(strA2, " tokenCreationTimestamp");
        }
        if (!strA2.isEmpty()) {
            throw new IllegalStateException(i.f.a("Missing required properties:", strA2));
        }
        taskCompletionSource.setResult(new a(bVar.f12565a, bVar.f12566b.longValue(), bVar.f12567c.longValue(), null));
        return true;
    }

    @Override // y5.e
    public boolean b(Exception exc) {
        this.f12586b.trySetException(exc);
        return true;
    }
}
