package w9;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e<u9.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map<String, u9.b> f37195b;

    public d(Map<String, u9.b> map) {
        this.f37195b = map;
    }

    @Override // w9.e
    public u9.b get(String str) {
        return this.f37195b.get(str);
    }
}
