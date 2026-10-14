package kd;

import ch.qos.logback.core.CoreConstants;
import fd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mc.f f32028c;

    public e(mc.f fVar) {
        this.f32028c = fVar;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CoroutineScope(coroutineContext=");
        sbA.append(this.f32028c);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }

    @Override // fd.g0
    public mc.f w() {
        return this.f32028c;
    }
}
