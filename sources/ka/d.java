package ka;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class d extends com.zipoapps.blytics.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, a> f31970a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31971b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31972c;

    public d(boolean z10) {
        this.f31972c = z10;
    }

    @Override // com.zipoapps.blytics.b
    public a a(String str, String str2) {
        return this.f31970a.get(a.a(str, str2));
    }

    @Override // com.zipoapps.blytics.b
    public a b(a aVar) {
        return a(aVar.f31957a, aVar.f31958b);
    }

    @Override // com.zipoapps.blytics.b
    public void e(a aVar) {
        this.f31970a.put(a.a(aVar.f31957a, aVar.f31958b), aVar);
    }
}
