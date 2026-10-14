package ue;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class h extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z<?> zVar) {
        super("HTTP " + zVar.a() + " " + zVar.f36543a.message());
        Objects.requireNonNull(zVar, "response == null");
        this.f36411c = zVar.a();
        zVar.f36543a.message();
    }
}
